package com.santu.Backend_Matrilab.dto;


import com.santu.Backend_Matrilab.dto.request.*;
import lombok.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data

@Builder
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String religion;
    private String gender;
    private String maritalStatus;
    private String language;
    private String profession;
    private String financialCondition;
    private String smokingHabits;
    private String drinkingStatus;
    private String presentAddress;
    private String district;
    private String division;
    private String taluk;
    private String zipCode;
    private String phoneNumber1;
    private String phoneNumber2;
    private String email;
    private String role;
    private BasicInformationDTO basicInformation;
    private FamilyInformationDTO familyInformation;
    private PhysicalAttributesDTO physicalAttributes;
    private List<CareerInformationDTO>  careerInformation = new ArrayList<>();
    private List<EducationInformationDTO> educationInformation  = new ArrayList<>();
    private List<GalleryDTO> galleries  = new ArrayList<>();
    private List<PartnerExpectationsDTO> partnerExpectations = new ArrayList<>();
    private List<PurchaseHistoryDTO> purchaseHistories = new ArrayList<>();
    private List<ShortlistedProfileDTO> shortlistedProfiles = new ArrayList<>();
    private List<MyInterestDTO> myInterests = new ArrayList<>();
    private List<InterestRequestDTO> interestRequests = new ArrayList<>();
    private List<IgnoredProfileDTO> ignoredProfiles = new ArrayList<>();
    private List<SupportTicketDTO> supportTickets = new ArrayList<>();
    private CurrentPackageDTO currentPackage;

    public UserDTO() {
    }

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public BasicInformationDTO getBasicInformation() {
        return basicInformation;
    }

    public void setBasicInformation(BasicInformationDTO basicInformation) {
        this.basicInformation = basicInformation;
    }

    public FamilyInformationDTO getFamilyInformation() {
        return familyInformation;
    }

    public void setFamilyInformation(FamilyInformationDTO familyInformation) {
        this.familyInformation = familyInformation;
    }

    public PhysicalAttributesDTO getPhysicalAttributes() {
        return physicalAttributes;
    }

    public void setPhysicalAttributes(PhysicalAttributesDTO physicalAttributes) {
        this.physicalAttributes = physicalAttributes;
    }

    public List<CareerInformationDTO> getCareerInformation() {
        return careerInformation;
    }

    public void setCareerInformation(List<CareerInformationDTO> careerInformation) {
        this.careerInformation = careerInformation;
    }

    public List<EducationInformationDTO> getEducationInformation() {
        return educationInformation;
    }

    public void setEducationInformation(List<EducationInformationDTO> educationInformation) {
        this.educationInformation = educationInformation;
    }

    public List<GalleryDTO> getGalleries() {
        return galleries;
    }

    public void setGalleries(List<GalleryDTO> galleries) {
        this.galleries = galleries;
    }

    public List<PartnerExpectationsDTO> getPartnerExpectations() {
        return partnerExpectations;
    }

    public void setPartnerExpectations(List<PartnerExpectationsDTO> partnerExpectations) {
        this.partnerExpectations = partnerExpectations;
    }

    public List<PurchaseHistoryDTO> getPurchaseHistories() {
        return purchaseHistories;
    }

    public void setPurchaseHistories(List<PurchaseHistoryDTO> purchaseHistories) {
        this.purchaseHistories = purchaseHistories;
    }

    public List<ShortlistedProfileDTO> getShortlistedProfiles() {
        return shortlistedProfiles;
    }

    public void setShortlistedProfiles(List<ShortlistedProfileDTO> shortlistedProfiles) {
        this.shortlistedProfiles = shortlistedProfiles;
    }

    public List<MyInterestDTO> getMyInterests() {
        return myInterests;
    }

    public void setMyInterests(List<MyInterestDTO> myInterests) {
        this.myInterests = myInterests;
    }

    public List<InterestRequestDTO> getInterestRequests() {
        return interestRequests;
    }

    public void setInterestRequests(List<InterestRequestDTO> interestRequests) {
        this.interestRequests = interestRequests;
    }

    public List<IgnoredProfileDTO> getIgnoredProfiles() {
        return ignoredProfiles;
    }

    public void setIgnoredProfiles(List<IgnoredProfileDTO> ignoredProfiles) {
        this.ignoredProfiles = ignoredProfiles;
    }

    public List<SupportTicketDTO> getSupportTickets() {
        return supportTickets;
    }

    public void setSupportTickets(List<SupportTicketDTO> supportTickets) {
        this.supportTickets = supportTickets;
    }

    public CurrentPackageDTO getCurrentPackage() {
        return currentPackage;
    }

    public void setCurrentPackage(CurrentPackageDTO currentPackage) {
        this.currentPackage = currentPackage;
    }

    public UserDTO(Long id, String firstName, String lastName, LocalDate dob, String religion, String gender, String maritalStatus, String language, String profession, String financialCondition, String smokingHabits, String drinkingStatus, String presentAddress, String district, String division, String taluk, String zipCode, String phoneNumber1, String phoneNumber2, String email, String role, BasicInformationDTO basicInformation, FamilyInformationDTO familyInformation, PhysicalAttributesDTO physicalAttributes, List<CareerInformationDTO> careerInformation, List<EducationInformationDTO> educationInformation, List<GalleryDTO> galleries, List<PartnerExpectationsDTO> partnerExpectations, List<PurchaseHistoryDTO> purchaseHistories, List<ShortlistedProfileDTO> shortlistedProfiles, List<MyInterestDTO> myInterests, List<InterestRequestDTO> interestRequests, List<IgnoredProfileDTO> ignoredProfiles, List<SupportTicketDTO> supportTickets, CurrentPackageDTO currentPackage) {
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
}
