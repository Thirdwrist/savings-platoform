package com.getThirdwrist.Savings.App.User;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
public class User {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "name required")
    private String name;

    @NotNull(message = "name required")
    private Long bankAccountNumber;

    @NotBlank(message = "bank account number required")
    private String bankAccountName;

    @NotNull(message = "bank required")
    private Long bank;

    @NotBlank(message = "profile avatar required")
    private String profileAvatar;

    @NotBlank(message = "email required")
    private String email;

    @NotBlank(message = "phone required")
    private String phone;

    private Timestamp createdAt;

    private Timestamp updatedAt;

    public User() {}

    public User updateUser(User user) {
        setName(user.getName());
        setBankAccountNumber(user.getBankAccountNumber());
        setBankAccountName(user.getBankAccountName());
        setBank(user.getBank());
        setProfileAvatar(user.getProfileAvatar());
        setPhone(user.getPhone());
        setEmail(user.getEmail());

        return this;
    }

    public User(String name, Long bankAccountNumber, String bankAccountName, Long bank, String profileAvatar, String phone, String email) {
        this.name = name;
        this.bankAccountNumber = bankAccountNumber;
        this.bankAccountName = bankAccountName;
        this.bank = bank;
        this.profileAvatar = profileAvatar;
        this.phone = phone;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBankAccountNumber(Long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public void setBank(Long bank) {
        this.bank = bank;
    }

    public void setProfileAvatar(String profileAvatar) {
        this.profileAvatar = profileAvatar;
    }

    public String getName() {
        return name;
    }

    public Long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public Long getBank() {
        return bank;
    }

    public String getProfileAvatar() {
        return profileAvatar;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
