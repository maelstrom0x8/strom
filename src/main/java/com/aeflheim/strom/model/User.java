package com.aeflheim.strom.model;

public class User {
    private String username;
    private String password;
    private String code;

    public User(String username, String password, String code) {
        this.username = username;
        this.password = password;
        this.code = code;
    }

    public User() {}

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
