<%--
  Created by IntelliJ IDEA.
  User: lyy
  Date: 2019/11/7
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="javax.servlet.http.Cookie" %>
<html>
<head>
    <title></title>
    <style>
        .a{
            width: 300px;
            height: 30px;
        }
        #b{
            width: 500px;
            border: 0px;
            text-align: right;
        }
    </style>
</head>
<body>

<%
    String username = "";
    String password = "";
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie: cookies){
        if (cookie.getName().equals("userNameCookie")){
            username = cookie.getValue();
        }
        if (cookie.getName().equals("passwordCookie")){
            password = cookie.getValue();
        }
    }
%>

<h1>用户注册</h1>
<hr>
<div id="b">
    <form action="add_cookie.jsp" ;methord="post">
        用户名：<input type="text" name="username";class="a" value=<%=username%>><br>
        密码：<input type="password" name="password";class="a" value=<%=password%>><br>
        确认密码：<input type="password" name="ensurePassword";class="a" value=<%=password%>><br>
        eMail:<input type="email" name="email";class="a"><br>
        性别：<input type="checkbox" name="gender">男 <input type="checkbox">女 <br>
        出生日期：<input type="date" name="birthday"><br>
        爱好：<input type="checkbox" name="nba">NBA <input type="checkbox" name="music">音乐<br>
        <input type="checkbox" name="net"> 上网 <input type="checkbox" name="basketbale">篮球<br>
        接受协议：<input type="radio" name="accept">是否接受条款<br>
        <input type="submit";value="提交">
    </form>
</div>


</body>
</html>
