package com.redmonkeysoftware.sdlt.model;

import org.apache.commons.lang3.StringUtils;

public enum PropertyType implements BaseEnumType {

    RESIDENTIAL("01", "Residential"),
    MIXED("02", "Mixed"),
    NON_RESIDENTIAL("03", "Non-Residential"),
    ADDITIONAL_RESIDENTIAL_PROPERTY("04", "Additional Residential Property");
    private final String code;
    private final String description;

    private PropertyType(final String code, final String description) {
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

    public static PropertyType fromCode(final String code) {
        for (PropertyType ict : values()) {
            if (StringUtils.equalsIgnoreCase(ict.getCode(), code)) {
                return ict;
            }
        }
        return null;
    }
}
