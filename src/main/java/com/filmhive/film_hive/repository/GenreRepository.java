package com.filmhive.film_hive.repository;

import com.filmhive.film_hive.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
