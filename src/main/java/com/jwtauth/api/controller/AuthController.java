package com.jwtauth.api.controller;

import com.jwtauth.api.model.Role;
import com.jwtauth.api.service.AuthService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        return authService.register(request.getUsername(), request.getPassword(), request.getRole());
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return authService.login(request.getUsername(), request.getPassword());
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String adminEndpoint() {
        return "Hello Admin! This is a protected route.";
    }

    @Data
    public static class RegisterRequest {
        private String username;
        private String password;
        private Role role;
    }

    @Data
    public static class LoginRequest {
        private String username;
        private String password;
    }
}
