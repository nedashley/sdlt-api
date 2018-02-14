package com.redmonkeysoftware.sdlt.model;

import org.apache.commons.lang3.StringUtils;

public enum InterestCreatedType implements BaseEnumType {

    FREEHOLD_LEASES("FG_1", "FG | Freehold subject to leases each reserving a ground or nominal rent"),
    FREEHOLD_VACANT_POSSESSION("FP_1", "FP | Freehold with vacant possession"),
    FREEHOLD_LEASE_OCCUPIERS("FT_1", "FT | Freehold subject to a lease or tenancy to an occupier"),
    LEASEHOLD_VACANT_POSSESSION("LG_1", "LG | Long leasehold at a ground or nominal rent with vacant possession"),
    LEASEHOLD_OCCUPIER("LP_1", "LP | A lease to an occupier"),
    LEASEHOLD_OCCUPIER_LEASES("LT_1", "LT | Long leasehold subject to lease(s) to an occupier"),
    OTHER_INTERESTS("OT_1", "OT | All other interests"),
    FREEHOLD_LONG_LEASE("FG_2", "FG | Freehold subject to a long lease"),
    SCOT_SUPERIORS_INTEREST("FG_3", "FG | Superior's interest, including minutes of waiver (Scotland Only)"),
    SCOT_OWNERS_INTEREST_VACANT_POSSESSION("FP_2", "FP | Owner's interest with vacant possession (Scotland Only)"),
    SCOT_OWNERS_INTEREST_TENANCY("FT_2", "FT | Owner's interest subject to tenancy (Scotland Only)"),
    SCOT_LEASEHOLD_TENANTS_INTEREST("LP_2", "LP | Leasehold/tenant's interest (Scotland Only)");
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
