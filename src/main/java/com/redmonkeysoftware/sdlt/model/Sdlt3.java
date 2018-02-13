package com.redmonkeysoftware.sdlt.model;

import java.io.Serializable;

public class Sdlt3 implements Serializable {

    private static final long serialVersionUID = 7970339525165775481L;
    @SdltXmlValue("SDLT3_PropertyTypeCode")
    protected String type;
    @SdltXmlValue("SDLT3_PropertyLocalAuthorityCode")
    protected String localAuthority;
    @SdltXmlValue("SDLT3_PropertyTitleNumber")
    protected String titleNumber;
    @SdltXmlValue("SDLT3_PropertyNLPGUPRN")
    protected String nlpgUprn;
    @SdltXmlValue("SDLT3_PropertyAddressBuildingNo")
    protected String property;
    @SdltXmlValue("SDLT3_PropertyAddressPostcode")
    protected String postcode;
    @SdltXmlValue("SDLT3_PropertyAddress1")
    protected String address1;
    @SdltXmlValue("SDLT3_PropertyAddress2")
    protected String address2;
    @SdltXmlValue("SDLT3_PropertyAddress3")
    protected String address3;
    @SdltXmlValue("SDLT3_PropertyAddress4")
    protected String address4;
    @SdltXmlValue("SDLT3_PropertyUnitsHectareMetres")
    protected String unitsHectareMetres;
    @SdltXmlValue("SDLT3_PropertyAreaSize")
    protected String areaSize;
    @SdltXmlValue("SDLT3_PropertyMineratlRightsCode")
    protected String mineratlRights;
    @SdltXmlValue("SDLT3_PropertyPlanAttachedYesNo")
    protected boolean planAttached;
    @SdltXmlValue("SDLT3_InterestCreatedCode")
    protected String interestCreated;
    @SdltXmlValue("SDLT3_InterestCreatedCodeDetailed")
    protected String interestedCreatedDetailed;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocalAuthority() {
        return localAuthority;
    }

    public void setLocalAuthority(String localAuthority) {
        this.localAuthority = localAuthority;
    }

    public String getTitleNumber() {
        return titleNumber;
    }

    public void setTitleNumber(String titleNumber) {
        this.titleNumber = titleNumber;
    }

    public String getNlpgUprn() {
        return nlpgUprn;
    }

    public void setNlpgUprn(String nlpgUprn) {
        this.nlpgUprn = nlpgUprn;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
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

    public String getMineratlRights() {
        return mineratlRights;
    }

    public void setMineratlRights(String mineratlRights) {
        this.mineratlRights = mineratlRights;
    }

    public boolean isPlanAttached() {
        return planAttached;
    }

    public void setPlanAttached(boolean planAttached) {
        this.planAttached = planAttached;
    }

    public String getInterestCreated() {
        return interestCreated;
    }

    public void setInterestCreated(String interestCreated) {
        this.interestCreated = interestCreated;
    }

    public String getInterestedCreatedDetailed() {
        return interestedCreatedDetailed;
    }

    public void setInterestedCreatedDetailed(String interestedCreatedDetailed) {
        this.interestedCreatedDetailed = interestedCreatedDetailed;
    }
}
