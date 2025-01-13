package com.filmhive.film_hive.service;

import com.filmhive.film_hive.entities.Film;
import com.filmhive.film_hive.repository.FilmRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImp implements FilmService{
    private FilmRepository filmRepository;

    @Autowired
    FilmServiceImp(FilmRepository filmRepository){
        this.filmRepository = filmRepository;
    }

    @Override
    @Transactional
    public List<Film> findAll(){
        return filmRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Film> findById(long id){
        return filmRepository.findById(id);
    }

    @Override
    @Transactional
    public Film createFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    @Transactional
    public Film updateFilm(long id, Film film) {
        return null;
    }

    @Override
    @Transactional
    public String removeById(long id) {
        return "";
    }
}
