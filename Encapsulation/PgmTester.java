package com.xowkz.oops.Encapsulation;

public class PgmTester {
	
public static void main(String []args) {
		
		System.out.println("Bag Tester Started : ");
		
		Bag b = new Bag();
		
		b.setbrand("WildCraft");
		String brand = b.getBrand();
		System.out.println(brand);
		
		b.setType("Bagpacks for Men");
		String type = b.getType();
		System.out.println(type);
		
		b.setPrice(2499);
		int price = b.getPrice();
		System.out.println(price);
		
		byte zip = 4;
		b.setZips(zip);
		byte zips = b.getZips();
		System.out.println(zips);
		
		b.setColor("Blue with Orange skin inside");
		String color = b.getColor();
		System.out.println(color);
		
		b.setSize('M');
		char size = b.getSize();
		System.out.println(size);
		
		short cap = 40;
		b.setCapacity(cap);
		short capacity = b.getCapacity();
		System.out.println(capacity);
		
		b.setWaterProof(true);
		boolean wproof = b.getWaterProof();
		System.out.println(wproof);
		
		b.setQuality("Good");
		String quality = b.getQuality();
		System.out.println(quality);
		
		byte rate = 5;
		b.setRating(rate);
		byte rating  = b.getRating();
		System.out.println("rating in stars:"+" "+rating+"star");
		
		System.out.println("Bag Tester Ended :");
		System.out.println();
		
		System.out.println("Institution Tester Ended :");
		Institute i = new Institute();
		
		i.setName("X WorkZ");
		String name = i.getName();
		System.out.println(name);
		
		i.setType("Organization");
		String type1 = i.getType();
		System.out.println(type1);
		
		i.setCourse("JAVA full stack development course");
		String course = i.getCourse();
		System.out.println(course);
		
		i.setFees(25000);
		int fees = i.getFees();
		System.out.println(fees);
		
		byte  due = 5;
		i.setDuration(due);
		byte duration  = i.getDuration();
		System.out.println("duration of course in months :"+" "+duration+" monts");
		
		short revw = 5;
		i.setReviews(revw);
		short reviews  = i.getReviews();
		System.out.println("reviews in stars:"+" "+reviews+"star");
		
		byte  branch = 2;
		i.setBranches(branch);
		byte branches  = i.getBranches();
		System.out.println("No of branches :"+" "+branches+" branches");
		
		i.setTrainers(true);
		boolean trainer = i.getTrainers();
		System.out.println("Trainers are Good and friendly :"+"  "+trainer);
		
		i.setFtrainer("Nikung");
		String trainer1 = i.getFtrainer();
		System.out.println(trainer1);
		
		i.setNecessary("Good and Hrad working Trainees");
		String necessary = i.getNecessary();
		System.out.println(necessary);
		
		System.out.println("Institution tester ended");
		System.out.println();
		
	}


}
