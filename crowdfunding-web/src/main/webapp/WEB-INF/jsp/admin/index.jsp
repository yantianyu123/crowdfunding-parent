<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <div><a class="navbar-brand" style="font-size:32px;" href="#">众筹平台 - 用户维护</a></div>
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
                                <input class="form-control has-success" type="text" placeholder="请输入查询条件">
                            </div>
                        </div>
                        <button type="button" class="btn btn-warning"><i class="glyphicon glyphicon-search"></i> 查询</button>
                    </form>
                    <button type="button" class="btn btn-danger" style="float:right;margin-left:10px;"><i class=" glyphicon glyphicon-remove"></i> 删除</button>
                    <button type="button" class="btn btn-primary" style="float:right;" onclick="window.location.href='${PATH}/admin/addPage'"><i class="glyphicon glyphicon-plus"></i> 新增</button>
                    <br>
                    <hr style="clear:both;">
                    <div class="table-responsive">
                        <table class="table  table-bordered">
                            <thead>
                                <tr >
                                    <th width="30">#</th>
                                    <th width="30"><input type="checkbox"></th>
                                    <th>账号</th>
                                    <th>名称</th>
                                    <th>邮箱地址</th>
                                    <th width="100">操作</th>
                                </tr>
                            </thead>
                            <tbody>
                                <C:forEach items="${requestScope.pageInfo.list}" var="admin" varStatus="status">
                                    <tr>
                                        <td>${status.count}</td>
                                        <td><input type="checkbox"></td>
                                        <td>${admin.loginacct}</td>
                                        <td>${admin.username}</td>
                                        <td>${admin.email}</td>
                                        <td>
                                            <button type="button" class="btn btn-success btn-xs"><i class=" glyphicon glyphicon-check"></i></button>
                                            <button type="button" onclick="update(${admin.id})" class="btn btn-primary btn-xs"><i class=" glyphicon glyphicon-pencil"></i></button>
                                            <button type="button" class="btn btn-danger btn-xs"><i class=" glyphicon glyphicon-remove"></i></button>
                                        </td>
                                    </tr>
                                </C:forEach>
                            </tbody>
                            <tfoot>
                                <tr >
                                    <td colspan="6" align="center">
                                        <ul class="pagination">
                                            <c:if test="${requestScope.pageInfo.isFirstPage}" >
                                                <li class="disabled"><a href="#">上一页</a></li>
                                            </c:if>
                                            <c:if test="${!requestScope.pageInfo.isFirstPage}" >
                                                <li><a href="${PATH}/admin/index?pageNum=${pageInfo.pageNum-1}">上一页</a></li>
                                            </c:if>
                                            <!-- 页码号 -->
                                            <C:forEach items="${pageInfo.navigatepageNums}" var="num">
                                                <C:if test="${pageInfo.pageNum == num}">
                                                    <li class="active"><a href="#">${num} <span class="sr-only">(current)</span></a></li>
                                                </C:if>
                                                <C:if test="${pageInfo.pageNum != num}">
                                                    <li><a href="${PATH}/admin/index?pageNum=${num}">${num}</a></li>
                                                </C:if>
                                            </C:forEach>


                                            <c:if test="${requestScope.pageInfo.isLastPage}" >
                                                <li class="disabled"><a href="#">下一页</a></li>
                                            </c:if>
                                            <c:if test="${!requestScope.pageInfo.isLastPage}" >
                                                <li><a href="${PATH}/admin/index?pageNum=${pageInfo.pageNum+1}">下一页</a></li>
                                            </c:if>
                                        </ul>
                                    </td>
                                </tr>
                            </tfoot>
                        </table>
                    </div>
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
    <%-- 跳转到修改页面 --%>
    function update(id){
        location.href = "${PATH}/admin/editPage?id="+id;
    }
</script>
</body>
</html>
