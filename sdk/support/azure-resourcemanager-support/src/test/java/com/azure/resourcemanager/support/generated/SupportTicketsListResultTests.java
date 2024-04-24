// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.fluent.models.SupportTicketDetailsInner;
import com.azure.resourcemanager.support.models.Consent;
import com.azure.resourcemanager.support.models.ContactProfile;
import com.azure.resourcemanager.support.models.PreferredContactMethod;
import com.azure.resourcemanager.support.models.QuotaChangeRequest;
import com.azure.resourcemanager.support.models.QuotaTicketDetails;
import com.azure.resourcemanager.support.models.SecondaryConsent;
import com.azure.resourcemanager.support.models.ServiceLevelAgreement;
import com.azure.resourcemanager.support.models.SeverityLevel;
import com.azure.resourcemanager.support.models.SupportEngineer;
import com.azure.resourcemanager.support.models.SupportTicketsListResult;
import com.azure.resourcemanager.support.models.TechnicalTicketDetails;
import com.azure.resourcemanager.support.models.UserConsent;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SupportTicketsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SupportTicketsListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"supportTicketId\":\"qawrlyxwj\",\"description\":\"cpr\",\"problemClassificationId\":\"nwbxgjvtbvpyssz\",\"problemClassificationDisplayName\":\"rujqg\",\"severity\":\"highestcriticalimpact\",\"enrollmentId\":\"uouq\",\"require24X7Response\":false,\"advancedDiagnosticConsent\":\"No\",\"problemScopingQuestions\":\"wbnguitnwui\",\"supportPlanId\":\"a\",\"contactDetails\":{\"firstName\":\"x\",\"lastName\":\"fizuckyf\",\"preferredContactMethod\":\"email\",\"primaryEmailAddress\":\"rfidfvzwdz\",\"additionalEmailAddresses\":[\"ymwisdkft\"],\"phoneNumber\":\"xmnteiwaop\",\"preferredTimeZone\":\"km\",\"country\":\"jcmmxdcufufsrp\",\"preferredSupportLanguage\":\"mzidnsezcxtb\"},\"serviceLevelAgreement\":{\"startTime\":\"2021-04-17T07:41:34Z\",\"expirationTime\":\"2021-11-30T22:43:16Z\",\"slaMinutes\":669773317},\"supportEngineer\":{\"emailAddress\":\"wmdwzjeiachboo\"},\"supportPlanType\":\"lnrosfqp\",\"supportPlanDisplayName\":\"ehzzvypyqrim\",\"title\":\"inpvswjdkirsoodq\",\"problemStartTime\":\"2021-07-12T18:06:29Z\",\"serviceId\":\"rmnohj\",\"serviceDisplayName\":\"kwh\",\"status\":\"oifiyipjxsqwpgr\",\"createdDate\":\"2021-03-31T15:02:13Z\",\"modifiedDate\":\"2021-06-14T22:17:31Z\",\"fileWorkspaceName\":\"cjxvsnbyxqab\",\"isTemporaryTicket\":\"Yes\",\"technicalTicketDetails\":{\"resourceId\":\"cyshurzafbljjgp\"},\"quotaTicketDetails\":{\"quotaChangeRequestSubType\":\"qcjm\",\"quotaChangeRequestVersion\":\"javbqidtqajz\",\"quotaChangeRequests\":[{}]},\"secondaryConsent\":[{\"userConsent\":\"Yes\",\"type\":\"krlkhbzhfepg\"},{\"userConsent\":\"Yes\",\"type\":\"xzlocxscp\"},{\"userConsent\":\"No\",\"type\":\"hhbcsglummajtjao\"}]},\"id\":\"xobnbdxkqpxok\",\"name\":\"jionpimexgstxgc\",\"type\":\"odgmaajrmvdjwz\"},{\"properties\":{\"supportTicketId\":\"ovmclwhijcoejct\",\"description\":\"zaqsqsycbkbfk\",\"problemClassificationId\":\"ukdkexxppofmxa\",\"problemClassificationDisplayName\":\"fjpgddtocjjxhvp\",\"severity\":\"minimal\",\"enrollmentId\":\"exhd\",\"require24X7Response\":false,\"advancedDiagnosticConsent\":\"Yes\",\"problemScopingQuestions\":\"eojnxqbzvddn\",\"supportPlanId\":\"ndei\",\"contactDetails\":{\"firstName\":\"btwnpzaoqvuhrhcf\",\"lastName\":\"cyddglmjthjqk\",\"preferredContactMethod\":\"email\",\"primaryEmailAddress\":\"yeicxmqciwqvhk\",\"additionalEmailAddresses\":[\"uigdtopbobjog\",\"m\",\"w\"],\"phoneNumber\":\"m\",\"preferredTimeZone\":\"uhrzayvvt\",\"country\":\"gvdfgiotkftutq\",\"preferredSupportLanguage\":\"ln\"},\"serviceLevelAgreement\":{\"startTime\":\"2021-02-04T14:07:35Z\",\"expirationTime\":\"2021-03-05T03:19:35Z\",\"slaMinutes\":1408526617},\"supportEngineer\":{\"emailAddress\":\"krxd\"},\"supportPlanType\":\"i\",\"supportPlanDisplayName\":\"thz\",\"title\":\"vqdra\",\"problemStartTime\":\"2021-02-10T08:49:49Z\",\"serviceId\":\"yb\",\"serviceDisplayName\":\"ehoqfbowskan\",\"status\":\"tzlcuiywgqywgn\",\"createdDate\":\"2021-09-15T21:07:23Z\",\"modifiedDate\":\"2021-04-01T08:37:52Z\",\"fileWorkspaceName\":\"zgpphrcgyncocpe\",\"isTemporaryTicket\":\"Yes\",\"technicalTicketDetails\":{\"resourceId\":\"coofsxlzev\"},\"quotaTicketDetails\":{\"quotaChangeRequestSubType\":\"qjqabcypmivkwl\",\"quotaChangeRequestVersion\":\"vccfw\",\"quotaChangeRequests\":[{},{}]},\"secondaryConsent\":[{\"userConsent\":\"Yes\",\"type\":\"onlebxetqgtzxdpn\"}]},\"id\":\"bqqwxrj\",\"name\":\"eallnwsubisnj\",\"type\":\"mpmngnzscxaqwoo\"},{\"properties\":{\"supportTicketId\":\"cbonqvpk\",\"description\":\"lrxnjeaseiphe\",\"problemClassificationId\":\"f\",\"problemClassificationDisplayName\":\"keyyi\",\"severity\":\"minimal\",\"enrollmentId\":\"bdlwtgrhpdjpj\",\"require24X7Response\":true,\"advancedDiagnosticConsent\":\"Yes\",\"problemScopingQuestions\":\"azjpqyegualhbxxh\",\"supportPlanId\":\"jzzvdud\",\"contactDetails\":{\"firstName\":\"wdslfhotwmcy\",\"lastName\":\"pwlbjnpg\",\"preferredContactMethod\":\"email\",\"primaryEmailAddress\":\"ftadehxnltyfs\",\"additionalEmailAddresses\":[\"usue\",\"nzwdejba\"],\"phoneNumber\":\"rxzdmohctbqvudwx\",\"preferredTimeZone\":\"ndnvo\",\"country\":\"gujjugwdkcglh\",\"preferredSupportLanguage\":\"lazjdyggdtjixhbk\"},\"serviceLevelAgreement\":{\"startTime\":\"2020-12-23T07:48:17Z\",\"expirationTime\":\"2021-02-13T10:06:52Z\",\"slaMinutes\":363488888},\"supportEngineer\":{\"emailAddress\":\"enevfyexfwhybci\"},\"supportPlanType\":\"yvdcsitynnaa\",\"supportPlanDisplayName\":\"ectehf\",\"title\":\"qsc\",\"problemStartTime\":\"2021-08-12T09:29:36Z\",\"serviceId\":\"pvhez\",\"serviceDisplayName\":\"gqhcjrefovg\",\"status\":\"qsl\",\"createdDate\":\"2021-08-20T18:32:02Z\",\"modifiedDate\":\"2021-05-05T15:09:29Z\",\"fileWorkspaceName\":\"qjpkcattpngjcrc\",\"isTemporaryTicket\":\"No\",\"technicalTicketDetails\":{\"resourceId\":\"jh\"},\"quotaTicketDetails\":{\"quotaChangeRequestSubType\":\"ajvnysounqe\",\"quotaChangeRequestVersion\":\"noae\",\"quotaChangeRequests\":[{},{},{},{}]},\"secondaryConsent\":[{\"userConsent\":\"Yes\",\"type\":\"rpmopjmc\"},{\"userConsent\":\"Yes\",\"type\":\"okth\"},{\"userConsent\":\"Yes\",\"type\":\"aodsfcpkv\"},{\"userConsent\":\"Yes\",\"type\":\"uozmyzydagfua\"}]},\"id\":\"bezy\",\"name\":\"uokktwhrdxwz\",\"type\":\"wqsmbsur\"},{\"properties\":{\"supportTicketId\":\"imoryocfsfksym\",\"description\":\"dystkiiuxhqyud\",\"problemClassificationId\":\"o\",\"problemClassificationDisplayName\":\"qn\",\"severity\":\"highestcriticalimpact\",\"enrollmentId\":\"czvyifq\",\"require24X7Response\":false,\"advancedDiagnosticConsent\":\"No\",\"problemScopingQuestions\":\"jsllrmv\",\"supportPlanId\":\"f\",\"contactDetails\":{\"firstName\":\"atkpnp\",\"lastName\":\"lexxbczwtru\",\"preferredContactMethod\":\"email\",\"primaryEmailAddress\":\"qzbqjvsov\",\"additionalEmailAddresses\":[\"kacspkw\",\"hzdobpxjmflbvvnc\"],\"phoneNumber\":\"kcciwwzjuqkhr\",\"preferredTimeZone\":\"ajiwkuo\",\"country\":\"oskg\",\"preferredSupportLanguage\":\"sauuimj\"},\"serviceLevelAgreement\":{\"startTime\":\"2021-06-29T03:13:35Z\",\"expirationTime\":\"2021-01-02T07:29:36Z\",\"slaMinutes\":1910171732},\"supportEngineer\":{\"emailAddress\":\"dyjrrfbyaosv\"},\"supportPlanType\":\"csonpclhoco\",\"supportPlanDisplayName\":\"lkevle\",\"title\":\"gz\",\"problemStartTime\":\"2021-09-05T06:09:57Z\",\"serviceId\":\"hfmvfaxkffe\",\"serviceDisplayName\":\"th\",\"status\":\"m\",\"createdDate\":\"2021-02-27T12:32:19Z\",\"modifiedDate\":\"2021-08-05T17:04:54Z\",\"fileWorkspaceName\":\"mzsb\",\"isTemporaryTicket\":\"No\",\"technicalTicketDetails\":{\"resourceId\":\"igrxwburvjxxjn\"},\"quotaTicketDetails\":{\"quotaChangeRequestSubType\":\"dptkoenkouk\",\"quotaChangeRequestVersion\":\"udwtiukbl\",\"quotaChangeRequests\":[{},{},{},{}]},\"secondaryConsent\":[{\"userConsent\":\"No\",\"type\":\"pazyxoegukg\"},{\"userConsent\":\"Yes\",\"type\":\"ucgygevqz\"},{\"userConsent\":\"Yes\",\"type\":\"mrbpizcdrqj\"},{\"userConsent\":\"Yes\",\"type\":\"dnfyhxdeoejzicwi\"}]},\"id\":\"sjttgzfbish\",\"name\":\"bkh\",\"type\":\"jdeyeamdpha\"}],\"nextLink\":\"lpbuxwgipwhonowk\"}")
            .toObject(SupportTicketsListResult.class);
        Assertions.assertEquals("qawrlyxwj", model.value().get(0).supportTicketId());
        Assertions.assertEquals("cpr", model.value().get(0).description());
        Assertions.assertEquals("nwbxgjvtbvpyssz", model.value().get(0).problemClassificationId());
        Assertions.assertEquals(SeverityLevel.HIGHESTCRITICALIMPACT, model.value().get(0).severity());
        Assertions.assertEquals("uouq", model.value().get(0).enrollmentId());
        Assertions.assertEquals(false, model.value().get(0).require24X7Response());
        Assertions.assertEquals(Consent.NO, model.value().get(0).advancedDiagnosticConsent());
        Assertions.assertEquals("wbnguitnwui", model.value().get(0).problemScopingQuestions());
        Assertions.assertEquals("a", model.value().get(0).supportPlanId());
        Assertions.assertEquals("x", model.value().get(0).contactDetails().firstName());
        Assertions.assertEquals("fizuckyf", model.value().get(0).contactDetails().lastName());
        Assertions.assertEquals(PreferredContactMethod.EMAIL,
            model.value().get(0).contactDetails().preferredContactMethod());
        Assertions.assertEquals("rfidfvzwdz", model.value().get(0).contactDetails().primaryEmailAddress());
        Assertions.assertEquals("ymwisdkft", model.value().get(0).contactDetails().additionalEmailAddresses().get(0));
        Assertions.assertEquals("xmnteiwaop", model.value().get(0).contactDetails().phoneNumber());
        Assertions.assertEquals("km", model.value().get(0).contactDetails().preferredTimeZone());
        Assertions.assertEquals("jcmmxdcufufsrp", model.value().get(0).contactDetails().country());
        Assertions.assertEquals("mzidnsezcxtb", model.value().get(0).contactDetails().preferredSupportLanguage());
        Assertions.assertEquals("inpvswjdkirsoodq", model.value().get(0).title());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-12T18:06:29Z"), model.value().get(0).problemStartTime());
        Assertions.assertEquals("rmnohj", model.value().get(0).serviceId());
        Assertions.assertEquals("cjxvsnbyxqab", model.value().get(0).fileWorkspaceName());
        Assertions.assertEquals("cyshurzafbljjgp", model.value().get(0).technicalTicketDetails().resourceId());
        Assertions.assertEquals("qcjm", model.value().get(0).quotaTicketDetails().quotaChangeRequestSubType());
        Assertions.assertEquals("javbqidtqajz", model.value().get(0).quotaTicketDetails().quotaChangeRequestVersion());
        Assertions.assertEquals(UserConsent.YES, model.value().get(0).secondaryConsent().get(0).userConsent());
        Assertions.assertEquals("krlkhbzhfepg", model.value().get(0).secondaryConsent().get(0).type());
        Assertions.assertEquals("lpbuxwgipwhonowk", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SupportTicketsListResult model = new SupportTicketsListResult()
            .withValue(Arrays.asList(
                new SupportTicketDetailsInner().withSupportTicketId("qawrlyxwj")
                    .withDescription("cpr")
                    .withProblemClassificationId("nwbxgjvtbvpyssz")
                    .withSeverity(SeverityLevel.HIGHESTCRITICALIMPACT)
                    .withEnrollmentId("uouq")
                    .withRequire24X7Response(false)
                    .withAdvancedDiagnosticConsent(Consent.NO)
                    .withProblemScopingQuestions("wbnguitnwui")
                    .withSupportPlanId("a")
                    .withContactDetails(new ContactProfile().withFirstName("x")
                        .withLastName("fizuckyf")
                        .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                        .withPrimaryEmailAddress("rfidfvzwdz")
                        .withAdditionalEmailAddresses(Arrays.asList("ymwisdkft"))
                        .withPhoneNumber("xmnteiwaop")
                        .withPreferredTimeZone("km")
                        .withCountry("jcmmxdcufufsrp")
                        .withPreferredSupportLanguage("mzidnsezcxtb"))
                    .withServiceLevelAgreement(new ServiceLevelAgreement())
                    .withSupportEngineer(new SupportEngineer())
                    .withTitle("inpvswjdkirsoodq")
                    .withProblemStartTime(OffsetDateTime.parse("2021-07-12T18:06:29Z"))
                    .withServiceId("rmnohj")
                    .withFileWorkspaceName("cjxvsnbyxqab")
                    .withTechnicalTicketDetails(new TechnicalTicketDetails().withResourceId("cyshurzafbljjgp"))
                    .withQuotaTicketDetails(new QuotaTicketDetails().withQuotaChangeRequestSubType("qcjm")
                        .withQuotaChangeRequestVersion("javbqidtqajz")
                        .withQuotaChangeRequests(Arrays.asList(new QuotaChangeRequest())))
                    .withSecondaryConsent(
                        Arrays.asList(new SecondaryConsent().withUserConsent(UserConsent.YES).withType("krlkhbzhfepg"),
                            new SecondaryConsent().withUserConsent(UserConsent.YES).withType("xzlocxscp"),
                            new SecondaryConsent().withUserConsent(UserConsent.NO).withType("hhbcsglummajtjao"))),
                new SupportTicketDetailsInner().withSupportTicketId("ovmclwhijcoejct")
                    .withDescription("zaqsqsycbkbfk")
                    .withProblemClassificationId("ukdkexxppofmxa")
                    .withSeverity(SeverityLevel.MINIMAL)
                    .withEnrollmentId("exhd")
                    .withRequire24X7Response(false)
                    .withAdvancedDiagnosticConsent(Consent.YES)
                    .withProblemScopingQuestions("eojnxqbzvddn")
                    .withSupportPlanId("ndei")
                    .withContactDetails(new ContactProfile().withFirstName("btwnpzaoqvuhrhcf")
                        .withLastName("cyddglmjthjqk")
                        .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                        .withPrimaryEmailAddress("yeicxmqciwqvhk")
                        .withAdditionalEmailAddresses(Arrays.asList("uigdtopbobjog", "m", "w"))
                        .withPhoneNumber("m")
                        .withPreferredTimeZone("uhrzayvvt")
                        .withCountry("gvdfgiotkftutq")
                        .withPreferredSupportLanguage("ln"))
                    .withServiceLevelAgreement(new ServiceLevelAgreement())
                    .withSupportEngineer(new SupportEngineer())
                    .withTitle("vqdra")
                    .withProblemStartTime(OffsetDateTime.parse("2021-02-10T08:49:49Z"))
                    .withServiceId("yb")
                    .withFileWorkspaceName("zgpphrcgyncocpe")
                    .withTechnicalTicketDetails(new TechnicalTicketDetails().withResourceId("coofsxlzev"))
                    .withQuotaTicketDetails(new QuotaTicketDetails().withQuotaChangeRequestSubType("qjqabcypmivkwl")
                        .withQuotaChangeRequestVersion("vccfw")
                        .withQuotaChangeRequests(Arrays.asList(new QuotaChangeRequest(), new QuotaChangeRequest())))
                    .withSecondaryConsent(Arrays
                        .asList(new SecondaryConsent().withUserConsent(UserConsent.YES).withType("onlebxetqgtzxdpn"))),
                new SupportTicketDetailsInner().withSupportTicketId("cbonqvpk")
                    .withDescription("lrxnjeaseiphe")
                    .withProblemClassificationId("f")
                    .withSeverity(SeverityLevel.MINIMAL)
                    .withEnrollmentId("bdlwtgrhpdjpj")
                    .withRequire24X7Response(true)
                    .withAdvancedDiagnosticConsent(Consent.YES)
                    .withProblemScopingQuestions("azjpqyegualhbxxh")
                    .withSupportPlanId("jzzvdud")
                    .withContactDetails(new ContactProfile().withFirstName("wdslfhotwmcy")
                        .withLastName("pwlbjnpg")
                        .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                        .withPrimaryEmailAddress("ftadehxnltyfs")
                        .withAdditionalEmailAddresses(Arrays.asList("usue", "nzwdejba"))
                        .withPhoneNumber("rxzdmohctbqvudwx")
                        .withPreferredTimeZone("ndnvo")
                        .withCountry("gujjugwdkcglh")
                        .withPreferredSupportLanguage("lazjdyggdtjixhbk"))
                    .withServiceLevelAgreement(new ServiceLevelAgreement())
                    .withSupportEngineer(new SupportEngineer())
                    .withTitle("qsc")
                    .withProblemStartTime(OffsetDateTime.parse("2021-08-12T09:29:36Z"))
                    .withServiceId("pvhez")
                    .withFileWorkspaceName("qjpkcattpngjcrc")
                    .withTechnicalTicketDetails(new TechnicalTicketDetails().withResourceId("jh"))
                    .withQuotaTicketDetails(new QuotaTicketDetails().withQuotaChangeRequestSubType("ajvnysounqe")
                        .withQuotaChangeRequestVersion("noae")
                        .withQuotaChangeRequests(Arrays.asList(new QuotaChangeRequest(), new QuotaChangeRequest(),
                            new QuotaChangeRequest(), new QuotaChangeRequest())))
                    .withSecondaryConsent(
                        Arrays.asList(new SecondaryConsent().withUserConsent(UserConsent.YES).withType("rpmopjmc"),
                            new SecondaryConsent().withUserConsent(UserConsent.YES).withType("okth"),
                            new SecondaryConsent().withUserConsent(UserConsent.YES).withType("aodsfcpkv"),
                            new SecondaryConsent().withUserConsent(UserConsent.YES).withType("uozmyzydagfua"))),
                new SupportTicketDetailsInner().withSupportTicketId("imoryocfsfksym")
                    .withDescription("dystkiiuxhqyud")
                    .withProblemClassificationId("o")
                    .withSeverity(SeverityLevel.HIGHESTCRITICALIMPACT)
                    .withEnrollmentId("czvyifq")
                    .withRequire24X7Response(false)
                    .withAdvancedDiagnosticConsent(Consent.NO)
                    .withProblemScopingQuestions("jsllrmv")
                    .withSupportPlanId("f")
                    .withContactDetails(new ContactProfile().withFirstName("atkpnp")
                        .withLastName("lexxbczwtru")
                        .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                        .withPrimaryEmailAddress("qzbqjvsov")
                        .withAdditionalEmailAddresses(Arrays.asList("kacspkw", "hzdobpxjmflbvvnc"))
                        .withPhoneNumber("kcciwwzjuqkhr")
                        .withPreferredTimeZone("ajiwkuo")
                        .withCountry("oskg")
                        .withPreferredSupportLanguage("sauuimj"))
                    .withServiceLevelAgreement(new ServiceLevelAgreement())
                    .withSupportEngineer(new SupportEngineer())
                    .withTitle("gz")
                    .withProblemStartTime(OffsetDateTime.parse("2021-09-05T06:09:57Z"))
                    .withServiceId("hfmvfaxkffe")
                    .withFileWorkspaceName("mzsb")
                    .withTechnicalTicketDetails(new TechnicalTicketDetails().withResourceId("igrxwburvjxxjn"))
                    .withQuotaTicketDetails(new QuotaTicketDetails().withQuotaChangeRequestSubType("dptkoenkouk")
                        .withQuotaChangeRequestVersion("udwtiukbl")
                        .withQuotaChangeRequests(Arrays.asList(new QuotaChangeRequest(), new QuotaChangeRequest(),
                            new QuotaChangeRequest(), new QuotaChangeRequest())))
                    .withSecondaryConsent(
                        Arrays.asList(new SecondaryConsent().withUserConsent(UserConsent.NO).withType("pazyxoegukg"),
                            new SecondaryConsent().withUserConsent(UserConsent.YES).withType("ucgygevqz"),
                            new SecondaryConsent().withUserConsent(UserConsent.YES).withType("mrbpizcdrqj"),
                            new SecondaryConsent().withUserConsent(UserConsent.YES).withType("dnfyhxdeoejzicwi")))))
            .withNextLink("lpbuxwgipwhonowk");
        model = BinaryData.fromObject(model).toObject(SupportTicketsListResult.class);
        Assertions.assertEquals("qawrlyxwj", model.value().get(0).supportTicketId());
        Assertions.assertEquals("cpr", model.value().get(0).description());
        Assertions.assertEquals("nwbxgjvtbvpyssz", model.value().get(0).problemClassificationId());
        Assertions.assertEquals(SeverityLevel.HIGHESTCRITICALIMPACT, model.value().get(0).severity());
        Assertions.assertEquals("uouq", model.value().get(0).enrollmentId());
        Assertions.assertEquals(false, model.value().get(0).require24X7Response());
        Assertions.assertEquals(Consent.NO, model.value().get(0).advancedDiagnosticConsent());
        Assertions.assertEquals("wbnguitnwui", model.value().get(0).problemScopingQuestions());
        Assertions.assertEquals("a", model.value().get(0).supportPlanId());
        Assertions.assertEquals("x", model.value().get(0).contactDetails().firstName());
        Assertions.assertEquals("fizuckyf", model.value().get(0).contactDetails().lastName());
        Assertions.assertEquals(PreferredContactMethod.EMAIL,
            model.value().get(0).contactDetails().preferredContactMethod());
        Assertions.assertEquals("rfidfvzwdz", model.value().get(0).contactDetails().primaryEmailAddress());
        Assertions.assertEquals("ymwisdkft", model.value().get(0).contactDetails().additionalEmailAddresses().get(0));
        Assertions.assertEquals("xmnteiwaop", model.value().get(0).contactDetails().phoneNumber());
        Assertions.assertEquals("km", model.value().get(0).contactDetails().preferredTimeZone());
        Assertions.assertEquals("jcmmxdcufufsrp", model.value().get(0).contactDetails().country());
        Assertions.assertEquals("mzidnsezcxtb", model.value().get(0).contactDetails().preferredSupportLanguage());
        Assertions.assertEquals("inpvswjdkirsoodq", model.value().get(0).title());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-12T18:06:29Z"), model.value().get(0).problemStartTime());
        Assertions.assertEquals("rmnohj", model.value().get(0).serviceId());
        Assertions.assertEquals("cjxvsnbyxqab", model.value().get(0).fileWorkspaceName());
        Assertions.assertEquals("cyshurzafbljjgp", model.value().get(0).technicalTicketDetails().resourceId());
        Assertions.assertEquals("qcjm", model.value().get(0).quotaTicketDetails().quotaChangeRequestSubType());
        Assertions.assertEquals("javbqidtqajz", model.value().get(0).quotaTicketDetails().quotaChangeRequestVersion());
        Assertions.assertEquals(UserConsent.YES, model.value().get(0).secondaryConsent().get(0).userConsent());
        Assertions.assertEquals("krlkhbzhfepg", model.value().get(0).secondaryConsent().get(0).type());
        Assertions.assertEquals("lpbuxwgipwhonowk", model.nextLink());
    }
}
