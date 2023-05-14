package com.hs.server.trade.dao;

import com.hs.api.trade.dto.OrderDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper {

    @Insert("INSERT INTO Orders(Order_Id, Order_Type, Order_CustomerId, Order_ProductId, "
            + "Order_OperatorId, Order_PurchaseAmount, Order_ExpectedShare, "
            + "Order_BankcardNum, Order_RedeemShare, Order_ExpectedIncome, "
            + "Order_Time, Order_Status) "
            + "VALUES (#{order.orderId},#{order.orderType},#{order.orderCustomerId},"
            + "#{order.orderProductId},#{order.orderOperatorId},"
            + "#{order.orderPurchaseAmount},#{order.orderExpectedShare},"
            + "#{order.orderBankcardNum},#{order.orderRedeemShare},"
            + "#{order.orderExpectedIncome},#{order.orderTime},#{order.orderStatus})")
    Integer addOrder(@Param("order")OrderDTO orderDTO);

    @Select("SELECT Order_Id AS orderId, Order_Type AS orderType, "
            + "Order_CustomerId AS orderCustomerId, Order_ProductId AS orderProductId, "
            + "Order_OperatorId AS orderOperatorId, Order_PurchaseAmount AS orderPurchaseAmount, "
            + "Order_ExpectedShare AS orderExpectedShare, Order_BankcardNum AS orderBankcardNum, "
            + "Order_RedeemShare AS orderRedeemShare, Order_ExpectedIncome AS orderExpectedIncome, "
            + "Order_Time AS orderTime, Order_Status AS orderStatus "
            + "FROM `Orders` WHERE Order_Id = #{id}")
    OrderDTO getOrderById(@Param("id") Integer id);

    @Select("SELECT Order_Id AS orderId, Order_Type AS orderType, "
            + "Order_CustomerId AS orderCustomerId, Order_ProductId AS orderProductId, "
            + "Order_OperatorId AS orderOperatorId, Order_PurchaseAmount AS orderPurchaseAmount, "
            + "Order_ExpectedShare AS orderExpectedShare, Order_BankcardNum AS orderBankcardNum, "
            + "Order_RedeemShare AS orderRedeemShare, Order_ExpectedIncome AS orderExpectedIncome, "
            + "Order_Time AS orderTime, Order_Status AS orderStatus "
            + "FROM `Orders` WHERE Order_CustomerId = #{orderCustomerId}")
    List<OrderDTO> getOrderByCustomerId(@Param("orderCustomerId") Integer orderCustomerId);

    @Update("UPDATE Orders SET " +
            "Order_Type = #{order.orderType}," +
            "Order_CustomerId = #{order.orderCustomerId}," +
            "Order_ProductId = #{order.orderProductId}," +
            "Order_OperatorId = #{order.orderOperatorId}," +
            "Order_PurchaseAmount = #{order.orderPurchaseAmount}," +
            "Order_ExpectedShare = #{order.orderExpectedShare}," +
            "Order_BankcardNum = #{order.orderBankcardNum}," +
            "Order_RedeemShare = #{order.orderRedeemShare}," +
            "Order_ExpectedIncome = #{order.orderExpectedIncome}," +
            "Order_Time = #{order.orderTime}," +
            "Order_Status = #{order.orderStatus}" +
            "WHERE Order_Id = #{order.orderId}")
    Integer updateOrder(@Param("order") OrderDTO orderDTO);
}
