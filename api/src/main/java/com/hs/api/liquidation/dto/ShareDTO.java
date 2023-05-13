package com.hs.api.liquidation.dto;

import java.util.Date;

public class ShareDTO {
    private short shareId;
    private short shareCustomerId;
    private short shareProductId;
    private float shareNum;
    private Date shareDate;

    public short getShareId() {
        return shareId;
    }

    public void setShareId(short shareId) {
        this.shareId = shareId;
    }

    public short getShareCustomerId() {
        return shareCustomerId;
    }

    public void setShareCustomerId(short shareCustomerId) {
        this.shareCustomerId = shareCustomerId;
    }

    public short getShareProductId() {
        return shareProductId;
    }

    public void setShareProductId(short shareProductId) {
        this.shareProductId = shareProductId;
    }

    public float getShareNum() {
        return shareNum;
    }

    public void setShareNum(float shareNum) {
        this.shareNum = shareNum;
    }

    public Date getShareDate() {
        return shareDate;
    }

    public void setShareDate(Date shareDate) {
        this.shareDate = shareDate;
    }
}