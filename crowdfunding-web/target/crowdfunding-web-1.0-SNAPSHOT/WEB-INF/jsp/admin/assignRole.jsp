<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
				  <li class="active">分配角色</li>
				</ol>
			<div class="panel panel-default">
			  <div class="panel-body">
				<form role="form" class="form-inline" id="assignFor">
                    <input type="hidden" name="adminId" value="${param.id}"/>
				  <div class="form-group">
					<label for="exampleInputPassword1">未分配角色列表</label><br>
					<select name="roleIdLeft" id="leftRole" class="form-control" multiple size="10" style="width:200px;overflow-y:auto;">
                        <c:forEach items="${unAssign}" var="role">
                            <option value="${role.id}">${role.name}</option>
                        </c:forEach>
                    </select>
				  </div>
				  <div class="form-group">
                        <ul>
                            <li onclick="leftToRight()" class="btn btn-default glyphicon glyphicon-chevron-right"></li>
                            <br>
                            <li onclick="rightToLeft()" class="btn btn-default glyphicon glyphicon-chevron-left" style="margin-top:20px;"></li>
                        </ul>
				  </div>
				  <div class="form-group" style="margin-left:40px;">
					<label for="exampleInputPassword1">已分配角色列表</label><br>
					<select name="roleIdRight" id="rightRole" class="form-control" multiple size="10" style="width:200px;overflow-y:auto;">
                        <c:forEach items="${assign}" var="role">
                            <option value="${role.id}">${role.name}</option>
                        </c:forEach>
                    </select>
				  </div>
				</form>
			  </div>
			</div>
        </div>
      </div>
    </div>
    <script src="${PATH}/static/jquery/jquery-2.1.1.min.js"></script>
    <script src="${PATH}/static/bootstrap/js/bootstrap.min.js"></script>
	<script src="${PATH}/static/script/docs.min.js"></script>
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
            });
            //分配角色
            function leftToRight() {
                var selectedLeft = $("#leftRole option:selected");
                if(selectedLeft.length == 0){
                    layer.msg("请选择要分配的角色！", {time:2000, icon:0, shift:6},function(){});
                }else{
                    $.ajax({
                        type:"post",
                        url:"${PATH}/admin/assignRole",
                        data:$("#assignFor").serialize(),
                        success:function (backData) {
                            if(backData.result == "ok"){
                                $("#rightRole").append(selectedLeft);
                            }else{
                                layer.msg("分配角色失败，请重试", {time:2000, icon:2, shift:6},function(){});
                            }
                        }
                    });
                }
            }
            //取消分配角色
            function rightToLeft() {
                var selectedRight = $("#rightRole option:selected");
                if(selectedRight.length == 0){
                    layer.msg("请选择要取消分配的角色！", {time:2000, icon:0, shift:6},function(){});
                }else{
                    $.ajax({
                        type:"post",
                        url:"${PATH}/admin/unAssignRole",
                        data:$("#assignFor").serialize(),
                        success:function (backData) {
                            if(backData.result == "ok"){
                                $("#leftRole").append(selectedRight);
                            }else{
                                layer.msg("取消分配角色失败，请重试", {time:2000, icon:2, shift:6},function(){});
                            }
                        }
                    });
                }
            }
        </script>
  </body>
</html>
