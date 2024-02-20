package com.dailycodework.breezehotel.repository;

import com.dailycodework.breezehotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
