package ra.ss09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ra.ss09.model.Movie;
import ra.ss09.model.Schedule;
import ra.ss09.model.ScreenRoom;
import ra.ss09.service.MovieService;
import ra.ss09.service.ScheduleService;
import ra.ss09.service.ScreenRoomService;

import java.util.List;

@Controller
public class HomeController {
    private final MovieService movieService = new MovieService();
    private final ScheduleService scheduleService = new ScheduleService();
    private final ScreenRoomService screenRoomService = new ScreenRoomService();

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

        List<Schedule> schedules = scheduleService.findAllScheduleByMovie(id);
        model.addAttribute("schedules", schedules);

        List<ScreenRoom> rooms = screenRoomService.getAllRooms();
        model.addAttribute("rooms", rooms);

        return "detailMovie";
    }

}
