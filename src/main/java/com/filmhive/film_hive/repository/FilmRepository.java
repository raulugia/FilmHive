package com.filmhive.film_hive.repository;

import com.filmhive.film_hive.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
