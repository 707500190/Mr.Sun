package com.macro.mall.tiny.common.utils;

import org.apache.naming.factory.BeanFactory;

/**
 * 通过beanId获取bean
 */
public final class GetBeanUtil extends BeanFactory {

    BeanFactory beanFactory;

    public  GetBeanUtil(BeanFactory beanFactory){
        this.beanFactory = beanFactory;

    }

    public static  Object getBean(){


        return  "";
    }


}
