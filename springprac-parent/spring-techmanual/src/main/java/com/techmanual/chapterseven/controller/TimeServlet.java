package com.techmanual.chapterseven.controller;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/7/13<p>
// -------------------------------------------------------

public class TimeServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(this
                .getServletContext());

        PrintWriter out = res.getWriter();
        out.println(ctx.getBean("dateBean"));
        out.flush();
        out.close();
    }
}
