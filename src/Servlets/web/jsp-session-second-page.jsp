<%-- 
    Document   : jsp-session-second-page
    Created on : Apr 4, 2023, 10:08:05 PM
    Author     : kyto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP session second page</title>
    </head>
    <body>
        <%
            
        String name = (String)session.getAttribute("user");
        out.println("Hello " + name);
        
        %>
        
    </body>
</html>
