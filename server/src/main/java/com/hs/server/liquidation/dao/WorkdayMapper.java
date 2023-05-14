package com.hs.server.liquidation.dao;

import com.hs.api.liquidation.dto.WorkdayDTO;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.LocalDateTypeHandler;

@Mapper
public interface WorkdayMapper {
    @Select("SELECT workday FROM WORKDAY")
    WorkdayDTO getWorkday();

    @Update("UPDATE WORKDAY SET workday = #{workday.workday}")
    Integer updateWorkday(@Param("workday") WorkdayDTO workdayDTO);
}
