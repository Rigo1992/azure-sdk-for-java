// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A string property that indicates the action to be performed on the Flink job. It can have one of the following enum
 * values =&gt; NEW, UPDATE, STATELESS_UPDATE, STOP, START, CANCEL, SAVEPOINT, LIST_SAVEPOINT, or DELETE.
 */
public final class Action extends ExpandableStringEnum<Action> {
    /**
     * Static value NEW for Action.
     */
    public static final Action NEW = fromString("NEW");

    /**
     * Static value UPDATE for Action.
     */
    public static final Action UPDATE = fromString("UPDATE");

    /**
     * Static value STATELESS_UPDATE for Action.
     */
    public static final Action STATELESS_UPDATE = fromString("STATELESS_UPDATE");

    /**
     * Static value STOP for Action.
     */
    public static final Action STOP = fromString("STOP");

    /**
     * Static value START for Action.
     */
    public static final Action START = fromString("START");

    /**
     * Static value CANCEL for Action.
     */
    public static final Action CANCEL = fromString("CANCEL");

    /**
     * Static value SAVEPOINT for Action.
     */
    public static final Action SAVEPOINT = fromString("SAVEPOINT");

    /**
     * Static value LIST_SAVEPOINT for Action.
     */
    public static final Action LIST_SAVEPOINT = fromString("LIST_SAVEPOINT");

    /**
     * Static value DELETE for Action.
     */
    public static final Action DELETE = fromString("DELETE");

    /**
     * Static value LAST_STATE_UPDATE for Action.
     */
    public static final Action LAST_STATE_UPDATE = fromString("LAST_STATE_UPDATE");

    /**
     * Static value RE_LAUNCH for Action.
     */
    public static final Action RE_LAUNCH = fromString("RE_LAUNCH");

    /**
     * Creates a new instance of Action value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Action() {
    }

    /**
     * Creates or finds a Action from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Action.
     */
    @JsonCreator
    public static Action fromString(String name) {
        return fromString(name, Action.class);
    }

    /**
     * Gets known Action values.
     * 
     * @return known Action values.
     */
    public static Collection<Action> values() {
        return values(Action.class);
    }
}
