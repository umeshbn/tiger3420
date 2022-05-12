package com.xowkz.oops.Encapsulation.Assignment;

public class Bike {
	private int cc;
	private String name;
	private  float weight;
	private  String company;
	private  boolean petrol;
	
	public Bike() {
		
	}

	 int getCc() {
		return cc;
	}

	 void setCc(int cc) {
		this.cc = cc;
	}

	 String getName() {
		return name;
	}

	 void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	 String getCompany() {
		return company;
	}

	 void setCompany(String company) {
		this.company = company;
	}

	 boolean getPetrol() {
		return petrol;
	}

	void setPetrol(boolean petrol) {
		this.petrol = petrol;
	}
	

}
