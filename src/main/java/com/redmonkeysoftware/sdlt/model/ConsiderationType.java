package com.redmonkeysoftware.sdlt.model;

import org.apache.commons.lang3.StringUtils;

public enum ConsiderationType implements BaseEnumType {
    CT_30("30", "Cash"),
    CT_31("31", "Debt"),
    CT_32("32", "Building Works"),
    CT_33("33", "Employment"),
    CT_34("34", "Other (such as annuity)"),
    CT_35("35", "Shares in a quoted company"),
    CT_36("36", "Shares in an unquoted company"),
    CT_37("37", "Other Land"),
    CT_38("38", "Services"),
    CT_39("39", "Contingent");
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
