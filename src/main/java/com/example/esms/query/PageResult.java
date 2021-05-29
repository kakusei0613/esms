package com.example.esms.query;

import java.util.List;

public class PageResult<T> {
    private List<T> data;
    private int totalCount;
    private int pageSize;
    private int currentPage;
    private int totalPage;
    private int prevPage;
    private int nextPage;

    public PageResult(List<T> data, int totalCount, int pageSize, int currentPage) {
//        System.out.println("totalCount:" + totalCount + " pageSize:" + pageSize + " currentPage:" + currentPage);
        this.data = data;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        if(totalCount < pageSize) {
            this.currentPage = 1;
            this.prevPage = 1;
            this.nextPage = 1;
            this.totalPage = 1;
            return;
        }
        this.totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
        this.nextPage = currentPage + 1 <= this.totalPage ? currentPage + 1 : this.totalPage;
        this.prevPage = currentPage - 1 >= 1 ? currentPage - 1 : 1;
    }

    public PageResult(int pageSize, int currentPage) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "data=" + data +
                ", totalCount=" + totalCount +
                ", pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                ", totalPage=" + totalPage +
                ", prevPage=" + prevPage +
                ", nextPage=" + nextPage +
                '}';
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPrevPage() {
        return prevPage;
    }

    public void setPrevPage(int prevPage) {
        this.prevPage = prevPage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
