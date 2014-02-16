/*
 * Copyright 2014 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyun.cloudmb.wa.isv.result;

import java.io.Serializable;

/**
 * 类JwxUserInfo.java的实现描述：TODO 类实现描述
 * 
 * @author fanyong 2014-2-14 下午2:18:49
 */
public class JwxAppInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * appId
     */
    private int               appId;

    /**
     * appKey
     */
    private String            appKey;

    /**
     * appSecret
     */
    private String            appSecret;

    /**
     * app名称
     */
    private String            appName;

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
