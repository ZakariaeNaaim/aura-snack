package com.aura_snack.security_service.sec.services;

import com.aura_snack.security_service.sec.entities.AppRole;
import com.aura_snack.security_service.sec.entities.AppUser;

import java.util.List;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username,String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();
}