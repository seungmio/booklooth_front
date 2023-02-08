package com.example.booklooth.data;

public class SearchListViewData {
    private int bookImage;
    private String bookName;
    private String bookInform;

    public SearchListViewData(int bookImage, String bookName, String bookInform) {
        this.bookImage = bookImage;
        this.bookName = bookName;
        this.bookInform = bookInform;
    }

    public int getBookImage() {
        return bookImage;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookInform() {
        return bookInform;
    }
}