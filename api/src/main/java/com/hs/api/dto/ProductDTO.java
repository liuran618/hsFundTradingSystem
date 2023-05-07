package com.hs.api.dto;

public class ProductDTO {
    private Integer productId;
    private String productName;
    private String productType;
    private Integer productRiskLevel;
    private double productNetValueYesterday;
    private double productNetValueToday;
    private double productTotalShare;
    private String productManager;
    private String productInfo;
    private double productPurchaseRate;
    private double productSellingRate;
    private double productManageRate;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getProductRiskLevel() {
        return productRiskLevel;
    }

    public void setProductRiskLevel(int productRiskLevel) {
        this.productRiskLevel = productRiskLevel;
    }

    public double getProductNetValueYesterday() {
        return productNetValueYesterday;
    }

    public void setProductNetValueYesterday(double productNetValueYesterday) {
        this.productNetValueYesterday = productNetValueYesterday;
    }

    public double getProductNetValueToday() {
        return productNetValueToday;
    }

    public void setProductNetValueToday(double productNetValueToday) {
        this.productNetValueToday = productNetValueToday;
    }

    public double getProductTotalShare() {
        return productTotalShare;
    }

    public void setProductTotalShare(double productTotalShare) {
        this.productTotalShare = productTotalShare;
    }

    public String getProductManager() {
        return productManager;
    }

    public void setProductManager(String productManager) {
        this.productManager = productManager;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public double getProductPurchaseRate() {
        return productPurchaseRate;
    }

    public void setProductPurchaseRate(double productPurchaseRate) {
        this.productPurchaseRate = productPurchaseRate;
    }

    public double getProductSellingRate() {
        return productSellingRate;
    }

    public void setProductSellingRate(double productSellingRate) {
        this.productSellingRate = productSellingRate;
    }

    public double getProductManageRate() {
        return productManageRate;
    }

    public void setProductManageRate(double productManageRate) {
        this.productManageRate = productManageRate;
    }
}
