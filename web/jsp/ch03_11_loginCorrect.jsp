<%--
  Created by IntelliJ IDEA.
  User: lyy
  Date: 2019/11/4
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>

<html>

<head>

    <title>成功登入页面</title>

</head>

<body>

<% String name = request.getParameter("RdName"); %>

欢迎，<%=name %>成功登录！

</body>

</html>
