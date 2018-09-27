package com.livingstation2.reproject.service.impl;


import com.livingstation2.reproject.entity.TInvitedEntity;
import com.livingstation2.reproject.repository.InvitedCodeRepository;
import com.livingstation2.reproject.service.InviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName InvitationServiceImpl
 * @Description TODO
 * @Author XLZ
 * @Date 2018/8/4 10:19
 * @Version :
 **/

@Service
public class InvitationServiceImpl implements InviteService {

    @Autowired
    InvitedCodeRepository invitedCodeRepository;

    @Override
    public List<TInvitedEntity> getInvitationCode() {

        return  invitedCodeRepository.findAll();
    }

    @Override
    public TInvitedEntity getInvitedCodeStatus(String invitedCode) {

        try {
            return invitedCodeRepository.findById(invitedCode).get();
        }catch (Exception e){
            return null;
        }

    }

    @Override
    @Transactional
    @Modifying
    public int updateStatus(TInvitedEntity invitedCode) {
        TInvitedEntity tInvitedEntity = new TInvitedEntity();

        tInvitedEntity =  invitedCodeRepository.save(invitedCode);

        if(tInvitedEntity==null || tInvitedEntity.getInvitedCode()==null){
            return 0;
        }else {
            return 1;
        }
    }
}
