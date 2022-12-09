package ru.practicum.later2.user;

import java.util.List;

interface UserRepository {
    List<User> findAll();
    User save (User user);
}
