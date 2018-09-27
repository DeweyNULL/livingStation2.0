package com.livingstation2.reproject.service.impl;


import com.livingstation2.reproject.entity.TAccountEntity;
import com.livingstation2.reproject.repository.AccoutRepository;
import com.livingstation2.reproject.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @ClassName AccountServiceImpl
 * @Description TODO
 * @Author XLZ
 * @Date 2018/8/4 10:08
 * @Version :
 **/

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccoutRepository accoutRepository;

    @Override
    @Transactional
    public TAccountEntity getAccountByAccountName(String accountName) {

        try {
            return  accoutRepository.findById(accountName).get();
        }catch (Exception e){
            return null;
        }

    }

    @Override
    @Transactional
    public TAccountEntity getAccountByUserMailAddress(String userEmailAddress) {
        return accoutRepository.findByUserEmailAddress(userEmailAddress);
    }

    @Override
    @Transactional
    @Modifying
    public int addOrUpdateAccount(TAccountEntity account) {

        TAccountEntity tAccountEntity = new TAccountEntity();

        tAccountEntity =  accoutRepository.save(account);

        if(tAccountEntity==null || tAccountEntity.getAccountName()==null){
            return 0;
        }else {
            return 1;
        }

    }

}
