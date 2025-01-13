package com.filmhive.film_hive.service;

import com.filmhive.film_hive.entities.Genre;
import com.filmhive.film_hive.repository.GenreRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GenreServiceImp implements GenreService{
    private GenreRepository genreRepository;

    @Autowired
    public GenreServiceImp(GenreRepository genreRepository){
        this.genreRepository = genreRepository;
    }

    @Override
    @Transactional
    public Optional<Genre> findById(long id) {
        return genreRepository.findById(id);
    }

    @Override
    @Transactional
    public Genre createGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    @Transactional
    public Genre updateGenre(long id, Genre genre) {
        return null;
    }

    @Override
    @Transactional
    public String deleteGenre(long id) {
        return "";
    }
}
