package com.metaro.metaro.member.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "spring.security.oauth2.client.registration.kakao")
public class KakaoRegistrationProperties {
    private String clientId;
    private String redirectUri;
    private String authorizationGrantType;
}
