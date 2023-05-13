package com.hs.server.customerManagement.imp;

import com.hs.api.cunstomerManagement.CustomerService;
import com.hs.api.cunstomerManagement.dto.CustomerDTO;
import com.hs.server.customerManagement.dao.CustomerMapper;
import com.hundsun.jrescloud.rpc.annotation.CloudComponent;
import org.springframework.beans.factory.annotation.Autowired;

@CloudComponent
public class CustomerServiceImp implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;
    @Override
    public Integer addCustomer(CustomerDTO customerDTO) {
        return customerMapper.addCustomer(customerDTO);
    }

    @Override
    public Integer updateCustomer(CustomerDTO customerDTO) {
        return customerMapper.updateCustomer(customerDTO);
    }

    @Override
    public CustomerDTO getCustomer(Integer id) {
        return customerMapper.getCustomer(id);
    }
}
