package es.puig.keycloak.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class PreAuthCodeResponse {
    @JsonProperty("grant")
    private final Grant grant;
    @JsonProperty("pin")
    private final String pin;
}
