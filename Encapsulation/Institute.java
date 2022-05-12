package com.xowkz.oops.Encapsulation;

public class Institute {
	
	private String name;
	private String type;
	private String course;
	private int fees;
	private byte duration;
	private short reviews;
	private byte branches;
	private boolean trainers;
	private String ftrainer;
	private String necessary;
	
	public Institute() {
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	public void setFees(int fees) {
		this.fees = fees;	
	}
	public int getFees() {
		return fees;
	}
	
	public void setDuration(byte duration) {
		this.duration = duration;
	}
	public byte getDuration() {
		return duration;
	}
	
	public void setReviews(short reviews) {
		this.reviews = reviews;
	}
	public short getReviews() {
		return reviews;
	}
	
	public void setBranches(byte branches) {
		this.branches = branches;
	}
	public byte getBranches() {
		return branches;
	}
	
	public void setTrainers(boolean trainers) {
		this.trainers = trainers;
	}
	public boolean getTrainers() {
		return trainers;
	}
	
	public void setFtrainer(String ftrainer) {
		this.ftrainer = ftrainer;
	}
	public String getFtrainer() {
		return ftrainer;
	}
	
	public void setNecessary(String necessary) {
		this.necessary = necessary;
	}
	public String getNecessary() {
		return necessary;
	}

}
