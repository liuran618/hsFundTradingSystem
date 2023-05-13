package com.hs.client.trade.controller;

import com.hs.api.trade.TradeService;
import com.hs.api.trade.dto.OrderDTO;
import com.hs.common.Result;
import com.hundsun.jrescloud.rpc.annotation.CloudReference;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trade")
public class TradeController {
    @CloudReference
    TradeService tradeService;
    @RequestMapping("/insertOrder")
    public Result<?> insertOrder(@RequestBody OrderDTO orderDTO){
        tradeService.addOrder(orderDTO);
        return Result.success();
    }
    @RequestMapping("/getOrder/{id}")
    public Result<?> getOrder(@PathVariable("id") Integer id){
        OrderDTO orderDTO = tradeService.getOrder(id);
        return Result.success(orderDTO);
    }
    @RequestMapping("/updateOrder")
    public Result<?> updateOrder(@RequestBody OrderDTO orderDTO){
        int judge = tradeService.updateOrder(orderDTO);
        if(judge != 0){return Result.success();}
        else{
            return Result.error("400","失败");
        }
    }

}
