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

import java.util.List;

@RestController
@RequestMapping("/trade")
public class TradeController {
    @CloudReference
    TradeService tradeService;
    @RequestMapping("/subscribe")
    public Result<?> insertOrder(@RequestBody OrderDTO orderDTO){
        int judge  = tradeService.subscribe(orderDTO);
        if(judge != 0){return Result.success();}
        else{
            return Result.error("500","失败");
        }
    }

    @RequestMapping("/redeem")
    public Result<?> updateOrder(@RequestBody OrderDTO orderDTO){
        int judge = tradeService.redeem(orderDTO);
        if(judge != 0){return Result.success();}
        else{
            return Result.error("500","失败");
        }
    }

    @RequestMapping("/withdraw/{id}")
    public Result<?> withdraw(@PathVariable("id") Integer id){
        tradeService.withdraw(id);
        return Result.success();
    }

    @RequestMapping("/getOrder/{customerId}")
    public Result<?> getOrder(@PathVariable("customerId") Integer customerId){
        List<OrderDTO> orderDTOList = tradeService.getOrderByCustomer(customerId);
        return Result.success(orderDTOList);
    }


}
