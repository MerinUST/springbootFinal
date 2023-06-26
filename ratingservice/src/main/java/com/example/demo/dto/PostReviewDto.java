package com.example.demo.dto;



public class PostReviewDto {
    private String username;
    private long id;
    private long isbn;
    private int rating;
    private String comment;
    private int ratingid;

    public PostReviewDto() {
    }

    public PostReviewDto(String username, long id, long isbn, int rating, String comment, int ratingid) {
        this.username = username;
        this.id = id;
        this.isbn = isbn;
        this.rating = rating;
        this.comment = comment;
        this.ratingid = ratingid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRatingid() {
        return ratingid;
    }

    public void setRatingid(int ratingid) {
        this.ratingid = ratingid;
    }
}
