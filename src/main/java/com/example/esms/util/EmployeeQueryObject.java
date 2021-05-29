package com.example.esms.util;

public class EmployeeQueryObject extends QueryObject{
//    对员工的查询不仅要分页，还要带关键字查询
    private String keyword;
    private Integer deptId = -1;

    @Override
    public String toString() {
        return "EmployeeQueryObject{" +
                "keyword='" + keyword + '\'' +
                ", deptId=" + deptId +
                '}';
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public int getStart() {
        return super.getStart();
    }

    @Override
    public int getCurrentPage() {
        return super.getCurrentPage();
    }

    @Override
    public void setCurrentPage(int currentPage) {
        super.setCurrentPage(currentPage);
    }

    @Override
    public int getPageSize() {
        return super.getPageSize();
    }

    @Override
    public void setPageSize(int pageSize) {
        super.setPageSize(pageSize);
    }
}
