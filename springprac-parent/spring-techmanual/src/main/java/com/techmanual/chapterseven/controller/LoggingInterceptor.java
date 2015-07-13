package com.techmanual.chapterseven.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/7/13<p>
// -------------------------------------------------------

public class LoggingInterceptor extends HandlerInterceptorAdapter {
    // 在接受处理前执行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info(handler.getClass().getName() + "执行处理前...");
        return true;
    }

    // 处理完请求执行
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        logger.info(handler.getClass().getName() + "处理完毕...");
    }

    // 在view绘制完毕之后执行
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        logger.info("请求处理完毕...");
    }

    // ===========================================private methods==============================//
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
}
