<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="GB18030">
  <head>
    <meta charset="GB18030">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

	<link rel="stylesheet" href="${PATH}/static/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="${PATH}/static/css/font-awesome.min.css">
	<link rel="stylesheet" href="${PATH}/static/css/main.css">
	<link rel="stylesheet" href="${PATH}/static/css/doc.min.css">
	<link rel="stylesheet" href="${PATH}/static/ztree/zTreeStyle.css">
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
              <div class="panel-heading"><i class="glyphicon glyphicon-th-list"></i> 给角色分配许可权限<div style="float:right;cursor:pointer;" data-toggle="modal" data-target="#myModal"><i class="glyphicon glyphicon-question-sign"></i></div></div>
			  <div class="panel-body">
                  <button id="assignBut" class="btn btn-success">分配许可</button>
                  <br><br>
                  <input type="hidden" name="roleId" value="${param.id}"/>
                  <ul id="treeDemo" class="ztree"></ul>
			  </div>
			</div>
        </div>
      </div>
    </div>
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
				
				initzTree();
            });
            
            //初始分配权限护树形结构
            function initzTree() {
                //简单的树形结构
                var setting = {
                    check: {
                        enable: true
                    },
                    data: {
                        key:{url: "xxx",name:"title"},
                        simpleData: {
                            enable: true, pIdKey: "pid"
                        }
                    },
                    view: {
                        addDiyDom: function (treeId, treeNode) {
                            $("#" + treeNode.tId + "_ico").removeClass();//.addClass();
                            $("#" + treeNode.tId + "_span").before("<span class='" + treeNode.icon + "'></span>");
                        }
                    }
                };
                //发送异步请求，获取节点数据
                $.ajax({
                    type:"get",
                    url:"${PATH}/permission/loadData",
                    success:function(backData) {
                        var  zNodes = backData;
                        $.fn.zTree.init($("#treeDemo"), setting, zNodes);
                        //把树形结构全部展开
                        var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
                        treeObj.expandAll(true);
                        echoPermission();
                    }
                });
                //回显已分配的权限
                function echoPermission() {
                    $.get("${PATH}/role/queryAssignPermissionId",{roleId:$("input[name='roleId']").val()},function (backData) {
                        $.each(backData,function (i,e) {
                            var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
                            var node = treeObj.getNodeByParam("id", e, null);
                            //选中已分配的权限
                            treeObj.checkNode(node, true, false);
                        });
                    })
                }
            }
            
            //给角色分配权限
            $("#assignBut").click(function () {
                //获取角色id
                var roleId = $("input[name='roleId']").val();
                var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
                //获取所有选中的节点
                var checkedNodes = treeObj.getCheckedNodes(true);
                
                if(checkedNodes.length == 0){
                    layer.msg("请选择要分配的全选！", {time:2000, icon:0, shift:6},function(){});
                }else {
                     var json = {roleId:roleId,ids:[]};
                    $.each(checkedNodes,function (index,permission) {
                        json["ids["+ index +"]"] = permission.id;
                    });
                   
                    $.ajax({
                        type:"post",
                        url:"${PATH}/role/assignPermission",
                        data:json,
                        success:function (backData) {
                            if(backData.result == "ok"){
                                layer.msg("分配权限成功", {time:2000, icon:6});
                            }else {
                                layer.msg("分配权限失败，请重试！", {time:2000, icon:2, shift:6},function(){});
                            }
                        }
                    });
                }
            });
        </script>
  </body>
</html>
