/*
 * Copyright 2014 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyun.cloudmb.wa.isv.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aliyun.cloudmb.wa.isv.common.APIResult;
import com.aliyun.cloudmb.wa.isv.common.HttpService;
import com.aliyun.cloudmb.wa.isv.param.out.QueryAppParam;
import com.aliyun.cloudmb.wa.isv.param.out.QueryUserParam;
import com.aliyun.cloudmb.wa.isv.result.JwxAppInfo;
import com.aliyun.cloudmb.wa.isv.result.JwxUserInfo;
import com.aliyun.cloudmb.wa.isv.util.ConfigHolder;

/**
 * 类JwxClient.java的实现描述：TODO 类实现描述
 * 
 * @author fanyong 2014-2-16 下午2:45:56
 */
public class JwxClient extends HttpService {

    private static final Logger log = LoggerFactory.getLogger(JwxClient.class);

    public JwxUserInfo fetchUserInfo(QueryUserParam param) {
        APIResult result = invoke(param, ConfigHolder.getUserInfoUrl());
        if (!result.isRet()) {
            log.error("获取用户信息出错:{}", result.toJsonString());
        }

        return result.getData(JwxUserInfo.class);
    }

    public JwxAppInfo fetchUserInfo(QueryAppParam param) {
        APIResult result = invoke(param, ConfigHolder.getUserInfoUrl());
        if (!result.isRet()) {
            log.error("获取应用信息出错:{}", result.toJsonString());
        }

        return result.getData(JwxAppInfo.class);
    }

}
