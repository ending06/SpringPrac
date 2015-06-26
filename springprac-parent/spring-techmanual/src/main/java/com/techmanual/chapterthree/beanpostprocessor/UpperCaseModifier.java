package com.techmanual.chapterthree.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/26<p>
// -------------------------------------------------------

public class UpperCaseModifier implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        List<Field> fieldList = Arrays.asList(bean.getClass().getDeclaredFields());
        for(Field fieldTemp:fieldList){
            if(fieldTemp.getType().equals(String.class)){
                fieldTemp.setAccessible(true);
                try{
                    String original = (String)fieldTemp.get(bean);
                    fieldTemp.set(bean,original.toUpperCase());
                }catch (Exception e){

                }
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
