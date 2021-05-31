<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>职位管理</title>
    <%@include file="/WEB-INF/views/common/link.jsp"%>
</head>
<body>
<div style="text-align: left">
    <form action="/position/add" method="post">
        名称：<input type="text" size="3" name="name" placeholder="职位名称"><input type="submit" value="添加" ><br>
    </form>
</div>
<div style="text-align: left">
    <table border="1" cellspacing="1">
        <thead>
        <tr>
            <th>职位编号</th>
            <th>职位名称</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <!--遍历域对象中的学生信息集合-->
        <c:forEach items="${positions}" var="position" varStatus="vs">
            <tr>
                <td>${position.id}</td>
                <td>${position.name}</td>
                <td>
                    <a href="/position/delete?id=${position.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>