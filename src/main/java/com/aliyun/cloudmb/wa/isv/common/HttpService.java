/*
 * Copyright 2014 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyun.cloudmb.wa.isv.common;

import java.util.Arrays;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.aliyun.cloudmb.wa.isv.param.JwxParam;

/**
 * 类BaseClient.java的实现描述： isv 请求接口处理基类
 * 
 * @author fanyong 2014-1-24 下午2:56:40
 */
public class HttpService {

    private static final Logger log = LoggerFactory.getLogger(HttpService.class);

    /**
     * 调用服务API接口,传递参数对象,得到ApiResponse对象
     * 
     * @param obj
     * @param url
     * @return
     */
    protected APIResult invoke(Object obj, String url) {
        return invoke(obj, null, url);
    }

    /**
     * 调用服务API接口,传递参数对象以及额外的参数,得到ApiResponse对象
     * 
     * @param obj
     * @param parameterMap
     * @param url
     * @return
     */
    protected APIResult invoke(Object obj, Map<String, String> parameterMap, String url) {
        try {
            @SuppressWarnings("unchecked")
            Map<String, String> map = BeanUtils.describe(obj);
            if (parameterMap == null) {
                parameterMap = map;
            } else if (map != null) {
                parameterMap.putAll(map);
            }
            return invoke(parameterMap, url);
        } catch (Exception e) {
            log.error("URL{} 接口请求出错", url, e);
        }

        return null;
    }

    /**
     * 调用服务API接口,传递参数对象,得到APIResult对象
     * 
     * @param parameterMap
     * @param url
     * @return
     */
    protected APIResult invoke(Map<String, String> parameterMap, String url) {
        try {
            String result = BaseHttpClient.post(url, parameterMap);
            APIResult apiResult = JSON.parseObject(result, APIResult.class);
            return apiResult;
        } catch (Exception e) {
            log.error("URL{}接口请求出错", url, e);
        }

        return null;
    }

    public String getSign(JwxParam param, String appSecret) {
        String sign = null;
        try {
            Map<String, String> propertyMap = BeanUtils.describe(param);
            //过滤掉不需要加密的参数
            propertyMap.remove("sign");
            propertyMap.remove("class");
            // 对参数名进行字典排序
            String[] keyArray = propertyMap.keySet().toArray(new String[0]);
            Arrays.sort(keyArray);
            StringBuilder sb = new StringBuilder();
            int index = 0;
            for (String key : keyArray) {
                index++;
                Object val = propertyMap.get(key);
                if (val == null) {
                    continue;
                }
                sb.append(key).append("=").append(val);
                if (index != keyArray.length) {
                    sb.append("＆");
                }
            }
            sb.append(appSecret);
            sign = DigestUtils.md5Hex(sb.toString());

            return sign;
        } catch (Exception e) {
            log.error("处理JwxParam参数加密处理出错", e);
        }

        return null;
    }

}
