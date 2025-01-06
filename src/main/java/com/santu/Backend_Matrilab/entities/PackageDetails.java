package com.santu.Backend_Matrilab.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class PackageDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "packageDetails")
    private List<PurchaseHistory> purchaseHistories;


    private String interestExpressLimit;
    private String contactViewLimit;
    private String imageUploadLimit;
    private String validityPeriod;
    private String paymentVia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PurchaseHistory> getPurchaseHistories() {
        return purchaseHistories;
    }

    public void setPurchaseHistories(List<PurchaseHistory> purchaseHistories) {
        this.purchaseHistories = purchaseHistories;
    }

    public String getInterestExpressLimit() {
        return interestExpressLimit;
    }

    public void setInterestExpressLimit(String interestExpressLimit) {
        this.interestExpressLimit = interestExpressLimit;
    }

    public String getContactViewLimit() {
        return contactViewLimit;
    }

    public void setContactViewLimit(String contactViewLimit) {
        this.contactViewLimit = contactViewLimit;
    }

    public String getImageUploadLimit() {
        return imageUploadLimit;
    }

    public void setImageUploadLimit(String imageUploadLimit) {
        this.imageUploadLimit = imageUploadLimit;
    }

    public String getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(String validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public String getPaymentVia() {
        return paymentVia;
    }

    public void setPaymentVia(String paymentVia) {
        this.paymentVia = paymentVia;
    }

    public PackageDetails() {
    }

    public PackageDetails(Long id, List<PurchaseHistory> purchaseHistories, String interestExpressLimit, String contactViewLimit, String imageUploadLimit, String validityPeriod, String paymentVia) {
        this.id = id;
        this.purchaseHistories = purchaseHistories;
        this.interestExpressLimit = interestExpressLimit;
        this.contactViewLimit = contactViewLimit;
        this.imageUploadLimit = imageUploadLimit;
        this.validityPeriod = validityPeriod;
        this.paymentVia = paymentVia;
    }
}
