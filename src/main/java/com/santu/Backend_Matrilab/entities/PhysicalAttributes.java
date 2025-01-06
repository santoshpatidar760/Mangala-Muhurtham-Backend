package com.santu.Backend_Matrilab.entities;


import jakarta.persistence.*;

@Entity
public class PhysicalAttributes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;



    @Column(nullable = false)
    private String complexion;

    @Column(nullable = false)
    private String height;

    @Column(nullable = false)
    private String weight;

    @Column(nullable = false)
    private String religion;

    @Column(nullable = false)
    private String eyeColor;

    @Column(nullable = false)
    private String hairColor;

    private String disability;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PhysicalAttributes() {
    }
    public PhysicalAttributes(Long id, String complexion, String height, String weight, String religion, String eyeColor, String hairColor, String disability, User user) {}
// Getters and Setters
}

