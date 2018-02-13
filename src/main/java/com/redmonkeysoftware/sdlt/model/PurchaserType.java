package com.redmonkeysoftware.sdlt.model;

import org.apache.commons.lang3.StringUtils;

public enum PurchaserType implements BaseEnumType {
    INDIVIDUAL("1", "Individual(s)"),
    NON_NATURAL("2", "Non-Natural Person(s)");
    private final String code;
    private final String description;

    private PurchaserType(final String code, final String description) {
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

    public static PurchaserType fromCode(final String code) {
        for (PurchaserType ict : values()) {
            if (StringUtils.equalsIgnoreCase(ict.getCode(), code)) {
                return ict;
            }
        }
        return null;
    }
}
