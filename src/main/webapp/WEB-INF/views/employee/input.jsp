<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>员工工资管理系统</title>
    <%@include file="/WEB-INF/views/common/link.jsp"%>
</head>
<body>
<div align="center">
    <c:set var="currentMenu" value="employee" />
    <form action="saveOrUpdate.do" method="post">
        <c:if test="${not empty employee}">
            员工号：&nbsp;&nbsp;&nbsp;<input type="text" name="id" value="${employee.id}"><br>
        </c:if>
        姓名：&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="name" value="${employee.name}"><br>
        性别：&nbsp;&nbsp;&nbsp;&nbsp;
        <select type="text" name="sex">
            <option value="0">女</option>
            <option value="1">男</option>
        </select>
        <script>
            if (${employee.sex}){
                $("select[name='sex']").val(1);
            }
            else
                $("select[name='sex']").val(0);
        </script>
        <br>
        出生日期：&nbsp;&nbsp;<input type="date" name="birthday" value="${employee.birthday}"><br>
        学历：&nbsp;&nbsp;&nbsp;&nbsp;
        <select type="text" name="education.id">
            <c:forEach items="${educations}" var="edu">
                <option value="${edu.id}">${edu.name}</option>
            </c:forEach>
        </select>
        <script>
            $("select[name='education.id']").val(${employee.education.id});
        </script>
        <br>
        入职日期：&nbsp;&nbsp;<input type="date" name="entryTime" value="${employee.entryTime}"><br>
        联系电话：&nbsp;&nbsp;<input type="text" name="phone" value="${employee.phone}"><br>
        地址：&nbsp;&nbsp;&nbsp;&nbsp;<textarea cols="15" rows="3" name="address">${employee.address}</textarea> <br>
        E-Mail：&nbsp;&nbsp;<input type="email" name="email" value="${employee.email}"><br>
        部门：&nbsp;&nbsp;&nbsp;&nbsp;
        <select type="text" name="department.id">
            <c:forEach items="${departments}" var="d">
                <option value="${d.id}">${d.name}</option>
            </c:forEach>
        </select>
        <script>
            $("select[name='department.id']").val(${employee.department.id});
        </script>
        <br>
        职位：&nbsp;&nbsp;&nbsp;&nbsp;
        <select type="text" name="position.id">
            <c:forEach items="${positions}" var="p">
                <option value="${p.id}">${p.name}</option>
            </c:forEach>
        </select>
        <script>
            $("select[name='position.id']").val(${employee.position.id});
        </script>
        <br>
        是否在职：&nbsp;&nbsp;
        <select type="text" name="onTheJob">
            <option value="0">否</option>
            <option value="1">是</option>
        </select>
        <script>
            if (${employee.onTheJob}){
                $("select[name='onTheJob']").val(1);
            }
            else
                $("select[name='onTheJob']").val(0);
        </script>
        <br>
        <input type="submit" value="保存">&nbsp;<input type="reset" value="重置">
    </form>
</div>
</body>
</html>