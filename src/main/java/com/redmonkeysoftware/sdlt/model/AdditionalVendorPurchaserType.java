package com.redmonkeysoftware.sdlt.model;

import org.apache.commons.lang3.StringUtils;

public enum AdditionalVendorPurchaserType implements BaseEnumType {
    PURCHASER("Purchaser", "Purchaser"),
    VENDOR("Vendor", "Vendor");
    private final String code;
    private final String description;

    private AdditionalVendorPurchaserType(final String code, final String description) {
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

    public static AdditionalVendorPurchaserType fromCode(final String code) {
        for (AdditionalVendorPurchaserType ict : values()) {
            if (StringUtils.equalsIgnoreCase(ict.getCode(), code)) {
                return ict;
            }
        }
        return null;
    }
}
