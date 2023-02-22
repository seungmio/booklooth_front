package com.example.booklooth.data;

public class MyReviewData {
    private int bookImage;
    private String bookName;

    public MyReviewData(int bookImage, String bookName) {
        this.bookImage = bookImage;
        this.bookName = bookName;
    }

    public int getBookImage() {
        return bookImage;
    }

    public void setBookImage(int bookImage) {
        this.bookImage = bookImage;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
