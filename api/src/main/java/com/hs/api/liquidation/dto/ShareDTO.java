package com.hs.api.liquidation.dto;

import java.util.Date;

public class ShareDTO {
    private Integer shareId;
    private Integer shareCustomerId;
    private Integer shareProductId;
    private double shareNum;
    private String shareDate;

    public Integer getShareId() {
        return shareId;
    }

    public void setShareId(Integer shareId) {
        this.shareId = shareId;
    }

    public Integer getShareCustomerId() {
        return shareCustomerId;
    }

    public void setShareCustomerId(Integer shareCustomerId) {
        this.shareCustomerId = shareCustomerId;
    }

    public Integer getShareProductId() {
        return shareProductId;
    }

    public void setShareProductId(Integer shareProductId) {
        this.shareProductId = shareProductId;
    }

    public double getShareNum() {
        return shareNum;
    }

    public void setShareNum(double shareNum) {
        this.shareNum = shareNum;
    }

    public String getShareDate() {
        return shareDate;
    }

    public void setShareDate(String shareDate) {
        this.shareDate = shareDate;
    }
}