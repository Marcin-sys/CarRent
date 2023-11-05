package com.comarch.camp.it.car.rent.model;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {  //construktor pelny
        this.login = login;
        this.password = password;
    }

    public User() { ///konstruktor domyslny / pusty
    }

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
