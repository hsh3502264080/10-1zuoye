<%--
  Created by IntelliJ IDEA.
  User: 86131
  Date: 2020/10/7
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/static/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<table border="1" width="700px" align="center" class="table-flower">
    <td hidden><input type="text" class="name12" value="${goodsDistrict}" name="goodsDistrict"/></td>
    <tr align="center">
        <td width="100">商品编号</td>
        <td width="100">商品名称</td>
        <td width="200">商品价格</td>
        <td width="200">库存数量</td>
        <td width="200">订单状态</td>
        <td width="200">操作</td>
    </tr>
</table>
</body>
</html>
<script>
    $(document).ready(function () {
        var name12=$(".name12").val();
        $.ajax({
            type:"GET",
            url:"/chuan",
            data:{goodsDistrict:name12},
            dataType:"json",
            success:function (data) {
                $.each(data.sel,function (i,v) {
                    var zhuang="";
                    if(v.billstatus==1){
                        zhuang="处理中";
                    }
                    if(v.billstatus==0){
                        zhuang="待处理";
                    }
                    if(v.billstatus==2){
                        zhuang="已处理";
                    }
                    var $tr = $("<tr align='center'><td > " + v.id
                        + "</td><td > " + v.goodsname + "</td><td> " + v.goodsprice
                        + "</td>><td> " + v.goodscount + "</td><td> " + zhuang
                        + "</td><td><a href='/chuan3/"+v.id+"/"+v.goodsname+"/"+v.goodsprice+"/"+v.goodscount+"/"+v.billstatus+"/'>修改</a></td></tr>");
                    $(".table-flower").append($tr);
                })
            }
        })
    })
</script>