<%--
  Created by IntelliJ IDEA.
  User: lyy
  Date: 2019/11/4
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import="java.util.Date" %>

<html>

<head>

    <title>page指令import属性示例</title>

</head>

<body>

<% Date date = new Date(); %>

<h1>page指令的import属性示例演示！</h1>

<p>现在的时间是：<%=date %></p>

</body>

</html>
