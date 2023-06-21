package br.com.chronotrack.api.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class UserToken {

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty
    private String type;

    @JsonProperty("expires_in")
    private Instant expiresIn;

    public UserToken() {
        type = "Bearer";
    }

    public UserToken(String accessToken, Instant expiresIn) {
        this.type = "Bearer";
        this.accessToken = accessToken;
        this.expiresIn = expiresIn.truncatedTo(ChronoUnit.SECONDS);
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Instant getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Instant expiresIn) {
        this.expiresIn = expiresIn;
    }
}
