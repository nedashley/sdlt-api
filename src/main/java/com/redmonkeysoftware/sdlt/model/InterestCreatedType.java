package com.redmonkeysoftware.sdlt.model;

import org.apache.commons.lang3.StringUtils;

public enum InterestCreatedType implements BaseEnumType {

    FG_1("FG_1", "FG | Freehold subject to leases each reserving a ground or nominal rent"),
    FP_1("FP_1", "FP | Freehold with vacant possession"),
    FT_1("FT_1", "FT | Freehold subject to a lease or tenancy to an occupier"),
    LG_1("LG_1", "LG | Long leasehold at a ground or nominal rent with vacant possession"),
    LP_1("LP_1", "LP | A lease to an occupier"),
    LT_1("LT_1", "LT | Long leasehold subject to lease(s) to an occupier"),
    OT_1("OT_1", "OT | All other interests"),
    FG_2("FG_2", "FG | Freehold subject to a long lease"),
    FG_3("FG_3", "FG | Superior's interest, including minutes of waiver (Scotland Only)"),
    FP_2("FP_2", "FP | Owner's interest with vacant possession (Scotland Only)"),
    FT_2("FT_2", "FT | Owner's interest subject to tenancy (Scotland Only)"),
    LP_2("LP_2", "LP | Leasehold/tenant's interest (Scotland Only)");
    private final String code;
    private final String description;

    private InterestCreatedType(final String code, final String description) {
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

    public static InterestCreatedType fromCode(final String code) {
        for (InterestCreatedType ict : values()) {
            if (StringUtils.equalsIgnoreCase(ict.getCode(), code)) {
                return ict;
            }
        }
        return null;
    }
}
