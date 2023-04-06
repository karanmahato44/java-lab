package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.http.*;

public class DBaccess extends HttpServlet {
    Connection con = null;

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter writer = res.getWriter();
        res.setContentType("text/html");
        String url = "jdbc:mysql://localhost:3306/tmp"; 
        try {
            String n = req.getParameter("fname");
            String l = req.getParameter("lname");
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "dQw4w9WgXcQ");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO users (fname, lname) VALUES ('" + n + "', '" + l + "')";
//            String sql = "SELECT * FROM users";
//            String sql = "UPDATE users SET fname='kyto' WHERE fname='karan'";
//            String sql = "DELETE FROM users WHERE fname='joe'";
          stmt.executeUpdate(sql);  
          writer.println("inserted into db sucessfully!");
          
//          stmt.executeQuery(sql);  
//           while(rs.next()) {
//               writer.println(rs.getString("fname"));
//           }
            
        } catch(SQLException | ClassNotFoundException e) {
                    writer.println("error" + e);
        }
        
    }
}