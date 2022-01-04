package com.codeup.springblog.controllers;

import javax.persistence.*;

@Entity
@Table(name="cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String make;

    @Column(nullable = false, length = 50)
    private String model;

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }
}
