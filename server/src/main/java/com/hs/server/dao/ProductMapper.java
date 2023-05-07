package com.hs.server.dao;

import com.hs.api.dto.ProductDTO;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ProductMapper {
    @Insert("INSERT INTO Product (Product_Name, Product_Type, Product_RiskLevel, Product_NetvalueYesterday, Product_NetvalueToday, Product_TotalShare, Product_Manager, Product_Info, Product_PurchaseRate, Product_SellingRate, Product_ManageRate) " +
            "VALUES (" +
            "        #{product.productName}, #{product.productType}, #{product.productRiskLevel}," +
            "        #{product.productNetValueYesterday}, #{product.productNetValueToday}, #{product.productTotalShare}," +
            "        #{product.productManager}, #{product.productInfo}, #{product.productPurchaseRate}, #{product.productSellingRate}, #{product.productManageRate}" +
            "    )")
    @SelectKey(statement = "SELECT last_insert_id()", keyProperty = "product.productId", before = false, resultType = Integer.class)
    Integer addProduct(@Param("product")ProductDTO productDTO);

    @Select("SELECT Product_Id AS productId, Product_Name AS productName, Product_Type AS productType, Product_RiskLevel AS productRiskLevel, Product_NetvalueYesterday AS productNetvalueYesterday, Product_NetvalueToday AS productNetvalueToday, Product_TotalShare AS productTotalShare, Product_Manager AS productManager, Product_Info AS productInfo, Product_PurchaseRate AS productPurchaseRate, Product_SellingRate AS productSellingRate, Product_ManageRate AS productManageRate FROM Product WHERE Product_Id = #{id}")
    ProductDTO getProduct(@Param("id")Integer productId);

    Integer updateProduct(ProductDTO productDTO);

    Integer deleteProduct(Integer productId);
}
