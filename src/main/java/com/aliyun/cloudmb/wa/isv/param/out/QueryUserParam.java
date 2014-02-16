/*
 * Copyright 2014 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyun.cloudmb.wa.isv.param.out;

import com.aliyun.cloudmb.wa.isv.param.JwxParam;

/**
 * 类QueryAppParam.java的实现描述：TODO 类实现描述
 * 
 * @author fanyong 2014-2-14 下午2:28:31
 */
public class QueryUserParam extends JwxParam {

    private static final long serialVersionUID = 7675107895613632711L;

    private String            access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}
