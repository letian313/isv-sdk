/*
 * Copyright 2013 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyun.cloudmb.wa.isv.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.TypeUtils;

/**
 * 类APIResult.java的实现描述： API接口返回格式
 * 
 * @author fanyong.kfy 2013-7-19 上午11:57:40
 */
public class APIResult implements Serializable {
    private static final long   serialVersionUID = 1L;
    private static final String ver              = "1.0";
    private boolean             ret;
    private String              errmsg;
    private Integer             errcode;
    private Object              data;

    public APIResult() {
    }

    private APIResult(Object obj) {
        this.ret = true;
        this.data = obj;
    }

    private APIResult(int errcode, String errmsg, Object t) {
        this.ret = false;
        this.errcode = errcode;
        this.errmsg = errmsg;
        this.data = t;
    }

    public static APIResult buildSuccessResult() {
        return new APIResult(null);
    }

    public static APIResult buildSuccessResult(Object obj) {
        return new APIResult(obj);
    }

    public static APIResult buildFailedResult(int errcode, String errmsg, Object obj) {
        return new APIResult(errcode, errmsg, obj);
    }

    public static APIResult buildFailedResult(int errcode, String errmsg) {
        return new APIResult(errcode, errmsg, null);
    }

    public static APIResult buildFailedResult(String errmsg) {
        return new APIResult(-1, errmsg, null);
    }

    public String getVer() {
        return ver;
    }

    public boolean isRet() {
        return ret;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 获取一个的结果（服务端方法只有一个返回结果时调用）
     * 
     * @param clazz 结果类型
     * @return 结果值
     */
    public <E> E getData(Class<E> clazz) {
        if (clazz == null || data == null) {
            return null;
        }
        return TypeUtils.cast(data, clazz, ParserConfig.getGlobalInstance());
    }

    /**
     * 获取多个结果集（服务端方法有多个返回结果时调用）
     * 
     * @param clazz 结果类型
     * @return 结果值
     */
    public <E> List<E> getListData(Class<E> clazz) {
        if (clazz == null || data == null) {
            return Collections.emptyList();
        }
        List<E> list = new ArrayList<E>();
        if (data instanceof List) {
            for (Object o : (List<?>) data) {
                E t = TypeUtils.cast(o, clazz, ParserConfig.getGlobalInstance());
                list.add(t);
            }
        }
        return list;
    }

    public String toJsonString() {

        return JSON.toJSONString(this);
    }
}
