package com.hs.server.productManagement.dao;

import com.hs.api.productManagement.dto.ProdailyDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProdailyMapper {
    @Insert("INSERT INTO Prodaily(prodaily_id, prodaily_date, prodaily_netvalue, prodaily_totalshare) "
            + "VALUES (#{prodaily.prodailyId},#{prodaily.prodailyDate},#{prodaily.prodailyNetvalue},#{prodaily.prodailyTotalshare})")
    Integer addProdaily(@Param("prodaily")ProdailyDTO prodailyDTO);

    @Select("SELECT prodaily_id as prodailyId, prodaily_date as prodailyDate, "
            + "prodaily_netvalue as prodailyNetvalue, prodaily_totalshare as prodailyTotalshare "
            + "FROM Prodaily WHERE prodaily_id = #{prodailyId}")
    ProdailyDTO getProdaily(@Param("prodailyId") Integer prodailyId);
}
