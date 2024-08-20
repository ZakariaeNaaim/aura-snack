package com.aura_snack.security_service.springjwt.services.fasad;

import com.aura_snack.security_service.springjwt.payload.request.LoginRequest;
import com.aura_snack.security_service.springjwt.payload.request.SignupRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {
     ResponseEntity<?> authenticateUser(LoginRequest loginRequest);

     ResponseEntity<?> registerUser(SignupRequest signUpRequest);

     void validateToken(String token);
}
