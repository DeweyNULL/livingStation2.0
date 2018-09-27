package com.livingstation2.reproject.bean;

import com.livingstation2.reproject.entity.TAccountEntity;
import com.livingstation2.reproject.entity.TInvitedEntity;

/**
 * @ClassName RegisterInfo
 * @Description TODO
 * @Author XLZ
 * @Date 2018/8/4 16:49
 * @Version :
 **/

public class RegisterInfo {
    private TInvitedEntity invited;
    private TAccountEntity account;

    public TInvitedEntity getInvited() {
        return invited;
    }

    public void setInvited(TInvitedEntity invited) {
        this.invited = invited;
    }

    public TAccountEntity getAccount() {
        return account;
    }

    public void setAccount(TAccountEntity account) {
        this.account = account;
    }
}
