package com.turvo.meetingSchedular;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class MettingSchedularService {
	private static List<Room> rooms = new ArrayList<Room>();
	private static Map<String, List<Meeting>> map = new HashMap<String, List<Meeting>>();
	static {
		Room room = new Room();
		room.setRoomIdentifier(UUID.randomUUID().toString());
		room.setCapacity(10);
		room.setAvailableEndTime(LocalDateTime.parse("2007-12-03T10:15:30"));
		room.setAvailableStartTime(LocalDateTime.parse("2007-12-03T10:15:30"));
		Room room1 = new Room();
		room1.setRoomIdentifier(UUID.randomUUID().toString());
		room1.setCapacity(4);
		room1.setAvailableEndTime(LocalDateTime.parse("2007-12-03T10:15:30"));
		room1.setAvailableStartTime(LocalDateTime.parse("2007-12-03T10:15:30"));
		Room room2 = new Room();
		room2.setRoomIdentifier(UUID.randomUUID().toString());
		room2.setCapacity(15);
		room2.setAvailableEndTime(LocalDateTime.parse("2007-12-03T10:15:30"));
		room2.setAvailableStartTime(LocalDateTime.parse("2007-12-03T10:15:30"));
		Room room3 = new Room();
		room3.setRoomIdentifier(UUID.randomUUID().toString());
		room3.setCapacity(30);
		room3.setAvailableEndTime(LocalDateTime.parse("2007-12-03T10:15:30"));
		room3.setAvailableStartTime(LocalDateTime.parse("2007-12-03T10:15:30"));
		rooms.add(room);
		rooms.add(room1);
		rooms.add(room2);
		rooms.add(room3);
	}

	public List<Room> getRooms() {
		return rooms;

	}

	public Optional<Room> getRoomById(String id) {
		return rooms.stream().filter(room -> room.getRoomIdentifier().equalsIgnoreCase(id)).findFirst();
	}

	public List<Room> getRoomsByCapacity(Integer capacity) {
		return rooms.stream().filter(room -> room.getCapacity() >= capacity).collect(Collectors.toList());

	}

	public String roomBooking(RoomMettingSchedularRequestDto roomMettingSchedularRequestDto) {
		Meeting meeting = new Meeting();
		meeting.setMeetingIdentifier(UUID.randomUUID().toString());
		meeting.setNumberOfAttendees(roomMettingSchedularRequestDto.getNumberOfAttendee());
		meeting.setStartTime(roomMettingSchedularRequestDto.getStartTime());
		meeting.setEndTime(roomMettingSchedularRequestDto.getEndTime());
		List<Meeting> meetings = map.get(roomMettingSchedularRequestDto.getRoom_id());
		if (meetings == null) {
			meetings = new ArrayList<Meeting>();
		}
		meetings.add(meeting);
		map.put(roomMettingSchedularRequestDto.getRoom_id(), meetings);
		return "Sucess";
	}

	public List<Meeting> getScheduledMettingByRoomId(String room_id) {
		List<Meeting> list = map.get(room_id);
		return list.stream().filter(meeting -> meeting.getEndTime().isAfter(LocalDateTime.now()))
				.collect(Collectors.toList());

	}

	public Optional<Meeting> getScheduledMettingByMettingId(String meeting_id) {
		return map.values().stream().flatMap(List::stream).collect(Collectors.toList()).stream()
				.filter(meeting -> meeting.getMeetingIdentifier().equals(meeting_id)).findFirst();
	}
}
