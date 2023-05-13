package com.hs.api.cunstomerManagement.dto;

public class CustomerDTO {
    private int customerId;
    private String customerName;
    private String customerCertificateType;
    private String customerCertificateId;
    private String customerNum;
    private String customerAccountType;
    private String customerBankcardNum;
    private String customerPassword;
    private int customerRiskLevel;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCertificateType() {
        return customerCertificateType;
    }

    public void setCustomerCertificateType(String customerCertificateType) {
        this.customerCertificateType = customerCertificateType;
    }

    public String getCustomerCertificateId() {
        return customerCertificateId;
    }

    public void setCustomerCertificateId(String customerCertificateId) {
        this.customerCertificateId = customerCertificateId;
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public String getCustomerAccountType() {
        return customerAccountType;
    }

    public void setCustomerAccountType(String customerAccountType) {
        this.customerAccountType = customerAccountType;
    }

    public String getCustomerBankcardNum() {
        return customerBankcardNum;
    }

    public void setCustomerBankcardNum(String customerBankcardNum) {
        this.customerBankcardNum = customerBankcardNum;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public int getCustomerRiskLevel() {
        return customerRiskLevel;
    }

    public void setCustomerRiskLevel(int customerRiskLevel) {
        this.customerRiskLevel = customerRiskLevel;
    }
}