<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工工资管理系统</title>
    <%@include file="/WEB-INF/views/common/link.jsp"%>
</head>
<body>
<div align="center">
    <form action="/employee/list" id="searchForm" method="post">
        <input type="hidden" name="currentPage" id="currentPage" value="1">
        关键字：<input type="text" id="keyword" name="keyword" placeholder="输入姓名或者邮箱" value="${qo.keyword}">&nbsp;
        部门：
        <select name="deptId" id="dept">
            <option value="-1">全部</option>
            <c:forEach items="${departments}" var="d">
                <option value="${d.id}">${d.name}</option>
            </c:forEach>
        </select>
        <script>
            // 编写JS脚本，回显已选择的部门
            $("#dept option[value='${qo.deptId}']").prop("selected", true);
        </script>
        <input type="submit" value="搜索">&nbsp;
    </form>
    <a href="/employee/input">添加员工</a>
</div>
<div align="center">
    <table border="1" cellspacing="0" align="center">
        <thead>
        <tr>
            <th>序号</th>
            <th>员工号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>出生日期</th>
            <th>学历</th>
            <th>入职日期</th>
            <th>联系电话</th>
            <th>地址</th>
            <th>E-Mail</th>
            <th>部门</th>
            <th>职位</th>
            <th>是否在职</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <!--遍历域对象中的学生信息集合-->
        <c:forEach items="${pageResult.data}" var="employees" varStatus="vs">
            <tr>
                <td>${vs.count}</td>
                <td>${employees.id}</td>
                <td>${employees.name}</td>
                <td>
                    <c:choose>
                        <c:when test="${employees.sex} == 0">
                            女
                        </c:when>
                        <c:otherwise>
                            男
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>${employees.birthday}</td>
                <td>${employees.education.name}</td>
                <td>${employees.entryTime}</td>
                <td>${employees.phone}</td>
                <td>${employees.address}</td>
                <td>${employees.email}</td>
                <td>${employees.department.name}</td>
                <td>${employees.position.name}</td>
                <td>
                    <c:choose>
                        <c:when test="${employees.onTheJob} == 0">
                            否
                        </c:when>
                        <c:otherwise>
                            是
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <a href="/employee/input?id=${employees.id}">编辑</a>
                    <a href="/employee/delete?id=${employees.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <%@ include file="/WEB-INF/views/common/page_plus.jsp"%>
</div>
</body>
</html>