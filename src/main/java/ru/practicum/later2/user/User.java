package ru.practicum.later2.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@Data
@AllArgsConstructor
@Entity
@Table(name = "users", schema = "public")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    String email;

    @Column(name = "registration_date")
    private Instant registrationDate = Instant.now();
}
