package com.redmonkeysoftware.sdlt.model;

import org.apache.commons.lang3.StringUtils;

public enum TransactionDescriptionType implements BaseEnumType {
    CONVEYANCE_TRANSFER_WITH_LEASE("A", "Conveyance/Transfer with Lease"),
    CONVEYANCE_TRANSFER("F", "Conveyance/Transfer"),
    GRANT_OF_LEASE("L", "Grant of Lease"),
    OTHER("O", "Other");
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
