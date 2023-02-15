package com.example.booklooth.data;

public class FeedData {

    private int ProfileImg;   //유저 프로필사진
    private String userName;    //유저 이름
    private int like;   //좋아요 개수
    private String title;   //책 제목
    private String content; //내용


    public FeedData(String userName, int like, String title, String content){
        this.userName = userName;
        this.like = like;
        this.title = title;
        this.content = content;
    }

    public String getName() {
        return userName;
    }

    public void setName(String userName) {

        this.userName = userName;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
