package com.getThirdwrist.Savings.App.Wallet;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class WalletHolding {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "amount required")
    @Column(name = "user_id")
    private Long userId;
    @NotBlank(message = "wallet id required")
    @Column(name = "wallet_id")
    private Long walletId;
    @Column(name = "release_day")
    @NotBlank(message = "reference required")
    private Date releaseDay;
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

    public Date getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(Date releaseDay) {
        this.releaseDay = releaseDay;
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
