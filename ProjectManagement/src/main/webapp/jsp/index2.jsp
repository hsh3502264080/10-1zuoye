<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86131
  Date: 2020/10/4
  Time: 17:41
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
            <th colspan="2">申报项目信息</th>
        </tr>
        <!-- 第一行 -->
        <tr>
            <td align="center">申报编号</td>
            <td><input type="text" class="nicheng" name="id" value="${id}" /></td>
        </tr>
        <!-- 第二行 -->
        <tr>
            <td align="center">项目名称</td>
            <td><input type="text" class="nicheng" name="projectname" value="${projectname}"/></td>
        </tr>
        <tr>
            <td align="center">申报开始日期</td>
            <td><input type="text" class="nicheng" name="startdate" value="${startdate}"  /></td>
        </tr>
        <tr>
            <td align="center">申报结束日期</td>
            <td><input type="text" class="nicheng" name="enddate" value="${enddate}"  /></td>
        </tr>
        <tr>
            <td align="center">申报状态</td>
            <td><select class="status" name="status">
                <c:if test="${status==2}">
                    <option value="2">已审核</option>
                </c:if>
                <c:if test="${status==1}">
                    <option value="1">审核中</option>
                    <option value="0">已申报</option>
                </c:if>
                <c:if test="${status==0}">
                    <option value="0">已申报</option>
                </c:if>
            </select></td>
        </tr>
        <!-- 第三行 -->
        <tr>

            <td><input type="submit" value="修改"/></td>
        </tr>
    </table>
</form>
</body>
</html>
