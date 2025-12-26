package dev.lootcentral.marketplace.dto.response;

import dev.lootcentral.marketplace.model.enums.Roles;
import jakarta.validation.Valid;

public record RegisterUserResponseDTO(
        String name,
        String email,
        Roles role
) {}
