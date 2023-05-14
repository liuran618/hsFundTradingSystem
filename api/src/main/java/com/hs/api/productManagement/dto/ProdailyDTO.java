package com.hs.api.productManagement.dto;

import java.util.Date;

public class ProdailyDTO {
    private Integer prodailyId;
    private Date prodailyDate;
    private double prodailyNetvalue;
    private double prodailyTotalshare;

    public Integer getProdailyId() {
        return prodailyId;
    }

    public void setProdailyId(Integer prodailyId) {
        this.prodailyId = prodailyId;
    }

    public Date getProdailyDate() {
        return prodailyDate;
    }

    public void setProdailyDate(Date prodailyDate) {
        this.prodailyDate = prodailyDate;
    }

    public double getProdailyNetvalue() {
        return prodailyNetvalue;
    }

    public void setProdailyNetvalue(double prodailyNetvalue) {
        this.prodailyNetvalue = prodailyNetvalue;
    }

    public double getProdailyTotalshare() {
        return prodailyTotalshare;
    }

    public void setProdailyTotalshare(double prodailyTotalshare) {
        this.prodailyTotalshare = prodailyTotalshare;
    }
}