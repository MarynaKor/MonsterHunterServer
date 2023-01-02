package com.example.monsterhunterserver;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class newUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
