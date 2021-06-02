package com.example.esms.query;

public class AbsenceQueryObject extends QueryObject{
    private Integer departmentId = -1;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
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
