package com.santu.Backend_Matrilab.entities;


import jakarta.persistence.*;

import jakarta.validation.constraints.Size;

@Entity
public class BasicInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;




    @Column(name = "first_name" )
    private String firstName;



    @Column(name = "last_name")
    private String lastName;


    @Column(name = "date_of_birth")
    private String dateOfBirth;


    private String religion;


    private String gender;


    @Column(name = "marital_status")
    private String maritalStatus;


    private String language;


    private String profession;


    @Column(name = "present_address")
    private String presentAddress;


    @Column(name = "financial_condition")
    private String financialCondition;


    @Column(name = "smoking_habits")
    private String smokingHabits;


    @Column(name = "drinking_status")
    private String drinkingStatus;


    private String district;


    private String division;


    private String taluk;


    @Column(name = "zip_code")
    private String zipCode;

    public BasicInformation() {
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

    public  String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstName) {
        this.firstName = firstName;
    }

    public  String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getFinancialCondition() {
        return financialCondition;
    }

    public void setFinancialCondition(String financialCondition) {
        this.financialCondition = financialCondition;
    }

    public String getSmokingHabits() {
        return smokingHabits;
    }

    public void setSmokingHabits(String smokingHabits) {
        this.smokingHabits = smokingHabits;
    }

    public String getDrinkingStatus() {
        return drinkingStatus;
    }

    public void setDrinkingStatus(String drinkingStatus) {
        this.drinkingStatus = drinkingStatus;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getTaluk() {
        return taluk;
    }

    public void setTaluk(String taluk) {
        this.taluk = taluk;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public BasicInformation(Long id, User user, String firstName, String lastName, String dateOfBirth, String religion, String gender, String maritalStatus, String language, String profession, String presentAddress, String financialCondition, String smokingHabits, String drinkingStatus, String district, String division, String taluk, String zipCode) {

        this.id = id;
        this.user = user;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.religion = religion;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.language = language;
        this.profession = profession;
        this.presentAddress = presentAddress;
        this.financialCondition = financialCondition;
        this.smokingHabits = smokingHabits;
        this.drinkingStatus = drinkingStatus;
        this.district = district;
        this.division = division;
        this.taluk = taluk;
        this.zipCode = zipCode;


    }

}
