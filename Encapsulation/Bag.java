package com.xowkz.oops.Encapsulation;

public class Bag {
	
	private String brand;
	private String type;
	private int price;
	private byte zips;
	private String color;
	private char size;
	private short capacity;
	private boolean waterproof;
	private String quality;
	private byte rating;
	
	
	public Bag() {
		
		
	}
	public void setbrand(String brand) {
		this.brand= brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setType(String type) {
		this.type = type;
		
	}
	public String getType() {
		return type;
	}
	public void setPrice(int price) {
		this.price = price;	
	}
	public int getPrice() {
		return price;
	}
	public void setZips(byte zips) {
		this.zips = zips;
	}
	public byte getZips() {
		return zips;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setSize(char size) {
		this.size = size;
	}
	public char getSize() {
		return size;
	}
	public void setCapacity(short cpacity) {
		this.capacity = capacity;
	}
	public short getCapacity() {
		return capacity;
	}
	public void setWaterProof(boolean waterproof) {
		this.waterproof = waterproof;
	}
	public boolean getWaterProof() {
		return waterproof;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getQuality() {
		return quality;
	}
	public void setRating(byte rating) {
		this.rating = rating;
	}
	public byte getRating() {
		return rating;
	}
	

}
