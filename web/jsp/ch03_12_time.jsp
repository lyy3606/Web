<%--
  Created by IntelliJ IDEA.
  User: lyy
  Date: 2019/11/4
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>

<html>

<head>

    <title>页面自动刷新时间</title>

</head>

<body>

当前时间是：<%=new Date().toLocaleString() %><br>

<hr>

<% response.setHeader("refresh", "1"); %>

</body>

</html>
