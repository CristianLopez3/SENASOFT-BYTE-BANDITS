package com.sena.senasoft.domain.user;


import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService{

    private final UserRepository userRepository;

    @Override
    public UserResponseDataDto saveUser(UserRegisterDataDto userDto) {
        User user = userRepository.save(new User(userDto));
        return new UserResponseDataDto(user);
    }

    @Override
    public UserResponseDataDto updateUser(UserUpdateDto userUpdateDto) {
        return null;
    }

    @Override
    public Page<UserListDto> getUserList(Pageable pagination) {
        return null;
    }



}
