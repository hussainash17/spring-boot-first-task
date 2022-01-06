package com.example.dbconnection.model;

import javax.persistence.*;

@Entity
@Table(name = "SBDMaster")
public class SBDMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int templateId;

    @Column(name = "templateName")
    private String templateName;

    @Column(name = "noOfSections")
    private int noOfSections;

    @Column(name = "status")
    private String status;

    @Column(name = "procType")
    private String procType;

    @Column(name = "stdFor")
    private String stdFor;

    @Column(name = "devPartnerId")
    private String devPartnerId;

    @Column(name = "foreignCurrency")
    private String foreignCurrency;

    public SBDMaster() {
    }

    public SBDMaster(int templateId, String templateName, int noOfSections, String status, String procType, String stdFor, String devPartnerId, String foreignCurrency) {
        this.templateId = templateId;
        this.templateName = templateName;
        this.noOfSections = noOfSections;
        this.status = status;
        this.procType = procType;
        this.stdFor = stdFor;
        this.devPartnerId = devPartnerId;
        this.foreignCurrency = foreignCurrency;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public int getNoOfSections() {
        return noOfSections;
    }

    public void setNoOfSections(int noOfSections) {
        this.noOfSections = noOfSections;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProcType() {
        return procType;
    }

    public void setProcType(String procType) {
        this.procType = procType;
    }

    public String getStdFor() {
        return stdFor;
    }

    public void setStdFor(String stdFor) {
        this.stdFor = stdFor;
    }

    public String getDevPartnerId() {
        return devPartnerId;
    }

    public void setDevPartnerId(String devPartnerId) {
        this.devPartnerId = devPartnerId;
    }

    public String getForeignCurrency() {
        return foreignCurrency;
    }

    public void setForeignCurrency(String foreignCurrency) {
        this.foreignCurrency = foreignCurrency;
    }
}
