package ra.ss09.service;

import ra.ss09.model.Movie;
import ra.ss09.repository.MovieRepository;

import java.util.List;

public class MovieService {
    private final MovieRepository movieDAO = new MovieRepository();

    public List<Movie> getAllMovies() {
        return movieDAO.findAll();
    }

    public Movie getMovieById(Long id) {
        return movieDAO.findById(id);
    }
}
