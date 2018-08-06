package com.turvo.meetingSchedular;

import java.time.LocalDateTime;

public class RoomMettingSchedularRequestDto {
private String room_id;
private Integer numberOfAttendee;
private LocalDateTime startTime;
private LocalDateTime endTime;
public String getRoom_id() {
	return room_id;
}
public void setRoom_id(String room_id) {
	this.room_id = room_id;
}
public Integer getNumberOfAttendee() {
	return numberOfAttendee;
}
public void setNumberOfAttendee(Integer numberOfAttendee) {
	this.numberOfAttendee = numberOfAttendee;
}
public LocalDateTime getStartTime() {
	return startTime;
}
public void setStartTime(LocalDateTime startTime) {
	this.startTime = startTime;
}
public LocalDateTime getEndTime() {
	return endTime;
}
public void setEndTime(LocalDateTime endTime) {
	this.endTime = endTime;
}


}
