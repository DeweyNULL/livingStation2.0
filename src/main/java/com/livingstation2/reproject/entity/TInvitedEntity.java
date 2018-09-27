package com.livingstation2.reproject.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @auther : Dewey
 * @date : 2018/9/27 14 57
 * @description :
 */
@Entity (name = "t_invited")
public class TInvitedEntity {

    @Id
    private String invitedCode;

    private int isUsed;


    public String getInvitedCode() {
        return invitedCode;
    }

    public void setInvitedCode(String invitedCode) {
        this.invitedCode = invitedCode;
    }

    public int getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(int isUsed) {
        this.isUsed = isUsed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TInvitedEntity that = (TInvitedEntity) o;
        return isUsed == that.isUsed &&
                Objects.equals(invitedCode, that.invitedCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invitedCode, isUsed);
    }
}
