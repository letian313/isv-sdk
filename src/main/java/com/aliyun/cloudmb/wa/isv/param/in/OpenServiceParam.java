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
 * 类OpenServiceParam.java的实现描述： 开通服务参数
 * 
 * @author fanyong 2014-1-23 下午5:05:53
 */
public class OpenServiceParam extends JwxParam {

    private static final long serialVersionUID = -6220911012956715893L;

    /**
     * 请求action
     */
    private String            method           = "openService";

    /**
     * ISV用户ID
     */
    @NotNull
    private String            isv_uid;

    /**
     * 产品ＩＤ
     */
    @NotNull
    private String            component_id;

    /**
     * 授权码
     */
    @NotNull
    private String            code;

    public String getComponent_id() {
        return component_id;
    }

    public void setComponent_id(String component_id) {
        this.component_id = component_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMethod() {
        return method;
    }

    public String getIsv_uid() {
        return isv_uid;
    }

    public void setIsv_uid(String isv_uid) {
        this.isv_uid = isv_uid;
    }

}
