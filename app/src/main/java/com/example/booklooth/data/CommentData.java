package com.example.booklooth.data;

import java.sql.Timestamp;

public class CommentData {
    private String commentImg;
    private int commentId;  //댓글 id
    private int reviewId;   //리뷰 id
    private int userId; //사용자 id
    private Timestamp commentDate;  //댓글 작성 날짜
    private String commentContent;  //댓글 내용

    public CommentData(String commentImg, int commentId, int reviewId, int userId, Timestamp commentDate, String commentContent) {
        this.commentImg = commentImg;
        this.commentId = commentId;
        this.reviewId = reviewId;
        this.userId = userId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
