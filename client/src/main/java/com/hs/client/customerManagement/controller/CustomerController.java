package com.hs.client.customerManagement.controller;

import com.hs.api.cunstomerManagement.BankcardService;
import com.hs.api.cunstomerManagement.CustomerService;
import com.hs.api.cunstomerManagement.dto.BankcardDTO;
import com.hs.api.cunstomerManagement.dto.CustomerDTO;
import com.hs.common.Result;
import com.hundsun.jrescloud.rpc.annotation.CloudReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @CloudReference
    CustomerService customerService;
    @CloudReference
    BankcardService bankcardService;

    @RequestMapping("/addCustomer")
    public Result<?> addCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.addCustomer(customerDTO);
        return Result.success();
    }

    @RequestMapping("/getCustomer/{id}")
    public Result<?> getCustomer(@PathVariable("id") Integer id){
        CustomerDTO customerDTO = customerService.getCustomer(id);
        return Result.success(customerDTO);
    }
    @RequestMapping("/updateCustomer")
    public Result<?> updateCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.updateCustomer(customerDTO);
        return Result.success();
    }

    @RequestMapping("/addBankcard")
    public Result<?> addBankcard(@RequestBody BankcardDTO bankcardDTO){
        bankcardService.addBankcard(bankcardDTO);
        return Result.success();
    }

    @RequestMapping("/deleteBankcard/{num}")
    public Result<?> deleteBankcard(@PathVariable("num") String num){
        bankcardService.deleteBankcard(num);
        return Result.success();
    }

}
