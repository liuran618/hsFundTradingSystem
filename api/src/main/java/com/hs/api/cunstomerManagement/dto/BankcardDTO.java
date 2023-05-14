package com.hs.api.cunstomerManagement.dto;

public class BankcardDTO {
    private String bankcardNum;
    private int bankcardCustomerId;
    private String bankcardHolderName;
    private String bankcardHolderNum;
    private String bankcardBankname;
    private String bankcardTransPass;
    private double bankcardBalance;

    public String getBankcardNum() {
        return bankcardNum;
    }

    public void setBankcardNum(String bankcardNum) {
        this.bankcardNum = bankcardNum;
    }

    public int getBankcardCustomerId() {
        return bankcardCustomerId;
    }

    public void setBankcardCustomerId(int bankcardCustomerId) {
        this.bankcardCustomerId = bankcardCustomerId;
    }

    public String getBankcardHolderName() {
        return bankcardHolderName;
    }

    public void setBankcardHolderName(String bankcardHolderName) {
        this.bankcardHolderName = bankcardHolderName;
    }

    public String getBankcardHolderNum() {
        return bankcardHolderNum;
    }

    public void setBankcardHolderNum(String bankcardHolderNum) {
        this.bankcardHolderNum = bankcardHolderNum;
    }

    public String getBankcardBankname() {
        return bankcardBankname;
    }

    public void setBankcardBankname(String bankcardBankname) {
        this.bankcardBankname = bankcardBankname;
    }

    public String getBankcardTransPass() {
        return bankcardTransPass;
    }

    public void setBankcardTransPass(String bankcardTransPass) {
        this.bankcardTransPass = bankcardTransPass;
    }

    public double getBankcardBalance() {
        return bankcardBalance;
    }

    public void setBankcardBalance(double bankcardBalance) {
        this.bankcardBalance = bankcardBalance;
    }
}