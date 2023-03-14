package com.idowu.lanefinance.service;


import com.idowu.lanefinance.dtos.request.UpdateUserRequestDto;
import com.idowu.lanefinance.dtos.request.UserRegistrationRequestDto;
import com.idowu.lanefinance.dtos.response.RegistrationResponseDto;
import com.idowu.lanefinance.entity.User;

public interface UserService {
    RegistrationResponseDto registerUser(UserRegistrationRequestDto registrationRequestDto);
    User getLoggedInUser();
    void updateUser(UpdateUserRequestDto updateUserDto, String id);
    String verifyAccount(String token);
}
