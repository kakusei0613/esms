package com.example.esms.query;

public class EmployeeQueryObject extends QueryObject{
//    对员工的查询不仅要分页，还要带关键字查询
    private String keyword;
    private Integer deptId = -1;
    private Boolean showNotOnJob = Boolean.FALSE;

    @Override
    public String toString() {
        return "EmployeeQueryObject{" +
                "keyword='" + keyword + '\'' +
                ", deptId=" + deptId + ", pageSize=" + this.getPageSize() +
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

    public void setShowNotOnJob(Boolean onTheJob) {
        this.showNotOnJob = onTheJob;
    }

    public Boolean getShowNotOnJob() {
        return showNotOnJob;
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
