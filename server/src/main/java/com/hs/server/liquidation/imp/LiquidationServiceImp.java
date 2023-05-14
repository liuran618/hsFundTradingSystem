package com.hs.server.liquidation.imp;

import com.hs.api.liquidation.LiquidationService;
import com.hs.api.liquidation.dto.WorkdayDTO;
import com.hs.server.liquidation.dao.ShareMapper;
import com.hs.server.liquidation.dao.WorkdayMapper;
import com.hundsun.jrescloud.rpc.annotation.CloudComponent;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@CloudComponent
public class LiquidationServiceImp implements LiquidationService {
    @Autowired
    WorkdayMapper workdayMapper;
    @Autowired
    ShareMapper shareMapper;

    @Override
    public WorkdayDTO getWorkday() {
        return workdayMapper.getWorkday();
    }

    @Override
    public Integer updateWorkday(WorkdayDTO workdayDTO) {
        String dateString = workdayDTO.getWorkday();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString, formatter); //将字符转转换为 localDate 类型

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        while ( dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY) {
            date = date.plusDays(1);
            dayOfWeek = date.getDayOfWeek();
        }
        dateString = date.format(formatter);
        workdayDTO.setWorkday(dateString);
        return workdayMapper.updateWorkday(workdayDTO);
    }

    @Override
    public Integer liquidate() {
        return null;
    }
}
