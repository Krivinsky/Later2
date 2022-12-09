package ru.practicum.later2.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {

    private Long id;

    private String firstName;

    private String lastName;

    String email;

    String registrationDate;
}
