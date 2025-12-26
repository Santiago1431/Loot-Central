package dev.lootcentral.marketplace.controller;

import dev.lootcentral.marketplace.config.SecurityConfig;
import dev.lootcentral.marketplace.config.TokenConfig;
import dev.lootcentral.marketplace.dto.request.LoginRequestDTO;
import dev.lootcentral.marketplace.dto.request.RegisterUserRequestDTO;
import dev.lootcentral.marketplace.dto.response.LoginResponseDTO;
import dev.lootcentral.marketplace.dto.response.RegisterUserResponseDTO;
import dev.lootcentral.marketplace.model.User;
import dev.lootcentral.marketplace.model.enums.Roles;
import dev.lootcentral.marketplace.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Tag(name = "Auth", description = "endpoint para registrar e fazer login de usuários")
@SecurityRequirement(name = SecurityConfig.security)
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    public AuthenticationManager authenticationManager;

    @Autowired
    public TokenConfig tokenConfig;

    @PostMapping("/register")
    @Operation(summary = "Registra novos usuarios", description = "metodo de registro de usuarios")
    @ApiResponse(responseCode = "201", description = "Usuario registrado com sucesso")
    @ApiResponse(responseCode = "400", description = "Email ja cadastrado")
    @ApiResponse(responseCode = "500", description = "Erro no servidor")
    public ResponseEntity<RegisterUserResponseDTO> registerUser(@Valid @RequestBody RegisterUserRequestDTO request) {
        User newUser = new User();
        newUser.setName(request.name());
        newUser.setPassword(passwordEncoder.encode(request.password()));
        newUser.setEmail(request.email());
        newUser.setDocument(request.document());
        newUser.setRole(Roles.BUYER);

        userRepository.save(newUser);

        return ResponseEntity.status(HttpStatus.CREATED).body(new RegisterUserResponseDTO(newUser.getName(), newUser.getEmail(), newUser.getRole()));

    }

    @PostMapping("/Login")
    @Operation(summary = "Login de usuarios", description = "Metodo de login")
    @ApiResponse(responseCode = "200", description = "Usuario logado com sucesso")
    @ApiResponse(responseCode = "400", description = "Email não cadastrado")
    @ApiResponse(responseCode = "500", description = "Erro no servidor")
    public ResponseEntity<LoginResponseDTO> login(@Valid @RequestBody LoginRequestDTO request) {

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(request.email(), request.password());
        Authentication authentication = authenticationManager.authenticate(authenticationToken);

        User userAuth = (User) authentication.getPrincipal();
        String token = tokenConfig.generateToken(userAuth);
        return ResponseEntity.status(HttpStatus.OK).body(new LoginResponseDTO(token));
    }
}
