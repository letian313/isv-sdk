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
 * 类OauthAcsToken.java的实现描述：TODO 类实现描述
 * 
 * @author fanyong 2014-2-14 下午3:14:45
 */
public class OauthAcsToken implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * oauth accesToken
     */
    private String            access_token;

    /**
     * oauthToken类型，支持bear和mac
     */
    private String            token_type;

    /**
     * 过期时间，毫秒数
     */
    private int               expires_in;

    /**
     * 刷新token
     */
    private String            refreshToken;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

}
