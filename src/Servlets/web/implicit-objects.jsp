<%-- 
    Document   : implicit-objects
    Created on : Apr 4, 2023, 9:48:28 PM
    Author     : kyto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Implicit Objects</title>
    </head>
    <body>
       
	<h1>Implicit Objects in JSP</h1>

	<h2>out Implicit Object</h2>
	<%
		out.println("Hello World!");
	%>

	<h2>request Implicit Object</h2>
	<%
		request.setAttribute("name", "John Doe");
		String name = (String) request.getAttribute("name");
		out.println("Name: " + name);
	%>

	<h2>response Implicit Object</h2>
	<%
		response.setContentType("text/html");
		response.getWriter().println("This is the response.");
	%>

	<h2>session Implicit Object</h2>
	<%
		session.setAttribute("counter", 1);
		int counter = (int) session.getAttribute("counter");
		out.println("Counter: " + counter);
	%>

	<h2>config Implicit Object</h2>
	<%
		String dbName = application.getInitParameter("DB_NAME");
		out.println("Database Name: " + dbName);
	%>

	<h2>application Implicit Object</h2>
	<%
		application.setAttribute("app_name", "My App");
		String appName = (String) application.getAttribute("app_name");
		out.println("Application Name: " + appName);
	%>

	<h2>exception Implicit Object</h2>
	<%
		try {
			int i = 1/0;
		} catch (Exception e) {
			out.println("Error: " + e.getMessage());
		}
	%>
        
        <%@ include file="firstjsp.jsp" %>
       
        
    </body>
</html>
