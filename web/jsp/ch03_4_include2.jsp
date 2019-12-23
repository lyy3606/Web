<%--
  Created by IntelliJ IDEA.
  User: lyy
  Date: 2019/11/4
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>

<head>

    <title>include指令示例</title>

</head>

<body>

<center>

    现在的日期和时间是：<%=new Date() %>

    <hr>

    <%@ include file="ch03_4_include1.jsp" %>

</center>

</body>

</html>