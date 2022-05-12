package com.xworkz.Abstract;

public class Iphone11 extends Iphone {

	@Override
	public void processor() {
		System.out.println("A10");
	}

	@Override
	public void display() {
		System.out.println("5 inch display");
		
	}

	@Override
	public void hardwareSpace() {
		System.out.println("32GB space");
		
	}

	@Override
	public void battery() {
		System.out.println("3000MAh");		
	}

	@Override
	public void wirlessAccess() {
		System.out.println("supports all");
		
	}

}
