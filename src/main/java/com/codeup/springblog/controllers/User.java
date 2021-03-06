package com.codeup.springblog.controllers;

import javax.persistence.*;
import java.util.List;

//@Entity
//@Table(name="posts")
//Im not sure if i should add this here or not, going to test tonight so i dont break it again
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 150)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    public User(User copy) {
        id = copy.id; // This line is SUPER important! Many things won't work if it's absent
        email = copy.email;
        username = copy.username;
        password = copy.password;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Post> userPosts;

    public User() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Post> getUserPosts() {
        return userPosts;
    }

    public void setUSerPosts(List<Post> userPosts) {
        this.userPosts = userPosts;
    }
}
