package com.turvo.meetingSchedular;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Room {
	private String roomIdentifier;
	private int capacity;
	/*@JsonSerialize(using = ToStringSerializer.class)
	// handles "yyyy-MM-dd" input just fine
	@JsonDeserialize(using = LocalDateDeserializer.class)*/
	private LocalDateTime availableStartTime;
	/*@JsonSerialize(using = ToStringSerializer.class)
	// handles "yyyy-MM-dd" input just fine
	@JsonDeserialize(using = LocalDateDeserializer.class)*/
	private LocalDateTime availableEndTime;
	@JsonIgnore
	private List<Slot> slots = new ArrayList<Slot>();

	public String getRoomIdentifier() {
		return roomIdentifier;
	}

	public List<Slot> getSlots() {
		return slots;
	}

	public void setSlots(List<Slot> slots) {
		this.slots = slots;
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

	public LocalDateTime getAvailableStartTime() {
		return availableStartTime;
	}

	public void setAvailableStartTime(LocalDateTime availableStartTime) {
		this.availableStartTime = availableStartTime;
	}

	public LocalDateTime getAvailableEndTime() {
		return availableEndTime;
	}

	public void setAvailableEndTime(LocalDateTime availableEndTime) {
		this.availableEndTime = availableEndTime;
	}

}
