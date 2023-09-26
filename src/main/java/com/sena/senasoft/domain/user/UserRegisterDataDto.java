package com.sena.senasoft.domain.user;

import java.util.Date;

public record UserRegisterDataDto(
        Long id,
        String name,
        String email,
        String password,
        String education,
        Date birthDate,
        String city,
        Role role
) {

    public UserRegisterDataDto(User user){
        this(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                user.getEducation(),
                user.getBirthDate(),
                user.getCity(),
                user.getRole()
        );
    }


}
