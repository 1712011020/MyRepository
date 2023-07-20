package com.njhf.the.thedemo.bean;

public class PageVo {
    private Integer pageNum;
    private Integer pageSize;

    public PageVo(Integer pageNum, Integer pageSize) {
        setPageNum(pageNum);
        setPageSize(pageSize);
    }

    public PageVo() {
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        if(pageNum==null||pageNum<=0){
            this.pageNum = 1;
        }else {
            this.pageNum=pageNum;
        }

    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if(pageSize==null||pageSize<=0){
            this.pageSize = 10;
        }else {
            this.pageSize=pageSize;
        }

    }
}
