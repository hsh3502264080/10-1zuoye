<%--
  Created by IntelliJ IDEA.
  User: 86131
  Date: 2020/10/2
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/xiu" method="post">
<table class="table-flowser" width="500" border="1" align="center">
    <tr>
        <th colspan="2">学员信息</th>
    </tr>
    <!-- 第一行 -->
    <tr>
        <input type="text" name="sid" hidden value="${sid}">
        <td align="center">姓名</td>
        <td><input type="text" class="nicheng" name="sname" value="${sname}" /></td>
    </tr>
    <!-- 第二行 -->
    <tr>
        <td align="center">年龄</td>
        <td><input type="text" class="nicheng" name="sage" value="${sage}"/></td>
    </tr>
    <tr>
        <td align="center">性别</td>
        <td><input type="text" class="nicheng" name="sgender" value="${sgender}"  /></td>
    </tr>
    <tr>
        <td align="center">家庭住址</td>
        <td><input type="text" class="nicheng" name="saddress" value="${saddress}"  /></td>
    </tr>
    <tr>
        <td align="center">Email</td>
        <td><input type="text" class="nicheng" name="semail" value="${semail}" /></td>
    </tr>
    <!-- 第三行 -->
    <tr>

        <td><input type="submit" value="修改"/></td>
    </tr>
</table>
</form>
</body>
</html>
