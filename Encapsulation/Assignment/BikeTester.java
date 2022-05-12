package com.xowkz.oops.Encapsulation.Assignment;

public class BikeTester {
	public static void main(String[]args) {
		Bike b=new Bike();
		
		b.setCc(100);
		int c=b.getCc();
		System.out.println(c);
		b.setName(" rx 100");
		String s=b.getName();
		System.out.println(s);
		b.setWeight(78.0f);
		float f=b.getWeight();
		System.out.println(f);
		b.setCompany("yamaha");
		String s1=b.getCompany();
		System.out.println(s1);
		b.setPetrol(true);
		boolean bb=b.getPetrol();
		System.out.println(bb);
		
	}

}
