package com.livingstation2.reproject.service;




import com.livingstation2.reproject.entity.TUsercollectEntity;

import java.util.List;

public interface UserCollectionService {
    public List<TUsercollectEntity> getUserCollection(String user);

    public int addOrUpdateUserCollectWeb(TUsercollectEntity userCollect);

    public int deleteUserCollectWeb(TUsercollectEntity userCollect);


}
