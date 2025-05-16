package ra.ss09.repository;

import ra.ss09.connection.DBConnection;
import ra.ss09.model.ScreenRoom;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ScreenRoomRepository {
    public List<ScreenRoom> findAll() {
        List<ScreenRoom> list = new ArrayList<>();
        String query = "SELECT * FROM screenRooms";
        try (Connection conn = DBConnection.openConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                ScreenRoom room = new ScreenRoom();
                room.setId(rs.getLong("id"));
                room.setScreenRoomName(rs.getString("screen_room_name"));
                room.setTotalSeat(rs.getInt("total_seat"));
                list.add(room);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
