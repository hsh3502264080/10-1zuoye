<%--
  Created by IntelliJ IDEA.
  User: 86131
  Date: 2020/10/4
  Time: 15:03
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
            <td align="center">资产编号</td>
            <td><input type="text" class="nicheng" name="assetid" /></td>
        </tr>
        <!-- 第二行 -->
        <tr>
            <td align="center">资产名称</td>
            <td><input type="text" class="nicheng" name="assetname" /></td>
        </tr>
        <tr>
            <td align="center">资产类型</td>
            <td><select name="assettype">
                <option value="0">请选择类型</option>
                <option value="电子">电子</option>
                <option value="机械">机械</option>
            </select></td>
        </tr>
        <tr>
            <td align="center">日库日期</td>
            <td><input type="text" class="nicheng" name="intodate" /></td>
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
