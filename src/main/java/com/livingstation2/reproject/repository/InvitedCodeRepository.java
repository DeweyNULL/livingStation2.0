package com.livingstation2.reproject.repository;

import com.livingstation2.reproject.entity.TInvitedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @auther : Dewey
 * @date : 2018/9/27 15 18
 * @description :
 */
public interface InvitedCodeRepository extends JpaRepository<TInvitedEntity,String> {


}
