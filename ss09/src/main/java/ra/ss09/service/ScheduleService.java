package ra.ss09.service;

import ra.ss09.model.Schedule;
import ra.ss09.repository.ScheduleRepository;

import java.util.List;

public class ScheduleService {
    private final ScheduleRepository scheduleRepo = new ScheduleRepository();

    public List<Schedule> findAllScheduleByMovie(Long movieId) {
        return scheduleRepo.findAllByMovieId(movieId);
    }
}
