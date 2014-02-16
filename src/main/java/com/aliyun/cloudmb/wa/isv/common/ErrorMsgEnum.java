/*
 * Copyright 2014 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyun.cloudmb.wa.isv.common;

/**
 * 类ErrorMsgEnum.java的实现描述：
 * 
 * <pre>
 * 错误编码为六位数字,首位代表业务线类型１－公共模块 2－用户相关　3－app应用相关　4－活动相关;<br/>
 * 次位为1,2或者3,4,其中1代表参数类错误,2代业务错误,3代表服务错误,4代表系统级别错误;<br/>
 * 第三位代表错误等级,1代表Error,2代表Warning;<br/>
 * 末尾三位代表错误编号,从001到999
 * </pre>
 * 
 * @author fanyong.kfy 2014-2-16 下午9:48:08
 */
public enum ErrorMsgEnum {

    PARAMETER_IS_NULL(11001, "参数缺失"),
    PARAMETER_SIGN_ERROR(11002, "参数sign错误");

    private int    errCode;

    private String errMsg;

    private ErrorMsgEnum(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public int getErrCode() {
        return errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

}
