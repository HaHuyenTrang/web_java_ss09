package ra.ss09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ra.ss09.model.Movie;
import ra.ss09.service.MovieService;

import java.util.List;

@Controller
public class HomeController {
    private final MovieService movieService = new MovieService();

    @GetMapping("/")
    public String home(Model model) {
        List<Movie> movies = movieService.getAllMovies();
        model.addAttribute("movies", movies);
        return "home";
    }

    @GetMapping("/detailMovie")
    public String detailMovie(@RequestParam("id") Long id, Model model) {
        Movie movie = movieService.getMovieById(id);
        model.addAttribute("movie", movie);
        return "detailMovie"; // detailMovie.jsp hoặc detailMovie.html
    }
}
