package net.youssfi.authjwtservice.service;

import net.youssfi.authjwtservice.dto.req.UserRequestDto;
import net.youssfi.authjwtservice.dto.resp.UserResponseDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<UserResponseDto> getAllUser();
    public UserResponseDto createUser(UserRequestDto userRequestDto);

}
