package com.example.gtics_lab7_20196483.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "products")
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID", nullable = false)
    private Integer id;

    @Column(name = "username", nullable = false, length = 100)
    private String username;


    @Column(name = "type", nullable = false, length = 100)
    private String type;

    @Column(name = "authorizedResource", nullable = false)
    private int authorizedResource;

    @Column(name = "active", nullable = false)
    private int active;


}
