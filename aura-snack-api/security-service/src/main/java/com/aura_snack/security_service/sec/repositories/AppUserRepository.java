package com.aura_snack.security_service.sec.repositories;

import com.aura_snack.security_service.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppUserRepository extends JpaRepository<AppUser,Long> {
    AppUser findByUsername(String username);
}