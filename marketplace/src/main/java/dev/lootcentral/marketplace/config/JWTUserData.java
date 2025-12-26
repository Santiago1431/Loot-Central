package dev.lootcentral.marketplace.config;

import lombok.Builder;

@Builder
public record JWTUserData(Long userId, String email) {
}
