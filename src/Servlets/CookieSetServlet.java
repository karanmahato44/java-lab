/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 *
 * @author kyto
 */
public class CookieSetServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter writer = res.getWriter();
        res.setContentType("text/html");
        String name = req.getParameter("username");
        
        writer.println("hello " + name);
        Cookie cookie = new Cookie("name", name);
        cookie.setMaxAge(60*60*24);
        res.addCookie(cookie);
        
        writer.println("<form action='CookieReadServlet' method='POST'>");
        writer.println("<input type='submit' value='go again'>");
        writer.println("</form>");
        writer.close();
    }
        
}
