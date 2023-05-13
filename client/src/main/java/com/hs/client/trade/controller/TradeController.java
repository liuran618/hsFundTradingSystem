package com.hs.client.trade.controller;

import com.hs.api.trade.TradeService;
import com.hs.api.trade.dto.OrderDTO;
import com.hundsun.jrescloud.rpc.annotation.CloudReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeController {
    @CloudReference
    TradeService tradeService;
    @RequestMapping("/insert")
    public String insertOrder(){
    }
    @RequestMapping("/get")
    public OrderDTO getOrder(){
        return tradeService.
    }
    @RequestMapping("/update")
    public String updateOrder(){
        tradeService.revocation();
    }

}
