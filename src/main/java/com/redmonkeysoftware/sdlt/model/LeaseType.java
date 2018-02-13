package com.redmonkeysoftware.sdlt.model;

import org.apache.commons.lang3.StringUtils;

public enum LeaseType implements BaseEnumType {
    MIXED("M", "Mixed"),
    RESIDENTIAL("R", "Residential"),
    NON_RESIDENTIAL("N", "Non Residential");
    private final String code;
    private final String description;

    private LeaseType(final String code, final String description) {
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

    public static LeaseType fromCode(final String code) {
        for (LeaseType ict : values()) {
            if (StringUtils.equalsIgnoreCase(ict.getCode(), code)) {
                return ict;
            }
        }
        return null;
    }
}
