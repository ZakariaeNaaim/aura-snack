package com.aura_snack.security_service.springjwt.controllers;


import com.aura_snack.security_service.springjwt.payload.request.LoginRequest;
import com.aura_snack.security_service.springjwt.payload.request.SignupRequest;
import com.aura_snack.security_service.springjwt.services.impl.AuthServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/auth")
public class AuthController {

  private final AuthServiceImpl authServiceImpl;

  AuthController(AuthServiceImpl authService) {
    this.authServiceImpl = authService;
  }

  @PostMapping("/token")
  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
    return authServiceImpl.authenticateUser(loginRequest);
  }

  @PostMapping("/register")
  public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
    return authServiceImpl.registerUser(signUpRequest);
  }

  @GetMapping("/validate")
  public String validateToken(@RequestParam("token") String token) {
    authServiceImpl.validateToken(token);
    return "Token is valid";
  }
}
