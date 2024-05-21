// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.sql;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.Region;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.test.annotation.DoNotRecord;
import com.azure.core.test.annotation.LiveOnly;
import com.azure.resourcemanager.resources.fluentcore.model.Creatable;
import com.azure.resourcemanager.resources.fluentcore.model.Indexable;
import com.azure.resourcemanager.resources.fluentcore.utils.ResourceManagerUtils;
import com.azure.resourcemanager.sql.models.AdministratorType;
import com.azure.resourcemanager.sql.models.AutomaticTuningMode;
import com.azure.resourcemanager.sql.models.AutomaticTuningOptionModeActual;
import com.azure.resourcemanager.sql.models.AutomaticTuningOptionModeDesired;
import com.azure.resourcemanager.sql.models.AutomaticTuningServerMode;
import com.azure.resourcemanager.sql.models.CapabilityStatus;
import com.azure.resourcemanager.sql.models.CheckNameAvailabilityReason;
import com.azure.resourcemanager.sql.models.CheckNameAvailabilityResult;
import com.azure.resourcemanager.sql.models.CreateMode;
import com.azure.resourcemanager.sql.models.DatabaseEdition;
import com.azure.resourcemanager.sql.models.DatabaseSku;
import com.azure.resourcemanager.sql.models.ElasticPoolEdition;
import com.azure.resourcemanager.sql.models.ElasticPoolSku;
import com.azure.resourcemanager.sql.models.FailoverGroupReplicationRole;
import com.azure.resourcemanager.sql.models.ReadOnlyEndpointFailoverPolicy;
import com.azure.resourcemanager.sql.models.ReadWriteEndpointFailoverPolicy;
import com.azure.resourcemanager.sql.models.RegionCapabilities;
import com.azure.resourcemanager.sql.models.ReplicationLink;
import com.azure.resourcemanager.sql.models.SampleName;
import com.azure.resourcemanager.sql.models.ServerNetworkAccessFlag;
import com.azure.resourcemanager.sql.models.SecurityAlertPolicyName;
import com.azure.resourcemanager.sql.models.SecurityAlertPolicyState;
import com.azure.resourcemanager.sql.models.ServiceObjectiveName;
import com.azure.resourcemanager.sql.models.Sku;
import com.azure.resourcemanager.sql.models.SqlActiveDirectoryAdministrator;
import com.azure.resourcemanager.sql.models.SqlDatabase;
import com.azure.resourcemanager.sql.models.SqlDatabaseAutomaticTuning;
import com.azure.resourcemanager.sql.models.SqlDatabaseImportExportResponse;
import com.azure.resourcemanager.sql.models.SqlDatabasePremiumServiceObjective;
import com.azure.resourcemanager.sql.models.SqlDatabaseStandardServiceObjective;
import com.azure.resourcemanager.sql.models.SqlDatabaseThreatDetectionPolicy;
import com.azure.resourcemanager.sql.models.SqlElasticPool;
import com.azure.resourcemanager.sql.models.SqlElasticPoolBasicEDTUs;
import com.azure.resourcemanager.sql.models.SqlFailoverGroup;
import com.azure.resourcemanager.sql.models.SqlFirewallRule;
import com.azure.resourcemanager.sql.models.SqlServer;
import com.azure.resourcemanager.sql.models.SqlServerAutomaticTuning;
import com.azure.resourcemanager.sql.models.SqlServerDnsAlias;
import com.azure.resourcemanager.sql.models.SqlSyncGroup;
import com.azure.resourcemanager.sql.models.SqlSyncMember;
import com.azure.resourcemanager.sql.models.SqlWarehouse;
import com.azure.resourcemanager.sql.models.SyncDirection;
import com.azure.resourcemanager.sql.models.SyncMemberDbType;
import com.azure.resourcemanager.sql.models.TransparentDataEncryption;
import com.azure.resourcemanager.sql.models.TransparentDataEncryptionState;
import com.azure.resourcemanager.storage.models.StorageAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SqlServerOperationsTests extends SqlServerTest {
    private static final String SQL_DATABASE_NAME = "myTestDatabase2";
    private static final String COLLATION = "SQL_Latin1_General_CP1_CI_AS";
    private static final String SQL_ELASTIC_POOL_NAME = "testElasticPool";
    private static final String SQL_FIREWALLRULE_NAME = "firewallrule1";
    private static final String START_IPADDRESS = "10.102.1.10";
    private static final String END_IPADDRESS = "10.102.1.12";

    // Only one sync database is allowed per region per subscription
    // canCRUDSqlSyncMember and canCRUDSqlSyncGroup need to be in 2 different region

    @Test
    public void canCRUDSqlSyncMember() throws Exception {
        final String dbName = "dbSample";
        final String dbSyncName = "dbSync";
        final String dbMemberName = "dbMember";
        final String syncGroupName = "groupName";
        final String syncMemberName = "memberName";
        final String administratorLogin = "sqladmin";
        final String administratorPassword = password();

        // Create
        SqlServer sqlPrimaryServer =
            sqlServerManager
                .sqlServers()
                .define(sqlServerName)
                .withRegion(Region.US_WEST3)
                .withNewResourceGroup(rgName)
                .withAdministratorLogin(administratorLogin)
                .withAdministratorPassword(administratorPassword)
                .defineDatabase(dbName)
                .fromSample(SampleName.ADVENTURE_WORKS_LT)
                .withStandardEdition(SqlDatabaseStandardServiceObjective.S0)
                .attach()
                .defineDatabase(dbSyncName)
                .withStandardEdition(SqlDatabaseStandardServiceObjective.S0)
                .attach()
                .defineDatabase(dbMemberName)
                .withStandardEdition(SqlDatabaseStandardServiceObjective.S0)
                .attach()
                .create();

        SqlDatabase dbSource = sqlPrimaryServer.databases().get(dbName);
        SqlDatabase dbSync = sqlPrimaryServer.databases().get(dbSyncName);
        SqlDatabase dbMember = sqlPrimaryServer.databases().get(dbMemberName);

        SqlSyncGroup sqlSyncGroup =
            dbSync
                .syncGroups()
                .define(syncGroupName)
                .withSyncDatabaseId(dbSource.id())
                .withDatabaseUserName(administratorLogin)
                .withDatabasePassword(administratorPassword)
                .withConflictResolutionPolicyHubWins()
                .withInterval(-1)
                .create();
        Assertions.assertNotNull(sqlSyncGroup);

        SqlSyncMember sqlSyncMember =
            sqlSyncGroup
                .syncMembers()
                .define(syncMemberName)
                .withMemberSqlDatabase(dbMember)
                .withMemberUserName(administratorLogin)
                .withMemberPassword(administratorPassword)
                .withMemberDatabaseType(SyncMemberDbType.AZURE_SQL_DATABASE)
                .withDatabaseType(SyncDirection.ONE_WAY_MEMBER_TO_HUB)
                .create();
        Assertions.assertNotNull(sqlSyncMember);

        sqlSyncMember
            .update()
            .withDatabaseType(SyncDirection.BIDIRECTIONAL)
            .withMemberUserName(administratorLogin)
            .withMemberPassword(administratorPassword)
            .withMemberDatabaseType(SyncMemberDbType.AZURE_SQL_DATABASE)
            .apply();

        Assertions.assertFalse(sqlSyncGroup.syncMembers().list().isEmpty());

        sqlSyncMember =
            sqlServerManager
                .sqlServers()
                .syncMembers()
                .getBySqlServer(rgName, sqlServerName, dbSyncName, syncGroupName, syncMemberName);
        Assertions.assertNotNull(sqlSyncMember);

        sqlSyncMember.delete();

        sqlSyncGroup.delete();
    }

    @Test
    public void canCRUDSqlSyncGroup() throws Exception {
        final String dbName = "dbSample";
        final String dbSyncName = "dbSync";
        final String syncGroupName = "groupName";
        final String administratorLogin = "sqladmin";
        final String administratorPassword = password();

        // Create
        SqlServer sqlPrimaryServer =
            sqlServerManager
                .sqlServers()
                .define(sqlServerName)
                .withRegion(Region.US_EAST)
                .withNewResourceGroup(rgName)
                .withAdministratorLogin(administratorLogin)
                .withAdministratorPassword(administratorPassword)
                .defineDatabase(dbName)
                .fromSample(SampleName.ADVENTURE_WORKS_LT)
                .withStandardEdition(SqlDatabaseStandardServiceObjective.S0)
                .attach()
                .defineDatabase(dbSyncName)
                .withStandardEdition(SqlDatabaseStandardServiceObjective.S0)
                .attach()
                .create();

        SqlDatabase dbSource = sqlPrimaryServer.databases().get(dbName);
        SqlDatabase dbSync = sqlPrimaryServer.databases().get(dbSyncName);

        SqlSyncGroup sqlSyncGroup =
            dbSync
                .syncGroups()
                .define(syncGroupName)
                .withSyncDatabaseId(dbSource.id())
                .withDatabaseUserName(administratorLogin)
                .withDatabasePassword(administratorPassword)
                .withConflictResolutionPolicyHubWins()
                .withInterval(-1)
                .create();

        Assertions.assertNotNull(sqlSyncGroup);

        // service no longer supports updating ConflictResolutionPolicy
        // sqlSyncGroup.update().withInterval(600).withConflictResolutionPolicyMemberWins().apply();

        Assertions
            .assertTrue(
                sqlServerManager
                    .sqlServers()
                    .syncGroups()
                    .listSyncDatabaseIds(Region.US_EAST)
                    .stream()
                    .findAny()
                    .isPresent());
        Assertions.assertFalse(dbSync.syncGroups().list().isEmpty());

        sqlSyncGroup =
            sqlServerManager.sqlServers().syncGroups().getBySqlServer(rgName, sqlServerName, dbSyncName, syncGroupName);
        Assertions.assertNotNull(sqlSyncGroup);

        sqlSyncGroup.delete();
    }

    @Test
    public void canCopySqlDatabase() throws Exception {
        final String sqlPrimaryServerName = generateRandomResourceName("sqlpri", 22);
        final String sqlSecondaryServerName = generateRandomResourceName("sqlsec", 22);
        final String epName = "epSample";
        final String dbName = "dbSample";
        final String administratorLogin = "sqladmin";
        final String administratorPassword = password();

        // Create
        SqlServer sqlPrimaryServer =
            sqlServerManager
                .sqlServers()
                .define(sqlPrimaryServerName)
                .withRegion(Region.US_EAST2)
                .withNewResourceGroup(rgName)
                .withAdministratorLogin(administratorLogin)
                .withAdministratorPassword(administratorPassword)
                .defineElasticPool(epName)
                .withPremiumPool()
                .attach()
                .defineDatabase(dbName)
                .withExistingElasticPool(epName)
                .fromSample(SampleName.ADVENTURE_WORKS_LT)
                .attach()
                .create();

        SqlServer sqlSecondaryServer =
            sqlServerManager
                .sqlServers()
                .define(sqlSecondaryServerName)
                .withRegion(Region.US_EAST)
                .withExistingResourceGroup(rgName)
                .withAdministratorLogin(administratorLogin)
                .withAdministratorPassword(administratorPassword)
                .create();

        SqlDatabase dbSample = sqlPrimaryServer.databases().get(dbName);

        SqlDatabase dbCopy =
            sqlSecondaryServer
                .databases()
                .define("dbCopy")
                .withSourceDatabase(dbSample)
                .withMode(CreateMode.COPY)
                .withPremiumEdition(SqlDatabasePremiumServiceObjective.P1)
                .create();

        Assertions.assertNotNull(dbCopy);
    }

    @Test
    public void canCRUDSqlFailoverGroup() throws Exception {
        final String sqlPrimaryServerName = generateRandomResourceName("sqlpri", 22);
        final String sqlSecondaryServerName = generateRandomResourceName("sqlsec", 22);
        final String sqlOtherServerName = generateRandomResourceName("sql000", 22);
        final String failoverGroupName = generateRandomResourceName("fg", 22);
        final String failoverGroupName2 = generateRandomResourceName("fg2", 22);
        final String dbName = "dbSample";
        final String administratorLogin = "sqladmin";
        final String administratorPassword = password();

        // Create
        SqlServer sqlPrimaryServer =
            sqlServerManager
                .sqlServers()
                .define(sqlPrimaryServerName)
                .withRegion(Region.US_EAST)
                .withNewResourceGroup(rgName)
                .withAdministratorLogin(administratorLogin)
                .withAdministratorPassword(administratorPassword)
                .defineDatabase(dbName)
                .fromSample(SampleName.ADVENTURE_WORKS_LT)
                .withStandardEdition(SqlDatabaseStandardServiceObjective.S0)
                .attach()
                .create();

        SqlServer sqlSecondaryServer =
            sqlServerManager
                .sqlServers()
                .define(sqlSecondaryServerName)
                .withRegion(Region.US_EAST2)
                .withExistingResourceGroup(rgName)
                .withAdministratorLogin(administratorLogin)
                .withAdministratorPassword(administratorPassword)
                .create();

        SqlServer sqlOtherServer =
            sqlServerManager
                .sqlServers()
                .define(sqlOtherServerName)
                .withRegion(Region.US_SOUTH_CENTRAL)
                .withExistingResourceGroup(rgName)
                .withAdministratorLogin(administratorLogin)
                .withAdministratorPassword(administratorPassword)
                .create();

        SqlFailoverGroup failoverGroup =
            sqlPrimaryServer
                .failoverGroups()
                .define(failoverGroupName)
                .withManualReadWriteEndpointPolicy()
                .withPartnerServerId(sqlSecondaryServer.id())
                .withReadOnlyEndpointPolicyDisabled()
                .create();
        Assertions.assertNotNull(failoverGroup);
        Assertions.assertEquals(failoverGroupName, failoverGroup.name());
        Assertions.assertEquals(rgName, failoverGroup.resourceGroupName());
        Assertions.assertEquals(sqlPrimaryServerName, failoverGroup.sqlServerName());
        Assertions.assertEquals(FailoverGroupReplicationRole.PRIMARY, failoverGroup.replicationRole());
        Assertions.assertEquals(1, failoverGroup.partnerServers().size());
        Assertions.assertEquals(sqlSecondaryServer.id(), failoverGroup.partnerServers().get(0).id());
        Assertions
            .assertEquals(
                FailoverGroupReplicationRole.SECONDARY, failoverGroup.partnerServers().get(0).replicationRole());
        Assertions.assertEquals(0, failoverGroup.databases().size());
        Assertions.assertEquals(0, failoverGroup.readWriteEndpointDataLossGracePeriodMinutes());
        Assertions.assertEquals(ReadWriteEndpointFailoverPolicy.MANUAL, failoverGroup.readWriteEndpointPolicy());
        Assertions.assertEquals(ReadOnlyEndpointFailoverPolicy.DISABLED, failoverGroup.readOnlyEndpointPolicy());

        SqlFailoverGroup failoverGroupOnPartner = sqlSecondaryServer.failoverGroups().get(failoverGroup.name());
        Assertions.assertEquals(failoverGroupName, failoverGroupOnPartner.name());
        Assertions.assertEquals(rgName, failoverGroupOnPartner.resourceGroupName());
        Assertions.assertEquals(sqlSecondaryServerName, failoverGroupOnPartner.sqlServerName());
        Assertions.assertEquals(FailoverGroupReplicationRole.SECONDARY, failoverGroupOnPartner.replicationRole());
        Assertions.assertEquals(1, failoverGroupOnPartner.partnerServers().size());
        Assertions.assertEquals(sqlPrimaryServer.id(), failoverGroupOnPartner.partnerServers().get(0).id());
        Assertions
            .assertEquals(
                FailoverGroupReplicationRole.PRIMARY, failoverGroupOnPartner.partnerServers().get(0).replicationRole());
        Assertions.assertEquals(0, failoverGroupOnPartner.databases().size());
        Assertions.assertEquals(0, failoverGroupOnPartner.readWriteEndpointDataLossGracePeriodMinutes());
        Assertions
            .assertEquals(ReadWriteEndpointFailoverPolicy.MANUAL, failoverGroupOnPartner.readWriteEndpointPolicy());
        Assertions
            .assertEquals(ReadOnlyEndpointFailoverPolicy.DISABLED, failoverGroupOnPartner.readOnlyEndpointPolicy());

        SqlFailoverGroup failoverGroup2 =
            sqlPrimaryServer
                .failoverGroups()
                .define(failoverGroupName2)
                .withAutomaticReadWriteEndpointPolicyAndDataLossGracePeriod(120)
                .withPartnerServerId(sqlOtherServer.id())
                .withReadOnlyEndpointPolicyEnabled()
                .create();
        Assertions.assertNotNull(failoverGroup2);
        Assertions.assertEquals(failoverGroupName2, failoverGroup2.name());
        Assertions.assertEquals(rgName, failoverGroup2.resourceGroupName());
        Assertions.assertEquals(sqlPrimaryServerName, failoverGroup2.sqlServerName());
        Assertions.assertEquals(FailoverGroupReplicationRole.PRIMARY, failoverGroup2.replicationRole());
        Assertions.assertEquals(1, failoverGroup2.partnerServers().size());
        Assertions.assertEquals(sqlOtherServer.id(), failoverGroup2.partnerServers().get(0).id());
        Assertions
            .assertEquals(
                FailoverGroupReplicationRole.SECONDARY, failoverGroup2.partnerServers().get(0).replicationRole());
        Assertions.assertEquals(0, failoverGroup2.databases().size());
        Assertions.assertEquals(120, failoverGroup2.readWriteEndpointDataLossGracePeriodMinutes());
        Assertions.assertEquals(ReadWriteEndpointFailoverPolicy.AUTOMATIC, failoverGroup2.readWriteEndpointPolicy());
        Assertions.assertEquals(ReadOnlyEndpointFailoverPolicy.ENABLED, failoverGroup2.readOnlyEndpointPolicy());

        failoverGroup
            .update()
            .withAutomaticReadWriteEndpointPolicyAndDataLossGracePeriod(120)
            .withReadOnlyEndpointPolicyEnabled()
            .withTag("tag1", "value1")
            .apply();
        Assertions.assertEquals(120, failoverGroup.readWriteEndpointDataLossGracePeriodMinutes());
        Assertions.assertEquals(ReadWriteEndpointFailoverPolicy.AUTOMATIC, failoverGroup.readWriteEndpointPolicy());
        Assertions.assertEquals(ReadOnlyEndpointFailoverPolicy.ENABLED, failoverGroup.readOnlyEndpointPolicy());

        SqlDatabase db = sqlPrimaryServer.databases().get(dbName);
        failoverGroup
            .update()
            .withManualReadWriteEndpointPolicy()
            .withReadOnlyEndpointPolicyDisabled()
            .withNewDatabaseId(db.id())
            .apply();
        Assertions.assertEquals(1, failoverGroup.databases().size());
        Assertions.assertEquals(db.id(), failoverGroup.databases().get(0));
        Assertions.assertEquals(0, failoverGroup.readWriteEndpointDataLossGracePeriodMinutes());
        Assertions.assertEquals(ReadWriteEndpointFailoverPolicy.MANUAL, failoverGroup.readWriteEndpointPolicy());
        Assertions.assertEquals(ReadOnlyEndpointFailoverPolicy.DISABLED, failoverGroup.readOnlyEndpointPolicy());

        List<SqlFailoverGroup> failoverGroupsList = sqlPrimaryServer.failoverGroups().list();
        Assertions.assertEquals(2, failoverGroupsList.size());

        failoverGroupsList = sqlSecondaryServer.failoverGroups().list();
        Assertions.assertEquals(1, failoverGroupsList.size());

        sqlPrimaryServer.failoverGroups().delete(failoverGroup2.name());
    }

    @Test
    public void canChangeSqlServerAndDatabaseAutomaticTuning() throws Exception {
        String sqlServerAdminName = "sqladmin";
        String sqlServerAdminPassword = password();
        String databaseName = "db-from-sample";
        String id = generateRandomUuid();
        String storageName = generateRandomResourceName(sqlServerName, 22);

        // Create
        SqlServer sqlServer =
            sqlServerManager
                .sqlServers()
                .define(sqlServerName)
                .withRegion(Region.US_EAST)
                .withNewResourceGroup(rgName)
                .withAdministratorLogin(sqlServerAdminName)
                .withAdministratorPassword(sqlServerAdminPassword)
                .defineDatabase(databaseName)
                .fromSample(SampleName.ADVENTURE_WORKS_LT)
                .withBasicEdition()
                .attach()
                .create();
        SqlDatabase dbFromSample = sqlServer.databases().get(databaseName);
        Assertions.assertNotNull(dbFromSample);
        Assertions.assertEquals(DatabaseEdition.BASIC, dbFromSample.edition());

        SqlServerAutomaticTuning serverAutomaticTuning = sqlServer.getServerAutomaticTuning();
        Assertions.assertEquals(AutomaticTuningServerMode.AUTO, serverAutomaticTuning.desiredState());
        Assertions.assertEquals(AutomaticTuningServerMode.AUTO, serverAutomaticTuning.actualState());
        Assertions.assertEquals(4, serverAutomaticTuning.tuningOptions().size());

        serverAutomaticTuning
            .update()
            .withAutomaticTuningMode(AutomaticTuningServerMode.AUTO)
            .withAutomaticTuningOption("createIndex", AutomaticTuningOptionModeDesired.OFF)
            .withAutomaticTuningOption("dropIndex", AutomaticTuningOptionModeDesired.ON)
            .withAutomaticTuningOption("forceLastGoodPlan", AutomaticTuningOptionModeDesired.DEFAULT)
            .apply();
        Assertions.assertEquals(AutomaticTuningServerMode.AUTO, serverAutomaticTuning.desiredState());
        Assertions.assertEquals(AutomaticTuningServerMode.AUTO, serverAutomaticTuning.actualState());
        Assertions
            .assertEquals(
                AutomaticTuningOptionModeDesired.OFF,
                serverAutomaticTuning.tuningOptions().get("createIndex").desiredState());
        Assertions
            .assertEquals(
                AutomaticTuningOptionModeActual.OFF,
                serverAutomaticTuning.tuningOptions().get("createIndex").actualState());
        Assertions
            .assertEquals(
                AutomaticTuningOptionModeDesired.ON,
                serverAutomaticTuning.tuningOptions().get("dropIndex").desiredState());
        Assertions
            .assertEquals(
                AutomaticTuningOptionModeActual.ON,
                serverAutomaticTuning.tuningOptions().get("dropIndex").actualState());
        Assertions
            .assertEquals(
                AutomaticTuningOptionModeDesired.DEFAULT,
                serverAutomaticTuning.tuningOptions().get("forceLastGoodPlan").desiredState());

        SqlDatabaseAutomaticTuning databaseAutomaticTuning = dbFromSample.getDatabaseAutomaticTuning();
        Assertions.assertEquals(4, databaseAutomaticTuning.tuningOptions().size());

        // The following results in "InternalServerError" at the moment
        databaseAutomaticTuning
            .update()
            .withAutomaticTuningMode(AutomaticTuningMode.AUTO)
            .withAutomaticTuningOption("createIndex", AutomaticTuningOptionModeDesired.OFF)
            .withAutomaticTuningOption("dropIndex", AutomaticTuningOptionModeDesired.ON)
            .withAutomaticTuningOption("forceLastGoodPlan", AutomaticTuningOptionModeDesired.DEFAULT)
            .apply();
        Assertions.assertEquals(AutomaticTuningMode.AUTO, databaseAutomaticTuning.desiredState());
        Assertions.assertEquals(AutomaticTuningMode.AUTO, databaseAutomaticTuning.actualState());
        Assertions
            .assertEquals(
                AutomaticTuningOptionModeDesired.OFF,
                databaseAutomaticTuning.tuningOptions().get("createIndex").desiredState());
        Assertions
            .assertEquals(
                AutomaticTuningOptionModeActual.OFF,
                databaseAutomaticTuning.tuningOptions().get("createIndex").actualState());
        Assertions
            .assertEquals(
                AutomaticTuningOptionModeDesired.ON,
                databaseAutomaticTuning.tuningOptions().get("dropIndex").desiredState());
        Assertions
            .assertEquals(
                AutomaticTuningOptionModeActual.ON,
                databaseAutomaticTuning.tuningOptions().get("dropIndex").actualState());
        Assertions
            .assertEquals(
                AutomaticTuningOptionModeDesired.DEFAULT,
                databaseAutomaticTuning.tuningOptions().get("forceLastGoodPlan").desiredState());

        // cleanup
        dbFromSample.delete();
        sqlServerManager.sqlServers().deleteByResourceGroup(rgName, sqlServerName);
    }

    @Test
    public void canCreateAndAquireServerDnsAlias() throws Exception {
        String sqlServerName1 = sqlServerName + "1";
        String sqlServerName2 = sqlServerName + "2";
        String sqlServerAdminName = "sqladmin";
        String sqlServerAdminPassword = password();

        // Create
        SqlServer sqlServer1 =
            sqlServerManager
                .sqlServers()
                .define(sqlServerName1)
                .withRegion(Region.US_EAST)
                .withNewResourceGroup(rgName)
                .withAdministratorLogin(sqlServerAdminName)
                .withAdministratorPassword(sqlServerAdminPassword)
                .create();
        Assertions.assertNotNull(sqlServer1);

        SqlServerDnsAlias dnsAlias = sqlServer1.dnsAliases().define(sqlServerName).create();

        Assertions.assertNotNull(dnsAlias);
        Assertions.assertEquals(rgName, dnsAlias.resourceGroupName());
        Assertions.assertEquals(sqlServerName1, dnsAlias.sqlServerName());

        dnsAlias = sqlServerManager.sqlServers().dnsAliases().getBySqlServer(rgName, sqlServerName1, sqlServerName);
        Assertions.assertNotNull(dnsAlias);
        Assertions.assertEquals(rgName, dnsAlias.resourceGroupName());
        Assertions.assertEquals(sqlServerName1, dnsAlias.sqlServerName());

        Assertions.assertEquals(1, sqlServer1.databases().list().size());

        SqlServer sqlServer2 =
            sqlServerManager
                .sqlServers()
                .define(sqlServerName2)
                .withRegion(Region.US_EAST)
                .withNewResourceGroup(rgName)
                .withAdministratorLogin(sqlServerAdminName)
                .withAdministratorPassword(sqlServerAdminPassword)
                .create();
        Assertions.assertNotNull(sqlServer2);

        sqlServer2.dnsAliases().acquire(sqlServerName, sqlServer1.id());
        ResourceManagerUtils.sleep(Duration.ofMinutes(3));

        dnsAlias = sqlServer2.dnsAliases().get(sqlServerName);
        Assertions.assertNotNull(dnsAlias);
        Assertions.assertEquals(rgName, dnsAlias.resourceGroupName());
        Assertions.assertEquals(sqlServerName2, dnsAlias.sqlServerName());

        // cleanup
        dnsAlias.delete();

        sqlServerManager.sqlServers().deleteByResourceGroup(rgName, sqlServerName1);
        sqlServerManager.sqlServers().deleteByResourceGroup(rgName, sqlServerName2);
    }

    @Test
    @LiveOnly
    public void canGetSqlServerCapabilitiesAndCreateIdentity() throws Exception {
        // LiveOnly because "test timing out after latest test proxy update"
        String sqlServerAdminName = "sqladmin";
        String sqlServerAdminPassword = password();
        String databaseName = "db-from-sample";

        RegionCapabilities regionCapabilities = sqlServerManager.sqlServers().getCapabilitiesByRegion(Region.US_EAST);
        Assertions.assertNotNull(regionCapabilities);
        Assertions.assertNotNull(regionCapabilities.supportedCapabilitiesByServerVersion().get("12.0"));
        Assertions
            .assertTrue(
                regionCapabilities.supportedCapabilitiesByServerVersion().get("12.0").supportedEditions().size() > 0);
        Assertions
            .assertTrue(
                regionCapabilities
                        .supportedCapabilitiesByServerVersion()
                        .get("12.0")
                        .supportedElasticPoolEditions()
                        .size()
                    > 0);

        // Create
        SqlServer sqlServer =
            sqlServerManager
                .sqlServers()
                .define(sqlServerName)
                .withRegion(Region.US_EAST)
                .withNewResourceGroup(rgName)
                .withAdministratorLogin(sqlServerAdminName)
                .withAdministratorPassword(sqlServerAdminPassword)
                .withSystemAssignedManagedServiceIdentity()
                .defineDatabase(databaseName)
                .fromSample(SampleName.ADVENTURE_WORKS_LT)
                .withBasicEdition()
                .attach()
                .create();
        SqlDatabase dbFromSample = sqlServer.databases().get(databaseName);
        Assertions.assertNotNull(dbFromSample);
        Assertions.assertEquals(DatabaseEdition.BASIC, dbFromSample.edition());

        Assertions.assertTrue(sqlServer.isManagedServiceIdentityEnabled());
        if (!isPlaybackMode()) {
            Assertions.assertEquals(sqlServerManager.tenantId(), sqlServer.systemAssignedManagedServiceIdentityTenantId());
        }
        Assertions.assertNotNull(sqlServer.systemAssignedManagedServiceIdentityPrincipalId());

        sqlServer.update().withSystemAssignedManagedServiceIdentity().apply();
        Assertions.assertTrue(sqlServer.isManagedServiceIdentityEnabled());
        if (!isPlaybackMode()) {
            Assertions.assertEquals(sqlServerManager.tenantId(), sqlServer.systemAssignedManagedServiceIdentityTenantId());
        }
        Assertions.assertNotNull(sqlServer.systemAssignedManagedServiceIdentityPrincipalId());

        // cleanup
        dbFromSample.delete();
        sqlServerManager.sqlServers().deleteByResourceGroup(rgName, sqlServerName);
    }

    @Test
    @DoNotRecord(skipInPlayback = true)
    // The test makes calls to the Azure Storage data plane APIs which are not mocked at this time.
    public void canCRUDSqlServerWithImportDatabase() throws Exception {
        // Create

        String sqlServerAdminName = "sqladmin";
        String sqlServerAdminPassword = password();
        String id = generateRandomUuid();
        String storageName = generateRandomResourceName(sqlServerName, 22);

        SqlServer sqlServer =
            sqlServerManager
                .sqlServers()
                .define(sqlServerName)
                .withRegion(Region.US_EAST)
                .withNewResourceGroup(rgName)
                .withAdministratorLogin(sqlServerAdminName)
                .withAdministratorPassword(sqlServerAdminPassword)
                .withActiveDirectoryAdministrator("DSEng", id)
                .create();

        SqlDatabase dbFromSample =
            sqlServer
                .databases()
                .define("db-from-sample")
                .fromSample(SampleName.ADVENTURE_WORKS_LT)
                .withBasicEdition()
                .withTag("tag1", "value1")
                .create();
        Assertions.assertNotNull(dbFromSample);
        Assertions.assertEquals(DatabaseEdition.BASIC, dbFromSample.edition());

        SqlDatabaseImportExportResponse exportedDB;
        StorageAccount storageAccount = null;
        try {
            storageAccount =
                storageManager.storageAccounts().getByResourceGroup(sqlServer.resourceGroupName(), storageName);
        } catch (ManagementException e) {
            Assertions.assertEquals(404, e.getResponse().getStatusCode());
        }
        if (storageAccount == null) {
            Creatable<StorageAccount> storageAccountCreatable =
                storageManager
                    .storageAccounts()
                    .define(storageName)
                    .withRegion(sqlServer.regionName())
                    .withExistingResourceGroup(sqlServer.resourceGroupName());

            exportedDB =
                dbFromSample
                    .exportTo(storageAccountCreatable, "from-sample", "dbfromsample.bacpac")
                    .withSqlAdministratorLoginAndPassword(sqlServerAdminName, sqlServerAdminPassword)
                    .execute();
            storageAccount =
                storageManager.storageAccounts().getByResourceGroup(sqlServer.resourceGroupName(), storageName);
        } else {
            exportedDB =
                dbFromSample
                    .exportTo(storageAccount, "from-sample", "dbfromsample.bacpac")
                    .withSqlAdministratorLoginAndPassword(sqlServerAdminName, sqlServerAdminPassword)
                    .execute();
        }

        SqlDatabase dbFromImport =
            sqlServer
                .databases()
                .define("db-from-import")
                .defineElasticPool("ep1")
                .withBasicPool()
                .attach()
                .importFrom(storageAccount, "from-sample", "dbfromsample.bacpac")
                .withSqlAdministratorLoginAndPassword(sqlServerAdminName, sqlServerAdminPassword)
                .withTag("tag2", "value2")
                .create();
        Assertions.assertNotNull(dbFromImport);
        Assertions.assertEquals("ep1", dbFromImport.elasticPoolName());

        dbFromImport.delete();
        dbFromSample.delete();
        sqlServer.elasticPools().delete("ep1");
        sqlServerManager.sqlServers().deleteByResourceGroup(rgName, sqlServerName);
    }

    @Test
    public void canCRUDSqlServerWithFirewallRule() throws Exception {
        // Create
        String sqlServerAdminName = "sqladmin";
        String id = generateRandomUuid();
        if (!isPlaybackMode()) {
            id = clientIdFromFile();
        }

        SqlServer sqlServer =
            sqlServerManager
                .sqlServers()
                .define(sqlServerName)
                .withRegion(Region.US_EAST)
                .withNewResourceGroup(rgName)
                .withAdministratorLogin(sqlServerAdminName)
                .withAdministratorPassword(password())
                .withActiveDirectoryAdministrator("DSEng", id)
                .withoutAccessFromAzureServices()
                .defineFirewallRule("somefirewallrule1")
                .withIpAddress("0.0.0.1")
                .attach()
                .withTag("tag1", "value1")
                .create();
        Assertions.assertEquals(sqlServerAdminName, sqlServer.administratorLogin());
        Assertions.assertEquals("v12.0", sqlServer.kind());
        Assertions.assertEquals("12.0", sqlServer.version());

        sqlServer = sqlServerManager.sqlServers().getByResourceGroup(rgName, sqlServerName);
        Assertions.assertEquals(sqlServerAdminName, sqlServer.administratorLogin());
        Assertions.assertEquals("v12.0", sqlServer.kind());
        Assertions.assertEquals("12.0", sqlServer.version());

        SqlActiveDirectoryAdministrator sqlADAdmin = sqlServer.getActiveDirectoryAdministrator();
        Assertions.assertNotNull(sqlADAdmin);
        Assertions.assertEquals("DSEng", sqlADAdmin.signInName());
        Assertions.assertNotNull(sqlADAdmin.id());
        Assertions.assertEquals(AdministratorType.ACTIVE_DIRECTORY, sqlADAdmin.administratorType());

        sqlADAdmin = sqlServer.setActiveDirectoryAdministrator("DSEngAll", id);
        Assertions.assertNotNull(sqlADAdmin);
        Assertions.assertEquals("DSEngAll", sqlADAdmin.signInName());
        Assertions.assertNotNull(sqlADAdmin.id());
        Assertions.assertEquals(AdministratorType.ACTIVE_DIRECTORY, sqlADAdmin.administratorType());
        sqlServer.removeActiveDirectoryAdministrator();

        final SqlServer finalSqlServer = sqlServer;
        validateResourceNotFound(() -> finalSqlServer.getActiveDirectoryAdministrator());

        SqlFirewallRule firewallRule =
            sqlServerManager.sqlServers().firewallRules().getBySqlServer(rgName, sqlServerName, "somefirewallrule1");
        Assertions.assertEquals("0.0.0.1", firewallRule.startIpAddress());
        Assertions.assertEquals("0.0.0.1", firewallRule.endIpAddress());

        validateResourceNotFound(
            () ->
                sqlServerManager
                    .sqlServers()
                    .firewallRules()
                    .getBySqlServer(rgName, sqlServerName, "AllowAllWindowsAzureIps"));

        sqlServer.enableAccessFromAzureServices();
        firewallRule =
            sqlServerManager
                .sqlServers()
                .firewallRules()
                .getBySqlServer(rgName, sqlServerName, "AllowAllWindowsAzureIps");
        Assertions.assertEquals("0.0.0.0", firewallRule.startIpAddress());
        Assertions.assertEquals("0.0.0.0", firewallRule.endIpAddress());

        sqlServer.update().defineFirewallRule("newFirewallRule1")
            .withIpAddress("0.0.0.2")
            .attach()
            .apply();
        sqlServer.firewallRules().delete("newFirewallRule2");

        final SqlServer finalSqlServer1 = sqlServer;
        validateResourceNotFound(() -> finalSqlServer1.firewallRules().get("newFirewallRule2"));

        firewallRule =
            sqlServerManager
                .sqlServers()
                .firewallRules()
                .define("newFirewallRule2")
                .withExistingSqlServer(rgName, sqlServerName)
                .withIpAddress("0.0.0.3")
                .create();

        Assertions.assertEquals("0.0.0.3", firewallRule.startIpAddress());
        Assertions.assertEquals("0.0.0.3", firewallRule.endIpAddress());

        firewallRule = firewallRule.update().withStartIpAddress("0.0.0.1").apply();

        Assertions.assertEquals("0.0.0.1", firewallRule.startIpAddress());
        Assertions.assertEquals("0.0.0.3", firewallRule.endIpAddress());

        sqlServer.firewallRules().delete("somefirewallrule1");
        validateResourceNotFound(
            () ->
                sqlServerManager
                    .sqlServers()
                    .firewallRules()
                    .getBySqlServer(rgName, sqlServerName, "somefirewallrule1"));

        firewallRule = sqlServer.firewallRules().define("somefirewallrule2").withIpAddress("0.0.0.4").create();

        Assertions.assertEquals("0.0.0.4", firewallRule.startIpAddress());
        Assertions.assertEquals("0.0.0.4", firewallRule.endIpAddress());

//        sqlServer.enableAccessFromAzureServices();

        firewallRule.delete();
    }

    @Test
    public void canCRUDSqlServer() throws Exception {

        // Check if the name is available
        CheckNameAvailabilityResult checkNameResult =
            sqlServerManager.sqlServers().checkNameAvailability(sqlServerName);
        Assertions.assertTrue(checkNameResult.isAvailable());

        // Create
        SqlServer sqlServer = createSqlServer();

        validateSqlServer(sqlServer);

        // Confirm the server name is unavailable
        checkNameResult = sqlServerManager.sqlServers().checkNameAvailability(sqlServerName);
        Assertions.assertFalse(checkNameResult.isAvailable());
        Assertions
            .assertEquals(
                CheckNameAvailabilityReason.ALREADY_EXISTS.toString(), checkNameResult.unavailabilityReason());

        sqlServer.update().withAdministratorPassword("P@ssword~2").apply();

        // List
        PagedIterable<SqlServer> sqlServers = sqlServerManager.sqlServers().listByResourceGroup(rgName);
        boolean found = false;
        for (SqlServer server : sqlServers) {
            if (server.name().equals(sqlServerName)) {
                found = true;
            }
        }
        Assertions.assertTrue(found);
        // Get
        sqlServer = sqlServerManager.sqlServers().getByResourceGroup(rgName, sqlServerName);
        Assertions.assertNotNull(sqlServer);

        sqlServerManager.sqlServers().deleteByResourceGroup(sqlServer.resourceGroupName(), sqlServer.name());
        validateSqlServerNotFound(sqlServer);
    }

    @Test
    public void canUseCoolShortcutsForResourceCreation() throws Exception {
        String database2Name = "database2";
        String database1InEPName = "database1InEP";
        String database2InEPName = "database2InEP";
        String elasticPool2Name = "elasticPool2";
        String elasticPool3Name = "elasticPool3";
        String elasticPool1Name = SQL_ELASTIC_POOL_NAME;

        // Create
        SqlServer sqlServer =
            sqlServerManager
                .sqlServers()
                .define(sqlServerName)
                .withRegion(Region.US_EAST)
                .withNewResourceGroup(rgName)
                .withAdministratorLogin("userName")
                .withAdministratorPassword("Password~1")
                .withoutAccessFromAzureServices()
                .defineDatabase(SQL_DATABASE_NAME).attach()
                .defineDatabase(database2Name).attach()
                .defineElasticPool(elasticPool1Name).withStandardPool().attach()
                .defineElasticPool(elasticPool2Name).withPremiumPool().attach()
                .defineElasticPool(elasticPool3Name).withStandardPool().attach()
                .defineDatabase(database1InEPName).withExistingElasticPool(elasticPool2Name).attach()
                .defineDatabase(database2InEPName).withExistingElasticPool(elasticPool2Name).attach()
                .defineFirewallRule(SQL_FIREWALLRULE_NAME).withIpAddressRange(START_IPADDRESS, END_IPADDRESS).attach()
                .defineFirewallRule(generateRandomResourceName("firewall_", 15)).withIpAddressRange(START_IPADDRESS, END_IPADDRESS).attach()
                .defineFirewallRule(generateRandomResourceName("firewall_", 15)).withIpAddress(START_IPADDRESS).attach()
                .create();

        validateMultiCreation(
            database2Name,
            database1InEPName,
            database2InEPName,
            elasticPool1Name,
            elasticPool2Name,
            elasticPool3Name,
            sqlServer,
            false);
        elasticPool1Name = SQL_ELASTIC_POOL_NAME + " U";
        database2Name = "database2U";
        database1InEPName = "database1InEPU";
        database2InEPName = "database2InEPU";
        elasticPool2Name = "elasticPool2U";
        elasticPool3Name = "elasticPool3U";

        // Update
        sqlServer =
            sqlServer
                .update()
                .defineDatabase(SQL_DATABASE_NAME).attach()
                .defineDatabase(database2Name).attach()
                .defineElasticPool(elasticPool1Name).withStandardPool().attach()
                .defineElasticPool(elasticPool2Name).withPremiumPool().attach()
                .defineElasticPool(elasticPool3Name).withStandardPool().attach()
                .defineDatabase(database1InEPName).withExistingElasticPool(elasticPool2Name).attach()
                .defineDatabase(database2InEPName).withExistingElasticPool(elasticPool2Name).attach()
                .defineFirewallRule(SQL_FIREWALLRULE_NAME).withIpAddressRange(START_IPADDRESS, END_IPADDRESS).attach()
                .defineFirewallRule(generateRandomResourceName("firewall_", 15)).withIpAddressRange(START_IPADDRESS, END_IPADDRESS).attach()
                .defineFirewallRule(generateRandomResourceName("firewall_", 15)).withIpAddress(START_IPADDRESS).attach()
                .withTag("tag2", "value2")
                .apply();

        validateMultiCreation(
            database2Name,
            database1InEPName,
            database2InEPName,
            elasticPool1Name,
            elasticPool2Name,
            elasticPool3Name,
            sqlServer,
            true);

        sqlServer.refresh();
        Assertions.assertEquals(sqlServer.elasticPools().list().size(), 0);

        // List
        PagedIterable<SqlServer> sqlServers = sqlServerManager.sqlServers().listByResourceGroup(rgName);
        boolean found = false;
        for (SqlServer server : sqlServers) {
            if (server.name().equals(sqlServerName)) {
                found = true;
            }
        }

        Assertions.assertTrue(found);
        // Get
        sqlServer = sqlServerManager.sqlServers().getByResourceGroup(rgName, sqlServerName);
        Assertions.assertNotNull(sqlServer);

        sqlServerManager.sqlServers().deleteByResourceGroup(sqlServer.resourceGroupName(), sqlServer.name());
        validateSqlServerNotFound(sqlServer);
    }

    @Test
    public void canCRUDSqlDatabase() throws Exception {
        // Create
        SqlServer sqlServer = createSqlServer();
        Mono<SqlDatabase> resourceStream =
            sqlServer.databases().define(SQL_DATABASE_NAME).withStandardEdition(SqlDatabaseStandardServiceObjective.S0).createAsync();

        SqlDatabase sqlDatabase = resourceStream.block();

        validateSqlDatabase(sqlDatabase, SQL_DATABASE_NAME);
        Assertions.assertTrue(sqlServer.databases().list().size() > 0);

        // Test security alert policy settings.

        final String storageAccountName = generateRandomResourceName("sqlsa", 20);
        StorageAccount storageAccount = storageManager.storageAccounts().define(storageAccountName)
            .withRegion(Region.US_EAST)
            .withExistingResourceGroup(rgName)
            .create();
        String accountKey = storageAccount.getKeys().get(0).value();
        String blobEntrypoint = storageAccount.endPoints().primary().blob();

        List<String> disabledAlerts = Collections.singletonList("Sql_Injection");

        sqlDatabase.defineThreatDetectionPolicy(SecurityAlertPolicyName.fromString("myPolicy"))
            .withPolicyEnabled()
            .withStorageEndpoint(blobEntrypoint)
            .withStorageAccountAccessKey(accountKey)
            .withAlertsFilter(disabledAlerts)
            .create();

        sqlDatabase.refresh();

        SqlDatabaseThreatDetectionPolicy alertPolicy = sqlDatabase.getThreatDetectionPolicy();
        Assertions.assertNotNull(alertPolicy);
        Assertions.assertEquals(SecurityAlertPolicyState.ENABLED, alertPolicy.currentState());
        Assertions.assertEquals(alertPolicy.disabledAlertList(), disabledAlerts);
        Assertions.assertTrue(alertPolicy.isDefaultSecurityAlertPolicy());

        // Done testing security alert policy

        // Test transparent data encryption settings.
        TransparentDataEncryption transparentDataEncryption = sqlDatabase.getTransparentDataEncryption();
        Assertions.assertNotNull(transparentDataEncryption.status());

        transparentDataEncryption = transparentDataEncryption.updateStatus(TransparentDataEncryptionState.ENABLED);

        Assertions.assertNotNull(transparentDataEncryption);
        Assertions.assertEquals(TransparentDataEncryptionState.ENABLED, transparentDataEncryption.status());

        transparentDataEncryption =
            sqlDatabase.getTransparentDataEncryption().updateStatus(TransparentDataEncryptionState.DISABLED);

        Assertions.assertNotNull(transparentDataEncryption);
        Assertions.assertEquals(TransparentDataEncryptionState.DISABLED, transparentDataEncryption.status());
        Assertions.assertEquals(transparentDataEncryption.sqlServerName(), sqlServerName);
        Assertions.assertEquals(transparentDataEncryption.databaseName(), SQL_DATABASE_NAME);
        Assertions.assertNotNull(transparentDataEncryption.name());
        Assertions.assertNotNull(transparentDataEncryption.id());
        // Done testing with encryption settings.

        // Assertions.assertNotNull(sqlDatabase.getUpgradeHint()); // This property is null

        sqlServer = sqlServerManager.sqlServers().getByResourceGroup(rgName, sqlServerName);
        validateSqlServer(sqlServer);

        // Create another database with above created database as source database.
        Creatable<SqlElasticPool> sqlElasticPoolCreatable =
            sqlServer.elasticPools().define(SQL_ELASTIC_POOL_NAME).withStandardPool();
        String anotherDatabaseName = "anotherDatabase";
        SqlDatabase anotherDatabase =
            sqlServer
                .databases()
                .define(anotherDatabaseName)
                .withNewElasticPool(sqlElasticPoolCreatable)
                .withSourceDatabase(sqlDatabase.id())
                .withMode(CreateMode.COPY)
                .create();

        validateSqlDatabaseWithElasticPool(anotherDatabase, anotherDatabaseName);
        sqlServer.databases().delete(anotherDatabase.name());

        // Get
        validateSqlDatabase(sqlServer.databases().get(SQL_DATABASE_NAME), SQL_DATABASE_NAME);

        // List
        validateListSqlDatabase(sqlServer.databases().list());

        // Delete
        sqlServer.databases().delete(SQL_DATABASE_NAME);
        validateSqlDatabaseNotFound(SQL_DATABASE_NAME);

        // Add another database to the server
        resourceStream =
            sqlServer
                .databases()
                .define("newDatabase")
                .withCollation(COLLATION)
                .withStandardEdition(SqlDatabaseStandardServiceObjective.S0)
                .createAsync();

        sqlDatabase = resourceStream.block();

        // Rename the database
        sqlDatabase = sqlDatabase.rename("renamedDatabase");
        validateSqlDatabase(sqlDatabase, "renamedDatabase");

        sqlServer.databases().delete(sqlDatabase.name());

        sqlServerManager.sqlServers().deleteByResourceGroup(sqlServer.resourceGroupName(), sqlServer.name());
        validateSqlServerNotFound(sqlServer);
    }

    @Test
    public void canManageReplicationLinks() throws Exception {
        // Create
        String anotherSqlServerName = sqlServerName + "another";
        SqlServer sqlServer1 = createSqlServer();
        SqlServer sqlServer2 = createSqlServer(anotherSqlServerName);

        Mono<SqlDatabase> resourceStream =
            sqlServer1
                .databases()
                .define(SQL_DATABASE_NAME)
                .withCollation(COLLATION)
                .withStandardEdition(SqlDatabaseStandardServiceObjective.S0)
                .createAsync();

        SqlDatabase databaseInServer1 = resourceStream.block();

        validateSqlDatabase(databaseInServer1, SQL_DATABASE_NAME);
        SqlDatabase databaseInServer2 =
            sqlServer2
                .databases()
                .define(SQL_DATABASE_NAME)
                .withSourceDatabase(databaseInServer1.id())
                .withMode(CreateMode.ONLINE_SECONDARY)
                .create();
        ResourceManagerUtils.sleep(Duration.ofSeconds(2));
        List<ReplicationLink> replicationLinksInDb1 =
            new ArrayList<>(databaseInServer1.listReplicationLinks().values());

        Assertions.assertEquals(replicationLinksInDb1.size(), 1);
        Assertions.assertEquals(replicationLinksInDb1.get(0).partnerDatabase(), databaseInServer2.name());
        Assertions.assertEquals(replicationLinksInDb1.get(0).partnerServer(), databaseInServer2.sqlServerName());

        List<ReplicationLink> replicationLinksInDb2 =
            new ArrayList<>(databaseInServer2.listReplicationLinks().values());

        Assertions.assertEquals(replicationLinksInDb2.size(), 1);
        Assertions.assertEquals(replicationLinksInDb2.get(0).partnerDatabase(), databaseInServer1.name());
        Assertions.assertEquals(replicationLinksInDb2.get(0).partnerServer(), databaseInServer1.sqlServerName());

        Assertions.assertNotNull(replicationLinksInDb1.get(0).refresh());

        // Failover
        replicationLinksInDb2.get(0).failover();
        replicationLinksInDb2.get(0).refresh();
        ResourceManagerUtils.sleep(Duration.ofSeconds(30));
        // Force failover
        replicationLinksInDb1.get(0).forceFailoverAllowDataLoss();
        replicationLinksInDb1.get(0).refresh();

        ResourceManagerUtils.sleep(Duration.ofSeconds(30));

        replicationLinksInDb2.get(0).delete();
        Assertions.assertEquals(databaseInServer2.listReplicationLinks().size(), 0);

        sqlServer1.databases().delete(databaseInServer1.name());
        sqlServer2.databases().delete(databaseInServer2.name());

        sqlServerManager.sqlServers().deleteByResourceGroup(sqlServer2.resourceGroupName(), sqlServer2.name());
        validateSqlServerNotFound(sqlServer2);
        sqlServerManager.sqlServers().deleteByResourceGroup(sqlServer1.resourceGroupName(), sqlServer1.name());
        validateSqlServerNotFound(sqlServer1);
    }

    @Test
    public void canDoOperationsOnDataWarehouse() throws Exception {
        // Create
        SqlServer sqlServer = createSqlServer();

        validateSqlServer(sqlServer);

        // List usages for the server.TODO (xiaofeicao) server backend not deployed
//        Assertions.assertNotNull(sqlServer.listUsageMetrics());

        Mono<SqlDatabase> resourceStream =
            sqlServer
                .databases()
                .define(SQL_DATABASE_NAME)
                .withCollation(COLLATION)
                .withSku(DatabaseSku.DATAWAREHOUSE_DW1000C)
                .createAsync();

        SqlDatabase sqlDatabase = resourceStream.block();
        Assertions.assertNotNull(sqlDatabase);

        sqlDatabase = sqlServer.databases().get(SQL_DATABASE_NAME);
        Assertions.assertNotNull(sqlDatabase);
        Assertions.assertTrue(sqlDatabase.isDataWarehouse());

        // Get
        SqlWarehouse dataWarehouse = sqlServer.databases().get(SQL_DATABASE_NAME).asWarehouse();

        Assertions.assertNotNull(dataWarehouse);
        Assertions.assertEquals(dataWarehouse.name(), SQL_DATABASE_NAME);
        Assertions.assertEquals(DatabaseEdition.DATA_WAREHOUSE, dataWarehouse.edition());

        // List Restore points.
        Assertions.assertNotNull(dataWarehouse.listRestorePoints());
        // Get usages. TODO (xiaofeicao) server backend not deployed
//        Assertions.assertNotNull(dataWarehouse.listUsageMetrics());

        // Pause warehouse
        dataWarehouse.pauseDataWarehouse();

        // Resume warehouse
        dataWarehouse.resumeDataWarehouse();

        sqlServer.databases().delete(SQL_DATABASE_NAME);

        sqlServerManager.sqlServers().deleteByResourceGroup(sqlServer.resourceGroupName(), sqlServer.name());
        validateSqlServerNotFound(sqlServer);
    }

    @Test
    public void canCRUDSqlDatabaseWithElasticPool() throws Exception {
        // Create
        SqlServer sqlServer = createSqlServer();

        Creatable<SqlElasticPool> sqlElasticPoolCreatable =
            sqlServer
                .elasticPools()
                .define(SQL_ELASTIC_POOL_NAME)
                .withStandardPool()
                .withTag("tag1", "value1");

        Mono<SqlDatabase> resourceStream =
            sqlServer
                .databases()
                .define(SQL_DATABASE_NAME)
                .withNewElasticPool(sqlElasticPoolCreatable)
                .withCollation(COLLATION)
                .createAsync();

        SqlDatabase sqlDatabase = resourceStream.block();

        validateSqlDatabase(sqlDatabase, SQL_DATABASE_NAME);

        sqlServer = sqlServerManager.sqlServers().getByResourceGroup(rgName, sqlServerName);
        validateSqlServer(sqlServer);

        // Get Elastic pool
        SqlElasticPool elasticPool = sqlServer.elasticPools().get(SQL_ELASTIC_POOL_NAME);
        validateSqlElasticPool(elasticPool);

        // Get
        validateSqlDatabaseWithElasticPool(sqlServer.databases().get(SQL_DATABASE_NAME), SQL_DATABASE_NAME);

        // List
        validateListSqlDatabase(sqlServer.databases().list());

        // Remove database from elastic pools.
        sqlDatabase
            .update()
            .withoutElasticPool()
            .withStandardEdition(SqlDatabaseStandardServiceObjective.S3)
            .apply();
        sqlDatabase = sqlServer.databases().get(SQL_DATABASE_NAME);
        Assertions.assertNull(sqlDatabase.elasticPoolName());

        // Update edition of the SQL database
        sqlDatabase.update().withPremiumEdition(SqlDatabasePremiumServiceObjective.P1).apply();
        sqlDatabase = sqlServer.databases().get(SQL_DATABASE_NAME);
        Assertions.assertEquals(sqlDatabase.edition(), DatabaseEdition.PREMIUM);
        Assertions.assertEquals(sqlDatabase.currentServiceObjectiveName(), ServiceObjectiveName.P1.toString());

        // Update just the service level objective for database.
        sqlDatabase.update().withPremiumEdition(SqlDatabasePremiumServiceObjective.P2).apply();
        sqlDatabase = sqlServer.databases().get(SQL_DATABASE_NAME);
        Assertions.assertEquals(sqlDatabase.currentServiceObjectiveName(), ServiceObjectiveName.P2.toString());
        Assertions.assertEquals(sqlDatabase.requestedServiceObjectiveName(), ServiceObjectiveName.P2.toString());

        // Update max size bytes of the database.
        sqlDatabase.update().withMaxSizeBytes(268435456000L).apply();

        sqlDatabase = sqlServer.databases().get(SQL_DATABASE_NAME);
        Assertions.assertEquals(sqlDatabase.maxSizeBytes(), 268435456000L);

        // Put the database back in elastic pool.
        sqlDatabase.update().withExistingElasticPool(SQL_ELASTIC_POOL_NAME).apply();

        sqlDatabase = sqlServer.databases().get(SQL_DATABASE_NAME);
        Assertions.assertEquals(sqlDatabase.elasticPoolName(), SQL_ELASTIC_POOL_NAME);

        // List Activity in elastic pool
        Assertions.assertNotNull(elasticPool.listActivities());

        // List databases in elastic pool.
        List<SqlDatabase> databasesInElasticPool = elasticPool.listDatabases();
        Assertions.assertNotNull(databasesInElasticPool);
        Assertions.assertEquals(databasesInElasticPool.size(), 1);

        // Get a particular database in elastic pool.
        SqlDatabase databaseInElasticPool = elasticPool.getDatabase(SQL_DATABASE_NAME);
        validateSqlDatabase(databaseInElasticPool, SQL_DATABASE_NAME);

        // Refresh works on the database got from elastic pool.
        databaseInElasticPool.refresh();

        // Validate that trying to get an invalid database from elastic pool returns null.
        validateResourceNotFound(() -> elasticPool.getDatabase("does_not_exist"));

        // Delete
        sqlServer.databases().delete(SQL_DATABASE_NAME);
        validateSqlDatabaseNotFound(SQL_DATABASE_NAME);

        SqlElasticPool sqlElasticPool = sqlServer.elasticPools().get(SQL_ELASTIC_POOL_NAME);

        // Add another database to the server and pool.
        resourceStream =
            sqlServer
                .databases()
                .define("newDatabase")
                .withExistingElasticPool(sqlElasticPool)
                .withCollation(COLLATION)
                .createAsync();

        sqlDatabase = resourceStream.block();
        sqlServer.databases().delete(sqlDatabase.name());
        validateSqlDatabaseNotFound("newDatabase");

        sqlServer.elasticPools().delete(SQL_ELASTIC_POOL_NAME);
        sqlServerManager.sqlServers().deleteByResourceGroup(sqlServer.resourceGroupName(), sqlServer.name());
        validateSqlServerNotFound(sqlServer);
    }

    @Test
    public void canCRUDSqlElasticPool() throws Exception {
        // Create
        SqlServer sqlServer = createSqlServer();

        sqlServer = sqlServerManager.sqlServers().getByResourceGroup(rgName, sqlServerName);
        validateSqlServer(sqlServer);

        Mono<SqlElasticPool> resourceStream =
            sqlServer
                .elasticPools()
                .define(SQL_ELASTIC_POOL_NAME)
                .withStandardPool()
                .withTag("tag1", "value1")
                .createAsync();
        SqlElasticPool sqlElasticPool = resourceStream.block();
        validateSqlElasticPool(sqlElasticPool);
        Assertions.assertEquals(sqlElasticPool.listDatabases().size(), 0);

        sqlElasticPool =
            sqlElasticPool
                .update()
                .withReservedDtu(SqlElasticPoolBasicEDTUs.eDTU_100)
                .withDatabaseMaxCapacity(20)
                .withDatabaseMinCapacity(10)
                .withStorageCapacity(102400 * 1024 * 1024L)
                .withNewDatabase(SQL_DATABASE_NAME)
                .withTag("tag2", "value2")
                .apply();

        validateSqlElasticPool(sqlElasticPool);
        Assertions.assertEquals(sqlElasticPool.listDatabases().size(), 1);
        Assertions.assertNotNull(sqlElasticPool.getDatabase(SQL_DATABASE_NAME));

        // Get
        validateSqlElasticPool(sqlServer.elasticPools().get(SQL_ELASTIC_POOL_NAME));

        // List
        validateListSqlElasticPool(sqlServer.elasticPools().list());

        // Delete
        sqlServer.databases().delete(SQL_DATABASE_NAME);
        sqlServer.elasticPools().delete(SQL_ELASTIC_POOL_NAME);
        validateSqlElasticPoolNotFound(sqlServer, SQL_ELASTIC_POOL_NAME);

        // Add another database to the server
        resourceStream =
            sqlServer.elasticPools().define("newElasticPool").withStandardPool().createAsync();

        sqlElasticPool = resourceStream.block();

        sqlServer.elasticPools().delete(sqlElasticPool.name());
        validateSqlElasticPoolNotFound(sqlServer, "newElasticPool");

        sqlServerManager.sqlServers().deleteByResourceGroup(sqlServer.resourceGroupName(), sqlServer.name());
        validateSqlServerNotFound(sqlServer);
    }

    @Test
    public void canCRUDSqlFirewallRule() throws Exception {
        // Create
        SqlServer sqlServer = createSqlServer();

        sqlServer = sqlServerManager.sqlServers().getByResourceGroup(rgName, sqlServerName);
        validateSqlServer(sqlServer);

        Mono<SqlFirewallRule> resourceStream =
            sqlServer
                .firewallRules()
                .define(SQL_FIREWALLRULE_NAME)
                .withIpAddressRange(START_IPADDRESS, END_IPADDRESS)
                .createAsync();

        SqlFirewallRule sqlFirewallRule = resourceStream.block();

        validateSqlFirewallRule(sqlFirewallRule, SQL_FIREWALLRULE_NAME);
        validateSqlFirewallRule(sqlServer.firewallRules().get(SQL_FIREWALLRULE_NAME), SQL_FIREWALLRULE_NAME);

        String secondFirewallRuleName = "secondFireWallRule";
        SqlFirewallRule secondFirewallRule =
            sqlServer.firewallRules().define(secondFirewallRuleName).withIpAddress(START_IPADDRESS).create();
        Assertions.assertNotNull(secondFirewallRule);

        secondFirewallRule = sqlServer.firewallRules().get(secondFirewallRuleName);
        Assertions.assertNotNull(secondFirewallRule);
        Assertions.assertEquals(START_IPADDRESS, secondFirewallRule.endIpAddress());

        secondFirewallRule = secondFirewallRule.update().withEndIpAddress(END_IPADDRESS).apply();

        validateSqlFirewallRule(secondFirewallRule, secondFirewallRuleName);
        sqlServer.firewallRules().delete(secondFirewallRuleName);

        final SqlServer finalSqlServer = sqlServer;
        validateResourceNotFound(() -> finalSqlServer.firewallRules().get(secondFirewallRuleName));

        // Get
        sqlFirewallRule = sqlServer.firewallRules().get(SQL_FIREWALLRULE_NAME);
        validateSqlFirewallRule(sqlFirewallRule, SQL_FIREWALLRULE_NAME);

        // Update
        // Making start and end IP address same.
        sqlFirewallRule.update().withEndIpAddress(START_IPADDRESS).apply();
        sqlFirewallRule = sqlServer.firewallRules().get(SQL_FIREWALLRULE_NAME);
        Assertions.assertEquals(sqlFirewallRule.endIpAddress(), START_IPADDRESS);

        // List
        validateListSqlFirewallRule(sqlServer.firewallRules().list());

        // Delete
        sqlServer.firewallRules().delete(sqlFirewallRule.name());
        validateSqlFirewallRuleNotFound();

        // Delete server
        sqlServerManager.sqlServers().deleteByResourceGroup(sqlServer.resourceGroupName(), sqlServer.name());
        validateSqlServerNotFound(sqlServer);
    }

    private void validateMultiCreation(
        String database2Name,
        String database1InEPName,
        String database2InEPName,
        String elasticPool1Name,
        String elasticPool2Name,
        String elasticPool3Name,
        SqlServer sqlServer,
        boolean deleteUsingUpdate) {
        validateSqlServer(sqlServer);
        validateSqlServer(sqlServerManager.sqlServers().getByResourceGroup(rgName, sqlServerName));
        validateSqlDatabase(sqlServer.databases().get(SQL_DATABASE_NAME), SQL_DATABASE_NAME);
        validateSqlFirewallRule(sqlServer.firewallRules().get(SQL_FIREWALLRULE_NAME), SQL_FIREWALLRULE_NAME);

        List<SqlFirewallRule> firewalls = sqlServer.firewallRules().list();
        Assertions.assertEquals(3, firewalls.size());

        int startIPAddress = 0;
        int endIPAddress = 0;

        for (SqlFirewallRule firewall : firewalls) {
            if (!firewall.name().equalsIgnoreCase(SQL_FIREWALLRULE_NAME)) {
                Assertions.assertEquals(firewall.startIpAddress(), START_IPADDRESS);
                if (firewall.endIpAddress().equalsIgnoreCase(START_IPADDRESS)) {
                    startIPAddress++;
                } else if (firewall.endIpAddress().equalsIgnoreCase(END_IPADDRESS)) {
                    endIPAddress++;
                }
            }
        }

        Assertions.assertEquals(startIPAddress, 1);
        Assertions.assertEquals(endIPAddress, 1);

        Assertions.assertNotNull(sqlServer.databases().get(database2Name));
        Assertions.assertNotNull(sqlServer.databases().get(database1InEPName));
        Assertions.assertNotNull(sqlServer.databases().get(database2InEPName));

        SqlElasticPool ep1 = sqlServer.elasticPools().get(elasticPool1Name);
        validateSqlElasticPool(ep1, elasticPool1Name);
        SqlElasticPool ep2 = sqlServer.elasticPools().get(elasticPool2Name);

        Assertions.assertNotNull(ep2);
        Assertions.assertEquals(ElasticPoolEdition.PREMIUM, ep2.edition());
        Assertions.assertEquals(ep2.listDatabases().size(), 2);
        Assertions.assertNotNull(ep2.getDatabase(database1InEPName));
        Assertions.assertNotNull(ep2.getDatabase(database2InEPName));

        SqlElasticPool ep3 = sqlServer.elasticPools().get(elasticPool3Name);

        Assertions.assertNotNull(ep3);
        Assertions.assertEquals(ElasticPoolEdition.STANDARD, ep3.edition());

        if (!deleteUsingUpdate) {
            sqlServer.databases().delete(database2Name);
            sqlServer.databases().delete(database1InEPName);
            sqlServer.databases().delete(database2InEPName);
            sqlServer.databases().delete(SQL_DATABASE_NAME);

            Assertions.assertEquals(ep1.listDatabases().size(), 0);
            Assertions.assertEquals(ep2.listDatabases().size(), 0);
            Assertions.assertEquals(ep3.listDatabases().size(), 0);

            sqlServer.elasticPools().delete(elasticPool1Name);
            sqlServer.elasticPools().delete(elasticPool2Name);
            sqlServer.elasticPools().delete(elasticPool3Name);

            firewalls = sqlServer.firewallRules().list();

            for (SqlFirewallRule firewallRule : firewalls) {
                firewallRule.delete();
            }
        } else {
            sqlServer
                .update()
                .withoutDatabase(database2Name)
                .withoutElasticPool(elasticPool1Name)
                .withoutElasticPool(elasticPool2Name)
                .withoutElasticPool(elasticPool3Name)
                .withoutDatabase(database1InEPName)
                .withoutDatabase(SQL_DATABASE_NAME)
                .withoutDatabase(database2InEPName)
                .withoutFirewallRule(SQL_FIREWALLRULE_NAME)
                .apply();

            Assertions.assertEquals(sqlServer.elasticPools().list().size(), 0);

            firewalls = sqlServer.firewallRules().list();
            Assertions.assertEquals(firewalls.size(), 2);
            for (SqlFirewallRule firewallRule : firewalls) {
                firewallRule.delete();
            }
        }

        Assertions.assertEquals(sqlServer.elasticPools().list().size(), 0);
        // Only master database is remaining in the SQLServer.
        Assertions.assertEquals(sqlServer.databases().list().size(), 1);
    }

    private void validateSqlFirewallRuleNotFound() {
        validateResourceNotFound(
            () ->
                sqlServerManager
                    .sqlServers()
                    .getByResourceGroup(rgName, sqlServerName)
                    .firewallRules()
                    .get(SQL_FIREWALLRULE_NAME));
    }

    private void validateSqlElasticPoolNotFound(SqlServer sqlServer, String elasticPoolName) {
        validateResourceNotFound(() -> sqlServer.elasticPools().get(elasticPoolName));
    }

    private void validateSqlDatabaseNotFound(String newDatabase) {
        validateResourceNotFound(
            () -> sqlServerManager.sqlServers().getByResourceGroup(rgName, sqlServerName).databases().get(newDatabase));
    }

    private void validateSqlServerNotFound(SqlServer sqlServer) {
        validateResourceNotFound(() -> sqlServerManager.sqlServers().getById(sqlServer.id()));
    }

    private void validateResourceNotFound(Supplier<Object> fetchResource) {
        try {
            Object result = fetchResource.get();
            Assertions.assertNull(result);
        } catch (ManagementException e) {
            Assertions.assertEquals(404, e.getResponse().getStatusCode());
        }
    }

    private SqlServer createSqlServer() {
        return createSqlServer(sqlServerName);
    }

    private SqlServer createSqlServer(String sqlServerName) {
        return sqlServerManager
            .sqlServers()
            .define(sqlServerName)
            .withRegion(Region.US_EAST)
            .withNewResourceGroup(rgName)
            .withAdministratorLogin("userName")
            .withAdministratorPassword("P@ssword~1")
            .create();
    }

    private static void validateListSqlFirewallRule(List<SqlFirewallRule> sqlFirewallRules) {
        boolean found = false;
        for (SqlFirewallRule firewallRule : sqlFirewallRules) {
            if (firewallRule.name().equals(SQL_FIREWALLRULE_NAME)) {
                found = true;
            }
        }
        Assertions.assertTrue(found);
    }

    private void validateSqlFirewallRule(SqlFirewallRule sqlFirewallRule, String firewallName) {
        Assertions.assertNotNull(sqlFirewallRule);
        Assertions.assertEquals(firewallName, sqlFirewallRule.name());
        Assertions.assertEquals(sqlServerName, sqlFirewallRule.sqlServerName());
        Assertions.assertEquals(START_IPADDRESS, sqlFirewallRule.startIpAddress());
        Assertions.assertEquals(END_IPADDRESS, sqlFirewallRule.endIpAddress());
        Assertions.assertEquals(rgName, sqlFirewallRule.resourceGroupName());
        Assertions.assertEquals(sqlServerName, sqlFirewallRule.sqlServerName());
        Assertions.assertEquals(Region.US_EAST, sqlFirewallRule.region());
    }

    private static void validateListSqlElasticPool(List<SqlElasticPool> sqlElasticPools) {
        boolean found = false;
        for (SqlElasticPool elasticPool : sqlElasticPools) {
            if (elasticPool.name().equals(SQL_ELASTIC_POOL_NAME)) {
                found = true;
            }
        }
        Assertions.assertTrue(found);
    }

    private void validateSqlElasticPool(SqlElasticPool sqlElasticPool) {
        validateSqlElasticPool(sqlElasticPool, SQL_ELASTIC_POOL_NAME);
    }

    private void validateSqlElasticPool(SqlElasticPool sqlElasticPool, String elasticPoolName) {
        Assertions.assertNotNull(sqlElasticPool);
        Assertions.assertEquals(rgName, sqlElasticPool.resourceGroupName());
        Assertions.assertEquals(elasticPoolName, sqlElasticPool.name());
        Assertions.assertEquals(sqlServerName, sqlElasticPool.sqlServerName());
        Assertions.assertEquals(ElasticPoolEdition.STANDARD, sqlElasticPool.edition());
        Assertions.assertNotNull(sqlElasticPool.creationDate());
        Assertions.assertNotEquals(0, sqlElasticPool.databaseDtuMax());
        Assertions.assertNotEquals(0, sqlElasticPool.dtu());
    }

    private static void validateListSqlDatabase(List<SqlDatabase> sqlDatabases) {
        boolean found = false;
        for (SqlDatabase database : sqlDatabases) {
            if (database.name().equals(SQL_DATABASE_NAME)) {
                found = true;
            }
        }
        Assertions.assertTrue(found);
    }

    private void validateSqlServer(SqlServer sqlServer) {
        Assertions.assertNotNull(sqlServer);
        Assertions.assertEquals(rgName, sqlServer.resourceGroupName());
        Assertions.assertNotNull(sqlServer.fullyQualifiedDomainName());
        //        Assertions.assertEquals(ServerVersion.ONE_TWO_FULL_STOP_ZERO, sqlServer.version());
        Assertions.assertEquals("userName", sqlServer.administratorLogin());
    }

    private void validateSqlDatabase(SqlDatabase sqlDatabase, String databaseName) {
        Assertions.assertNotNull(sqlDatabase);
        Assertions.assertEquals(sqlDatabase.name(), databaseName);
        Assertions.assertEquals(sqlServerName, sqlDatabase.sqlServerName());
        Assertions.assertEquals(sqlDatabase.collation(), COLLATION);
        Assertions.assertEquals(DatabaseEdition.STANDARD, sqlDatabase.edition());
    }

    private void validateSqlDatabaseWithElasticPool(SqlDatabase sqlDatabase, String databaseName) {
        validateSqlDatabase(sqlDatabase, databaseName);
        Assertions.assertEquals(SQL_ELASTIC_POOL_NAME, sqlDatabase.elasticPoolName());
    }

    @Test
    @LiveOnly
    public void testRandomSku() {
        // LiveOnly because "test timing out after latest test proxy update"
        // "M" series is not supported in this region
        List<DatabaseSku> databaseSkus = DatabaseSku.getAll().stream().filter(sku -> !"M".equals(sku.toSku().family())).collect(Collectors.toCollection(LinkedList::new));
        Collections.shuffle(databaseSkus);
        List<ElasticPoolSku> elasticPoolSkus = ElasticPoolSku.getAll().stream().filter(sku -> !"M".equals(sku.toSku().family())).collect(Collectors.toCollection(LinkedList::new));
        Collections.shuffle(elasticPoolSkus);

        sqlServerManager.sqlServers().getCapabilitiesByRegion(Region.US_EAST).supportedCapabilitiesByServerVersion()
            .forEach((x, serverVersionCapability) -> {
                serverVersionCapability.supportedEditions().forEach(edition -> {
                    edition.supportedServiceLevelObjectives().forEach(serviceObjective -> {
                        if (serviceObjective.status() != CapabilityStatus.AVAILABLE && serviceObjective.status() != CapabilityStatus.DEFAULT || "M".equals(serviceObjective.sku().family())) {
                            databaseSkus.remove(DatabaseSku.fromSku(serviceObjective.sku()));
                        }
                    });
                });
                serverVersionCapability.supportedElasticPoolEditions().forEach(edition -> {
                    edition.supportedElasticPoolPerformanceLevels().forEach(performance -> {
                        if (performance.status() != CapabilityStatus.AVAILABLE && performance.status() != CapabilityStatus.DEFAULT || "M".equals(performance.sku().family())) {
                            elasticPoolSkus.remove(ElasticPoolSku.fromSku(performance.sku()));
                        }
                    });
                });
            });

        SqlServer sqlServer = sqlServerManager.sqlServers().define(sqlServerName)
            .withRegion(Region.US_EAST)
            .withNewResourceGroup(rgName)
            .withAdministratorLogin("userName")
            .withAdministratorPassword(password())
            .create();

        // Too many elastic pools defined will hit sql server DTU quota limits.
        // https://learn.microsoft.com/en-us/azure/azure-sql/database/resource-limits-logical-server?view=azuresql#logical-server-limits
        Flux.merge(
            Flux.range(0, 3)
                .flatMap(i -> sqlServer.databases().define("database" + i).withSku(databaseSkus.get(i)).createAsync().cast(Indexable.class)),
            Flux.range(0, 3)
                .flatMap(i -> sqlServer.elasticPools().define("elasticPool" + i).withSku(elasticPoolSkus.get(i)).createAsync().cast(Indexable.class))
        )
            .blockLast();
    }

    @Test
    @Disabled("Only run for updating sku")
    public void generateSku() throws IOException {
        StringBuilder databaseSkuBuilder = new StringBuilder();
        StringBuilder elasticPoolSkuBuilder = new StringBuilder();
        sqlServerManager.sqlServers().getCapabilitiesByRegion(Region.US_EAST).supportedCapabilitiesByServerVersion()
            .forEach((x, serverVersionCapability) -> {
                serverVersionCapability.supportedEditions().forEach(edition -> {
                    if (edition.name().equalsIgnoreCase("System")) {
                        return;
                    }
                    edition.supportedServiceLevelObjectives().forEach(serviceObjective -> {
                        addStaticSkuDefinition(databaseSkuBuilder, edition.name(), serviceObjective.name(), serviceObjective.sku(), "DatabaseSku");
                    });
                });
                serverVersionCapability.supportedElasticPoolEditions().forEach(edition -> {
                    if (edition.name().equalsIgnoreCase("System")) {
                        return;
                    }
                    edition.supportedElasticPoolPerformanceLevels().forEach(performance -> {
                        String detailName = String.format("%s_%d", performance.sku().name(), performance.sku().capacity());
                        addStaticSkuDefinition(elasticPoolSkuBuilder, edition.name(), detailName, performance.sku(), "ElasticPoolSku");
                    });
                });
            });

        String databaseSku = new String(readAllBytes(getClass().getResourceAsStream("/DatabaseSku.java")), StandardCharsets.UTF_8);
        databaseSku = databaseSku.replace("<Generated>", databaseSkuBuilder.toString());
        Files.write(new File("src/main/java/com/azure/resourcemanager/sql/models/DatabaseSku.java").toPath(), databaseSku.getBytes(StandardCharsets.UTF_8));

        String elasticPoolSku = new String(readAllBytes(getClass().getResourceAsStream("/ElasticPoolSku.java")), StandardCharsets.UTF_8);
        elasticPoolSku = elasticPoolSku.replace("<Generated>", elasticPoolSkuBuilder.toString());
        Files.write(new File("src/main/java/com/azure/resourcemanager/sql/models/ElasticPoolSku.java").toPath(), elasticPoolSku.getBytes(StandardCharsets.UTF_8));

        sqlServerManager.resourceManager().resourceGroups().define(rgName).withRegion(Region.US_EAST).create(); // for deletion
    }

    private byte[] readAllBytes(InputStream inputStream) throws IOException {
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            byte[] data = new byte[4096];
            while (true) {
                int size = inputStream.read(data);
                if (size > 0) {
                    outputStream.write(data, 0, size);
                } else {
                    return outputStream.toByteArray();
                }
            }
        }
    }

    private void addStaticSkuDefinition(StringBuilder builder, String edition, String detailName, Sku sku, String className) {
        builder
            .append("\n    ").append("/** ").append(edition).append(" Edition with ").append(detailName).append(" sku. */")
            .append("\n    ").append("public static final ").append(className).append(" ").append(String.format("%s_%s", edition.toUpperCase(Locale.ROOT), detailName.toUpperCase(Locale.ROOT))).append(" =")
            .append("\n        new ").append(className).append("(")
                .append(sku.name() == null ? null : "\"" + sku.name() + "\"")
                .append(", ")
                .append(sku.tier() == null ? null : "\"" + sku.tier() + "\"")
                .append(", ")
                .append(sku.family() == null ? null : "\"" + sku.family() + "\"")
                .append(", ")
                .append(sku.capacity())
                .append(", ")
                .append(sku.size() == null ? null : "\"" + sku.size() + "\"")
                .append(");");
    }

    @Test
    public void canCreateAndUpdatePublicNetworkAccess() {
        // Create
        SqlServer sqlServer =
            sqlServerManager
                .sqlServers()
                .define(sqlServerName)
                .withRegion(Region.US_EAST)
                .withNewResourceGroup(rgName)
                .withAdministratorLogin("userName")
                .withAdministratorPassword("P@ssword~1")
                .withoutAccessFromAzureServices()
                .disablePublicNetworkAccess()
                .create();

        sqlServer.refresh();
        Assertions.assertEquals(ServerNetworkAccessFlag.DISABLED, sqlServer.publicNetworkAccess());

        sqlServer.update().enablePublicNetworkAccess().apply();
        sqlServer.refresh();
        Assertions.assertEquals(ServerNetworkAccessFlag.ENABLED, sqlServer.publicNetworkAccess());

        sqlServer.update().disablePublicNetworkAccess().apply();
        sqlServer.refresh();
        Assertions.assertEquals(ServerNetworkAccessFlag.DISABLED, sqlServer.publicNetworkAccess());
    }
}
