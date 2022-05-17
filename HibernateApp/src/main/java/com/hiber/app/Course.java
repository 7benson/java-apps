package com.hiber.app;

import javax.persistence.Embeddable;

@Embeddable
public class Course {
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String course;
	private String duration;
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Course(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
