package com.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User{

    @Id
    @Column(name="userId")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userId;

    @Column(name="phone")
    private String phone;

    @Column(name="email")
    private String email;

    @Column(name="name")
    private String name;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


