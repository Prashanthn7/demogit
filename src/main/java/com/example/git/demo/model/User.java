package com.example.git.demo.model;

@entity
public class User {
    private String username;
    private int userId;
    private int userAge;
    private String userEmail;

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    private String userGender;

    public String getUsername() {
        return username;
    }

    public int getUserId() {
        return userId;
    }

    public int getUserAge() {
        return userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
