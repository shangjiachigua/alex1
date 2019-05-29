<%--
  Created by IntelliJ IDEA.
  User: 86187
  Date: 2019/5/26
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>商品分类信息</title>
</head>
<body>
<div>
    <table border="1">
        <tr>
            <td>序号</td>
            <td>分类名称</td>
        </tr>
        <c:forEach items="${categorylist.list}" var="list">
        <tr>
            <td>${list.cid}</td>
            <td>${list.cname}</td>
        </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
