package com.jomilto.javatest.movies.data;

import com.jomilto.javatest.movies.model.Genre;
import com.jomilto.javatest.movies.model.Movie;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class MovieRepositoryIntegrationTest {

    private MovieRepositoryJDBC movieRepository;
    private  DataSource dataSource;

    @Before
    public void setUp() throws Exception {

        dataSource = new DriverManagerDataSource("jdbc:h2:mem:text;MODE=MYSQL","sa","sa");
        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        movieRepository = new MovieRepositoryJDBC(jdbcTemplate);
    }

    @Test
    public void load_all_movies() {

        Collection<Movie> movies = movieRepository.findAll();

        assertEquals(Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "Matrix", 136, Genre.ACTION)
        ),movies);
    }

    @Test
    public void load_movie_by_id() {
        Movie movie = movieRepository.findByID(2);

        assertEquals(
                new Movie(2, "Memento", 113, Genre.THRILLER)
        , movie);
    }

    @Test
    public void insert_a_movie() {
        Movie movie = new Movie("Son como niños",122,Genre.COMEDY);
        movieRepository.saveOrUpdate(movie);

        Movie movieFound = movieRepository.findByID(4);

        assertEquals(
                new Movie(4, "Son como niños",122,Genre.COMEDY),
                movieFound
        );
    }

    @After
    public void tearDown() throws Exception {
        final Statement s = dataSource.getConnection().createStatement();
        s.execute("drop all objects delete files");
    }
}