/*
 * Copyright 2014 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyun.cloudmb.wa.isv.model;

import java.io.Serializable;

/**
 * 类JwxUserInfo.java的实现描述：TODO 类实现描述
 * 
 * @author fanyong 2014-2-14 下午2:18:49
 */
public class JwxAppInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 聚无限用户ID
     */
    private int               jwxUid;

    /**
     * 邮箱
     */
    private String            email;

    /**
     * 昵称
     */
    private String            nickName;

    /**
     * 省份
     */
    private String            province;

    /**
     * 城市
     */
    private String            city;

    /**
     * 公司地址
     */
    private String            companyAddress;

    public int getJwxUid() {
        return jwxUid;
    }

    public void setJwxUid(int jwxUid) {
        this.jwxUid = jwxUid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

}
