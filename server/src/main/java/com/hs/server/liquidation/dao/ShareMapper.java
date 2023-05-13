package com.hs.server.liquidation.dao;

import com.hs.api.liquidation.dto.ShareDTO;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ShareMapper {
    @Insert("INSERT INTO Share (Share_Id, Share_CustomerId, Share_ProductId, Share_Num, Share_Date) " +
            "VALUES (#{share.shareId}, #{share.shareCustomerId}, #{share.shareProductId}, #{share.shareNum}, #{share.shareDate})")
    void insertShare(@Param("share") ShareDTO shareDTO);

    @Update("UPDATE Share SET Share_CustomerId=#{share.shareCustomerId}, Share_ProductId=#{share.shareProductId}, " +
            "Share_Num=#{share.shareNum}, Share_Date=#{share.shareDate} WHERE Share_Id=#{share.shareId}")
    void updateShare(@Param("share")ShareDTO shareDTO);
    @Delete("DELETE FROM Share WHERE Share_Id=#{id}")
    void deleteShare(@Param("id") short id);

}
