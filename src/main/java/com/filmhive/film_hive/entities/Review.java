package com.filmhive.film_hive.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "content")
    @NotNull(message = "Review content is required")
    @NotEmpty(message = "Review cannot be empty")
    @Size(min = 10, max = 800, message = "Review must be between 10 and 800 characters")
    private String content;

    @Column(name = "rating")
    @NotNull(message = "Rating is required")
    @Size(min = 1, max = 5, message = "Rating must be between 1 and 5")
    private int rating;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    public Review(){

    }

    public Review(String content, int rating, User user){
        this.content = content;
        this.rating = rating;
        this.user = user;
    }

    @PrePersist
    protected void onCreate(){
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
