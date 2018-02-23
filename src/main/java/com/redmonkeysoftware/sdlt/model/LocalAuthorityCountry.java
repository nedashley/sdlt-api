package com.redmonkeysoftware.sdlt.model;

import org.apache.commons.lang3.StringUtils;

public enum LocalAuthorityCountry implements BaseEnumType {
    ENGLAND("E", "England"), WALES("W", "Wales"), SCOTLAND("S", "Scotland");
    private final String code;
    private final String description;

    private LocalAuthorityCountry(final String code, final String description) {
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

    public static LocalAuthorityCountry fromCode(final String code) {
        for (LocalAuthorityCountry ict : values()) {
            if (StringUtils.equalsIgnoreCase(ict.getCode(), code)) {
                return ict;
            }
        }
        return null;
    }
}
