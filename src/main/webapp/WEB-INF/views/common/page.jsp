<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<div style="text-align: center;">
    第 ${pageResult.currentPage} 页，共 ${pageResult.totalPage} 页<br>
    <input type="button" id="first" value="首页">
    <input type="button" id="prev" value="上一页">
    <input type="button" id="next" value="下一页">
    <input type="button" id="last" value="尾页">
    转跳到第<input type="text" id="gotoPage" name="gotoPage" size="2" value="">页
    <input type="button" id="gotoPageBtn" value="转跳">
</div>
<script>
    $("#first").click(function () {
        if($("#currentPage").val() == 1) {
            return;
        }
        $("#currentPage").val(1);
        $("#searchForm").submit();
    })
    $("#next").click(function () {
        if( (${pageResult.nextPage}) == 1) {
            return;
        }
        $("#currentPage").val(${pageResult.nextPage});
        $("#searchForm").submit();
    })
    $("#prev").click(function () {
        $("#currentPage").val(${pageResult.prevPage});
        $("#searchForm").submit();
    })
    $("#last").click(function () {
        if( (${pageResult.lastPage}) == 1) {
            return;
        }
        $("#currentPage").val(${pageResult.totalPage});
        $("#searchForm").submit();
    })
    $("#gotoPageBtn").click(function () {
        var gpn = $("#gotoPage").val();
        if(gpn == "" || gpn == null || gpn > ${pageResult.totalPage}) {
            $("#gotoPage").val("");
            $("#searchForm").submit();
            return;
        }
        $("#currentPage").val(gpn);
        $("#searchForm").submit();
    })
</script>
</html>