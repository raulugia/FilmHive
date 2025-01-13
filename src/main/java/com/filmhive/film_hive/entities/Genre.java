package com.filmhive.film_hive.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

@Entity
@Table(name = "genre")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "genre_name")
    @NotNull(message = "Genre name is required")
    private GenreType genreName;

    @ManyToMany(mappedBy = "genres")
    private Set<Film> films;

    public Genre(){

    }

    public Genre(GenreType genreName) {
        this.genreName = genreName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public GenreType getGenreName() {
        return genreName;
    }

    public void setGenreName(GenreType genreName) {
        this.genreName = genreName;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }
}
