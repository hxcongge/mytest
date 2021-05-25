<%--
  Created by IntelliJ IDEA.
  User: Cong
  Date: 2021/4/30
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/statics/layui/css/layui.css">
</head>
<body>

<center>
    <h1>宠物类型数据</h1>
    <br>
    <!--表示表格容器，用来展示动态表格的数据-->
    <table id="demo" lay-filter="test"></table>
</center>
<script src="/statics/layui/layui.js"></script>
<script type="text/javascript">
    layui.use(['table'],function(){
        var table = layui.table;

        //第一个实例
        table.render({
            elem: '#demo'  //表示跟表格容器的id进行绑定
            ,height: 400 //表格容器的高度
            //  默认会自动传递两个参数：?page=1&limit=30  page 代表当前页码、limit 代表每页数据量
            ,url: '/pet/loadData' //数据接口, 用来访问到后端控制器中，获取数据返回 （JSON数据）
            ,page: true //开启分页
            ,limits: [5,10,15,20,100] //自定义分页条数
            ,limit: 5  //默认每页显示5条记录
            ,even: true  //隔行变色效果
            ,cols: [[ //表头
                /*
                      表示当前一列数据：
                 field : 字段， 跟返回的JSON对象的属性的名字完全一致！！！
                 title : 表示标题
                 width ： 列的宽度
                 sort ： 是否支持排序 true支持
                 fixed: 'left'  ： 向左悬浮
                 templet:自定义模板
                 * */
                {field: 'petid', title: '宠物标号', width:120, sort: true}
                ,{field: 'petname', title: '宠物姓名', width:160}
                ,{field: 'breedname', title: '宠物品种', width:130, sort: true, templet: '<div>{{d.breedinfo.breedname}}</div>'}
                ,{field: 'petsex', title: '宠物性别', width:100}
                ,{field: 'birthday', title: '生日', width: 180,sort: true}
                ,{field: 'description', title: '描述', width: 250}

            ]]
        });
    })
</script>
</body>
</html>
