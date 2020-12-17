package com.getThirdwrist.Savings.App.Transaction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.security.Timestamp;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message = "user id is required")
    @Column(name = "user_id")
    private Long UserId;
    @NotBlank(message = "wallet id is required")
    @Column(name = "wallet_id")
    private Long WalletId;
    @NotBlank(message = "initial balance is required")
    @Column(name = "initial_balance")
    private Long initialBalance;
    @NotBlank(message = "current balance is required")
    @Column(name = "current_balance")
    private Long currentBalance;
    @NotBlank(message = "currency is required")
    private String currency;
    @NotBlank(message = "status is required")
    private String status;
    @NotBlank(message = "model type is required")
    private String modelType;
    @NotBlank(message = "model id is required")
    private Long modelId;
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
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public Long getWalletId() {
        return WalletId;
    }

    public void setWalletId(Long walletId) {
        WalletId = walletId;
    }

    public Long getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(Long initialBalance) {
        this.initialBalance = initialBalance;
    }

    public Long getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Long currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
