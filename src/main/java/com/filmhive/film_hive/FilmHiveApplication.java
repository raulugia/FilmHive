package com.filmhive.film_hive;

import com.filmhive.film_hive.service.GenreService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FilmHiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmHiveApplication.class, args);
	}

//	@Bean
//	CommandLineRunner populateGenreTable(GenreService genreService){
//		return args -> {
//			genreService.populateGenres();
//			System.out.println("Genres table populated");
//		};
//	}

}
