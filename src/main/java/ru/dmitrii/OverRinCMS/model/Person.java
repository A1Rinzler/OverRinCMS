package ru.dmitrii.OverRinCMS.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Shouldn`t be empty")
    //@Size(message = "Size from 1 to 20")
    @Column(name = "username")
    private String login;

    @NotEmpty(message = "Shouldn`t be empty")
    //@Size(message = "Size from 1 to 20")
    @Column(name = "username")
    private String username;

    @NotEmpty(message = "Shouldn`t be empty")
    @Column(name = "password")
    private String password;

    @NotEmpty(message = "Shouldn`t be empty")
    @Column(name = "role")
    private String role;

    @CreationTimestamp
    @Column(name = "create_time")
    private LocalDateTime create_time;

    @UpdateTimestamp
    @Column(name = "update_time")
    private LocalDateTime update_time;

}
