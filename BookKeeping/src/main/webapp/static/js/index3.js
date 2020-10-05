$(document).ready(function () {
    $.post("/doShenFen",function (resout) {
        $.each(resout.data,function (i,v) {
            var $option = $("<option value='"+v.id+"'>"+v.name+"</option>");
            $(".rank").append($option);
        })
    },"json");
})