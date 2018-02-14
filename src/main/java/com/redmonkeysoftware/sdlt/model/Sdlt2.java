package com.redmonkeysoftware.sdlt.model;

import java.io.Serializable;

public class Sdlt2 implements Serializable {

    private static final long serialVersionUID = 9034711286976521480L;
    @SdltXmlValue("SDLT2_AdditionalVendorOrPuchaser")
    protected AdditionalVendorPurchaserType additionalVendorOrPurchaser;
    @SdltXmlValue("SDLT2_AdditionalVendorPurchaserTitle")
    protected String title;
    @SdltXmlValue("SDLT2_AdditionalVendorPurchaserSurname")
    protected String surname;
    @SdltXmlValue("SDLT2_AdditionalVendorPurchaserFirstName1")
    protected String firstName;
    @SdltXmlValue("SDLT2_AdditionalVendorPurchaserFirstName2")
    protected String secondName;
    @SdltXmlValue("SDLT2_AdditionalVendorPurchaserAddressPostcode")
    protected String postcode;
    @SdltXmlValue("SDLT2_AdditionalVendorPurchaserAddressBuildingNo")
    protected String property;
    @SdltXmlValue("SDLT2_AdditionalVendorPurchaserAddress1")
    protected String address1;
    @SdltXmlValue("SDLT2_AdditionalVendorPurchaserAddress2")
    protected String address2;
    @SdltXmlValue("SDLT2_AdditionalVendorPurchaserAddress3")
    protected String address3;
    @SdltXmlValue("SDLT2_AdditionalVendorPurchaserAddress4")
    protected String address4;
    @SdltXmlValue("SDLT2_PurchaserVendorConnectedYesNo")
    protected boolean connected;
    @SdltXmlValue("SDLT2_AdditionalPurchaserActingAsTrusteeYesNo")
    protected boolean actingAsTrustee;

    public AdditionalVendorPurchaserType getAdditionalVendorOrPurchaser() {
        return additionalVendorOrPurchaser;
    }

    public void setAdditionalVendorOrPurchaser(AdditionalVendorPurchaserType additionalVendorOrPurchaser) {
        this.additionalVendorOrPurchaser = additionalVendorOrPurchaser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
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

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public boolean isActingAsTrustee() {
        return actingAsTrustee;
    }

    public void setActingAsTrustee(boolean actingAsTrustee) {
        this.actingAsTrustee = actingAsTrustee;
    }
}
