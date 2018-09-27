package com.livingstation2.reproject.service.impl;


import com.livingstation2.reproject.entity.TUsercollectEntity;
import com.livingstation2.reproject.repository.UserCollectWebRepository;
import com.livingstation2.reproject.service.UserCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName UserCollecctionServiceImpl
 * @Description TODO
 * @Author XLZ
 * @Date 2018/8/4 11:04
 * @Version :
 **/

public class UserCollecctionServiceImpl implements UserCollectionService {

    @Autowired
    UserCollectWebRepository userCollectWebRepository;

    @Override
    public List<TUsercollectEntity> getUserCollection(String user) {

        return  userCollectWebRepository.findAllByUser(user);
    }

    @Override
    @Transactional
    @Modifying
    public int addOrUpdateUserCollectWeb(TUsercollectEntity userCollect) {
        TUsercollectEntity tUsercollectEntity = new TUsercollectEntity();

        tUsercollectEntity = userCollectWebRepository.save(userCollect);
        if(tUsercollectEntity == null || tUsercollectEntity.getId()==null){
            return 0;
        }else {
            return 1;
        }

    }

    @Override
    public int deleteUserCollectWeb(TUsercollectEntity userCollect) {


        userCollectWebRepository.delete(userCollect);

        return 0;
    }
}
