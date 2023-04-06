<%-- 
    Document   : firstjsp
    Created on : Mar 22, 2023, 5:01:44 PM
    Author     : kyto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Print loop</title>
    </head>
    <body>
        
        <%= "print 10 times" %>
        <hr>
        <% 
            for(int i = 0; i < 10; i++)
                out.println("nice<br>");
                
        %>
    </body>
</html>
