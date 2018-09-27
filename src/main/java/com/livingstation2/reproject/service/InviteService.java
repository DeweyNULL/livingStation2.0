package com.livingstation2.reproject.service;



import com.livingstation2.reproject.entity.TInvitedEntity;

import java.util.List;

public interface InviteService {

    public List<TInvitedEntity> getInvitationCode();

    public TInvitedEntity getInvitedCodeStatus(String invitedCode);

    public int updateStatus(TInvitedEntity invitedCode);


}
