package com.turvo.meetingSchedular;

import java.time.LocalDateTime;

public class Meeting {
private String meetingIdentifier;
private int numberOfAttendees;
private LocalDateTime startTime;
private LocalDateTime endTime ;
public String getMeetingIdentifier() {
	return meetingIdentifier;
}
public void setMeetingIdentifier(String meetingIdentifier) {
	this.meetingIdentifier = meetingIdentifier;
}
public int getNumberOfAttendees() {
	return numberOfAttendees;
}
public void setNumberOfAttendees(int numberOfAttendees) {
	this.numberOfAttendees = numberOfAttendees;
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
