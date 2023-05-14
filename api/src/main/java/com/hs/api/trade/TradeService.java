package com.hs.api.trade;

import com.hs.api.trade.dto.OrderDTO;
import com.hundsun.jrescloud.rpc.annotation.CloudService;
import org.springframework.core.annotation.Order;

import java.util.List;

@CloudService(validation = true)
public interface TradeService {
    Integer subscribe(OrderDTO orderDTO);
    Integer redeem(OrderDTO orderDTO);
    Integer withdraw(Integer orderId);
    List<OrderDTO> getOrderByCustomer(Integer orderCustomerId);
}
