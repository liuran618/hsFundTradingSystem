package com.hs.api.cunstomerManagement;

import com.hs.api.cunstomerManagement.dto.CustomerDTO;
import com.hundsun.jrescloud.rpc.annotation.CloudService;

@CloudService(validation = true)
public interface CustomerService {
    Integer addCustomer(CustomerDTO customerDTO);
    CustomerDTO getCustomer(Integer id);
    Integer updateCustomer(CustomerDTO customerDTO);
}
