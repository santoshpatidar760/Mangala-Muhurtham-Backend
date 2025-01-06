package com.santu.Backend_Matrilab.entities;
import jakarta.persistence.*;
@Entity
public class FamilyInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String fathersName;

    @Column(nullable = false)
    private String fathersProfession;

    @Column(nullable = false)
    private String fathersContact;


    @Column(nullable = false)
    private String mothersName;

    @Column(nullable = false)
    private String mothersProfession;

    @Column(nullable = false)
    private String mothersContact;


    @Column(nullable = false)
    private int totalBrother;


    @Column(nullable = false)
    private int totalSister;

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

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getFathersProfession() {
        return fathersProfession;
    }

    public void setFathersProfession(String fathersProfession) {
        this.fathersProfession = fathersProfession;
    }

    public String getFathersContact() {
        return fathersContact;
    }

    public void setFathersContact(String fathersContact) {
        this.fathersContact = fathersContact;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getMothersProfession() {
        return mothersProfession;
    }

    public void setMothersProfession(String mothersProfession) {
        this.mothersProfession = mothersProfession;
    }

    public String getMothersContact() {
        return mothersContact;
    }

    public void setMothersContact(String mothersContact) {
        this.mothersContact = mothersContact;
    }

    public int getTotalBrother() {
        return totalBrother;
    }

    public void setTotalBrother(int totalBrother) {
        this.totalBrother = totalBrother;
    }

    public int getTotalSister() {
        return totalSister;
    }

    public void setTotalSister(int totalSister) {
        this.totalSister = totalSister;
    }

    public FamilyInformation() {
    }

    public FamilyInformation(Long id, User user, String fathersName, String fathersProfession, String fathersContact, String mothersName, String mothersProfession, String mothersContact, int totalBrother, int totalSister) {
        this.id = id;
        this.user = user;
        this.fathersName = fathersName;
        this.fathersProfession = fathersProfession;
        this.fathersContact = fathersContact;
        this.mothersName = mothersName;
        this.mothersProfession = mothersProfession;
        this.mothersContact = mothersContact;
        this.totalBrother = totalBrother;
        this.totalSister = totalSister;
    }


}
