/*
 * Copyright 2014 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyun.cloudmb.wa.isv.common;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 类BaseHttpClient.java的实现描述：TODO 类实现描述
 * 
 * @author fanyong 2014-2-14 下午1:48:44
 */
public class BaseHttpClient {

    private static Logger            log        = LoggerFactory.getLogger(BaseHttpClient.class);

    private static DefaultHttpClient httpclient = new DefaultHttpClient();

    public static String post(String url, Map<String, String> params) {
        String body = null;
        log.info("create httppost:" + url);
        HttpPost post = postForm(url, params);
        body = invoke(httpclient, post);

        return body;
    }

    public static String get(String url) {
        String body = null;
        log.info("create httppost:" + url);
        HttpGet get = new HttpGet(url);
        body = invoke(httpclient, get);

        return body;
    }

    private static String invoke(DefaultHttpClient httpclient, HttpUriRequest httpost) {
        HttpResponse response = sendRequest(httpclient, httpost);
        String body = paseResponse(response);

        return body;
    }

    private static String paseResponse(HttpResponse response) {
        log.info("get response from http server..");
        HttpEntity entity = response.getEntity();
        log.info("response status: " + response.getStatusLine());
        String charset = EntityUtils.getContentCharSet(entity);
        log.info(charset);
        String body = null;
        try {
            body = EntityUtils.toString(entity);
            log.info(body);
        } catch (ParseException e) {
            log.error("解析http响应出错", e);
        } catch (IOException e) {
            log.error("解析http响应出错", e);
        }

        return body;
    }

    private static HttpResponse sendRequest(DefaultHttpClient httpclient, HttpUriRequest httpost) {
        log.info("execute post...");
        HttpResponse response = null;
        try {
            response = httpclient.execute(httpost);
        } catch (ClientProtocolException e) {
            log.error("发送http请求出错:{}", httpost.getURI(), e);
        } catch (IOException e) {
            log.error("发送http请求出错:{}", httpost.getURI(), e);
        }
        return response;
    }

    private static HttpPost postForm(String url, Map<String, String> params) {

        HttpPost httpost = new HttpPost(url);
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();

        Set<String> keySet = params.keySet();
        for (String key : keySet) {
            nvps.add(new BasicNameValuePair(key, params.get(key)));
        }

        try {
            log.info("set utf-8 form entity to httppost");
            httpost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
        } catch (UnsupportedEncodingException e) {
            log.error("设置http请求header出错:{}", httpost.getURI(), e);
        }

        return httpost;
    }

}
