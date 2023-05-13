package com.hs.api.cunstomerManagement;

import com.hs.api.cunstomerManagement.dto.BankcardDTO;
import com.hundsun.jrescloud.rpc.annotation.CloudService;

@CloudService(validation = true)
public interface BankcardService {
    Integer addBankcard(BankcardDTO bankcardDTO);
    BankcardDTO getBankcard(String num);
    Integer deleteBankcard(String num);
}
