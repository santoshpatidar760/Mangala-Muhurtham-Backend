
package com.santu.Backend_Matrilab.dto.request;
public class PartnerExpectationsDTO {

    private Long id;
    private Long userId;
    private String generalRequirement;
    private Integer minimumAge;
    private Integer maximumAge;
    private Integer minimumHeight;
    private Integer maximumHeight;
    private Integer maximumWeight;
    private String maritalStatus;
    private String religion;
    private String complexion;
    private String smokingHabits;
    private String drinkingStatus;
    private String minimumDegree;
    private String profession;
    private String languages;
    private String personality;
    private String financialCondition;
    private String familyPosition;

    // Constructor
    public PartnerExpectationsDTO(Long id, Long userId, String generalRequirement, Integer minimumAge, Integer maximumAge,
                                  Integer minimumHeight, Integer maximumHeight, Integer maximumWeight, String maritalStatus,
                                  String religion, String complexion, String smokingHabits, String drinkingStatus, String minimumDegree,
                                  String profession, String languages, String personality, String financialCondition,
                                  String familyPosition) {
        this.id = id;
        this.userId = userId;
        this.generalRequirement = generalRequirement;
        this.minimumAge = minimumAge;
        this.maximumAge = maximumAge;
        this.minimumHeight = minimumHeight;
        this.maximumHeight = maximumHeight;
        this.maximumWeight = maximumWeight;
        this.maritalStatus = maritalStatus;
        this.religion = religion;
        this.complexion = complexion;
        this.smokingHabits = smokingHabits;
        this.drinkingStatus = drinkingStatus;
        this.minimumDegree = minimumDegree;
        this.profession = profession;
        this.languages = languages;
        this.personality = personality;
        this.financialCondition = financialCondition;
        this.familyPosition = familyPosition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getGeneralRequirement() {
        return generalRequirement;
    }

    public void setGeneralRequirement(String generalRequirement) {
        this.generalRequirement = generalRequirement;
    }

    public Integer getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(Integer minimumAge) {
        this.minimumAge = minimumAge;
    }

    public Integer getMaximumAge() {
        return maximumAge;
    }

    public void setMaximumAge(Integer maximumAge) {
        this.maximumAge = maximumAge;
    }

    public Integer getMinimumHeight() {
        return minimumHeight;
    }

    public void setMinimumHeight(Integer minimumHeight) {
        this.minimumHeight = minimumHeight;
    }

    public Integer getMaximumHeight() {
        return maximumHeight;
    }

    public void setMaximumHeight(Integer maximumHeight) {
        this.maximumHeight = maximumHeight;
    }

    public Integer getMaximumWeight() {
        return maximumWeight;
    }

    public void setMaximumWeight(Integer maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
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

    public String getMinimumDegree() {
        return minimumDegree;
    }

    public void setMinimumDegree(String minimumDegree) {
        this.minimumDegree = minimumDegree;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getFinancialCondition() {
        return financialCondition;
    }

    public void setFinancialCondition(String financialCondition) {
        this.financialCondition = financialCondition;
    }

    public String getFamilyPosition() {
        return familyPosition;
    }

    public void setFamilyPosition(String familyPosition) {
        this.familyPosition = familyPosition;
    }
}
