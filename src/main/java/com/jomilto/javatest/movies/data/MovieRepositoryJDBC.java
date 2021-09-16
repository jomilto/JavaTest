package com.jomilto.javatest.movies.data;

import com.jomilto.javatest.movies.model.Genre;
import com.jomilto.javatest.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.Collection;

public class MovieRepositoryJDBC implements MovieRepository {

    private JdbcTemplate jdbcTemplate;

    public MovieRepositoryJDBC(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findByID(long id) {
        return null;
    }

    @Override
    public Collection<Movie> findAll() {

        return jdbcTemplate.query("select * from movies;", movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {

    }

    private static RowMapper<Movie> movieMapper = (rs, i) ->
            new Movie(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("minutes"),
                    Genre.valueOf(rs.getString("genre"))
            );
}
