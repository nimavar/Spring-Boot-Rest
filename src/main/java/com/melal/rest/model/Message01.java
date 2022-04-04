package com.melal.rest.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class Message01 {

    private String applicantBicCode;

    private String iban;

    private String originalKey;

    private String paymentCode;

    private String securityTicket;

    @Override
    public String toString() {
        return "Message01{" +
                "applicantBicCode='" + applicantBicCode + '\'' +
                ", iban='" + iban + '\'' +
                ", originalKey='" + originalKey + '\'' +
                ", paymentCode='" + paymentCode + '\'' +
                ", securityTicket='" + securityTicket + '\'' +
                '}';
    }

    public String getApplicantBicCode() {
        return applicantBicCode;
    }

    public void setApplicantBicCode(String applicantBicCode) {
        this.applicantBicCode = applicantBicCode;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getOriginalKey() {
        return originalKey;
    }

    public void setOriginalKey(String originalKey) {
        this.originalKey = originalKey;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getSecurityTicket() {
        return securityTicket;
    }

    public void setSecurityTicket(String securityTicket) {
        this.securityTicket = securityTicket;
    }
}
