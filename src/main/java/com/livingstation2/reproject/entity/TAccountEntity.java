package com.livingstation2.reproject.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @auther : Dewey
 * @date : 2018/9/27 14 57
 * @description :
 */
@Entity(name = "t_account")
public class TAccountEntity {

    @Id
    private String accountName;


    private String password;

    private String userEmailAddress;

    private Integer accountStatus;


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getUserEmailAddress() {
        return userEmailAddress;
    }

    public void setUserEmailAddress(String userEmailAddress) {
        this.userEmailAddress = userEmailAddress;
    }

    public Integer getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TAccountEntity that = (TAccountEntity) o;
        return Objects.equals(accountName, that.accountName) &&
                Objects.equals(password, that.password) &&
                Objects.equals(userEmailAddress, that.userEmailAddress) &&
                Objects.equals(accountStatus, that.accountStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, password, userEmailAddress, accountStatus);
    }
}
