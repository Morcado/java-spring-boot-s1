package com.spring.test.springbootjava.models;

import javax.persistence.*;
import javax.persistence.Column;

@Entity
@Table (name = "boards")
public class Board {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column (length = 300)
    private String name;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private  User user;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
