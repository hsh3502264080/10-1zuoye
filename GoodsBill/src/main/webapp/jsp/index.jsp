<%--
  Created by IntelliJ IDEA.
  User: 86131
  Date: 2020/10/7
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/static/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<div align="center">
    <h3>请选择区域：<select class="diqu" >
        <option value="0">请选择</option>
        <option value="1">朝阳</option>
        <option value="2">海淀</option>
        <option value="3">丰台</option>
        <option value="4">西城</option>
        <option value="5">昌平</option>
    </select> <button class="chaxun">查询</button>  </h3>
</div>
</body>
</html>
<script>
    $(document).ready(function () {
        $(".chaxun").click(function () {
            var id = $(".diqu").val();
          // $.ajax({
          //     type:"GET",
          //     url:"/chuan2",
          //     data:{goodsDistrict:id},
          //     dataType:"json",
          //     succuss:function (data) {
          //     }
          // })
            location.href="/chuan2/"+id+"";
        })
    })
</script>
