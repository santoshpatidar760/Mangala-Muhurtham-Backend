package com.santu.Backend_Matrilab.entities;


import jakarta.persistence.*;

@Entity
public class IgnoredProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
