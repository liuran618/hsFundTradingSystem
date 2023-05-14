package com.hs.client.liquidation.controller;

import com.hs.api.liquidation.LiquidationService;
import com.hs.api.liquidation.dto.WorkdayDTO;
import com.hs.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/liquidation")
public class liquidationController {
    @Autowired
    LiquidationService liquidationService;

    @RequestMapping("/getWorkday")
    public Result<?> getWorkday(){
        WorkdayDTO workdayDTO = liquidationService.getWorkday();
        return Result.success(workdayDTO);
    }
    @RequestMapping("/addWorkday")
    public Result<?> addWorkday(){
        WorkdayDTO workdayDTO = liquidationService.getWorkday();

    }
}
