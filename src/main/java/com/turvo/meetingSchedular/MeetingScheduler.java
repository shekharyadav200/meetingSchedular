package com.turvo.meetingSchedular;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meetingScheduler")
public class MeetingScheduler {
	@Autowired
	private MettingSchedularService mettingSchedularService;
	@GetMapping("/rooms")
	public ResponseEntity<List<Room>> getRooms() {
		return new ResponseEntity<List<Room>>(mettingSchedularService.getRooms(), HttpStatus.OK);
	}
	@GetMapping("/room/{id}")
	public ResponseEntity<Room> getRoomById(@PathVariable("id") String id) {
		return new ResponseEntity<Room>(mettingSchedularService.getRoomById(id).get(), HttpStatus.OK);
	}
	@GetMapping("/rooms/{capacity}")
	public ResponseEntity<List<Room>> getRoomsByCapacity(@PathVariable("capacity") Integer capacity) {
		return new ResponseEntity<List<Room>>(mettingSchedularService.getRoomsByCapacity(capacity), HttpStatus.OK);
	}
    @PostMapping("/BookingRequest")
	public ResponseEntity<String> roomBooking(@RequestBody RoomMettingSchedularRequestDto roomMettingSchedularRequestDto){
		return new ResponseEntity<String>(mettingSchedularService.roomBooking(roomMettingSchedularRequestDto), HttpStatus.OK);
	}
    @GetMapping("/getRoomByRoomId/{room_id}")
    public ResponseEntity<List<Meeting>> getMettingByRoomId(@PathVariable("room_id") String room_id){
		return new ResponseEntity<List<Meeting>>(mettingSchedularService.getScheduledMettingByRoomId(room_id), HttpStatus.OK);
	}
    @GetMapping("/getMeetingByMettingId/{meeting_id}")
    public ResponseEntity<List<Meeting>> getMettingByMeetingId(@PathVariable("meeting_id") String meeting_id){
		return new ResponseEntity<List<Meeting>>(mettingSchedularService.getScheduledMettingByRoomId(meeting_id), HttpStatus.OK);
	}
}
