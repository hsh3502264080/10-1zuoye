<%--
  Created by IntelliJ IDEA.
  User: 86131
  Date: 2020/10/1
  Time: 22:49
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
        <th width="100">预定编号</th>
        <th width="100">会议室</th>
        <th width="100">预定人</th>
        <th width="120">日期</th>
    </tr>
    <a href="/jsp/ins.jsp">添加会议</a>
</table>
</body>
</html>
<script>
$(document).ready(function () {
    $.ajax({
        type: "GET",
        url: "/sel",
        dataType: "json",
        success: function (data) {
            $.each(data.s, function (i, v) {
                console.log(v)
                var $tr = $("<tr align='center'><td> " + v.id + "</td><td> " + v.meetingName + "</td><td> " + v.advanceName + "</td><td> " + v.meetingOrder + "</td></tr>");
                $(".table-flower").append($tr);
            })
        }
    })




})

    
</script>
