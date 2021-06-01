<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>工资管理</title>
    <%@include file="/WEB-INF/views/common/link.jsp"%>
</head>
<body>
<div style="text-align: left">
    <form action="/salary/list" id="searchForm" method="post">
        <input type="hidden" name="currentPage" id="currentPage">
        <script>
            $("#currentPage").val(${sqo.currentPage});
        </script>
        关键字：<input type="text" id="keyword" name="keyword" placeholder="输入姓名或者员工号" value="${sqo.keyword}">&nbsp;
        部门：
        <select name="departmentId" id="dept">
            <option value="-1">全部</option>
            <c:forEach items="${departments}" var="d">
                <option value="${d.id}">${d.name}</option>
            </c:forEach>
        </select>
        <script>
            // 编写JS脚本，回显已选择的部门
            $("#dept option[value='${sqo.departmentId}']").prop("selected", true);
        </script>
        每页显示记录数：
        <input type="text" id="pageSize" name="pageSize" size="1" placeholder="15">
        <script>
            $("#pageSize").val(${sqo.pageSize});
        </script>
        <input type="submit" value="搜索">&nbsp;
    </form>
</div>
<div style="text-align: left">
    <table border="1" cellspacing="1">
        <thead>
        <tr>
            <th>序号</th>
            <th>员工号</th>
            <th>姓名</th>
            <th>部门</th>
            <th>职位</th>
            <th>实发工资</th>
            <th>提成</th>
            <th>本月扣款</th>
            <th>实发工资</th>
        </tr>
        </thead>
        <tbody>
        <!--遍历域对象中的学生信息集合-->
        <c:forEach items="${pageRsult.data}" var="sr" varStatus="vs">
            <tr>
                <td>${vs.count}</td>
                <td>${sr.employee.id}</td>
                <td>${sr.name}</td>
                <td>${sr.department.name}</td>
                <td>${sr.position.name}</td>
                <td>${sr.employee.base}</td>
                <td>${sr.employee.extra}</td>
                <td>${sr.deduction}</td>
                <td>${sr.actSalary}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>