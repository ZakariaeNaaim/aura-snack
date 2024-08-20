package com.aura_snack.security_service.springjwt.repository;

import java.util.Optional;

import com.aura_snack.security_service.springjwt.models.ERole;
import com.aura_snack.security_service.springjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
