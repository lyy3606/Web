<%--
  Created by IntelliJ IDEA.
  User: lyy
  Date: 2019/11/1
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>

    <script>
      function MyAdd(i,j) {
        return i+j;
      }
    </script>

    <title>my text</title>
    <style id="p_style">
      p {color: blueviolet}
    </style>

    <script src = js/add.js type="text/javascript">
    </script>

  </head>
  <body>
  <p id="text">this is a text</p>
  <BUTTON type="button" onclick='document.getElementById("text").innerHTML="hello world"'>点击我</BUTTON>

  <img content="string" width="100" height="100" src="img/kangnaixi.jpg">
  <p>hello world</p>
  <link rel="stylesheet" type="text/css" href="tetx.css">
  <a href="ListUserServlet">分页显示数据</a>
  <a href="HelloWorld">链接</a><br>
  <a href="jsp/ch03_1_first.jsp">计算10以内之和</a><br>
  <a href="jsp/ch02_3.jsp">新闻通知</a><br>
  <a href="jsp/ch03_2_servlet.jsp">显示三角形</a><br>
  <a href="jsp/ch03_3_page.jsp">import显示时间</a><br>
  <a href="jsp/ch03_4_include1.jsp">include 实例1</a><br>
  <a href="jsp/ch03_4_include2.jsp">include 实例2</a><br>
  <a href="jsp/ch03_5_output.jsp">include 传参1</a><br>
  <a href="jsp/ch03_5_string.jsp">include 传参2</a><br>
  <a href="jsp/ch03_6_infoInput.jsp">利用表单传递参数1</a><br>
  <a href="jsp/ch03_6_infoReceive.jsp">利用表单传递参数2</a><br>
  <a href="jsp/ch03_7_infoInput.jsp">追加在网址后实现参数传递1</a><br>
  <a href="jsp/ch03_7_infoReceive.jsp">追加在网址后实现参数传递2</a><br>
  <a href="jsp/ch03_8_infoInput.jsp">采用getParammeterNames获取参数1</a><br>
  <a href="jsp/ch03_8_infoReceive.jsp">采用getParammeterNames获取参数2</a><br>
  <a href="jsp/ch03_9_input.jsp">计算任意两个实数之和1</a><br>
  <a href="jsp/ch03_9_output.jsp">计算任意两个实数之和2</a><br>
  <a href="jsp/ch03_9_sum.jsp">计算任意两个实数之和3</a><br>
  <a href="jsp/ch03_10_input.jsp">使用request获取客户端信息1</a><br>
  <a href="jsp/ch03_10_showInfo.jsp">使用request获取客户端信息2</a><br>
  <a href="jsp/ch03_11_userLogin.jsp">用户登录1</a><br>
  <a href="jsp/ch03_11_userReceive.jsp">用户登录2</a><br>
  <a href="jsp/ch03_11_loginCorrect.jsp">用户登录3</a><br>
  <a href="jsp/ch03_12_time.jsp">页面自动刷新时间</a><br>
  <a href="jsp/ch03_13_session.jsp">利用session对象获取对话信息并显示</a><br>
  <a href="jsp/ch03_14_application.jsp">统计网站访问人数</a><br>
  <a href="jsp/ch03_16_input.jsp">网上答题及自动评测系统1</a><br>
  <a href="jsp/ch03_16_show.jsp">网上答题及自动评测系统2</a><br>
  <a href="jsp/ch03_17_buy1.jsp">简单的购物车案例1</a><br>
  <a href="jsp/ch03_17_buy2.jsp">简单的购物车案例2</a><br>
  <a href="jsp/ch03_17_display.jsp">简单的购物车案例3</a><br>
  <a href="user-sign-in.jsp">用户信息注册</a>
  </body>
</html>
