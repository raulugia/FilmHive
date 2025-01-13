package com.filmhive.film_hive.service;


import com.filmhive.film_hive.entities.Film;

import java.util.List;
import java.util.Optional;

public interface FilmService {
    List<Film> findAll();

    Optional<Film> findById(long id);

    Film createFilm(Film film);

    Film updateFilm(long id, Film film);

    String removeById(long id);
}
