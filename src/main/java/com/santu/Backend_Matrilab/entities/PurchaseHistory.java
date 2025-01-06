package com.santu.Backend_Matrilab.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class PurchaseHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String packageName;
    private String validityPeriod;
    private Double price;
    private LocalDate purchaseDate;
    private String status;

    @ManyToOne
    @JoinColumn(name = "package_details_id")
    private PackageDetails packageDetails;

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

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(String validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PackageDetails getPackageDetails() {
        return packageDetails;
    }

    public void setPackageDetails(PackageDetails packageDetails) {
        this.packageDetails = packageDetails;
    }

    public PurchaseHistory() {
    }

    public PurchaseHistory(Long id, User user, String packageName, String validityPeriod, Double price, LocalDate purchaseDate, String status, PackageDetails packageDetails) {
        this.id = id;
        this.user = user;
        this.packageName = packageName;
        this.validityPeriod = validityPeriod;
        this.price = price;
        this.purchaseDate = purchaseDate;
        this.status = status;
        this.packageDetails = packageDetails;
    }
}
