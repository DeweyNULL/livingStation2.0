package com.livingstation2.reproject.service;




import com.livingstation2.reproject.entity.TUsercollectEntity;

import java.util.List;

public interface BaseWebCollectSerivce {

    public List<TUsercollectEntity> getUserCollection(String user);

    public List<TUsercollectEntity> getUserCollectionByUserAndType(TUsercollectEntity userCollect);

    public TUsercollectEntity getWebByUserAndWebSiteName(TUsercollectEntity userCollect);

    public int addOrUpdateUserCollect(TUsercollectEntity userCollect);

    public int deleteUser(TUsercollectEntity userCollect);



}
