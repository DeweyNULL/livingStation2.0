package com.livingstation2.reproject.repository;

import com.livingstation2.reproject.entity.TUsercollectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @auther : Dewey
 * @date : 2018/9/27 15 33
 * @description :
 */
public interface UserCollectWebRepository extends JpaRepository<TUsercollectEntity,Long> {
    public List<TUsercollectEntity> findAllByUser(String username);
}
