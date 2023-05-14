package com.hs.server.customerManagement.dao;

import com.hs.api.cunstomerManagement.dto.BankcardDTO;
import org.apache.ibatis.annotations.*;

@Mapper
public interface BankcardMapper {
    @Insert("INSERT INTO bankcard(bankcard_num, bankcard_customerid, "
            + "bankcard_holdername, bankcard_holdernum, "
            + "bankcard_bankname, bankcard_transpass, bankcard_balance) "
            + "VALUES (#{bankcard.bankcardNum}, #{bankcard.bankcardCustomerId}, "
            + "#{bankcard.bankcardHolderName}, #{bankcard.bankcardHolderNum}, "
            + "#{bankcard.bankcardBankname}, #{bankcard.bankcardTransPass}, #{bankcard.bankcardBalance})")
    Integer addBankcard(@Param("bankcard")BankcardDTO bankcardDTO);

    @Select("SELECT bankcard_num AS bankcardNum, bankcard_customerid AS bankcardCustomerId, "
            + "bankcard_holdername AS bankcardHolderName, bankcard_holdernum AS bankcardHolderNum, "
            + "bankcard_bankname AS bankcardBankname, bankcard_transpass AS bankcardTransPass, "
            + "bankcard_balance AS bankcardBalance FROM Bankcard WHERE bankcard_num=#{num}")
    BankcardDTO getBankcard(String num);

    @Update("UPDATE bankcard SET " +
            "bankcard_customerid = #{bankcard.bankcardCustomerId}, " +
            "bankcard_holdername = #{bankcard.bankcardHolderName}, " +
            "bankcard_holdernum = #{bankcard.bankcardHolderNum}, " +
            "bankcard_bankname = #{bankcard.bankcardBankname}, " +
            "bankcard_transpass = #{bankcard.bankcardTransPass}, " +
            "bankcard_balance = #{bankcard.bankcardBalance} " +
            "WHERE bankcard_num = #{bankcard.bankcardNum}")
    Integer updateBankcard(@Param("bankcard") BankcardDTO bankcardDto);

    @Delete("DELETE FROM bankcard WHERE bankcard_num = #{num}")
    Integer deleteBankcard(String num);
}
