package com.xowkz.oops.Encapsulation;

public class Car {
	private String brand;
	private long price;
	private byte weight;
	private String color;
	private  boolean sensor;
	private String engine;
	private short fuelCapacity;
	private boolean airBaloan;
	private int numOfDoors;
	private int speed;
	private byte numOfSeats;
	
	public Car() {
		
	}
	
	void setBrand(String brand) {
		this.brand=brand;
		}
	String getBrand() {
		return brand;	
	}
	void setPrice(long price) {
		this.price=price;
	}
	long getPrice() {
		return price;
	}
	void setWeight(byte weight) {
		this.weight=weight;
	}
	byte getWeight() {
		return weight;	
	}
	void setColor(String color) {
		this.color=color;
	}
	String getColor() {
		return color;
	}
	void setSensor(boolean sensor) {
		this.sensor=sensor;
	}
	boolean getSensor() {
		return sensor;
	}
	void setEngine(String engine) {
		this.engine=engine;
		
	}
	String getEngine() {
		return engine;
	}
	void setFuelCapacity(short fuelCapacity) {
		this.fuelCapacity=fuelCapacity;
	}
	  short getFuelCapacity(){
		  return fuelCapacity;
	  }
	  void setAirBaloan(boolean airBaloan) {
		  this.airBaloan=airBaloan;
		  
	  }
	  boolean getAirBaloan() {
		  return airBaloan;
	  }
	  void setNumOfDoors(int numOfDoors) {
		  this.numOfDoors=numOfDoors;  
	  }
	  int getnumOfDoors() {
		  return numOfDoors;
	  }
	  void setSpeed(int speed) {
		  this.speed=speed;
	  }
	  int getSpeed() {
		  return speed;
	  }
	  void setNumOfSeats(byte numOfSeats) {
		  this.numOfSeats=numOfSeats;
	  }
	  byte getNumOfSeats() {
		  return numOfSeats;
	  }

}
