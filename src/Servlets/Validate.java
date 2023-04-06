/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kyto
 */
public class Validate extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter writer = res.getWriter();
        RequestDispatcher rd;
        String n = req.getParameter("name");
        String p = req.getParameter("pass");
        
        if(p.equals("password123")) {
            rd = req.getRequestDispatcher("Welcome");
            rd.forward(req, res);
        }
        else {
            writer.println("wrong password, try again");
            rd = req.getRequestDispatcher("req.html");
            rd.include(req, res);
        }   
        writer.close();
    }
}