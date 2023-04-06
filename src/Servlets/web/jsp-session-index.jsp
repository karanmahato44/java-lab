<%-- 
    Document   : jsp-session-index
    Created on : Apr 4, 2023, 10:00:34 PM
    Author     : kyto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP session index page</title>
    </head>
    <body>
        <form action="jsp-session-welcome.jsp" method="POST">
            Name: <input type="text" name="uname">
            <input type="submit" value="go"><br>
        </form>
    </body>
</html>
