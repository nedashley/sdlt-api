package com.redmonkeysoftware.sdlt.model;

import org.apache.commons.lang3.StringUtils;

public enum TaxReliefType implements BaseEnumType {
    TR_05("05", "Designated disadvantaged areas (residential)"),
    TR_07("07", "Designated disadvantaged areas (mixed)"),
    TR_08("08", "Part-exchange (house building company)"),
    TR_09("09", "Re-location of employment"),
    TR_10("10", "Compulsory purchase facilitating development"),
    TR_11("11", "Compliance with planning obligations"),
    TR_12("12", "Group relief"),
    TR_13("13", "Reconstruction relief"),
    TR_14("14", "Acquisition relief (tax at 0.5%)"),
    TR_15("15", "Demutualisation of insurance company"),
    TR_16("16", "Demutualisation of building society"),
    TR_17("17", "Incorporation of limited liability partnership"),
    TR_18("18", "Transfers involving public bodies"),
    TR_19("19", "Transfer in consequence of reorganisation of parliamentary constituencies"),
    TR_20("20", "Charities"),
    TR_21("21", "Acquisition by bodies established for national purposes"),
    TR_22("22", "Right to buy transactions"),
    TR_23("23", "Registered social landlords"),
    TR_24("24", "Alternative property finance"),
    TR_25("25", "Collective enfranchisements by leaseholders (not in Scotland)"),
    TR_26("26", "Crofting community right to buy (Scotland only)"),
    TR_27("27", "Diplomatic Privileges"),
    TR_28("28", "Other"),
    TR_29("29", "Combination of Reliefs"),
    TR_30("30", "Zero Carbon Homes"),
    TR_31("31", "Alternative Finance Investment Bonds"),
    TR_32("32", "First Time Buyers relief"),
    TR_33("33", "Multiple Dwelling relief"),
    TR_34("34", "Pre-completion transaction"),
    TR_35("35", "15% Relief");
    private final String code;
    private final String description;

    private TaxReliefType(final String code, final String description) {
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

    public static TaxReliefType fromCode(final String code) {
        for (TaxReliefType ict : values()) {
            if (StringUtils.equalsIgnoreCase(ict.getCode(), code)) {
                return ict;
            }
        }
        return null;
    }
}
