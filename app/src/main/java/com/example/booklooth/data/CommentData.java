package com.example.booklooth.data;

import java.sql.Timestamp;

public class CommentData {
    private String commentImg;
    private int commentId;  //댓글 고유 id
    private int reviewId;   //리뷰 고유 id
    private String userName;
    private Timestamp commentDate;  //댓글 작성 날짜
    private String commentContent;  //댓글 내용

    public CommentData(String commentImg, int commentId, int reviewId, String userName, Timestamp commentDate, String commentContent) {
        this.commentImg = commentImg;
        this.commentId = commentId;
        this.reviewId = reviewId;
        this.userName = userName;
        this.commentDate = commentDate;
        this.commentContent = commentContent;
    }

    public String getCommentImg() {
        return commentImg;
    }

    public void setCommentImg(String commentImg) {
        this.commentImg = commentImg;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userId) {
        this.userName = userId;
    }

    public Timestamp getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Timestamp commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
}
