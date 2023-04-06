<%-- 
    Document   : formjsp
    Created on : Mar 22, 2023, 9:16:31 PM
    Author     : kyto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>jsp form processing</title>
    </head>
    <body>
        
        <% 
//        String fn = request.getParameter("fname");
//        String ln = request.getParameter("lname");
//        
//        out.println("Hello " + fn + " " + ln);
//        

        
        int x = Integer.parseInt(request.getParameter("first_number"));
        int y = Integer.parseInt(request.getParameter("second_number"));
        int sum = x + y;
        
        out.println("the sum is: " + sum);
        %>
    </body>
</html>
