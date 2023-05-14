package com.hs.api.liquidation;

import com.hs.api.liquidation.dto.WorkdayDTO;

public interface LiquidationService {
    WorkdayDTO getWorkday();
    Integer updateWorkday(WorkdayDTO workdayDTO);
    Integer liquidate();
}
