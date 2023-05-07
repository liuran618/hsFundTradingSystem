package com.hs.server.trade.imp;

import com.hs.api.trade.TradeService;
import com.hs.api.trade.dto.OrderDTO;
import com.hundsun.jrescloud.rpc.annotation.CloudComponent;

@CloudComponent
public class TradeServiceImp implements TradeService {
    @Override
    public Integer purchase(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public Integer redemption(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public Integer revocation(Integer orderId) {
        return null;
    }
}
