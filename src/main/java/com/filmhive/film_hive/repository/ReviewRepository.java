package com.filmhive.film_hive.repository;

import com.filmhive.film_hive.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
