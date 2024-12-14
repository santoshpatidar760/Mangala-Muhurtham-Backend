package com.santu.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotNull(message = "Date of Birth is mandatory")
    private LocalDate dateOfBirth;

    private String timeOfBirth;

    @NotBlank(message = "Gender is mandatory")
    private String gender;

    @NotBlank(message = "Marital Status is mandatory")
    private String maritalStatus;

    @NotBlank(message = "Physical Fitness is mandatory")
    private String physicalFitness;

    @NotBlank(message = "Religion is mandatory")
    private String religion;

    private String familyStatus;

    @NotBlank(message = "Caste is mandatory")
    private String caste;

    private String district;

    @ElementCollection
    @CollectionTable(name = "user_education", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "education")
    @NotEmpty(message = "At least one education option must be selected")
    private List<String> education;

    private String work;

    private Double salary;

    private String workplace;

    @NotBlank(message = "Height is mandatory")
    private String height;

    private String color;

    private String fatherName;

    private String motherName;

    private String fatherWork;

    private String motherJob;

    private int maleSiblings;

    private int femaleSiblings;

    private int marriedMaleSiblings;

    private int marriedFemaleSiblings;

    private String location;

    private String ancestry;

    private String familyDeity;

    private String expectation;

    @NotBlank(message = "Primary phone number is mandatory")
    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    private String phoneNumber1;

    private String phoneNumber2;

    @NotBlank(message = "Email ID is mandatory")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "password is mandatory")
    private String password;

    private String address;

    private String addressDistrict;
    @Lob
    private String photopath;

    @NotBlank(message = "Role is mandatory")
    private String role;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getTimeOfBirth() { return timeOfBirth; }
    public void setTimeOfBirth(String timeOfBirth) { this.timeOfBirth = timeOfBirth; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getMaritalStatus() { return maritalStatus; }
    public void setMaritalStatus(String maritalStatus) { this.maritalStatus = maritalStatus; }

    public String getPhysicalFitness() { return physicalFitness; }
    public void setPhysicalFitness(String physicalFitness) { this.physicalFitness = physicalFitness; }

    public String getReligion() { return religion; }
    public void setReligion(String religion) { this.religion = religion; }

    public String getFamilyStatus() { return familyStatus; }
    public void setFamilyStatus(String familyStatus) { this.familyStatus = familyStatus; }

    public String getCaste() { return caste; }
    public void setCaste(String caste) { this.caste = caste; }

    public String getDistrict() { return district; }
    public void setDistrict(String district) { this.district = district; }

    public List<String> getEducation() { return education; }
    public void setEducation(List<String> education) { this.education = education; }

    public String getWork() { return work; }
    public void setWork(String work) { this.work = work; }

    public Double getSalary() { return salary; }
    public void setSalary(Double salary) { this.salary = salary; }

    public String getWorkplace() { return workplace; }
    public void setWorkplace(String workplace) { this.workplace = workplace; }

    public String getHeight() { return height; }
    public void setHeight(String height) { this.height = height; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getFatherName() { return fatherName; }
    public void setFatherName(String fatherName) { this.fatherName = fatherName; }

    public String getMotherName() { return motherName; }
    public void setMotherName(String motherName) { this.motherName = motherName; }

    public String getFatherWork() { return fatherWork; }
    public void setFatherWork(String fatherWork) { this.fatherWork = fatherWork; }

    public String getMotherJob() { return motherJob; }
    public void setMotherJob(String motherJob) { this.motherJob = motherJob; }

    public int getMaleSiblings() { return maleSiblings; }
    public void setMaleSiblings(int maleSiblings) { this.maleSiblings = maleSiblings; }

    public int getFemaleSiblings() { return femaleSiblings; }
    public void setFemaleSiblings(int femaleSiblings) { this.femaleSiblings = femaleSiblings; }

    public int getMarriedMaleSiblings() { return marriedMaleSiblings; }
    public void setMarriedMaleSiblings(int marriedMaleSiblings) { this.marriedMaleSiblings = marriedMaleSiblings; }

    public int getMarriedFemaleSiblings() { return marriedFemaleSiblings; }
    public void setMarriedFemaleSiblings(int marriedFemaleSiblings) { this.marriedFemaleSiblings = marriedFemaleSiblings; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getAncestry() { return ancestry; }
    public void setAncestry(String ancestry) { this.ancestry = ancestry; }

    public String getFamilyDeity() { return familyDeity; }
    public void setFamilyDeity(String familyDeity) { this.familyDeity = familyDeity; }

    public String getExpectation() { return expectation; }
    public void setExpectation(String expectation) { this.expectation = expectation; }

    public String getPhoneNumber1() { return phoneNumber1; }
    public void setPhoneNumber1(String phoneNumber1) { this.phoneNumber1 = phoneNumber1; }

    public String getPhoneNumber2() { return phoneNumber2; }
    public void setPhoneNumber2(String phoneNumber2) { this.phoneNumber2 = phoneNumber2; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getAddressDistrict() { return addressDistrict; }
    public void setAddressDistrict(String addressDistrict) { this.addressDistrict = addressDistrict; }

    public String getPhotopath() { return photopath; }
    public void setPhotopath(String photopath) { this.photopath = photopath; }


    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }


}

