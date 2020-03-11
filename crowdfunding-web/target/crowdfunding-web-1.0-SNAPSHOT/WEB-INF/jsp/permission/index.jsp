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
           <div><a class="navbar-brand" style="font-size:32px;" href="#">众筹平台 - 许可维护</a></div>
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
              <div class="panel-heading"><i class="glyphicon glyphicon-th-list"></i> 许可权限管理 <div style="float:right;cursor:pointer;" data-toggle="modal" data-target="#myModal"><i class="glyphicon glyphicon-question-sign"></i></div></div>
			  <div class="panel-body">
                  <ul id="treeDemo" class="ztree"></ul>
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
                            <input type="hidden" name="pid"/>
                            <label>权限名称</label>
                            <input type="text" class="form-control" id="addTitle" name="title" placeholder="请输入权限名称">
                        </div>
                        <div class="form-group">
                            <label>权限地址</label>
                            <input type="text" class="form-control" id="addName" name="name" placeholder="请输入权限地址">
                        </div>
                        <div class="form-group">
                            <label>权限样式</label>
                            <input type="text" class="form-control" id="addIcon" name="icon" placeholder="请输入权限样式">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" onclick="addMenu()" class="btn btn-primary">添加</button>
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
                    <h4 class="modal-title">添加角色</h4>
                </div>
                <div class="modal-body">
                    <form role="form" id="for2">
                        <div class="form-group">
                            <input type="hidden" name="id"/>
                            <label>权限名称</label>
                            <input type="text" class="form-control" id="updateTitle" name="title" placeholder="请输入权限名称">
                        </div>
                        <div class="form-group">
                            <label>权限地址</label>
                            <input type="text" class="form-control" id="updateName" name="name" placeholder="请输入权限地址">
                        </div>
                        <div class="form-group">
                            <label>权限样式</label>
                            <input type="text" class="form-control" id="updateIcon" name="icon" placeholder="请输入权限样式">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" onclick="updateMenu()" class="btn btn-primary">修改</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div>    

    
    <script src="${PATH}/static/jquery/jquery-2.1.1.min.js"></script>
    <script src="${PATH}/static/bootstrap/js/bootstrap.min.js"></script>
	<script src="${PATH}/static/script/docs.min.js"></script>
    <script src="${PATH}/static/jquery/layer/layer.js"></script>
	<script src="${PATH}/static/ztree/jquery.ztree.all-3.5.min.js"></script>
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
            //初始化权限维护树形结构
            function initzTree() {
                //简单的树形结构
                var setting = {
                    data: {
                        key:{name:"title"},
                        simpleData: {
                            enable: true, pIdKey: "pid"
                        }
                    },
                    view: {
                        addDiyDom: function (treeId, treeNode) {
                            $("#" + treeNode.tId + "_ico").removeClass();//.addClass();
                            $("#" + treeNode.tId + "_span").before("<span class='" + treeNode.icon + "'></span>");
                        },
                        addHoverDom: function (treeId, treeNode) {
                            var aObj = $("#" + treeNode.tId + "_a"); // tId = permissionTree_1, ==> $("#permissionTree_1_a")
                            aObj.attr("href", "javascript:;");
                            if (treeNode.editNameFlag || $("#btnGroup" + treeNode.tId).length > 0) return;
                            var s = '<span id="btnGroup' + treeNode.tId + '">';
                            if (treeNode.level == 0) {
                                s += '<a class="btn btn-info dropdown-toggle btn-xs" style="margin-left:10px;padding-top:0px;" onclick="addModal(' + treeNode.id + ')" >&nbsp;&nbsp;<i class="fa fa-fw fa-plus rbg "></i></a>';
                            } else if (treeNode.level == 1) {
                                s += '<a class="btn btn-info dropdown-toggle btn-xs" style="margin-left:10px;padding-top:0px;"  onclick="updateModal(' + treeNode.id + ')" title="修改权限信息">&nbsp;&nbsp;<i class="fa fa-fw fa-edit rbg "></i></a>';
                                if (treeNode.children.length == 0) {
                                    s += '<a class="btn btn-info dropdown-toggle btn-xs" style="margin-left:10px;padding-top:0px;" onclick="deleteModal(' + treeNode.id + ')" >&nbsp;&nbsp;<i class="fa fa-fw fa-times rbg "></i></a>';
                                }
                                s += '<a class="btn btn-info dropdown-toggle btn-xs" style="margin-left:10px;padding-top:0px;" onclick="addModal(' + treeNode.id + ')" >&nbsp;&nbsp;<i class="fa fa-fw fa-plus rbg "></i></a>';
                            } else if (treeNode.level == 2) {
                                s += '<a class="btn btn-info dropdown-toggle btn-xs" style="margin-left:10px;padding-top:0px;"  onclick="updateModal(' + treeNode.id + ')" title="修改权限信息">&nbsp;&nbsp;<i class="fa fa-fw fa-edit rbg "></i></a>';
                                s += '<a class="btn btn-info dropdown-toggle btn-xs" style="margin-left:10px;padding-top:0px;" onclick="deleteModal(' + treeNode.id + ')">&nbsp;&nbsp;<i class="fa fa-fw fa-times rbg "></i></a>';
                            }
    
                            s += '</span>';
                            aObj.after(s);
                        },
                        removeHoverDom: function (treeId, treeNode) {
                            $("#btnGroup" + treeNode.tId).remove();
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
                    }
                });
            }
            
            //展示添加模态框
            function addModal(pid) {
                $("#for1 input[name='pid']").val(pid);
                
                //清除模态框数据
                $("#for1 input[name='name']").val("");
                $("#for1 input[name='title']").val("");
                $("#for1 input[name='icon']").val("");
                $("#addModal").modal({
                    show:true,
                    backdrop:'static'
                });
            }
            //添加权限
            function addMenu() {
                $.ajax({
                    type:"post",
                    url:"${PATH}/permission/add",
                    data:$("#for1").serialize(),
                    success:function () {
                        //关闭模态框
                        $('#addModal').modal('hide');
                        initzTree();
                    }
                });
            }
            
            //展示修改模态框
            function updateModal(id) {
                $.ajax({
                    type:"post",
                    url:"${PATH}/permission/query",
                    data:{id:id},
                    success:function (backData) {
                        //回显数据
                        $("#for2 input[name='id']").val(backData.id);
                        $("#for2 input[name='title']").val(backData.title);
                        $("#for2 input[name='name']").val(backData.name);
                        $("#for2 input[name='icon']").val(backData.icon);
                        
                        //展示模态框
                        $("#updateModal").modal({
                            show:true,
                            backdrop:'static'
                        });
                    }
                });
            }
            
            //修改数据
            function updateMenu() {
                $.ajax({
                    type:"post",
                    url:"${PATH}/permission/update",
                    data:$("#for2").serialize(),
                    success:function () {
                        //关闭模态框
                        $('#updateModal').modal('hide');
                        initzTree();
                    }
                });
            }
            
            //删除权限信息
            function deleteModal(id) {
                layer.confirm('确定要删除该条数据吗？',{btn:['确定','取消']}
                    ,function (index) {
                        $.get("${PATH}/permission/delete",{id:id},function () {
                            initzTree();
                        });
                        layer.close(index);
                    },function (index) {
                        layer.close(index);}
                );
                
            }
            
        </script>
  </body>
</html>
