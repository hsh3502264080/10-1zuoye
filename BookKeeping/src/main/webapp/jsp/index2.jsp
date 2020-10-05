<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/10/2
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form action="/doIndex2" method="post">
        <table  border="1px black solid;" style="width:500px;" class="table">
            <tr  style="border: 1px black solid;" align="center"><td colspan="2"><h1>添加人员</h1></td></tr>
            <tr >
                <td align="center">姓名</td><td><input type="text" name="name"  class="name"><span style="color: red">*</span> </td></tr>
            <tr>
                <td align="center">年龄</td><td><input type="text" class="age" name="age"><span style="color: red">*</span> </td></tr>
            <tr>
                <td align="center">性别</td><td><select class="sex" name="sex"><option value="0">男</option><option value="1">女</option></select><span style="color: red">*</span> </td></tr>
            <tr>
                <td align="center">证件类型</td><td><select class="rank" name="credentialtypeid"></select> <span style="color: red">*</span></td></tr>
            <tr>
                <td align="center">证件号</td><td><input type="text" class="idnumber" name="idnumber"><span style="color: red">*</span> </td>
            </tr>
            <tr align="center">
                <td colspan="2"><input type="submit" value="添加" /></td>
            </tr>
        </table>
        ${error}
    </form>
</div>
<script type="text/javascript" src="/static/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/static/js/index3.js"></script>
</body>
</html>
