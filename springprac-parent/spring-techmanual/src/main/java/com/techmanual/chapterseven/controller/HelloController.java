package com.techmanual.chapterseven.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/7/1<p>
// -------------------------------------------------------

public class HelloController implements Controller {
    private String viewPage;

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // tomcat运行，测试http://localhost:8080/techmanual/hello.do?user=testUser
        String user = request.getParameter("user");
        return new ModelAndView(viewPage, "user", user);
    }

    public void setViewPage(String viewPage) {
        this.viewPage = viewPage;
    }
}
