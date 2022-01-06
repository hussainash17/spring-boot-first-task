package com.example.dbconnection.model;

import javax.persistence.*;

@Entity
@Table(name = "SMSHistory")
public class SMSHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int smsLogId;

    @Column(name = "mobileNo")
    private String mobileNo;

    @Column(name = "sentDate")
    private String sentDate;

    @Column(name = "smsText")
    private String smsText;

    @Column(name = "exceptionLog")
    private  String exceptionLog;

    public SMSHistory() {

    }

    public SMSHistory(int smsLogId, String mobileNo, String sentDate, String smsText, String exceptionLog) {
        this.smsLogId = smsLogId;
        this.mobileNo = mobileNo;
        this.sentDate = sentDate;
        this.smsText = smsText;
        this.exceptionLog = exceptionLog;
    }

    public int getSmsLogId() {
        return smsLogId;
    }

    public void setSmsLogId(int smsLogId) {
        this.smsLogId = smsLogId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getSentDate() {
        return sentDate;
    }

    public void setSentDate(String sentDate) {
        this.sentDate = sentDate;
    }

    public String getSmsText() {
        return smsText;
    }

    public void setSmsText(String smsText) {
        this.smsText = smsText;
    }

    public String getExceptionLog() {
        return exceptionLog;
    }

    public void setExceptionLog(String exceptionLog) {
        this.exceptionLog = exceptionLog;
    }

    @Override
    public String toString() {
        return "SMSHistory{" +
                "smsLogId=" + smsLogId +
                ", mobileNo='" + mobileNo + '\'' +
                ", sentDate='" + sentDate + '\'' +
                ", smsText='" + smsText + '\'' +
                ", exceptionLog='" + exceptionLog + '\'' +
                '}';
    }
}
