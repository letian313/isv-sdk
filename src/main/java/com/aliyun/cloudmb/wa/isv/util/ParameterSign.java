/*
 * Copyright 2014 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyun.cloudmb.wa.isv.util;

import java.util.Arrays;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.codec.digest.DigestUtils;

import com.aliyun.cloudmb.wa.isv.param.JwxParam;

/**
 * 类ValidationParameter.java的实现描述：
 * 
 * <pre>
 * 根据参数进行排序，然后参考appSecret进行md5加密比对
 * </pre>
 * 
 * @author fanyong 2014-2-16 下午9:25:29
 */
public class ParameterSign {

    public static String getSign(JwxParam param, String appSecret) {
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
            System.err.println("处理JwxParam参数加密处理出错:" + e.getMessage());
        }

        return null;
    }

}
