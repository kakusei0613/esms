package com.example.esms.domain;

public class Admin {
    private Integer id;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", userName='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
