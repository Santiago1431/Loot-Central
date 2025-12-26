package dev.lootcentral.marketplace.dto.request;

import jakarta.validation.constraints.NotEmpty;

public record RegisterUserRequestDTO (
        @NotEmpty(message = "Nome de Usuário Obrigatório") String name,
        @NotEmpty(message = "Email Obrigatório") String email,
        @NotEmpty(message = "CPF/CNPJ Obrigatório") String document,
        @NotEmpty(message = "Senha Obrigatória") String password
){
}
