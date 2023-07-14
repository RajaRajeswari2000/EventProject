package com.rajarajeswari.spring.boot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="events")
public class EventEntity {
	@Id
	private String eventname;
	private String timing;
	private String location;
	private String about;
	
	public EventEntity() {
		
	}
	
	public EventEntity(String eventname, String timing, String location, String about) {
		super();
		this.eventname = eventname;
		this.timing = timing;
		this.location = location;
		this.about = about;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	@Override
	public String toString() {
		return "EventEntity [eventname=" + eventname + ", timing=" + timing + ", location=" + location + ", about="
				+ about + "]";
	}
	
	

}
