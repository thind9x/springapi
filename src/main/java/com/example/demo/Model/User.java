package com.example.demo.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity(name = "userpmc")
@Table(name = "userpmc")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class User implements Serializable{
    /**
     *
     */
 


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  userid;   
    private String name;
    private String email;
    private String username;
    private String password;
    private String role;

    public User() {
    }
    public User(int userid, String name, String email, String username, String password, String role) {
        this.userid = userid;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

}