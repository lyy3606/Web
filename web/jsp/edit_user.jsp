<%--
  Created by IntelliJ IDEA.
  User: lyy
  Date: 2019/12/19
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>编辑user</title>
</head>

<body>

<div style="margin: auto" width="300px">
    <form action="UpdateUserServlet" method="post" onsubmit="return submit()">
        name:&nbsp;&nbsp;<input name="name" value="${user.name}"> <br><br>
        gender:&nbsp;&nbsp;<input name="gender" value="${user.gender}">
        addr:&nbsp;&nbsp;<input name="addr" value="${user.addr}">
        grade:&nbsp;&nbsp;<input name="grade" value="${user.grade}">
        course:&nbsp;&nbsp;<input name="course" value="${user.course}"><br>
        <input type="hidden" name="id" value="${user.id}">
        <input type="submit" value="提交">
    </form>
</div>

<script type="text/javascript">
    function submit() {
        var id = document.getElementById("id").innerText;
        var name = document.getElementById("name").innerText;
        var gender = document.getElementById("gender").innerText;
        var addr = document.getElementById("addr").innerText;
        var grade = document.getElementById("grade").innerText;
        var course = document.getElementById("course").innerText;
        if (id == null || id === "" || name == null || name === "" || gender == null || gender === "" || addr == null || addr === ""
            || grade == null || grade === "" || course == null || course === "") {
            alert('请补全信息')
            return false
        }
        return true
    }
</script>
</body>
</html>
