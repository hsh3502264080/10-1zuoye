<%--
  Created by IntelliJ IDEA.
  User: 86131
  Date: 2020/10/2
  Time: 14:14
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
    <tr align="center" ><td colspan="6" width="200">学员信息列表</td></tr>
    <tr>
        <th width="100">编号</th>
        <th width="100">姓名</th>
        <th width="100">姓名</th>
        <th width="120">年龄</th>
        <th width="120">住址</th>
        <th width="120">Email</th>
    </tr>
</table>
<p align="center" style="color: red">${msg}</p>
</body>
</html>

<script>
    $(document).ready(function () {
        
        $.ajax({
            type:"GET",
            url:"/sel",
            dataType:"json",
            success:function (data) {
                console.log(data)
                $.each(data.a,function (i,v) {
                    var $tr=$("<tr><td><a href='/chuan/"+v.sid+"/"+v.sname+"/"+v.sgender+"/"+v.sage+"/"+v.saddress+"/"+v.semail+"/'>"+v.sid+"</a></td><td>"+v.sname+"</td><td>"+v.sgender+"</td><td>"+v.sage+"</td><td>"+v.saddress+"</td><td>"+v.semail+"</td></tr>");
                    $(".table-flower").append($tr);
                })
            }
        })
        
    })
    
    
</script>

