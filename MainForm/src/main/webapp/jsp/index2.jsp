<%--
  Created by IntelliJ IDEA.
  User: 86131
  Date: 2020/10/4
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/static/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<table class="table-flower" width="800" border="1" align="center">
    <tr>
        <td>资产编号</td>
        <td><input name="assetid" class="assetid"> </td>
        <td>资产类型</td>
        <td><select name="assettype" class="assettype">
            <option value="0">请选择类型</option>
            <option value="电子">电子</option>
            <option value="机械">机械</option>
        </select></td>
        <td><button class="chax">查询</button></td>
    </tr>
    <tr>
        <th width="100">资产编号</th>
        <th width="100">资产名称</th>
        <th width="100">资产类型</th>
        <th width="120">入库日期</th>
    </tr>
</table>
</body>
</html>
<script>
    $(document).ready(function () {
        cha();
      $(".chax").click(function () {
          var assetid=$(".assetid").val();
          var assettype=$(".assettype").val();
        cha();
      })
    })
    var assetid=$(".assetid").val();
    var assettype=$(".assettype").val();
    function cha() {
        $.ajax({
            type:"GET",
            url:"/sel",
            data:{assetid:assetid,assettype:assettype},
            dataType:"json",
            success:function (data) {
                console.log(data)
                $.each(data.a,function (i,v) {
                    var $tr = $("<tr><td>" + v.id + "</td><td>"
                        + v.assetid + "</td><td>" + v.assetname
                        + "</td><td>" + v.assettype
                        + "</td><td>" + v.intodate + "</td></tr>");
                    $(".table-flower").append($tr);
                })
            }
        })
    }
</script>
