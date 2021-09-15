package com.jomilto.javatest.movies.service;

import com.jomilto.javatest.movies.data.MovieRepository;
import com.jomilto.javatest.movies.model.Genre;
import com.jomilto.javatest.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        Collection<Movie> allMovies = movieRepository.findAll()
                .stream().filter(movie -> movie.getGenre() == genre)
                .collect(Collectors.toList());

        return allMovies;
    }
}
