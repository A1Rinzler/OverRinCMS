package ru.dmitrii.OverRinCMS.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;

public class PersonLoginDTO {

    @NotEmpty(message = "Shouldn`t be empty")
    //@Size(message = "Size from 1 to 20")
    @Column(name = "login")
    private String login;

    @NotEmpty(message = "Shouldn`t be empty")
    @Column(name = "password")
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
