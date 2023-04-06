package com.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ThirdServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.println("<h2>responding to get requests</h2>");
    }
   
}
