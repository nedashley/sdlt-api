package com.redmonkeysoftware.sdlt.model;

import com.redmonkeysoftware.sdlt.model.response.GetAccountOTP;
import java.io.Serializable;
import java.time.LocalDateTime;

public class SdltAccountOtp implements Serializable {

    private static final long serialVersionUID = 4898703668910239251L;
    protected final LocalDateTime created = LocalDateTime.now();
    protected String loginUrl;
    protected String password;

    public SdltAccountOtp withGetAccountOTP(GetAccountOTP otp) {
        this.loginUrl = otp.getLoginURL();
        this.password = otp.getPassword();
        return this;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreated() {
        return created;
    }

}
