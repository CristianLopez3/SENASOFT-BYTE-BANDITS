package com.sena.senasoft.domain.user;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService{

    private final UserRepository userRepository;

    @Override
    public UserResponseDataDto saveUser(UserRegisterDataDto userDto) {
        User user = new User(userDto);
        return new UserResponseDataDto(user);
    }
}
