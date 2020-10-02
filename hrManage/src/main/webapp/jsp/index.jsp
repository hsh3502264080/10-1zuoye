<%--
  Created by IntelliJ IDEA.
  User: 86131
  Date: 2020/10/2
  Time: 15:36
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
        <th width="100">编号</th>
        <th width="100">姓名</th>
        <th width="100">性别</th>
        <th width="120">年龄</th>
        <th width="100">等级</th>
        <th width="100">部门</th>
        <th width="120">操作</th>
    </tr>


</table> <p align="center"><a href="/jsp/ins.jsp" >添加人员</a></p>
</body>
</html>
<script>
    $(document).ready(function () {
        $.ajax({
            type:"GET",
            url:"sel",
            dataType:"json",
            success:function (data) {
                $.each(data.s,function (i,v) {
                    var $tr=$("<tr><td>"+v.id+"</td><td>"+v.name+"</td><td>"+v.sex+"</td><td>"+v.age+"</td><td>"+v.pank+"</td><td>"+v.department+"</td><td><a href='#' class='shan'>删除</a></td></tr>");
                    $(".table-flower").append($tr);
                })
                $(".shan").click(function () {
                    var id=$(this).parent().prev().prev().prev().prev().prev().prev().text();
                    $.ajax({
                        type:"GET",
                        url:"/del",
                        data:{id:id},
                        dataType:"json",
                        success:function (data) {
                            alert("删除成功")
                        }
                    })
                })
            }
        })
    })

</script>
