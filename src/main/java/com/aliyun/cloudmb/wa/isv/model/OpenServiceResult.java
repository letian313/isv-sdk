/*
 * Copyright 2014 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyun.cloudmb.wa.isv.model;

/**
 * 类OpenServiceResult.java的实现描述：TODO 类实现描述
 * 
 * @author fanyong 2014-2-16 下午10:13:51
 */
public class OpenServiceResult {

    /**
     * ISV appid
     */
    private String isvAppId;

    /**
     * isv用户ＩＤ
     */
    private int    isvUid;

    /**
     * appKey
     */
    private String appKey;

    /**
     * appSecret
     */
    private String appSecret;

    public String getIsvAppId() {
        return isvAppId;
    }

    public void setIsvAppId(String isvAppId) {
        this.isvAppId = isvAppId;
    }

    public int getIsvUid() {
        return isvUid;
    }

    public void setIsvUid(int isvUid) {
        this.isvUid = isvUid;
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

}
