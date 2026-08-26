package ru.dmitrii.OverRinCMS.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

public class PersonDTO {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Shouldn`t be empty")
    //@Size(message = "Size from 1 to 20")
    @Column(name = "login")
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDateTime getCreate_time() {
        return create_time;
    }

    public void setCreate_time(LocalDateTime create_time) {
        this.create_time = create_time;
    }

    public LocalDateTime getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(LocalDateTime update_time) {
        this.update_time = update_time;
    }
}
