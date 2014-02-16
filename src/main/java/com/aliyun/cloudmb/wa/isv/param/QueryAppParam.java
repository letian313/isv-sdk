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
public class QueryAppParam extends JwxParam {

    private static final long serialVersionUID = -1583726667561354920L;

    /**
     * jwx　oauth token
     */
    private String            access_token;

    /**
     * isv对应的app id
     */
    private String            isv_app_id;

    /**
     * 聚无限平台的app id
     */
    private int               app_id;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getIsv_app_id() {
        return isv_app_id;
    }

    public void setIsv_app_id(String isv_app_id) {
        this.isv_app_id = isv_app_id;
    }

    public int getApp_id() {
        return app_id;
    }

    public void setApp_id(int app_id) {
        this.app_id = app_id;
    }

}
