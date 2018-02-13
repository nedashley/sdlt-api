package com.redmonkeysoftware.sdlt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDateTime;

public class SdltAccessToken implements Serializable {

    @JsonIgnore
    protected final LocalDateTime created = LocalDateTime.now();
    @JsonProperty("access_token")
    protected String accessToken;

    public boolean isExpired() {
        return created.isBefore(LocalDateTime.now().minusMinutes(50));
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

}
