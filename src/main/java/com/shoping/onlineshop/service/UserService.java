package com.shoping.onlineshop.service;

import java.util.List;
import com.shoping.onlineshop.dto.UserDto;
import com.shoping.onlineshop.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);
    User findByEmail(String email);
    List<UserDto> findAllUsers();
}
