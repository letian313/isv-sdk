/*
 * Copyright 2014 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyun.cloudmb.wa.isv.param;

/**
 * 类QueryAppParam.java的实现描述：TODO 类实现描述
 * 
 * @author fanyong 2014-2-14 下午2:28:31
 */
public class QueryAccessTokenParam extends JwxParam {

    private static final long serialVersionUID = -1583726667561354920L;

    /**
     * jwx　oauth code
     */
    private String            code;

    /**
     * 对应的isv的appkey
     */
    private String            client_id;

    /**
     * 对应的isv的appSecret
     */
    private String            client_secret;

    /**
     * 授权方式
     */
    private String            grant_type       = "authorization_code";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getGrant_type() {
        return grant_type;
    }

}
