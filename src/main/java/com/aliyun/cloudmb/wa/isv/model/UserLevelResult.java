/*
 * Copyright 2014 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyun.cloudmb.wa.isv.model;

/**
 * 类UserLevelResult.java的实现描述：TODO 类实现描述
 * 
 * @author fanyong 2014-2-16 下午10:14:04
 */
public class UserLevelResult {

    /**
     * 聚无限用户ＩＤ
     */
    private int jwxUid;

    /**
     * 用户等级
     */
    private int userLevel;

    public int getJwxUid() {
        return jwxUid;
    }

    public void setJwxUid(int jwxUid) {
        this.jwxUid = jwxUid;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

}
