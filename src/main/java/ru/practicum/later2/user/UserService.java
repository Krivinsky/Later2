package ru.practicum.later2.user;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User saveUser(User user);
}
