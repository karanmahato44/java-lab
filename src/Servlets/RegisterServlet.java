/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kyto
 */
public class RegisterServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        String name = req.getParameter("name");
        String address = req.getParameter("address");
         
        
        writer.println("<html><head><title>read form data - get</title></head>");
        writer.println("<body><h2>Name is: " + name + "</h2>");
        writer.println("<h2>Address is: " + address + "</h2></body></html>");

    }
}
