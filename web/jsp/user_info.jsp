<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lyy
  Date: 2019/11/8
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息：</title>
</head>
<body>
<table>
    <tr>
        <td width="60pd" bgcolor="#8a2be2">序号</td>
        <td width="60pd" bgcolor="blue">名字</td>
        <td width="60pd" bgcolor="green">性别</td>
        <td width="60pd" bgcolor="aqua">地址</td>
        <td width="60pd" bgcolor="#f0ffff">成绩</td>
        <td width="60pd" bgcolor="#ffebcd">课程</td>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td width="60pd" bgcolor="#8a2be2">${user.value.id}</td>
            <td width="60pd" bgcolor="blue">${user.value.name}</td>
            <td width="60pd" bgcolor="green">${user.value.gender}</td>
            <td width="60pd" bgcolor="aqua">${user.value.addr}</td>
            <td width="60pd" bgcolor="#f0ffff">${user.value.grade}</td>
            <td width="60pd" bgcolor="#ffebcd">${user.value.course}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
