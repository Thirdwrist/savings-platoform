package com.getThirdwrist.Savings.App.Wallet;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.security.Timestamp;

@Entity
public class WalletPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message = "name required")
    private String name;
    private String description;
    @Column(name = "release_interval")
    private String releaseInterval;
    @Column(name = "release_interval_count")
    private Long releaseIntervalCount;
    @Column(name = "release_count_per_year")
    private Long releaseCountPerYear;
    @Column(name = "can_release_on_non_release_day")
    private boolean canReleaseOnNonReleaseDay;
    @Column(name = "release_on_non_release_day_penalty")
    private Long releaseOnNonReleaseDayPenalty;
    private Long interest;
    private boolean hold;
    @Column(name = "can_break_hold")
    private boolean canBreakHold;
    private String currency;
    private String iconImage;
    private String banner;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public WalletPolicy(@NotBlank(message = "name required") String name, String description, String releaseInterval, Long releaseIntervalCount, Long releaseCountPerYear, boolean canReleaseOnNonReleaseDay, Long releaseOnNonReleaseDayPenalty, Long interest, boolean hold, boolean canBreakHold, String currency, String iconImage, String banner) {
        this.name = name;
        this.description = description;
        this.releaseInterval = releaseInterval;
        this.releaseIntervalCount = releaseIntervalCount;
        this.releaseCountPerYear = releaseCountPerYear;
        this.canReleaseOnNonReleaseDay = canReleaseOnNonReleaseDay;
        this.releaseOnNonReleaseDayPenalty = releaseOnNonReleaseDayPenalty;
        this.interest = interest;
        this.hold = hold;
        this.canBreakHold = canBreakHold;
        this.currency = currency;
        this.iconImage = iconImage;
        this.banner = banner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseInterval() {
        return releaseInterval;
    }

    public void setReleaseInterval(String releaseInterval) {
        this.releaseInterval = releaseInterval;
    }

    public Long getReleaseIntervalCount() {
        return releaseIntervalCount;
    }

    public void setReleaseIntervalCount(Long releaseIntervalCount) {
        this.releaseIntervalCount = releaseIntervalCount;
    }

    public Long getReleaseCountPerYear() {
        return releaseCountPerYear;
    }

    public void setReleaseCountPerYear(Long releaseCountPerYear) {
        this.releaseCountPerYear = releaseCountPerYear;
    }

    public boolean isCanReleaseOnNonReleaseDay() {
        return canReleaseOnNonReleaseDay;
    }

    public void setCanReleaseOnNonReleaseDay(boolean canReleaseOnNonReleaseDay) {
        this.canReleaseOnNonReleaseDay = canReleaseOnNonReleaseDay;
    }

    public Long getReleaseOnNonReleaseDayPenalty() {
        return releaseOnNonReleaseDayPenalty;
    }

    public void setReleaseOnNonReleaseDayPenalty(Long releaseOnNonReleaseDayPenalty) {
        this.releaseOnNonReleaseDayPenalty = releaseOnNonReleaseDayPenalty;
    }

    public Long getInterest() {
        return interest;
    }

    public void setInterest(Long interest) {
        this.interest = interest;
    }

    public boolean isHold() {
        return hold;
    }

    public void setHold(boolean hold) {
        this.hold = hold;
    }

    public boolean isCanBreakHold() {
        return canBreakHold;
    }

    public void setCanBreakHold(boolean canBreakHold) {
        this.canBreakHold = canBreakHold;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getIconImage() {
        return iconImage;
    }

    public void setIconImage(String iconImage) {
        this.iconImage = iconImage;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
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
