package com.xworkz.Abstract;

public class Iphone13 extends Iphone {

	@Override
	public void processor() {
     System.out.println("Hexa-Core A15 Bionic Chip Processor");		
	}

	@Override
	public void display() {
		System.out.println("6.1 inch");
	}

	@Override
	public void hardwareSpace() {
		System.out.println("128GB ROM ");
		
	}

	@Override
	public void battery() {
		System.out.println("500 mAh battery back up");
		
	}

	@Override
	public void wirlessAccess() {
		System.out.println("supports all type wireless devices");
		
	}

}
