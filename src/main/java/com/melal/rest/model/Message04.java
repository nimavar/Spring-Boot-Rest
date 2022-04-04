
package com.melal.rest.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class Message04 {

    private String accountComment;
    private String accountNumber;
    private List<AccountOwner> accountOwner;
    private String accountStatus;
    private String errorCode;
    private String paymentCode;
    private String paymentCodeValid;
    private String referenceNumber;

    @Override
    public String toString() {
        return "Message04{" +
                "accountComment='" + accountComment + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountOwner=" + accountOwner +
                ", accountStatus='" + accountStatus + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", paymentCode='" + paymentCode + '\'' +
                ", paymentCodeValid='" + paymentCodeValid + '\'' +
                ", referenceNumber='" + referenceNumber + '\'' +
                ", requestedIban='" + requestedIban + '\'' +
                '}';
    }

    private String requestedIban;

    public String getAccountComment() {
        return accountComment;
    }

    public void setAccountComment(String accountComment) {
        this.accountComment = accountComment;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<AccountOwner> getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(List<AccountOwner> accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getPaymentCodeValid() {
        return paymentCodeValid;
    }

    public void setPaymentCodeValid(String paymentCodeValid) {
        this.paymentCodeValid = paymentCodeValid;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getRequestedIban() {
        return requestedIban;
    }

    public void setRequestedIban(String requestedIban) {
        this.requestedIban = requestedIban;
    }

}
