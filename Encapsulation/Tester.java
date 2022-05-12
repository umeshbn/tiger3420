package com.xowkz.oops.Encapsulation;

public class Tester {
			public static void main(String[] args) {
				Car c=new Car();
				c.setBrand("Tata");
				String t=c.getBrand();
				c.setPrice(2000000);
				long l=c.getPrice();
				byte ba=100;
				c.setWeight(ba);
				byte b=c.getWeight();
				c.setColor("black");
				String t1=c.getColor();
				c.setSensor(true);
				boolean t3=c.getSensor();
				c.setEngine("petrol");
				String sa=c.getEngine();
				short shh=14;
				c.setFuelCapacity(shh);
				short sh=c.getFuelCapacity();
				c.setAirBaloan(true);
				boolean bl=c.getAirBaloan();
				c.setNumOfDoors(4);
				int i=c.getnumOfDoors();
				c.setSpeed(12);
				int ii=c.getSpeed();
				byte bb=5;
				c.setNumOfSeats(bb);
				byte b1=c.getNumOfSeats();
				System.out.println(t+"\n"+l+"\n"+b+"\n"+t1+"\n"+t3+"\n"+sa+"\n"+sh+"\n"+bl+"\n"+i+"\n"+ii+"\n"+b1);
				System.out.println("=====================================");
				Phone p=new Phone();
				p.setBrand("andriod");
				String s=p.getBrand();
				
				p.setType("redmi note 7 pro");
				String st=p.getType();
				byte bbb=4;
				p.setRam(bbb);
				byte b3=p.getRam();
				short sh0=64;
				p.setRom(sh0);
				short sho=p.getRom();
				p.setFrontCamera(8.5f);
				float f=p.getFrontCamera();
				p.setStorageExpandable(true);
				boolean e=p.getStoragExpandable();
				p.setWarranty("1 year");
				String w=p.getWarranty();
				p.setTouchScreen(true);
				boolean o=p.getTouchScreen();
				p.setColor("blue");
				String co=p.getColor();
				p.setDisplay(6.3);
				double d=p.getDisplay();
			System.out.println(s+"\n"+st+"\n"+b3+"\n"+sho+"\n"+f+"\n"+e+"\n"+w+"\n"+o+"\n"+co+"\n"+d);

				}
}
