package com.metaro.metaro.member.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class MemberResponseDTO {

    // 토큰 발급
    public record authTokenDTO(
            String grantType,
            String accessToken,
            Long accessTokenValidTime,
            String refreshToken,
            Long refreshTokenValidTime
    ) {
    }

    public record KakaoProfile(
            String nickname,
            String email,
            String gender
    ){
    }

    // Kakao Token
    public record KakaoTokenDTO(
            @JsonProperty("token_type")
            String tokenType,
            @JsonProperty("access_token")
            String accessToken,
            @JsonProperty("refresh_token")
            String refreshToken,
            @JsonProperty("id_token")
            String idToken,
            @JsonProperty("expires_in")
            int expiresIn,
            @JsonProperty("refresh_token_expires_in")
            int refreshTokenExpiresIn,
            String scope
    ) {
    }

    // Kakao Info
    public record KakaoInfoDTO(
            long id,
            @JsonProperty("has_signed_up")
            boolean hasSignedUp,
            @JsonProperty("connected_at")
            LocalDateTime connectedAt,
            KakaoProperties properties,
            @JsonProperty("kakao_account")
            KakaoAccount kakaoAccount
    ) {
        public record KakaoProperties(
                String nickname
        ) {
        }

        public record KakaoAccount(
                @JsonProperty("profile_nickname_needs_agreement")
                boolean profileNicknameNeedsAgreement,
                String nickname,
                @JsonProperty("email_needs_agreement")
                boolean emailNeedsAgreement,
                @JsonProperty("is_email_valid")
                boolean isEmailValid,
                @JsonProperty("is_email_verified")
                boolean isEmailVerified,
                String email,
                @JsonProperty("age_range_needs_agreement")
                boolean ageRangeNeedsAgreement,
                @JsonProperty("age_range")
                String age_range,
                @JsonProperty("gender_needs_agreement")
                boolean genderNeedsAgreement,
                String gender
        ) {
        }
    }
}
