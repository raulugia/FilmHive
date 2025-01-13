package com.filmhive.film_hive.repository;

import com.filmhive.film_hive.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
