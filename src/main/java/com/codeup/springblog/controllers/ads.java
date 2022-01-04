package com.codeup.springblog.controllers;

import javax.persistence.*;

@Entity
@Table(name="ads")
public class ads {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 150)
    private String title;

    @Column
    private String description;
}
