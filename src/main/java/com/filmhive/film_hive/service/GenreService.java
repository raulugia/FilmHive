package com.filmhive.film_hive.service;

import com.filmhive.film_hive.entities.Genre;

public interface GenreService {
    Genre findById(long id);

    Genre createGenre();

    Genre updateGenre(long id);

    String deleteGenre(long id);
}
