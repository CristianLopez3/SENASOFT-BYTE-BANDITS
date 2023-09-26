package com.sena.senasoft.controller;


import com.sena.senasoft.domain.user.UserRegisterDataDto;
import com.sena.senasoft.domain.user.UserResponseDataDto;
import com.sena.senasoft.domain.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping
    public ResponseEntity<UserResponseDataDto> saveUser(UserRegisterDataDto registerData){
        if(registerData == null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(userService.saveUser(registerData));
    }

}
