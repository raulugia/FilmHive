package com.filmhive.film_hive.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
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
    private List<Film> films = new ArrayList<>();

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

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", genreName=" + genreName +
                ", films=" + films +
                '}';
    }
}
