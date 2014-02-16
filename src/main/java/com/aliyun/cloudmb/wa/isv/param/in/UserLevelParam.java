/*
 * Copyright 2014 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyun.cloudmb.wa.isv.param.in;

import javax.validation.constraints.NotNull;

import com.aliyun.cloudmb.wa.isv.param.JwxParam;

/**
 * 类OpenServiceParam.java的实现描述： 获取用户等级
 * 
 * @author fanyong 2014-1-23 下午5:05:53
 */
public class UserLevelParam extends JwxParam {

    private static final long serialVersionUID = -6220911012956715893L;

    /**
     * 请求action
     */
    private String            method           = "userLevel";

    /**
     * isv用户ＩＤ
     */
    @NotNull
    private String            isv_uids;

    /**
     * 开始时间
     */
    @NotNull
    private String            begin_time;

    /**
     * 结束时间
     */
    @NotNull
    private String            end_time;

    public String getIsv_uids() {
        return isv_uids;
    }

    public void setIsv_uids(String isv_uids) {
        this.isv_uids = isv_uids;
    }

    public String getBegin_time() {
        return begin_time;
    }

    public void setBegin_time(String begin_time) {
        this.begin_time = begin_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getMethod() {
        return method;
    }

}
