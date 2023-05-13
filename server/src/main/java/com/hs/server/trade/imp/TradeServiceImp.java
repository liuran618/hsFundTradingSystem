package com.hs.server.trade.imp;

import com.hs.api.trade.TradeService;
import com.hs.api.trade.dto.OrderDTO;
import com.hs.server.trade.dao.OrderMapper;
import com.hundsun.jrescloud.rpc.annotation.CloudComponent;
import org.springframework.beans.factory.annotation.Autowired;

@CloudComponent
public class TradeServiceImp implements TradeService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public Integer addOrder(OrderDTO orderDTO) {
        System.out.println(orderDTO.getOrderId());
        return orderMapper.addOrder(orderDTO);
    }

    @Override
    public OrderDTO getOrder(Integer orderId) {
        return orderMapper.getOrder(orderId);
    }

    @Override
    public Integer updateOrder(OrderDTO orderDTO) {
        System.out.println(orderDTO.getOrderId());
        return orderMapper.updateOrder(orderDTO);
    }
}
