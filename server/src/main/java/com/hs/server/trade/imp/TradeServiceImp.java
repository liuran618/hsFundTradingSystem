package com.hs.server.trade.imp;

import com.hs.api.cunstomerManagement.dto.BankcardDTO;
import com.hs.api.trade.TradeService;
import com.hs.api.trade.dto.OrderDTO;
import com.hs.server.customerManagement.dao.BankcardMapper;
import com.hs.server.trade.dao.OrderMapper;
import com.hundsun.jrescloud.rpc.annotation.CloudComponent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@CloudComponent
public class TradeServiceImp implements TradeService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    BankcardMapper bankcardMapper;

    @Override
    public Integer subscribe(OrderDTO orderDTO) {
        double purchaseAmount = orderDTO.getOrderPurchaseAmount();
        String bankcardNum = orderDTO.getOrderBankcardNum();
        BankcardDTO bankcard= bankcardMapper.getBankcard(bankcardNum);
        double bankcardBalance =bankcard.getBankcardBalance();
        //判断银行卡余额是否足够支付购买
        if(purchaseAmount > bankcardBalance){
            return 0;
        }
        else{
            orderMapper.addOrder(orderDTO);
            bankcard.setBankcardBalance(bankcardBalance - purchaseAmount);
            return bankcardMapper.updateBankcard(bankcard);
        }
    }

    @Override
    public Integer redeem(OrderDTO orderDTO) {
        return orderMapper.addOrder(orderDTO);
    }

    @Override
    public Integer withdraw(Integer orderId) {
        OrderDTO orderDTO = orderMapper.getOrderById(orderId);
        orderDTO.setOrderStatus("withdrawal");
        return orderMapper.updateOrder(orderDTO);
    }

    @Override
    public List<OrderDTO> getOrderByCustomer(Integer orderCustomerId) {
        return orderMapper.getOrderByCustomerId(orderCustomerId);
    }


}
