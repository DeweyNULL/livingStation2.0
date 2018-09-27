package com.livingstation2.reproject.service;


import com.livingstation2.reproject.entity.TAccountEntity;

public interface AccountService {

    //根据账号名获取账号的功能
    public TAccountEntity getAccountByAccountName(String accountName);

    //根据账号的邮箱获取账号的功能
    public TAccountEntity getAccountByUserMailAddress(String userEmailAddress);

    //注册功能以及更新功能（此处有主见userAccountName必填）
    public int addOrUpdateAccount(TAccountEntity account);


}
