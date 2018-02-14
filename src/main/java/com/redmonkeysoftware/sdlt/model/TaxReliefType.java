package com.redmonkeysoftware.sdlt.model;

import org.apache.commons.lang3.StringUtils;

public enum TaxReliefType implements BaseEnumType {
    RESIDENTIAL_DISADVANTAGED_AREA("05", "Designated disadvantaged areas (residential)"),
    MIXED_DISADVANTAGED_AREA("07", "Designated disadvantaged areas (mixed)"),
    PART_EXCHANGE("08", "Part-exchange (house building company)"),
    EMPLOYMENT_RELOCATION("09", "Re-location of employment"),
    COMPULSORY_PURCHASE_FOR_DEVELOPMENT("10", "Compulsory purchase facilitating development"),
    PLANNING_OBLIGATION_COMPLIANCE("11", "Compliance with planning obligations"),
    GROUP_RELIEF("12", "Group relief"),
    RECONSTRUCTION_RELIEF("13", "Reconstruction relief"),
    ACQUISITION_RELIEF("14", "Acquisition relief (tax at 0.5%)"),
    DEMUTUALISATION_OF_INSURANCE_COMPANY("15", "Demutualisation of insurance company"),
    DEMUTUALISATION_OF_BUILDING_SOCIETY("16", "Demutualisation of building society"),
    INCORPORATION_OF_LLP("17", "Incorporation of limited liability partnership"),
    TRANSFERS_INVOLVING_PUBLIC_BODIES("18", "Transfers involving public bodies"),
    TRANSFER_REORGANISATION_CONSTITUENCY("19", "Transfer in consequence of reorganisation of parliamentary constituencies"),
    CHARITIES("20", "Charities"),
    ACQUISITION_NATIONAL_PURPOSES("21", "Acquisition by bodies established for national purposes"),
    RIGHT_TO_BUY("22", "Right to buy transactions"),
    SOCIAL_LANDLORDS("23", "Registered social landlords"),
    ALTERNATIVE_PROPERTY_FINANCE("24", "Alternative property finance"),
    COLLECTIVE_ENFRANCHISEMENTS("25", "Collective enfranchisements by leaseholders (not in Scotland)"),
    CROFTING_COMMUNITY("26", "Crofting community right to buy (Scotland only)"),
    DIPLOMATIC_PRIVILEGES("27", "Diplomatic Privileges"),
    OTHER("28", "Other"),
    COMBINATION_OF_RELIEFS("29", "Combination of Reliefs"),
    ZERO_CARBON_HOMES("30", "Zero Carbon Homes"),
    ALTERNATIVE_FINANCE_INVESTMENT_BONDS("31", "Alternative Finance Investment Bonds"),
    FIRST_TIME_BUYER("32", "First Time Buyers relief"),
    MULTIPLE_DWELLING("33", "Multiple Dwelling relief"),
    PRE_COMPLETION("34", "Pre-completion transaction"),
    FIFTEEN_PERCENT_RELIEF("35", "15% Relief");
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
