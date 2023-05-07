package com.hs.api.trade.dto;

import java.util.Date;

public class OrderDTO {
    private Integer orderId;
    private String orderType;
    private Integer orderCustomerId;
    private Integer orderProductId;
    private Integer orderOperatorId;
    private double orderPurchaseAmount;
    private double orderExpectedShare;
    private String orderBankcardNum;
    private double orderRedeemShare;
    private double orderExpectedIncome;
    private Date orderTime;

    private String orderStatus;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderCustomerId() {
        return orderCustomerId;
    }

    public void setOrderCustomerId(Integer orderCustomerId) {
        this.orderCustomerId = orderCustomerId;
    }

    public Integer getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(Integer orderProductId) {
        this.orderProductId = orderProductId;
    }

    public Integer getOrderOperatorId() {
        return orderOperatorId;
    }

    public void setOrderOperatorId(Integer orderOperatorId) {
        this.orderOperatorId = orderOperatorId;
    }

    public double getOrderPurchaseAmount() {
        return orderPurchaseAmount;
    }

    public void setOrderPurchaseAmount(double orderPurchaseAmount) {
        this.orderPurchaseAmount = orderPurchaseAmount;
    }

    public double getOrderExpectedShare() {
        return orderExpectedShare;
    }

    public void setOrderExpectedShare(double orderExpectedShare) {
        this.orderExpectedShare = orderExpectedShare;
    }

    public String getOrderBankcardNum() {
        return orderBankcardNum;
    }

    public void setOrderBankcardNum(String orderBankcardNum) {
        this.orderBankcardNum = orderBankcardNum;
    }

    public double getOrderRedeemShare() {
        return orderRedeemShare;
    }

    public void setOrderRedeemShare(double orderRedeemShare) {
        this.orderRedeemShare = orderRedeemShare;
    }

    public double getOrderExpectedIncome() {
        return orderExpectedIncome;
    }

    public void setOrderExpectedIncome(double orderExpectedIncome) {
        this.orderExpectedIncome = orderExpectedIncome;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }


}