package com.redmonkeysoftware.sdlt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class SdltAccessToken implements Serializable {

    private static final long serialVersionUID = -8360457238827236103L;

    @JsonIgnore
    protected final LocalDateTime created;
    @JsonProperty("access_token")
    protected String accessToken;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    
    public SdltAccessToken() {
        created = LocalDateTime.now();
    }

    public SdltAccessToken(LocalDateTime created) {
        this.created = created;
    }

    public boolean isExpired() {
        return created.isBefore(LocalDateTime.now().minusMinutes(50));
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public LocalDateTime getCreated() {
        return created;
    }

}
