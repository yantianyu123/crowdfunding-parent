<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh_CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" href="${PATH}/static/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${PATH}/static/css/font-awesome.min.css">
    <link rel="stylesheet" href="${PATH}/static/css/main.css">
    <link rel="stylesheet" href="${PATH}/static/css/doc.min.css">
    <style>
        .tree li {
            list-style-type: none;
            cursor:pointer;
        }
    </style>
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <div><a class="navbar-brand" style="font-size:32px;" href="user.html">众筹平台 - 用户维护</a></div>
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
            <ol class="breadcrumb">
                <li><a href="#">首页</a></li>
                <li><a href="#">数据列表</a></li>
                <li class="active">修改</li>
            </ol>
            <div class="panel panel-default">
                <div class="panel-heading">表单数据<div style="float:right;cursor:pointer;" data-toggle="modal" data-target="#myModal"><i class="glyphicon glyphicon-question-sign"></i></div></div>
                <div class="panel-body">
                    <form role="form" id="for1" action="${PATH}/admin/update" method="post">
                        <input type="hidden" name="userpswd" value="${admin.userpswd}"/>
                        <input type="hidden" name="id" value="${admin.id}"/>
                        <input type="hidden" name="pageNum" value="${param.pageNum}"/>
                        <div class="form-group">
                            <label for="exampleInputPassword1">登陆账号</label>
                            <input type="text" class="form-control" id="loginacct" name="loginacct" value="${admin.loginacct}">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputPassword1">用户名称</label>
                            <input type="text" class="form-control" id="username" name="username" value="${admin.username}">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1">邮箱地址</label>
                            <input type="email" class="form-control" id="email" name="email" value="${admin.email}">
                            <p class="help-block label label-warning">请输入合法的邮箱地址, 格式为： xxxx@xxxx.com</p>
                        </div>
                        <button type="button" id="updateBut" class="btn btn-success"><i class="glyphicon glyphicon-edit"></i> 修改</button>
                        <button type="button" id="resBut" class="btn btn-danger"><i class="glyphicon glyphicon-refresh"></i> 重置</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="${PATH}/static/jquery/jquery-2.1.1.min.js"></script>
<script src="${PATH}/static/bootstrap/js/bootstrap.min.js"></script>
<script src="${PATH}/static/script/docs.min.js"></script>
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
    });

    $("#updateBut").click(function () {
        $("#for1").submit();
    });

    $("#resBut").click(function () {
        $("#for1")[0].reset();
    });
</script>
</body>
</html>
