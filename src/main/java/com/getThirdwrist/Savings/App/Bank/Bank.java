package com.getThirdwrist.Savings.App.Bank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;

public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "code Required")
    private Long code;
    @NotBlank(message = "Name Required")
    private String name;
    @NotBlank(message = "nibss code Required")
    @Column(name = "nibss_code")
    private Long nibssCode;
    @NotBlank(message = "status Required")
    private Boolean status;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getCode() {
        return code;
    }

    public Long getNibssCode() {
        return nibssCode;
    }

    public Boolean getStatus() {
        return status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    @JsonIgnore
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public void setNibssCode(Long nibssCode) {
        this.nibssCode = nibssCode;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


}
