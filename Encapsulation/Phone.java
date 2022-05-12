package com.xowkz.oops.Encapsulation;

public class Phone {
	private String brand;
	private String type;
	private byte ram;
	private short rom;
	private float frontCamera;
	private boolean storagExpandable;
	private String warranty;
	private boolean touchScreen;
	private String color;
	private double display;
	
	public Phone() {
		
	}
	void setBrand(String brand) {
		this.brand=brand;
	}
	String getBrand() {
		return brand;
	}
	void setType(String type) {
		this.type=type;
	}
	String getType() {
		return type;
	}
	void setRam(byte ram) {
		this.ram=ram;
	}
	byte getRam() {
		return ram;
	}
	void setRom(short rom) {
		this.rom=rom;
	}
	short getRom() {
		return rom;
	}
	void setFrontCamera(float frontCamera) {
		this.frontCamera=frontCamera;
	}
	float getFrontCamera() {
	   return frontCamera;
	}
	void setStorageExpandable(boolean storagExpandable) {
		this.storagExpandable=storagExpandable;
	}
	boolean getStoragExpandable() {
		return storagExpandable;
	}
	void setWarranty(String warranty) {
		this.warranty=warranty;
	}
	String getWarranty() {
		return warranty;
	}
	void setTouchScreen(boolean touchScreen) {
		this.touchScreen=touchScreen;
	}
	boolean getTouchScreen() {
		return touchScreen;
	}
	void setColor(String color) {
		this.color=color;
	}
	String getColor() {
		return color;
	}
	void setDisplay(double display) {
		this.display=display;
	}
	double getDisplay() {
		return display;
	}
}
