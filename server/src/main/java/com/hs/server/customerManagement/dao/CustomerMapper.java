package com.hs.server.customerManagement.dao;

import com.hs.api.cunstomerManagement.dto.CustomerDTO;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CustomerMapper {
    @Insert("INSERT INTO customer(customer_id, customer_name, "
            + "customer_certificatetype, customer_certificateid, "
            + "customer_num, customer_accounttype, "
            + "customer_bankcardnum, customer_password, customer_risklevel) "
            + "VALUES (#{customer.customerId}, #{customer.customerName}, "
            + "#{customer.customerCertificateType}, #{customer.customerCertificateId}, "
            + "#{customer.customerNum}, #{customer.customerAccountType}, "
            + "#{customer.customerBankcardNum}, #{customer.customerPassword}, #{customer.customerRiskLevel})")
    Integer addCustomer(@Param("customer")CustomerDTO customerDTO);

    @Select("SELECT customer_id AS customerId, customer_name AS customerName, "
            + "customer_certificatetype AS customerCertificateType, "
            + "customer_certificateid AS customerCertificateId, "
            + "customer_num AS customerNum, "
            + "customer_accounttype AS customerAccountType, "
            + "customer_bankcardnum AS customerBankcardNum, "
            + "customer_password AS customerPassword, "
            + "customer_risklevel AS customerRiskLevel "
            + "FROM Customer WHERE customer_id=#{id}")
    CustomerDTO getCustomer(Integer id);
    @Update("UPDATE Customer SET customer_name=#{customer.customerName}, "
            + "customer_certificatetype=#{customer.customerCertificateType}, "
            + "customer_certificateid=#{customer.customerCertificateId}, "
            + "customer_num=#{customer.customerNum}, "
            + "customer_accounttype=#{customer.customerAccountType}, "
            + "customer_bankcardnum=#{customer.customerBankcardNum}, "
            + "customer_password=#{customer.customerPassword}, "
            + "customer_risklevel=#{customer.customerRiskLevel} "
            + "WHERE customer_id=#{customer.customerId}")
    Integer updateCustomer(@Param("customer")CustomerDTO customerDTO);
}
