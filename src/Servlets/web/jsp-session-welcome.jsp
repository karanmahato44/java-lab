<%-- 
    Document   : jsp-session-welcome
    Created on : Apr 4, 2023, 10:03:41 PM
    Author     : kyto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP session welcome</title>
    </head>
    <body>
        <%
            String name = request.getParameter("uname");
            out.println("Welcome " + name);
            session.setAttribute("user", name);
            
        %>
        <br>
        <a href="jsp-session-second-page.jsp">Visit second page</a>
        
    </body>
</html>
