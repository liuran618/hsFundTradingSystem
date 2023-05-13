package com.hs.api.productManagement.dto;

import java.util.Date;

public class ProdailyDTO {
    private short prodailyId;
    private Date prodailyDate;
    private float prodailyNetvalue;
    private float prodailyTotalshare;

    public short getProdailyId() {
        return prodailyId;
    }

    public void setProdailyId(short prodailyId) {
        this.prodailyId = prodailyId;
    }

    public Date getProdailyDate() {
        return prodailyDate;
    }

    public void setProdailyDate(Date prodailyDate) {
        this.prodailyDate = prodailyDate;
    }

    public float getProdailyNetvalue() {
        return prodailyNetvalue;
    }

    public void setProdailyNetvalue(float prodailyNetvalue) {
        this.prodailyNetvalue = prodailyNetvalue;
    }

    public float getProdailyTotalshare() {
        return prodailyTotalshare;
    }

    public void setProdailyTotalshare(float prodailyTotalshare) {
        this.prodailyTotalshare = prodailyTotalshare;
    }
}