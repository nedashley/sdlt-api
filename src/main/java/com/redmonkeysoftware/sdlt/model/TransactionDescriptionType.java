package com.redmonkeysoftware.sdlt.model;

import org.apache.commons.lang3.StringUtils;

public enum TransactionDescriptionType implements BaseEnumType {
    A("A", "Conveyance/Transfer with Lease"),
    F("F", "Conveyance/Transfer"),
    L("L", "Grant of Lease"),
    O("O", "Other");
    private final String code;
    private final String description;

    private TransactionDescriptionType(final String code, final String description) {
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

    public static TransactionDescriptionType fromCode(final String code) {
        for (TransactionDescriptionType ict : values()) {
            if (StringUtils.equalsIgnoreCase(ict.getCode(), code)) {
                return ict;
            }
        }
        return null;
    }
}
