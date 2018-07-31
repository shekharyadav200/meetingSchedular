package com.turvo.meetingSchedular;

import java.util.Date;

public class Meeting {
private String meetingIdentifier;
private int numberOfAttendees;
private Date startTime;
private Date endTime ;
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
public Date getStartTime() {
	return startTime;
}
public void setStartTime(Date startTime) {
	this.startTime = startTime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
	
	
}
