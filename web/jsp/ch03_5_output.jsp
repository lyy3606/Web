<%--
  Created by IntelliJ IDEA.
  User: lyy
  Date: 2019/11/4
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<html>

<head>

    <title>接受参数页面</title>

</head>

<body>

接受参数，并显示结果页面。<br/>

<%String str=request.getParameter("userName"); %>

<font color="blue" size="12"><%=str %></font>你好，欢迎你访问！

</body>

</html>
