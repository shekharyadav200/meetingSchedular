package com.turvo.meetingSchedular;

import java.util.Date;

public class Room {
	private String roomIdentifier;
	private int capacity;
	private Date availableStartTime;
	private Date availableEndTime;

	public String getRoomIdentifier() {
		return roomIdentifier;
	}

	public void setRoomIdentifier(String roomIdentifier) {
		this.roomIdentifier = roomIdentifier;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Date getAvailableStartTime() {
		return availableStartTime;
	}

	public void setAvailableStartTime(Date availableStartTime) {
		this.availableStartTime = availableStartTime;
	}

	public Date getAvailableEndTime() {
		return availableEndTime;
	}

	public void setAvailableEndTime(Date availableEndTime) {
		this.availableEndTime = availableEndTime;
	}

}
