$(document).ready(function () {
    cha();
    $(".tianjia").click(function () {
        location.href="/toIndex2";
    });
    
})
var xing;
function cha() {
    $(".tia").remove();
    $.post("/doIndex",function(resoult){
        $.each(resoult.data,function (i,v) {
            if(v.sex==0){
                xing="男"
            }else{
                xing="女"
            }
            var $tr = $("<tr class='tia' align='center'><td>"+v.id+"</td><td>"+v.name+"</td><td>"+v.age+"</td><td>"+xing+"</td><td>"+v.typeName+"</td><td>"+v.idnumber+"</td><td>"+v.addtime+"</td><td><a href='javascript:void(0)' class='shan'>删除</a></td></tr>");
            console.log($tr)
            $(".student").append($tr);
        })

        $(".shan").click(function () {
            var id = $(this).parent().prev().prev().prev().prev().prev().prev().prev().text();
            var json2 = {
                id : id
            }
            $.post("/doDel",json2,function (result) {
                if(result.data>0){
                    alert("删除成功");
                    cha();
                }else{
                    alert("删除失败")
                }
            },"json")
        });
    },"json");
}