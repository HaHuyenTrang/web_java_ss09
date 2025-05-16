package ra.ss09.service;

import ra.ss09.model.ScreenRoom;
import ra.ss09.repository.ScreenRoomRepository;

import java.util.List;

public class ScreenRoomService {
    private final ScreenRoomRepository roomRepo = new ScreenRoomRepository();

    public List<ScreenRoom> getAllRooms() {
        return roomRepo.findAll();
    }
}
