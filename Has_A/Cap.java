package com.xowkz.oops.Has_A;

public class Cap {
	
	private String color;
	private String shape;
	private int size;
	
	public Cap() {
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public String getAll() {
		String obj=color +"\t"+ shape+"\t"+size;
		return obj;

	}
}
