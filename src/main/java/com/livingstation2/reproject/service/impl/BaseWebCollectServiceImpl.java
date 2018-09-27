package com.livingstation2.reproject.service.impl;


import com.livingstation2.reproject.entity.TUsercollectEntity;
import com.livingstation2.reproject.repository.UserCollectWebRepository;
import com.livingstation2.reproject.service.BaseWebCollectSerivce;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName BaseWebCollectServiceImpl
 * @Description TODO
 * @Author XLZ
 * @Date 2018/8/5 20:12
 * @Version :
 **/

@Service
public class BaseWebCollectServiceImpl implements BaseWebCollectSerivce {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserCollectWebRepository userCollectWebRepository;

    @Override
    public List<TUsercollectEntity> getUserCollection(String user) {
        return userCollectWebRepository.findAllByUser(user);
    }

    @Override
    public List<TUsercollectEntity> getUserCollectionByUserAndType(TUsercollectEntity userCollect) {

        return userCollectWebRepository.findAll(Example.of(userCollect));
    }

    @Override
    public TUsercollectEntity getWebByUserAndWebSiteName(TUsercollectEntity userCollect) {
        try {
            return userCollectWebRepository.findOne(Example.of(userCollect)).get();
        }catch (Exception e){
            return null;
        }

    }

    @Override
    @Transactional
    @Modifying
    public int addOrUpdateUserCollect(TUsercollectEntity userCollect) {
        TUsercollectEntity tUsercollectEntity = new TUsercollectEntity();

        tUsercollectEntity = userCollectWebRepository.save(userCollect);

        if(tUsercollectEntity==null||tUsercollectEntity.getId()==null) {
            return 0;
        }else {
            return 1;
        }

    }

    @Override
    public int deleteUser(TUsercollectEntity userCollect) {
        TUsercollectEntity tUsercollectEntity = new TUsercollectEntity();
        logger.info("into delete method , the delete model is "+userCollect.toString());
        try {
            tUsercollectEntity = userCollectWebRepository.findOne(Example.of(userCollect)).get();
            logger.info(tUsercollectEntity.toString());
        }catch (Exception e){
            logger.info("no such data");
            return 1;

        }

        userCollectWebRepository.delete(tUsercollectEntity);
        return 0;
    }
}
