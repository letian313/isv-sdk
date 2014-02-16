/*
 * Copyright 2014 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyun.cloudmb.wa.isv.util;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * 类ConfigHolder.java的实现描述：TODO 类实现描述
 * 
 * @author fanyong 2014-2-14 下午2:41:50
 */
public class ConfigHolder {

    private static Configuration config = null;

    static {
        try {
            config = new PropertiesConfiguration("jwx-url.properties");
        } catch (ConfigurationException e) {
            System.err.println(e);
        }
    }

    public static String getUserInfoUrl() {
        return config.getString("jwx.userinfo.url");
    }

    public static String getAppInfoUrl() {
        return config.getString("jwx.appinfo.url");
    }

}
