<%--
  Created by IntelliJ IDEA.
  User: 86131
  Date: 2020/10/2
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/ins" method="post">
<table class="table-flowser" width="500" border="1" align="center">
    <tr>
        <th colspan="2">添加人员</th>
    </tr>
    <!-- 第一行 -->
    <tr>
        <td align="center">性别</td>
        <td><select name="sex">
            <option value="0">请选择</option>
            <option value="男">男</option>
            <option value="女">女</option>
        </select></td>
    </tr>
    <!-- 第二行 -->
    <tr>
        <td align="center">姓名</td>
        <td><input type="text" class="nicheng" name="name" /></td>
    </tr>
    <tr>
        <td align="center">年龄</td>
        <td><input type="text" class="nicheng" name="age" /></td>
    </tr>
    <tr>
        <td align="center">等级</td>
        <td><select name="pank">
            <option value="0">请选择</option>
            <option value="1级">1级</option>
            <option value="2级">2级</option>
        </select></td>
    </tr>
    <tr>
        <td align="center">部门</td>
        <td><select name="department">
            <option value="0">请选择</option>
            <option value="开放">开放</option>
            <option value="支持">支持</option>
        </select></td>
    </tr>
    <!-- 第三行 -->
    <tr align="center">
        <td><button type="submit" class="tijiao">提交</button></td>
        <td><button type="button" onclick="fanhui()">返回</button></td>
    </tr>
</table>
</form>
</body>
</html>
