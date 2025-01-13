package com.filmhive.film_hive.service;


import com.filmhive.film_hive.entities.Film;

import java.util.List;

public interface FilmService {
    List<Film> findAll();

    Film findById(long id);

    Film createFilm();

    Film updateFilm();

    String removeById(long id);
}
