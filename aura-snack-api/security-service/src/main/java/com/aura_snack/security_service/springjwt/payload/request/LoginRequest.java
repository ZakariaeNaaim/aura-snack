package com.aura_snack.security_service.springjwt.payload.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
	@NotBlank
  private String username;

	@NotBlank
	private String password;
}
