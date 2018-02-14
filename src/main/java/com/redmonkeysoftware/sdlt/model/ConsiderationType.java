package com.redmonkeysoftware.sdlt.model;

import org.apache.commons.lang3.StringUtils;

public enum ConsiderationType implements BaseEnumType {
    CASH("30", "Cash"),
    DEBT("31", "Debt"),
    BUILDING_WORKS("32", "Building Works"),
    EMPLOYMENT("33", "Employment"),
    OTHER("34", "Other (such as annuity)"),
    SHARES_QUOTED("35", "Shares in a quoted company"),
    SHARES_UNQUOTED("36", "Shares in an unquoted company"),
    OTHER_LAND("37", "Other Land"),
    SERVICES("38", "Services"),
    CONTINGENT("39", "Contingent");
    private final String code;
    private final String description;

    private ConsiderationType(final String code, final String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return code;
    }

    public static ConsiderationType fromCode(final String code) {
        for (ConsiderationType ict : values()) {
            if (StringUtils.equalsIgnoreCase(ict.getCode(), code)) {
                return ict;
            }
        }
        return null;
    }
}
