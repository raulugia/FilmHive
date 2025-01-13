package com.filmhive.film_hive.service;

import com.filmhive.film_hive.entities.Genre;

import java.util.Optional;

public interface GenreService {
    Optional<Genre> findById(long id);

    Genre createGenre(Genre genre);

    Genre updateGenre(long id, Genre genre);

    String deleteGenre(long id);
}
