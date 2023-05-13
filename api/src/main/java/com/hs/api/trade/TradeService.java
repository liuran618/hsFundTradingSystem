package com.hs.api.trade;

import com.hs.api.trade.dto.OrderDTO;
import com.hundsun.jrescloud.rpc.annotation.CloudService;

@CloudService(validation = true)
public interface TradeService {
    Integer addOrder(OrderDTO orderDTO);
    Integer updateOrder(OrderDTO orderDTO);
}
