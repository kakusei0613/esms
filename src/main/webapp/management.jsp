<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工工资管理系统</title>
    <%@include file="/WEB-INF/views/common/link.jsp"%>
</head>
<body>
    <div class="container">
        <div class="department" style="float: left">
            <iframe src="/department/list" frameborder="1"></iframe>
        </div>
        <div class="position" style="float: left">
            <iframe src="/position/list" frameborder="1"></iframe>
        </div>
        <div class="education" style="float: left">
            <iframe src="/education/list" frameborder="1"></iframe>
        </div>
        <div class="admin" style="float: left">
            <iframe src="/admin/list" frameborder="1"></iframe>
        </div>
        <div class="action" style="float: bottom">

        </div>>
    </div>
</body>
</html>