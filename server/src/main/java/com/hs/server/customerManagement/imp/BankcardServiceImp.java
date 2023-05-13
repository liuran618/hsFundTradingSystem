package com.hs.server.customerManagement.imp;

import com.hs.api.cunstomerManagement.BankcardService;
import com.hs.api.cunstomerManagement.dto.BankcardDTO;
import com.hs.server.customerManagement.dao.BankcardMapper;
import com.hundsun.jrescloud.rpc.annotation.CloudComponent;
import org.springframework.beans.factory.annotation.Autowired;

@CloudComponent
public class BankcardServiceImp implements BankcardService {
    @Autowired
    BankcardMapper bankcardMapper;
    @Override
    public Integer addBankcard(BankcardDTO bankcardDTO) {
        return bankcardMapper.addBankcard(bankcardDTO);
    }

    @Override
    public BankcardDTO getBankcard(String num) {
        return bankcardMapper.getBankcard(num);
    }

    @Override
    public Integer deleteBankcard(String num) {
        return bankcardMapper.deleteBankcard(num);
    }
}
