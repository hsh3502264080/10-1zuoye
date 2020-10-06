<%--
  Created by IntelliJ IDEA.
  User: 86131
  Date: 2020/10/6
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doAdd">
    <table style="margin: auto;text-align: center">
        <tr>
            <td>类型</td>
            <td><input type="radio" name="typeId" value="2">支出
                <input type="radio" name="typeId" value="3">收入
                <input type="radio" name="typeId" value="4">转账
                <input type="radio" name="typeId" value="5">借出
                <input type="radio" name="typeId" value="6">借入
                <input type="radio" name="typeId" value="7">还入
                <input type="radio" name="typeId" value="8">还出
            </td>
        </tr>
        <tr>
            <td>标题</td>
            <td><input type="text" name="title"></td>
        </tr>
        <tr>
            <td>日期</td>
            <td><input type="text" name="billTime"></td>
            <td>金额</td>
            <td><input type="text" placeholder="0" name="price"></td>
        </tr>
        <tr>

            <td>说明</td>
            <td><input type="text" name="explain"></td>

        </tr>
        <tr>
            <td>
                <input type="button" value="重置">
            </td>
            <td>
                <input type="submit" value="保存">
            </td>
            <td>
                <button><a href="/">返回</a></button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
