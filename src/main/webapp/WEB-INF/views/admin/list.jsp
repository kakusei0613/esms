<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>职位管理</title>
    <%@include file="/WEB-INF/views/common/link.jsp"%>
</head>
<body>
<div style="text-align: left">
    <form action="/admin/add" method="post">
        新用户：&nbsp;<input type="text" size="3" name="userName" placeholder="用户名"><br>
        密码：&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="userPassword" size="3"><br>
        <input type="submit" value="添加" ><br>
    </form>
</div>
<div style="text-align: left">
    <table border="1" cellspacing="1">
        <thead>
        <tr>
            <th>序号</th>
            <th>用户名</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <!--遍历域对象中的学生信息集合-->
        <c:forEach items="${admins}" var="admin" varStatus="vs">
            <tr>
                <td>${vs.count}</td>
                <td>${admin.userName}</td>
                <td>
                    <a href="/admin/delete?id=${admin.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>