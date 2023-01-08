package ru.practicum.later2.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByEmailContainingIgnoreCase(@Param("email") String emailSearch);

    List<UserShort> findAllByEmailContainingIgnoreCase(String emailSearch);
}
