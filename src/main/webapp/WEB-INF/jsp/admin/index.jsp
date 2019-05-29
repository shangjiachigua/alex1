<%--
  Created by IntelliJ IDEA.
  User: 86187
  Date: 2019/5/26
  Time: 12:20
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        String path = request.getContextPath() + "/";
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
                + path;
    %>
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/left.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/dtree.css">
</head>
<body>
<div style="height: auto">
    <table align="center">
        <tr>
            <td>欢迎：</td>
        </tr>
    </table>
</div>
<!--left树菜单-->
<div>
    <table width="100" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td height="12"></td>
        </tr>
    </table>
    <table width="100%" border="0">
        <tr>
            <td>
                <div class="dtree">

                    <a href="javascript: d.openAll();">展开所有</a> | <a href="javascript: d.closeAll();">关闭所有</a>

                    <script type="text/javascript" src="<%=basePath%>js/dtree.js"></script>
                    <script type="text/javascript">

                        d = new dTree('d');
                        d.add('01', -1, '系统菜单树');
                        d.add('0102', '01', '分类管理', '', '', 'mainFrame');
                        d.add('010201', '0102', '分类管理', 'tocategorylist', '', 'mainFrame');
                        d.add('0104', '01', '商品管理');
                        d.add('010401', '0104', '商品管理', 'admin/product/list.jsp', '', 'mainFrame');
                        d.add('0106', '01', '订单管理');
                        d.add('010601', '0106', '订单管理', 'admin/order/list.jsp', '', 'mainFrame');
                        document.write(d);
                    </script>
                </div>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
