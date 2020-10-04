<%--
  Created by IntelliJ IDEA.
  User: 86131
  Date: 2020/10/4
  Time: 17:08
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
    <p align="center">申报状态 <select class="status">
        <option value="0">已申报</option>
        <option value="1">审核中</option>
        <option value="2">已审核</option>
    </select>
        <button onclick="a()">查询</button>
    </p>
    <tr align="center">
        <td colspan="6" width="200">申报项目列表</td>
    </tr>
    <tr>
        <th width="100">项目编号</th>
        <th width="100">项目名称</th>
        <th width="100">申报开始日期</th>
        <th width="120">申报结束日期</th>
        <th width="120">申报状态</th>
        <th width="120">操作</th>
    </tr>
</table>
<table class="table table-fenye" width="300" border="1" align="center">
    <tr align="center">
        <td><a href=" " onclick="startPage()">首页</a></td>
        <td><a href="javascript:void(0)" onclick="prev()">上一页</a></td>
        <td class="page">1/1</td>
        <td><a href="javascript:void(0)" onclick="next()">下一页</a></td>
        <td><a href="javascript:void(0)" onclick="endPage()">尾页</a></td>
    </tr>
</table>
<p style="color: red">${msg}</p>
</body>
</html>
<script>
    $(document).ready(function () {
        fenye();
    })
    function prev() {
        pageIndex = data1.select.prePage;
        fenye();
    }
    function next() {
        pageIndex=data1.select.nextPage;
        fenye();
    }
    function a() {
        var status = $(".status").val();
        fenye();
    }
    var pageSize = 3;
    var pageIndex = 1;
    var data1;

    function fenye() {
        $(".table-flower tr:gt(0)").remove();
        var status = $(".status").val();
        var json = {
            status: status,
            pageindex: pageIndex,
            pagesize: pageSize
        }
        $.ajax({
            type: "GET",
            url: "/sel",
            data: json,
            dataType: "json",
            success: function (data) {
                console.log(data);
                $(".page").text("第" + data.select.pageNum + "页/第" + data.select.pages + "页");
                data1 = data;
                $.each(data.select.list, function (i, v) {
                    var zhuangtai = "";
                    if (v.status == 0) {
                        zhuangtai = "已申报";
                    }
                    if (v.status == 1) {
                        zhuangtai = "审核中";
                    }
                    if (v.status == 2) {
                        zhuangtai = "已审核";
                    }
                    if (v.status != 2) {
                        var $tr = $("<tr><td>" + v.id + "</td><td>"
                            + v.projectname + "</td><td>" + v.startdate
                            + "</td><td>" + v.enddate
                            + "</td><td>" + zhuangtai + "</td><td><a href='/chuan/"+v.id+"/"+v.projectname+"/"+v.startdate+"/"+v.enddate+"/"+v.status+""+"'>审核</a></td></tr>");
                        $(".table-flower").append($tr);
                    }
                    if (v.status == 2) {
                        var $tr = $("<tr><td>" + v.id + "</td><td>"
                            + v.projectname + "</td><td>" + v.startdate
                            + "</td><td>" + v.enddate
                            + "</td><td>" + zhuangtai + "</td></tr>");
                        $(".table-flower").append($tr);
                    }

                })
            }
        })

    }


</script>