<%--
  Created by IntelliJ IDEA.
  User: lyy
  Date: 2019/12/19
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table align="center" cellspacing="0" border="1">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>gender</td>
        <td>addr</td>
        <td>grade</td>
        <td>course</td>
        <td>编辑</td>
        <td>删除</td>
    </tr>
    <c:forEach var="item" items="${users}" varStatus="st">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.gender}</td>
            <td>${item.addr}</td>
            <td>${item.grade}</td>
            <td>${item.course}</td>
            <td><a href="EditUserServlet?id=${item.id}">edit</a></td>
            <td><a href="RemoveUserServlet?id=${item.id}">remove</a></td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="6" align="center">
            <a href="jsp/add_user.jsp">[添加]</a>
            <a href="?start=0">[首页]</a>
            <a href="?start=${pre}">[上一页]</a>
            <a href="?start=${next}">[下一页]</a>
            <a href="?start=${last}">[尾页]</a>
        </td>
    </tr>
</table>
