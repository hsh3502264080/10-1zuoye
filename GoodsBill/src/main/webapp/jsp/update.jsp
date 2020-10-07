<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86131
  Date: 2020/10/7
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/xiu" method="post">
<table width="700px" border="1">
    <tr align="center">
        <td align="center" >商品编号</td>
        <td><input type="text" class="id" value="${sessionScope.chuan2_id}" name="id"/></td>
    </tr>
    <!-- 第二行 -->
    <tr align="center">
        <td align="center">商品名称</td>
        <td><input type="text" name="goodsname" class="name" value="${sessionScope.chuan_name}" /></td>
    </tr>
    <tr align="center">
        <td align="center">商品价格</td>
        <td><input type="text" name="goodsprice" class="jiage" value="${sessionScope.chuan_jiage}" /></td>
    </tr>
    <!-- 第三行 -->
    <tr align="center">
        <td align="center">库存数量</td>
        <td><input type="text" name="goodscount" class="shuliang" value="${sessionScope.chuan_shuliang}"  /></td>
    </tr>

    <tr align="center">
        <td align="center">订单状态</td>
        <td><select class="status" name="billstatus" >
            <c:if test="${status==2}">
                <option value="2">已处理 </option>
            </c:if>
            <c:if test="${status==1}">
                <option value="1">处理中</option>
                <option value="0">已申报</option>
            </c:if>
            <c:if test="${status==0}">
                <option value="0">待处理 </option>
            </c:if>
        </select></td>
    </tr>
    <input type="submit" value="修改">
</table>
</form>
</body>
</html>
