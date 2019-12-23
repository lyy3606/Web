<%--
  Created by IntelliJ IDEA.
  User: lyy
  Date: 2019/11/19
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="javax.servlet.http.Cookie" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
Cookie username = new Cookie("userNameCookie",request.getParameter("username"));
Cookie password = new Cookie("passwordCookie",request.getParameter("password"));
username.setMaxAge(1000);
password.setMaxAge(1000);
response.addCookie(username);
response.addCookie(password);
%>
<jsp:forward page="UserServlet"></jsp:forward>
</body>
</html>
