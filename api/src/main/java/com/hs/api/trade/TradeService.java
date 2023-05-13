package com.hs.api.trade;

import com.hs.api.trade.dto.OrderDTO;
import com.hundsun.jrescloud.rpc.annotation.CloudService;
import org.springframework.core.annotation.Order;

@CloudService(validation = true)
public interface TradeService {
    Integer addOrder(OrderDTO orderDTO);
    Integer updateOrder(OrderDTO orderDTO);
    OrderDTO getOrder(Integer orderId);
}
