package com.hs.server.trade.dao;

import com.hs.api.trade.dto.OrderDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TradeMapper {

    @Insert("INSERT INTO Orders(Order_Type, Order_CustomerId, Order_ProductId, "
            + "Order_OperatorId, Order_PurchaseAmount, Order_ExpectedShare, "
            + "Order_BankcardNum, Order_RedeemShare, Order_ExpectedIncome, "
            + "Order_Time, Order_Status) "
            + "VALUES (#{order.orderType},#{order.orderCustomerId},"
            + "#{order.orderProductId},#{order.orderOperatorId},"
            + "#{order.orderPurchaseAmount},#{order.orderExpectedShare},"
            + "#{order.orderBankcardNum},#{order.orderRedeemShare},"
            + "#{order.orderExpectedIncome},#{order.orderTime},#{order.orderStatus})")
    Integer addOrder(@Param("order")OrderDTO orderDTO);
}
