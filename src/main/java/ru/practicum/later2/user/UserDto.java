package ru.practicum.later2.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private Long id;

    private String email;

    private String firstName;

    private String lastName;

    String registrationDate;

    UserState state;

}
