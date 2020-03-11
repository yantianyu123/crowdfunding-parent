<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh_CN">
<head>
    <meta charset="GB18030">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" href="${PATH}/static/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${PATH}/static/css/font-awesome.min.css">
    <link rel="stylesheet" href="${PATH}/static/css/main.css">
    <style>
        .tree li {
            list-style-type: none;
            cursor:pointer;
        }
        table tbody tr:nth-child(odd){background:#F4F4F4;}
        table tbody td:nth-child(even){color:#C00;}
    </style>
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <div><a class="navbar-brand" style="font-size:32px;" href="#">众筹平台 - 角色维护</a></div>
        </div>
        <jsp:include page="/WEB-INF/jsp/base/header.jsp"></jsp:include>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <jsp:include page="/WEB-INF/jsp/base/menu.jsp"></jsp:include>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title"><i class="glyphicon glyphicon-th"></i> 数据列表</h3>
                </div>
                <div class="panel-body">
                    <form class="form-inline" role="form" style="float:left;">
                        <div class="form-group has-feedback">
                            <div class="input-group">
                                <div class="input-group-addon">查询条件</div>
                                <input id="condition" class="form-control has-success" type="text" placeholder="请输入查询条件">
                            </div>
                        </div>
                        <button type="button" id="likeBut" class="btn btn-warning"><i class="glyphicon glyphicon-search"></i> 查询</button>
                    </form>
                    <button type="button" id="deleteBut" class="btn btn-danger" style="float:right;margin-left:10px;"><i class=" glyphicon glyphicon-remove"></i> 删除</button>
                    <button type="button" class="btn btn-primary" style="float:right;" onclick="add()"><i class="glyphicon glyphicon-plus"></i> 新增</button>
                    <br>
                    <hr style="clear:both;">
                    <div class="table-responsive">
                        <form id="deletesFro">
                            <table class="table  table-bordered">
                                <thead>
                                <tr >
                                    <th width="30">#</th>
                                    <th width="30"><input id="allCheck" type="checkbox"></th>
                                    <th>名称</th>
                                    <th width="100">操作</th>
                                </tr>
                                </thead>
                                <tbody id="bodyPage">

                                </tbody>
                                <tfoot>
                                    <tr >
                                        <td colspan="6" align="center">
                                            <ul class="pagination">

                                            </ul>
                                        </td>
                                    </tr>
                                </tfoot>
                            </table>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- 添加 模态框 -->
<div id="addModal" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">添加角色</h4>
            </div>
            <div class="modal-body">
                <form role="form" id="for1">
                    <div class="form-group">
                        <label>角色名</label>
                        <input type="text" class="form-control" id="addName" name="name" placeholder="请输入角色名">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" onclick="addRole()" class="btn btn-primary">添加</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<!-- 修改 模态框 -->
<div id="updateModal" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">修改角色</h4>
            </div>
            <div class="modal-body">
                <form role="form" id="for2">
                    <div class="form-group">
                        <label>角色名</label>
                        <input type="hidden" name="id"/>
                        <input type="text" class="form-control" name="name"/>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" onclick="updateRole()" class="btn btn-primary">修改</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<script src="${PATH}/static/jquery/jquery-2.1.1.min.js"></script>
<script src="${PATH}/static/bootstrap/js/bootstrap.min.js"></script>
<script src="${PATH}/static/script/docs.min.js"></script>
<script src="${PATH}/static/ztree/jquery.ztree.all-3.5.min.js"></script>
<script src="${PATH}/static/jquery/layer/layer.js"></script>
<script type="text/javascript">
    $(function () {
        $(".list-group-item").click(function(){
            if ( $(this).find("ul") ) {
                $(this).toggleClass("tree-closed");
                if ( $(this).hasClass("tree-closed") ) {
                    $("ul", this).hide("fast");
                } else {
                    $("ul", this).show("fast");
                }
            }
        });

        showData(1);
    });

    //异步请求数据
    function showData(pageNum) {

        var dataPage;
        //判断是否是模糊查询
        if($.trim($("#condition").val()) != ""){
            dataPage = {pageNum:pageNum,pageSize:5,condition:$("#condition").val()};
        }else{
            dataPage = {pageNum:pageNum,pageSize:5};
        }

        var index = -1;
        var bodyData = '';
        $.ajax({
            type:"post",
            url:"${PATH}/role/showData",
            data:dataPage,
            beforeSend:function () {
                index = layer.msg('正在加载数据中...',{icon:16})
            },
            success:function (backData) {
                layer.close(index);
                //页体数据
                bodyData = pageBody(backData);
                $("#bodyPage").html(bodyData);
                //页尾数据
                pageFoot(backData);
            }
        });
    }
    //页体数据拼接
    function pageBody(backData){
        var data = "";
        $.each(backData.list,function (index,role) {
            data += '<tr>';
            data += '   <td>'+ (index+1) +'</td>';
            data += '   <td><input type="checkbox" name="ids" value="'+ role.id +'"></td>';
            data += '   <td>'+ role.name +'</td>';
            data += '   <td>';
            data += '       <button type="button" onclick="assign('+ (role.id) +')" class="btn btn-success btn-xs"><i class=" glyphicon glyphicon-check"></i></button>';
            data += '       <button type="button" onclick="update('+ (role.id) +')" class="btn btn-primary btn-xs"><i class=" glyphicon glyphicon-pencil"></i></button>';
            data += '       <button type="button" onclick="deleteRole('+ (role.id) +')" class="btn btn-danger btn-xs"><i class=" glyphicon glyphicon-remove"></i></button>';
            data += '   </td>';
            data += '</tr>';
        })
        return data;
    }
    //页尾数据拼接
    function pageFoot(backData) {
        $("tfoot ul.pagination").empty();

        if(backData.isFirstPage){
            $("tfoot ul.pagination").append('<li class="disabled"><a href="#">上一页</a></li>');
        }else{
            $("tfoot ul.pagination").append('<li><a onclick="showData('+ (backData.pageNum-1) +')">上一页</a></li>');
        }
        $.each(backData.navigatepageNums,function (index,num) {
            if(num == backData.pageNum){
                $("tfoot ul.pagination").append('<li class="active"><a href="#">'+ (index+1) +'<span class="sr-only">(current)</span></a></li>');
            }else {
                $("tfoot ul.pagination").append('<li><a onclick="showData('+ num +')">'+ num +'</a></li>');
            }
        })
        if(backData.isLastPage){
            $("tfoot ul.pagination").append('<li class="disabled"><a href="#">下一页</a></li>');
        }else {
            $("tfoot ul.pagination").append('<li><a onclick="showData('+ (backData.pageNum+1) +')">下一页</a></li>');
        }
    }

    //模糊查询
    $("#likeBut").click(function () {
        showData(1);
    });
    //展示添加模态框
    function add() {
        //把模态框的数据清除
        $("#addName").val("");

        $("#addModal").modal({
            show:true,
            backdrop:'static'
        });
    }
    //添加数据
    function addRole() {
        $.ajax({
            type:"post",
            url:"${PATH}/role/add",
            data:$("#for1").serialize(),
            success:function (backData) {
                if(backData.result == "ok") {
                    //添加成功，关闭模态框
                    $('#addModal').modal('hide');
                    showData(1);
                }else if(backData.result == "no"){
                    layer.msg("添加失败！",{time:1500},function () {
                        //添加失败，关闭模态框
                        $('#addModal').modal('hide');
                        showData(1);
                    });
                }else if(backData == "403"){
                    layer.msg("你没有操作权限！",{time:1500});
                }
            }
        });
    }

    //先查询数据 展示修改模态框
    function update(id) {
        $.ajax({
            type:"post",
            url:"${PATH}/role/query",
            data:{id:id},
            success:function (backData) {
                $("#for2 input[name='name']").val(backData.name);
                $("#for2 input[name='id']").val(backData.id);
                //展示修改模态框
                $('#updateModal').modal({
                    show:true,
                    backdrop:'static'
                });
            }
        });
    }
    //修改模态框数据
    function updateRole(){
        $.ajax({
            type:"post",
            url:"${PATH}/role/update",
            data:$("#for2").serialize(),
            success:function (backData) {
                if(backData.result == "ok") {
                    //修改成功，关闭模态框
                    $("#updateModal").modal('hide');
                    showData(1);
                }else {
                    layer.msg("修改失败！",{time:1500},function () {
                        //修改失败，关闭模态框
                        $('#updateName').modal('hide');
                        showData(1);
                    });
                }
            }
        });
    }
    //删除数据
    function deleteRole(id) {
        layer.confirm('确定要删除该条数据吗？',{btn:['确定','取消']}
            ,function (index) {
                $.ajax({
                    type:"post",
                    url:"${PATH}/role/delete",
                    data:{id:id},
                    success:function (backData) {
                        if(backData.result == "ok"){
                            showData(1);
                        }else {
                            showData(1);
                        }
                    }
                });
                layer.close(index);
            },function (index) {
                layer.close(index);}
        )
    }
    //全选和全不选
    $("#allCheck").click(function () {
        $("#bodyPage input:checkbox").prop("checked",$(this).prop("checked"));
    });
    //批量删除
    $("#deleteBut").click(function () {
        if($("tbody input:checked").length > 0){
            layer.confirm('确定要删除这些数据吗？',{btn:['确定','取消']}
                ,function (index) {
                    $.ajax({
                        type:"post",
                        url:"${PATH}/role/deletes",
                        data:$("#deletesFro").serialize(),
                        success:function (backData) {
                            showData(1);
                        }
                    });
                    layer.close(index);
                },function (index) {
                    layer.close(index);
                });
        }else {
            layer.msg('请选择要删除的管理员！',{time:2000});
        }
    });
    //跳转到分配权限页面
    function assign(id) {
        
       location.href="${PATH}/role/assignPage?id="+id;
    }
</script>
</body>
</html>
