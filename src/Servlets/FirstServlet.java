package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;

public class FirstServlet implements Servlet {
    
    ServletConfig config;
    
    
    @Override
    public void init(ServletConfig config) {
        this.config = config;
        System.out.println("creating obj...");
    }
    
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        System.out.println("servicing...");
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.println("<h2>hello from servlets</h2>");
        writer.println("<p> today is " + new Date().toString() + "</p>");
        writer.close();
    }
    
   
    @Override
    public void destroy() {
        System.out.println("destroying servlet obj...");
    }
    
    
    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }
    
    
    @Override
    public String getServletInfo() {
        return "this is a servlet demo";
    }
    
}
