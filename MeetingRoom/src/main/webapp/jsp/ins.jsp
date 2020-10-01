<%--
  Created by IntelliJ IDEA.
  User: 86131
  Date: 2020/10/1
  Time: 23:05
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
        <th colspan="2">会议室预定</th>
    </tr>
    <!-- 第一行 -->
    <tr>
        <td align="center">会议室</td>
        <td><select name="meetingName">
            <option value="1">1号</option>
            <option value="2">2号</option>  <option value="3">3号</option>
        </select></td>
    </tr>
    <!-- 第二行 -->
    <tr>
        <td align="center">申请人</td>
        <td><input type="text" class="nicheng" name="advanceName" /></td>
    </tr>
    <tr>
        <td align="center">预定日期</td>
        <td><input type="text" class="nicheng" name="meetingOrder" /></td>
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
