package com.filmhive.film_hive.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

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

}
