package ra.ss09.repository;

import ra.ss09.connection.DBConnection;
import ra.ss09.model.Schedule;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ScheduleRepository {

    public List<Schedule> findAllByMovieId(Long movieId) {
        List<Schedule> schedules = new ArrayList<>();
        String query = "SELECT * FROM schedules WHERE movie_id = ?";
        try (Connection conn = DBConnection.openConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setLong(1, movieId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Schedule schedule = new Schedule();
                schedule.setId(rs.getLong("id"));
                schedule.setMovieId(rs.getLong("movie_id"));
                schedule.setShowTime(rs.getTimestamp("show_time"));
                schedule.setScreenRoomId(rs.getLong("screen_room_id"));
                schedule.setAvailableSeats(rs.getInt("available_seats"));
                schedule.setFormat(rs.getString("format"));
                schedules.add(schedule);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return schedules;
    }
}

