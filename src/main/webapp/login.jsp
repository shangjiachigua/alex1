<%--
  Created by IntelliJ IDEA.
  User: 86187
  Date: 2019/5/23
  Time: 22:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="divForm">
       
    <form action="" method="post">
            <p>
            欢迎登陆网站主页
            </p>
            <p>
            用户名：<input type="text" name="username"/>
            </p>
            <p>
            密 &nbsp;&nbsp;码：<input type="password" name="password"/>
            </p>
            <input type="submit" value="登录"/>
    </form>
</div>
 
</body>


<style type="text/css">
    .divForm {
        position: absolute; /*绝对定位*/
        width: 300px;
        height: 200px;

        /*border: 1px solid red;*/
        text-align: center; /*(让div中的内容居中)*/
        top: 50%;
        left: 50%;
        margin-top: -200px;
        margin-left: -150px;
    }
</style>
</body>
</html>
