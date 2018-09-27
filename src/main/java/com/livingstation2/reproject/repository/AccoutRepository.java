package com.livingstation2.reproject.repository;

import com.livingstation2.reproject.entity.TAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther : Dewey
 * @date : 2018/9/27 15 03
 * @description :
 */
public interface AccoutRepository extends JpaRepository<TAccountEntity , String> {

    public TAccountEntity findByUserEmailAddress(String userEmailAddress);
}
