/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kyto
 */
public class ReadParams extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter writer = res.getWriter();
        res.setContentType("text/html");
        Enumeration names = req.getParameterNames();
     
        
        writer.println("<h2>Parameter Names and values are: </h2>");
        
        while(names.hasMoreElements()) {
            String stringName = (String)names.nextElement();
            writer.println("<h3>" + stringName + "</h3>");
        
            String[] values = req.getParameterValues(stringName);

            for(int i = 0; i < values.length; i++) {
                writer.println(values[i]);
            }
        
        }
        
        
        
       
        

    }
}
