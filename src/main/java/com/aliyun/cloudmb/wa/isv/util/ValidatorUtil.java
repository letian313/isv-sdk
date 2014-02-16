/*
 * Copyright 2014 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyun.cloudmb.wa.isv.util;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * hibernate validator通用校验器
 * 类ValidateUtil.java的实现描述：TODO 类实现描述 
 * @author fanyong 2014-1-16 上午1:30:34
 */
public class ValidatorUtil {
    private static Validator validator;
    
    static { 
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory(); 
        validator = factory.getValidator(); 
    } 
     
    public static <T> void validator(T t) { 
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t); 
        if(constraintViolations.size() > 0) { 
            StringBuilder validateError = new StringBuilder(); 
            for(ConstraintViolation<T> constraintViolation: constraintViolations) { 
                validateError.append(constraintViolation.getMessage() + ";") ; 
            } 
            throw new IllegalArgumentException(validateError.toString()); 
        } 
    } 
}
