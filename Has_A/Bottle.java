package com.xowkz.oops.Has_A;

public class Bottle {
	private String color;
	private String type;
	private short price;
	private Cap cap;
	
	public String  getAll() {
		String obj=color+"\t"+type+"\t"+price+"\t"+cap.getAll();
		return obj;
	}
	
	public  Bottle() {
		
	}
	

	public Cap getCap() {
		return cap;
	}

	public void setCap(Cap cap) {
		this.cap = cap;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public short getPrice() {
		return price;
	}

	public void setPrice(short price) {
		this.price = price;
	}
	

}
