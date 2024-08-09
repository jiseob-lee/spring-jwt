package rg.jwt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import rg.jwt.dto.LoginRequestDto;
import rg.jwt.dto.TokenDto;
import rg.jwt.service.AuthService;
import rg.jwt.service.JwtService;
import rg.jwt.util.JwtUtil;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthApiController {

    private final AuthService authService;
    
    private final JwtService jwtService;
    
    private final JwtUtil jwtUtil;
    
    //@PreAuthorize("hasAnyRole('ROLE_MANAGER', 'ROLE_ADMIN', 'ROLE_NORMAL')")
    @PreAuthorize("permitAll")
    @PostMapping("login")
    public ResponseEntity<TokenDto> getMemberProfile(
            @Valid @RequestBody LoginRequestDto request
    ) {
    	TokenDto token = this.authService.login(request);
    	jwtService.login(token, request.getEmail());
        return ResponseEntity.status(HttpStatus.OK).body(token);
    }

    @GetMapping("checkClaims")
    public void checkClaims(String token) {
    	jwtUtil.checkClaims(token);
    }
}

