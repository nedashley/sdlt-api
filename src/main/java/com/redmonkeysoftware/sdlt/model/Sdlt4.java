package com.redmonkeysoftware.sdlt.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Sdlt4 implements Serializable {

    private static final long serialVersionUID = -4033861399854185663L;
    @SdltXmlValue("SDLT4_ConsiderationStockYesNo")
    protected Boolean considerationStock;
    @SdltXmlValue("SDLT4_ConsiderationGoodWillYesNo")
    protected Boolean considerationGoodWill;
    @SdltXmlValue("SDLT4_ConsiderationOtherYesNo")
    protected Boolean considerationOther;
    @SdltXmlValue("SDLT4_ConsiderationChattelsYesNo")
    protected Boolean considerationChattels;
    @SdltXmlValue("SDLT4_TotalConsiderationAmount")
    protected BigDecimal totalConsideration;
    @SdltXmlValue("SDLT4_PropertyUseOffice")
    protected Boolean propertyUseOffice;
    @SdltXmlValue("SDLT4_PropertyUseHotel")
    protected Boolean propertyUseHotel;
    @SdltXmlValue("SDLT4_PropertyUseShop")
    protected Boolean propertyUseShop;
    @SdltXmlValue("SDLT4_PropertyUseWarehouse")
    protected Boolean propertyUseWarehouse;
    @SdltXmlValue("SDLT4_PropertyUseFactory")
    protected Boolean propertyUseFactory;
    @SdltXmlValue("SDLT4_PropertyUseOther")
    protected Boolean propertyUseOther;
    @SdltXmlValue("SDLT4_PropertyUseOtherInd")
    protected Boolean propertyUseOtherInd;
    @SdltXmlValue("SDLT4_PostTransactionRulingYesNo")
    protected Boolean postTransactionRuling;
    @SdltXmlValue("SDLT4_IfYesHasRullingBeenFollowed")
    protected Boolean rulingBeenFollowed;
    @SdltXmlValue("SDLT4_ConsiderationDependentOnFutureEventsYesNo")
    protected Boolean considerationDependantOnFutureEvents;
    @SdltXmlValue("SDLT4_DeferredPaymentAgreedYesNo")
    protected Boolean deferredPaymentAgreed;
    @SdltXmlValue("SDLT4_PropertyMineratlRightsCode")
    protected String propertyMineratlRightsCode;
    @SdltXmlValue("SDLT4_Purchaser1DescriptionCode")
    protected String purchaser1DescriptionCode;
    @SdltXmlValue("SDLT4_Purchaser2DescriptionCode")
    protected String purchaser2DescriptionCode;
    @SdltXmlValue("SDLT4_Purchaser3DescriptionCode")
    protected String purchaser3DescriptionCode;
    @SdltXmlValue("SDLT4_Purchaser4DescriptionCode")
    protected String purchaser4DescriptionCode;
    @SdltXmlValue("SDLT4_PropertyTypeCode")
    protected String propertyType;
    @SdltXmlValue("SDLT4_PropertySameAddressAsSDLT1")
    protected String sameAddress;
    @SdltXmlValue("SDLT4_PropertyAddressPostcode")
    protected String addressPostcode;
    @SdltXmlValue("SDLT4_PropertyAddressBuildingNo")
    protected String addressProperty;
    @SdltXmlValue("SDLT4_PropertyAddress1")
    protected String address1;
    @SdltXmlValue("SDLT4_PropertyAddress2")
    protected String address2;
    @SdltXmlValue("SDLT4_PropertyAddress3")
    protected String address3;
    @SdltXmlValue("SDLT4_PropertyAddress4")
    protected String address4;
    @SdltXmlValue("SDLT4_PropertyLocalAuthorityCode")
    protected LocalAuthority localAuthority;
    @SdltXmlValue("SDLT4_PropertyTitleNumber")
    protected String titleNumber;
    @SdltXmlValue("SDLT4_PropertyNLPGUPRN")
    protected String propertyNlpgUprn;
    @SdltXmlValue("SDLT4_PropertyUnitsHectareMetres")
    protected String unitsHectareMetres;
    @SdltXmlValue("SDLT4_PropertyAreaSize")
    protected String areaSize;
    @SdltXmlValue("SDLT4_PropertyPlanAttachedYesNo")
    protected Boolean planAttached;
    @SdltXmlValue("SDLT4_InterestCreatedCode")
    protected InterestCreatedType interestCreated;
    @SdltXmlValue("SDLT4_InterestCreatedCodeDetailed")
    protected String interestCreatedDetailed;
    @SdltXmlValue("SDLT4_LeaseTypeCode")
    protected LeaseType leaseType;
    @SdltXmlValue("SDLT4_LeaseStartDate")
    protected LocalDate leaseStartDate;
    @SdltXmlValue("SDLT4_LeaseEndDate")
    protected LocalDate leaseEndDate;
    @SdltXmlValue("SDLT4_RentFreePeriod")
    protected String rentFreePeriod;
    @SdltXmlValue("SDLT4_TotalLeasePremiumPayable")
    protected BigDecimal totalLeasePremiumPayable;
    @SdltXmlValue("SDLT4_EndDateForStartingRent")
    protected LocalDate startingRentEndDate;
    @SdltXmlValue("SDLT4_LaterRentKnownYesNo")
    protected Boolean laterRentKnown;
    @SdltXmlValue("SDLT4_LeaseAmountVAT")
    protected BigDecimal leaseAmountVat;
    @SdltXmlValue("SDLT4_TotalLeasePremiumPaid")
    protected BigDecimal totalLeasePremiumPaid;
    @SdltXmlValue("SDLT4_NetPresentValue")
    protected BigDecimal newPresentValue;
    @SdltXmlValue("SDLT4_TotalLeasePremiumTaxPayable")
    protected BigDecimal totalLeasePremiumTaxPayable;
    @SdltXmlValue("SDLT4_TotalLeaseNPVTaxPayable")
    protected BigDecimal totalLeaseNpvTaxPayable;
    @SdltXmlValue("SDLT4_AnyTermsSurrendered")
    protected String anyTermsSurrendered;
    @SdltXmlValue("SDLT4_BreakClauseTypeCode")
    protected String breakClauseTypeCode;
    @SdltXmlValue("SDLT4_BreakClauseDate")
    protected LocalDate breakClauseDate;
    @SdltXmlValue("SDLT4_ConditionsOptionToRenew")
    protected String conditionsOptionToRenew;
    @SdltXmlValue("SDLT4_ConditionsUnascertainableRent")
    protected String conditionsUnascertainableRent;
    @SdltXmlValue("SDLT4_ConditionsMarketRent")
    protected String conditionsMarketRent;
    @SdltXmlValue("SDLT4_ConditionsContingentReservedRent")
    protected String conditionsContingentReservedRent;
    @SdltXmlValue("SDLT4_ConditionsTurnoverRent")
    protected String conditionsTurnoverRent;
    @SdltXmlValue("SDLT4_PropertyRentReviewFrequency")
    protected String rentReviewFrequency;
    @SdltXmlValue("SDLT4_FirstReviewDate")
    protected LocalDate firstReviewDate;
    @SdltXmlValue("SDLT4_ReviewClauseType")
    protected String reviewClauseType;
    @SdltXmlValue("SDLT4_DateOfRentChange")
    protected LocalDate dateOfRentChange;
    @SdltXmlValue("SDLT4_PropertyServiceChargeAmount")
    protected BigDecimal serviceChargeAmount;
    @SdltXmlValue("SDLT4_PropertyServiceChargeFrequency")
    protected String serviceChargeFrequency;
    @SdltXmlValue("SDLT4_ConsiderationTenant2LandlordCode1")
    protected ConsiderationType considerationTenant2LandlordCode1;
    @SdltXmlValue("SDLT4_ConsiderationTenant2LandlordCode2")
    protected ConsiderationType considerationTenant2LandlordCode2;
    @SdltXmlValue("SDLT4_ConsiderationTenant2LandlordCode3")
    protected ConsiderationType considerationTenant2LandlordCode3;
    @SdltXmlValue("SDLT4_ConsiderationTenant2LandlordCode4")
    protected ConsiderationType considerationTenant2LandlordCode4;
    @SdltXmlValue("SDLT4_ConsiderationLandlord2TenantCode1")
    protected ConsiderationType considerationLandlord2TenantCode1;
    @SdltXmlValue("SDLT4_ConsiderationLandlord2TenantCode2")
    protected ConsiderationType considerationLandlord2TenantCode2;
    @SdltXmlValue("SDLT4_ConsiderationLandlord2TenantCode3")
    protected ConsiderationType considerationLandlord2TenantCode3;
    @SdltXmlValue("SDLT4_ConsiderationLandlord2TenantCode4")
    protected ConsiderationType considerationLandlord2TenantCode4;

    public Boolean getConsiderationStock() {
        return considerationStock;
    }

    public void setConsiderationStock(Boolean considerationStock) {
        this.considerationStock = considerationStock;
    }

    public Boolean getConsiderationGoodWill() {
        return considerationGoodWill;
    }

    public void setConsiderationGoodWill(Boolean considerationGoodWill) {
        this.considerationGoodWill = considerationGoodWill;
    }

    public Boolean getConsiderationOther() {
        return considerationOther;
    }

    public void setConsiderationOther(Boolean considerationOther) {
        this.considerationOther = considerationOther;
    }

    public Boolean getConsiderationChattels() {
        return considerationChattels;
    }

    public void setConsiderationChattels(Boolean considerationChattels) {
        this.considerationChattels = considerationChattels;
    }

    public BigDecimal getTotalConsideration() {
        return totalConsideration;
    }

    public void setTotalConsideration(BigDecimal totalConsideration) {
        this.totalConsideration = totalConsideration;
    }

    public Boolean getPropertyUseOffice() {
        return propertyUseOffice;
    }

    public void setPropertyUseOffice(Boolean propertyUseOffice) {
        this.propertyUseOffice = propertyUseOffice;
    }

    public Boolean getPropertyUseHotel() {
        return propertyUseHotel;
    }

    public void setPropertyUseHotel(Boolean propertyUseHotel) {
        this.propertyUseHotel = propertyUseHotel;
    }

    public Boolean getPropertyUseShop() {
        return propertyUseShop;
    }

    public void setPropertyUseShop(Boolean propertyUseShop) {
        this.propertyUseShop = propertyUseShop;
    }

    public Boolean getPropertyUseWarehouse() {
        return propertyUseWarehouse;
    }

    public void setPropertyUseWarehouse(Boolean propertyUseWarehouse) {
        this.propertyUseWarehouse = propertyUseWarehouse;
    }

    public Boolean getPropertyUseFactory() {
        return propertyUseFactory;
    }

    public void setPropertyUseFactory(Boolean propertyUseFactory) {
        this.propertyUseFactory = propertyUseFactory;
    }

    public Boolean getPropertyUseOther() {
        return propertyUseOther;
    }

    public void setPropertyUseOther(Boolean propertyUseOther) {
        this.propertyUseOther = propertyUseOther;
    }

    public Boolean getPropertyUseOtherInd() {
        return propertyUseOtherInd;
    }

    public void setPropertyUseOtherInd(Boolean propertyUseOtherInd) {
        this.propertyUseOtherInd = propertyUseOtherInd;
    }

    public Boolean getPostTransactionRuling() {
        return postTransactionRuling;
    }

    public void setPostTransactionRuling(Boolean postTransactionRuling) {
        this.postTransactionRuling = postTransactionRuling;
    }

    public Boolean getRulingBeenFollowed() {
        return rulingBeenFollowed;
    }

    public void setRulingBeenFollowed(Boolean rulingBeenFollowed) {
        this.rulingBeenFollowed = rulingBeenFollowed;
    }

    public Boolean getConsiderationDependantOnFutureEvents() {
        return considerationDependantOnFutureEvents;
    }

    public void setConsiderationDependantOnFutureEvents(Boolean considerationDependantOnFutureEvents) {
        this.considerationDependantOnFutureEvents = considerationDependantOnFutureEvents;
    }

    public Boolean getDeferredPaymentAgreed() {
        return deferredPaymentAgreed;
    }

    public void setDeferredPaymentAgreed(Boolean deferredPaymentAgreed) {
        this.deferredPaymentAgreed = deferredPaymentAgreed;
    }

    public String getPropertyMineratlRightsCode() {
        return propertyMineratlRightsCode;
    }

    public void setPropertyMineratlRightsCode(String propertyMineratlRightsCode) {
        this.propertyMineratlRightsCode = propertyMineratlRightsCode;
    }

    public String getPurchaser1DescriptionCode() {
        return purchaser1DescriptionCode;
    }

    public void setPurchaser1DescriptionCode(String purchaser1DescriptionCode) {
        this.purchaser1DescriptionCode = purchaser1DescriptionCode;
    }

    public String getPurchaser2DescriptionCode() {
        return purchaser2DescriptionCode;
    }

    public void setPurchaser2DescriptionCode(String purchaser2DescriptionCode) {
        this.purchaser2DescriptionCode = purchaser2DescriptionCode;
    }

    public String getPurchaser3DescriptionCode() {
        return purchaser3DescriptionCode;
    }

    public void setPurchaser3DescriptionCode(String purchaser3DescriptionCode) {
        this.purchaser3DescriptionCode = purchaser3DescriptionCode;
    }

    public String getPurchaser4DescriptionCode() {
        return purchaser4DescriptionCode;
    }

    public void setPurchaser4DescriptionCode(String purchaser4DescriptionCode) {
        this.purchaser4DescriptionCode = purchaser4DescriptionCode;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getSameAddress() {
        return sameAddress;
    }

    public void setSameAddress(String sameAddress) {
        this.sameAddress = sameAddress;
    }

    public String getAddressPostcode() {
        return addressPostcode;
    }

    public void setAddressPostcode(String addressPostcode) {
        this.addressPostcode = addressPostcode;
    }

    public String getAddressProperty() {
        return addressProperty;
    }

    public void setAddressProperty(String addressProperty) {
        this.addressProperty = addressProperty;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public LocalAuthority getLocalAuthority() {
        return localAuthority;
    }

    public void setLocalAuthority(LocalAuthority localAuthority) {
        this.localAuthority = localAuthority;
    }

    public String getTitleNumber() {
        return titleNumber;
    }

    public void setTitleNumber(String titleNumber) {
        this.titleNumber = titleNumber;
    }

    public String getPropertyNlpgUprn() {
        return propertyNlpgUprn;
    }

    public void setPropertyNlpgUprn(String propertyNlpgUprn) {
        this.propertyNlpgUprn = propertyNlpgUprn;
    }

    public String getUnitsHectareMetres() {
        return unitsHectareMetres;
    }

    public void setUnitsHectareMetres(String unitsHectareMetres) {
        this.unitsHectareMetres = unitsHectareMetres;
    }

    public String getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(String areaSize) {
        this.areaSize = areaSize;
    }

    public Boolean getPlanAttached() {
        return planAttached;
    }

    public void setPlanAttached(Boolean planAttached) {
        this.planAttached = planAttached;
    }

    public InterestCreatedType getInterestCreated() {
        return interestCreated;
    }

    public void setInterestCreated(InterestCreatedType interestCreated) {
        this.interestCreated = interestCreated;
    }

    public String getInterestCreatedDetailed() {
        return interestCreatedDetailed;
    }

    public void setInterestCreatedDetailed(String interestCreatedDetailed) {
        this.interestCreatedDetailed = interestCreatedDetailed;
    }

    public LeaseType getLeaseType() {
        return leaseType;
    }

    public void setLeaseType(LeaseType leaseType) {
        this.leaseType = leaseType;
    }

    public LocalDate getLeaseStartDate() {
        return leaseStartDate;
    }

    public void setLeaseStartDate(LocalDate leaseStartDate) {
        this.leaseStartDate = leaseStartDate;
    }

    public LocalDate getLeaseEndDate() {
        return leaseEndDate;
    }

    public void setLeaseEndDate(LocalDate leaseEndDate) {
        this.leaseEndDate = leaseEndDate;
    }

    public String getRentFreePeriod() {
        return rentFreePeriod;
    }

    public void setRentFreePeriod(String rentFreePeriod) {
        this.rentFreePeriod = rentFreePeriod;
    }

    public BigDecimal getTotalLeasePremiumPayable() {
        return totalLeasePremiumPayable;
    }

    public void setTotalLeasePremiumPayable(BigDecimal totalLeasePremiumPayable) {
        this.totalLeasePremiumPayable = totalLeasePremiumPayable;
    }

    public LocalDate getStartingRentEndDate() {
        return startingRentEndDate;
    }

    public void setStartingRentEndDate(LocalDate startingRentEndDate) {
        this.startingRentEndDate = startingRentEndDate;
    }

    public Boolean getLaterRentKnown() {
        return laterRentKnown;
    }

    public void setLaterRentKnown(Boolean laterRentKnown) {
        this.laterRentKnown = laterRentKnown;
    }

    public BigDecimal getLeaseAmountVat() {
        return leaseAmountVat;
    }

    public void setLeaseAmountVat(BigDecimal leaseAmountVat) {
        this.leaseAmountVat = leaseAmountVat;
    }

    public BigDecimal getTotalLeasePremiumPaid() {
        return totalLeasePremiumPaid;
    }

    public void setTotalLeasePremiumPaid(BigDecimal totalLeasePremiumPaid) {
        this.totalLeasePremiumPaid = totalLeasePremiumPaid;
    }

    public BigDecimal getNewPresentValue() {
        return newPresentValue;
    }

    public void setNewPresentValue(BigDecimal newPresentValue) {
        this.newPresentValue = newPresentValue;
    }

    public BigDecimal getTotalLeasePremiumTaxPayable() {
        return totalLeasePremiumTaxPayable;
    }

    public void setTotalLeasePremiumTaxPayable(BigDecimal totalLeasePremiumTaxPayable) {
        this.totalLeasePremiumTaxPayable = totalLeasePremiumTaxPayable;
    }

    public BigDecimal getTotalLeaseNpvTaxPayable() {
        return totalLeaseNpvTaxPayable;
    }

    public void setTotalLeaseNpvTaxPayable(BigDecimal totalLeaseNpvTaxPayable) {
        this.totalLeaseNpvTaxPayable = totalLeaseNpvTaxPayable;
    }

    public String getAnyTermsSurrendered() {
        return anyTermsSurrendered;
    }

    public void setAnyTermsSurrendered(String anyTermsSurrendered) {
        this.anyTermsSurrendered = anyTermsSurrendered;
    }

    public String getBreakClauseTypeCode() {
        return breakClauseTypeCode;
    }

    public void setBreakClauseTypeCode(String breakClauseTypeCode) {
        this.breakClauseTypeCode = breakClauseTypeCode;
    }

    public LocalDate getBreakClauseDate() {
        return breakClauseDate;
    }

    public void setBreakClauseDate(LocalDate breakClauseDate) {
        this.breakClauseDate = breakClauseDate;
    }

    public String getConditionsOptionToRenew() {
        return conditionsOptionToRenew;
    }

    public void setConditionsOptionToRenew(String conditionsOptionToRenew) {
        this.conditionsOptionToRenew = conditionsOptionToRenew;
    }

    public String getConditionsUnascertainableRent() {
        return conditionsUnascertainableRent;
    }

    public void setConditionsUnascertainableRent(String conditionsUnascertainableRent) {
        this.conditionsUnascertainableRent = conditionsUnascertainableRent;
    }

    public String getConditionsMarketRent() {
        return conditionsMarketRent;
    }

    public void setConditionsMarketRent(String conditionsMarketRent) {
        this.conditionsMarketRent = conditionsMarketRent;
    }

    public String getConditionsContingentReservedRent() {
        return conditionsContingentReservedRent;
    }

    public void setConditionsContingentReservedRent(String conditionsContingentReservedRent) {
        this.conditionsContingentReservedRent = conditionsContingentReservedRent;
    }

    public String getConditionsTurnoverRent() {
        return conditionsTurnoverRent;
    }

    public void setConditionsTurnoverRent(String conditionsTurnoverRent) {
        this.conditionsTurnoverRent = conditionsTurnoverRent;
    }

    public String getRentReviewFrequency() {
        return rentReviewFrequency;
    }

    public void setRentReviewFrequency(String rentReviewFrequency) {
        this.rentReviewFrequency = rentReviewFrequency;
    }

    public LocalDate getFirstReviewDate() {
        return firstReviewDate;
    }

    public void setFirstReviewDate(LocalDate firstReviewDate) {
        this.firstReviewDate = firstReviewDate;
    }

    public String getReviewClauseType() {
        return reviewClauseType;
    }

    public void setReviewClauseType(String reviewClauseType) {
        this.reviewClauseType = reviewClauseType;
    }

    public LocalDate getDateOfRentChange() {
        return dateOfRentChange;
    }

    public void setDateOfRentChange(LocalDate dateOfRentChange) {
        this.dateOfRentChange = dateOfRentChange;
    }

    public BigDecimal getServiceChargeAmount() {
        return serviceChargeAmount;
    }

    public void setServiceChargeAmount(BigDecimal serviceChargeAmount) {
        this.serviceChargeAmount = serviceChargeAmount;
    }

    public String getServiceChargeFrequency() {
        return serviceChargeFrequency;
    }

    public void setServiceChargeFrequency(String serviceChargeFrequency) {
        this.serviceChargeFrequency = serviceChargeFrequency;
    }

    public ConsiderationType getConsiderationTenant2LandlordCode1() {
        return considerationTenant2LandlordCode1;
    }

    public void setConsiderationTenant2LandlordCode1(ConsiderationType considerationTenant2LandlordCode1) {
        this.considerationTenant2LandlordCode1 = considerationTenant2LandlordCode1;
    }

    public ConsiderationType getConsiderationTenant2LandlordCode2() {
        return considerationTenant2LandlordCode2;
    }

    public void setConsiderationTenant2LandlordCode2(ConsiderationType considerationTenant2LandlordCode2) {
        this.considerationTenant2LandlordCode2 = considerationTenant2LandlordCode2;
    }

    public ConsiderationType getConsiderationTenant2LandlordCode3() {
        return considerationTenant2LandlordCode3;
    }

    public void setConsiderationTenant2LandlordCode3(ConsiderationType considerationTenant2LandlordCode3) {
        this.considerationTenant2LandlordCode3 = considerationTenant2LandlordCode3;
    }

    public ConsiderationType getConsiderationTenant2LandlordCode4() {
        return considerationTenant2LandlordCode4;
    }

    public void setConsiderationTenant2LandlordCode4(ConsiderationType considerationTenant2LandlordCode4) {
        this.considerationTenant2LandlordCode4 = considerationTenant2LandlordCode4;
    }

    public ConsiderationType getConsiderationLandlord2TenantCode1() {
        return considerationLandlord2TenantCode1;
    }

    public void setConsiderationLandlord2TenantCode1(ConsiderationType considerationLandlord2TenantCode1) {
        this.considerationLandlord2TenantCode1 = considerationLandlord2TenantCode1;
    }

    public ConsiderationType getConsiderationLandlord2TenantCode2() {
        return considerationLandlord2TenantCode2;
    }

    public void setConsiderationLandlord2TenantCode2(ConsiderationType considerationLandlord2TenantCode2) {
        this.considerationLandlord2TenantCode2 = considerationLandlord2TenantCode2;
    }

    public ConsiderationType getConsiderationLandlord2TenantCode3() {
        return considerationLandlord2TenantCode3;
    }

    public void setConsiderationLandlord2TenantCode3(ConsiderationType considerationLandlord2TenantCode3) {
        this.considerationLandlord2TenantCode3 = considerationLandlord2TenantCode3;
    }

    public ConsiderationType getConsiderationLandlord2TenantCode4() {
        return considerationLandlord2TenantCode4;
    }

    public void setConsiderationLandlord2TenantCode4(ConsiderationType considerationLandlord2TenantCode4) {
        this.considerationLandlord2TenantCode4 = considerationLandlord2TenantCode4;
    }
}
