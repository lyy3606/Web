<%--
  Created by IntelliJ IDEA.
  User: lyy
  Date: 2019/12/20
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生信息</title>
</head>

<body>

<div width="300px" style="margin: auto">
    <form action="/web_war_exploded/AddUserServlet" method="post" onsubmit="return submit()">
        Id:<input type="text" name="id"><br>
        Name:<input type="text" name="name"><br>
        Gender:<input type="text" name="gender"><br>
        Addr:<input type="text" name="addr"><br>
        Grade:<input type="number" name="grade"><br>
        Course:<input type="text" name="course"><br>
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
