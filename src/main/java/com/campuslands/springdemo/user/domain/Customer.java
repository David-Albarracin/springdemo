package com.campuslands.springdemo.user.domain;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private Integer customerId;

    @Column(name = "LEGAL_ID", unique = true, length = 250)
    private String legalId;

    @Column(name = "EMAIL", unique = true, length = 255)
    private String email;

    @Column(name = "FIRST_NAME", length = 250)
    private String firstName;

    @Column(name = "LAST_NAME", length = 250)
    private String lastName;

    @Column(name = "PHONE_NUMBER", length = 45)
    private String phoneNumber;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "LOGIN_AT")
    private LocalDateTime loginAt;

    @Column(name = "PHONE_NUMBER_PREFIX", length = 45)
    private String phoneNumberPrefix;

    @Column(name = "LEGAL_ID_TYPE", length = 45)
    private String legalIdType;

    // Getters and Setters

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getLegalId() {
        return legalId;
    }

    public void setLegalId(String legalId) {
        this.legalId = legalId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getLoginAt() {
        return loginAt;
    }

    public void setLoginAt(LocalDateTime loginAt) {
        this.loginAt = loginAt;
    }

    public String getPhoneNumberPrefix() {
        return phoneNumberPrefix;
    }

    public void setPhoneNumberPrefix(String phoneNumberPrefix) {
        this.phoneNumberPrefix = phoneNumberPrefix;
    }

    public String getLegalIdType() {
        return legalIdType;
    }

    public void setLegalIdType(String legalIdType) {
        this.legalIdType = legalIdType;
    }
}
