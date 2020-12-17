package com.getThirdwrist.Savings.App.Transfer;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;

@Entity
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "wallet_id")
    private Long walletId;
    @Column(name = "user_bank_account_id")
    private Long userBankAccountId;
    @NotBlank(message = "bank id required")
    @Column(name = "bank_id")
    private Long bankId;
    @NotBlank(message = "currency is required")
    private String currency;
    @NotBlank(message = "status is required")
    private Boolean status;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getWalletId() {
        return walletId;
    }

    public void setWalletId(Long walletId) {
        this.walletId = walletId;
    }

    public Long getUserBankAccountId() {
        return userBankAccountId;
    }

    public void setUserBankAccountId(Long userBankAccountId) {
        this.userBankAccountId = userBankAccountId;
    }

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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
