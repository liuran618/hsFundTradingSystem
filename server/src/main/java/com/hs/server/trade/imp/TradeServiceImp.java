package com.hs.server.trade.imp;

import com.hs.api.trade.TradeService;
import com.hs.api.trade.dto.OrderDTO;
import com.hs.server.trade.dao.TradeMapper;
import com.hundsun.jrescloud.rpc.annotation.CloudComponent;
import org.springframework.beans.factory.annotation.Autowired;

@CloudComponent
public class TradeServiceImp implements TradeService {
    @Autowired
    TradeMapper tradeMapper;
    @Override
    public Integer purchase(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public Integer redemption(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public Integer revocation(OrderDTO orderDTO) {
        return tradeMapper.updateOrder(orderDTO);
    }
}
