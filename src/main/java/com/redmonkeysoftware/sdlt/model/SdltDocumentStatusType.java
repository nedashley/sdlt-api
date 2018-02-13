package com.redmonkeysoftware.sdlt.model;

import org.apache.commons.lang3.StringUtils;

public enum SdltDocumentStatusType {
    DRAFT,
    ARCHIVED,
    PENDING,
    REJECTED,
    ACCEPTED;

    public static SdltDocumentStatusType parse(String input) {
        for (SdltDocumentStatusType type : values()) {
            if (StringUtils.equalsIgnoreCase(type.name(), input)) {
                return type;
            }
        }
        return null;
    }
}
