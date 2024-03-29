package com.dacproject.SocialHelpCarePortal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Event {
	
	@Id
	@GeneratedValue
	private int eventId;
	private String eventName;
	private String date;
	private int duration;
	private String venue;
	private String eventtype;
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getEventtype() {
		return eventtype;
	}
	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}
	public Event(String eventName, String date, int duration, String venue, String eventtype) {
		super();
		this.eventName = eventName;
		this.date = date;
		this.duration = duration;
		this.venue = venue;
		this.eventtype = eventtype;
	}
	public Event() {
		
	}
	@Override
	public String toString() {
		return "Event [eventName=" + eventName + "]";
	}
	
	
	
}
