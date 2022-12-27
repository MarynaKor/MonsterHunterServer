package com.example.monsterhunterserver;


public class newUser {
    private Integer id;
    private String username;
    private Integer highScore;


    public void setId (Integer id){
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setUsername(String Username) {
        this.username = Username;
    }

    public String getUsername() {
        return this.username;
    }

    public Integer getHighScore() {
        return this.highScore;
    }

    public void setHighScore(Integer highScore) {
        this.highScore = highScore;
    }
}
