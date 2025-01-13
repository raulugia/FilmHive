package com.filmhive.film_hive.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.Set;

public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    @NotEmpty(message = "Title cannot be empty")
    @NotNull(message = "Title is required")
    @Size(min = 1, max = 100, message = "Title must be between 1 and 100 characters")
    private String title;

    @Column(name = "release_date")
    @NotNull(message = "Release date is required")
    private LocalDate releaseDate;

    @Column(name = "duration")
    @NotNull(message = "Duration is required")
    private int duration;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "overview")
    @NotEmpty(message = "Overview cannot be empty")
    @NotNull(message = "Overview is required")
    private String overview;

    @Column(name = "budget")
    @NotNull(message = "Budget is required")
    private double budget;

    @Column(name = "revenue")
    @NotNull(message = "Revenue is required")
    private double revenue;

    @ManyToMany(mappedBy = "films")
    @JoinTable(
            name = "film_genres",
            joinColumns = @JoinColumn(name="film_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private Set<Genre> genres;

    public Film(){

    }

    public Film(String title, LocalDate releaseDate, int duration, String imageUrl, String overview, double budget, double revenue) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.imageUrl = imageUrl;
        this.overview = overview;
        this.budget = budget;
        this.revenue = revenue;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }
}
