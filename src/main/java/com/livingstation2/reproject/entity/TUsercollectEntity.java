package com.livingstation2.reproject.entity;

import javax.persistence.*;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * @auther : Dewey
 * @date : 2018/9/27 14 57
 * @description :
 */
@Entity (name = "t_usercollect" )

public class TUsercollectEntity {

    @Id @GeneratedValue(strategy = IDENTITY )
    private Long id;


    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    private String userCollectWebsite;
    private String userCollectWebsiteType;
    private String userMakeName;
    private String webApi;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserCollectWebsite() {
        return userCollectWebsite;
    }

    public void setUserCollectWebsite(String userCollectWebsite) {
        this.userCollectWebsite = userCollectWebsite;
    }

    public String getUserCollectWebsiteType() {
        return userCollectWebsiteType;
    }

    public void setUserCollectWebsiteType(String userCollectWebsiteType) {
        this.userCollectWebsiteType = userCollectWebsiteType;
    }

    public String getUserMakeName() {
        return userMakeName;
    }

    public void setUserMakeName(String userMakeName) {
        this.userMakeName = userMakeName;
    }

    public String getWebApi() {
        return webApi;
    }

    public void setWebApi(String webApi) {
        this.webApi = webApi;
    }

    @Override
    public String toString() {
        return "TUsercollectEntity{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", userCollectWebsite='" + userCollectWebsite + '\'' +
                ", userCollectWebsiteType='" + userCollectWebsiteType + '\'' +
                ", userMakeName='" + userMakeName + '\'' +
                ", webApi='" + webApi + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TUsercollectEntity that = (TUsercollectEntity) o;
        return id == that.id &&
                Objects.equals(userCollectWebsite, that.userCollectWebsite) &&
                Objects.equals(userCollectWebsiteType, that.userCollectWebsiteType) &&
                Objects.equals(userMakeName, that.userMakeName) &&
                Objects.equals(webApi, that.webApi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userCollectWebsite, userCollectWebsiteType, userMakeName, webApi);
    }
}
