package com.example.esms.query;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SalaryQueryObject extends QueryObject{
    private String keyword;
    private String date;
    private Integer departmentId;

    public SalaryQueryObject() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        this.date = sdf.format(date);
        this.departmentId = -1;
        System.out.println(this.date);
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

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
