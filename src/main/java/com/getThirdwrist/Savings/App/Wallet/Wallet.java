package com.getThirdwrist.Savings.App.Wallet;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;

@Entity
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long balance;
    @Column(name = "user_id")
    private Long userId;
    private Long currency;
    @Column(name = "wallet_type")
    private String walletType;
    private Boolean hold;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void debitBalance(Long amount)
    {
        this.balance -=amount;
    }

    public void creditBalance(Long amount)
    {
        this.balance +=amount;
    }

    public Long getBalance()
    {
        return balance;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCurrency() {
        return currency;
    }

    public void setCurrency(Long currency) {
        this.currency = currency;
    }

    public String getWalletType() {
        return walletType;
    }

    public void setWalletType(String walletType) {
        this.walletType = walletType;
    }

    public Boolean getHold() {
        return hold;
    }

    public void setHold(Boolean hold) {
        this.hold = hold;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

}
