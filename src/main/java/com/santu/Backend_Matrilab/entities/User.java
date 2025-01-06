package com.santu.Backend_Matrilab.entities;



import jakarta.persistence.*;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users")
@Data

@Builder
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "dob", nullable = false)
    private LocalDate dob;

    @Column(name = "religion", nullable = false)
    private String religion;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "language")
    private String language;

    @Column(name = "profession")
    private String profession;

    @Column(name = "financial_condition")
    private String financialCondition;

    @Column(name = "smoking_habits")
    private String smokingHabits;

    @Column(name = "drinking_status")
    private String drinkingStatus;

    @Column(name = "present_address", nullable = false)
    private String presentAddress;

    @Column(name = "district", nullable = false)
    private String district;

    @Column(name = "division", nullable = false)
    private String division;

    @Column(name = "taluk", nullable = false)
    private String taluk;

    @Column(name = "zip_code", nullable = false)
    private String zipCode;

    @Column(name = "phone_number1", nullable = false)
    private String phoneNumber1;

    @Column(name = "phone_number2")
    private String phoneNumber2;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "confirm_password", nullable = false)
    private String confirmPassword;

    private String role;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private BasicInformation basicInformation;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private FamilyInformation familyInformation;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private PhysicalAttributes physicalAttributes;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CareerInformation> careerInformation  = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<EducationInformation> educationInformation  = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Gallery> galleries = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PartnerExpectations> partnerExpectations = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PurchaseHistory> purchaseHistories  = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ShortlistedProfile> shortlistedProfiles  = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MyInterest> myInterests  = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<InterestRequest> interestRequests  = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<IgnoredProfile> ignoredProfiles  = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SupportTicket> supportTickets  = new ArrayList<>();

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private CurrentPackage currentPackage;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
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

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
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

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public BasicInformation getBasicInformation() {
        return basicInformation;
    }

    public void setBasicInformation(BasicInformation basicInformation) {
        this.basicInformation = basicInformation;
    }

    public FamilyInformation getFamilyInformation() {
        return familyInformation;
    }

    public void setFamilyInformation(FamilyInformation familyInformation) {
        this.familyInformation = familyInformation;
    }

    public PhysicalAttributes getPhysicalAttributes() {
        return physicalAttributes;
    }

    public void setPhysicalAttributes(PhysicalAttributes physicalAttributes) {
        this.physicalAttributes = physicalAttributes;
    }

    public List<Gallery> getGalleries() {
        return galleries;
    }

    public void setGalleries(List<Gallery> galleries) {
        this.galleries = galleries;
    }

    public List<PartnerExpectations> getPartnerExpectations() {
        return partnerExpectations;
    }

    public void setPartnerExpectations(List<PartnerExpectations> partnerExpectations) {
        this.partnerExpectations = partnerExpectations;
    }

    public List<PurchaseHistory> getPurchaseHistories() {
        return purchaseHistories;
    }

    public void setPurchaseHistories(List<PurchaseHistory> purchaseHistories) {
        this.purchaseHistories = purchaseHistories;
    }

    public List<ShortlistedProfile> getShortlistedProfiles() {
        return shortlistedProfiles;
    }

    public void setShortlistedProfiles(List<ShortlistedProfile> shortlistedProfiles) {
        this.shortlistedProfiles = shortlistedProfiles;
    }

    public List<MyInterest> getMyInterests() {
        return myInterests;
    }

    public void setMyInterests(List<MyInterest> myInterests) {
        this.myInterests = myInterests;
    }

    public List<InterestRequest> getInterestRequests() {
        return interestRequests;
    }

    public void setInterestRequests(List<InterestRequest> interestRequests) {
        this.interestRequests = interestRequests;
    }

    public List<IgnoredProfile> getIgnoredProfiles() {
        return ignoredProfiles;
    }

    public void setIgnoredProfiles(List<IgnoredProfile> ignoredProfiles) {
        this.ignoredProfiles = ignoredProfiles;
    }

    public List<SupportTicket> getSupportTickets() {
        return supportTickets;
    }

    public void setSupportTickets(List<SupportTicket> supportTickets) {
        this.supportTickets = supportTickets;
    }

    public CurrentPackage getCurrentPackage() {
        return currentPackage;
    }

    public void setCurrentPackage(CurrentPackage currentPackage) {
        this.currentPackage = currentPackage;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public List<CareerInformation> getCareerInformation() {
        return careerInformation;
    }

    public void setCareerInformation(List<CareerInformation> careerInformation) {
        this.careerInformation = careerInformation;
    }

    public List<EducationInformation> getEducationInformation() {
        return educationInformation;
    }

    public void setEducationInformation(List<EducationInformation> educationInformation) {
        this.educationInformation = educationInformation;
    }

    public User() {

    }

    public User(Long id, String firstName, String lastName, LocalDate dob, String religion, String gender, String maritalStatus, String language, String profession, String financialCondition, String smokingHabits, String drinkingStatus, String presentAddress, String district, String division, String taluk, String zipCode, String phoneNumber1, String phoneNumber2, String email, String password, String confirmPassword, String role, BasicInformation basicInformation, FamilyInformation familyInformation, PhysicalAttributes physicalAttributes, List<CareerInformation> careerInformation, List<EducationInformation> educationInformation, List<Gallery> galleries, List<PartnerExpectations> partnerExpectations, List<PurchaseHistory> purchaseHistories, List<ShortlistedProfile> shortlistedProfiles, List<MyInterest> myInterests, List<InterestRequest> interestRequests, List<IgnoredProfile> ignoredProfiles, List<SupportTicket> supportTickets, CurrentPackage currentPackage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.religion = religion;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.language = language;
        this.profession = profession;
        this.financialCondition = financialCondition;
        this.smokingHabits = smokingHabits;
        this.drinkingStatus = drinkingStatus;
        this.presentAddress = presentAddress;
        this.district = district;
        this.division = division;
        this.taluk = taluk;
        this.zipCode = zipCode;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.role = role;
        this.basicInformation = basicInformation;
        this.familyInformation = familyInformation;
        this.physicalAttributes = physicalAttributes;
        this.careerInformation = careerInformation;
        this.educationInformation = educationInformation;
        this.galleries = galleries;
        this.partnerExpectations = partnerExpectations;
        this.purchaseHistories = purchaseHistories;
        this.shortlistedProfiles = shortlistedProfiles;
        this.myInterests = myInterests;
        this.interestRequests = interestRequests;
        this.ignoredProfiles = ignoredProfiles;
        this.supportTickets = supportTickets;
        this.currentPackage = currentPackage;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role));
    }

    @Override
    public String getUsername() {
        return email;
    }
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
