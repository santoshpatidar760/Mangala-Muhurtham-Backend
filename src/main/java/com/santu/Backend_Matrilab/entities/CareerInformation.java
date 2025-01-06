package com.santu.Backend_Matrilab.entities;

import jakarta.persistence.*;

@Entity
public class CareerInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String company;
    private String designation;
    private String startYear;
    private String endYear;

    public CareerInformation() {
    }

    public CareerInformation(Long id, User user, String company, String designation, String startYear, String endYear) {
        this.id = id;
        this.user = user;
        this.company = company;
        this.designation = designation;
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }
}
