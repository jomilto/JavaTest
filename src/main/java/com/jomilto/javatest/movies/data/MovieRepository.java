package com.jomilto.javatest.movies.data;

import com.jomilto.javatest.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {

    Movie findByID(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}
