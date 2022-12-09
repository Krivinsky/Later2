package ru.practicum.later2.user;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class UserMapper {

    public User toUser(UserDto userDto) {
        return new User(
            userDto.getId(),
            userDto.getFirstName(),
            userDto.getLastName(),
            userDto.getEmail(),
            Instant.now()
        );
    }

    public UserDto toUserDto(User user) {
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getRegistrationDate().toString()
        );
    }
}
