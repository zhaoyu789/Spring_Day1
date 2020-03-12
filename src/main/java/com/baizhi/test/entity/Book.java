package com.baizhi.test.entity;

public class Book {
    private String bookname;
    private String bookcolor;
    private Integer sishu;

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setBookcolor(String bookcolor) {
        this.bookcolor = bookcolor;
    }

    public void setSishu(Integer sishu) {
        this.sishu = sishu;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", bookcolor='" + bookcolor + '\'' +
                ", sishu=" + sishu +
                '}';
    }
}