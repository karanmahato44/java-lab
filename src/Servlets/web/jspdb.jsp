<%-- 
    Document   : jspdb
    Created on : Mar 22, 2023, 9:58:46 PM
    Author     : kyto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>jsp db access</title>
    </head>
    <body>
        <%@page import="java.sql.*" %>
                
        <% 
            
            
        String isbn = request.getParameter("isbn");
        String title = request.getParameter("title");
        String auth = request.getParameter("author");
        int price = Integer.parseInt(request.getParameter("price"));
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tmp", "root", "dQw4w9WgXcQ");
        Statement stmt = con.createStatement();
        String sql = "INSERT INTO books(isbn, title, author, price) VALUES('"+isbn+"', '"+title+"', '"+auth+"', '"+price+"')";
        stmt.executeUpdate(sql);
        out.println("added to db sucessfully");
        
        
        
        %>
    </body>
</html>
