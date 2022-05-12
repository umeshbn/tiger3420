package com.xowkz.oops.Has_A;

import java.util.Scanner;

public class BottleTester {
	public static void main(String []args) {
	
		Scanner scan=new Scanner(System.in);
		
		
		Cap cap=new Cap();
		System.out.println("enter the cap color");
		cap.setColor(scan.next());
		System.out.println("enter the cap shape");
		cap.setShape(scan.next());
		System.out.println("enter the cap size");
		cap.setSize(scan.nextInt());
		
		Bottle bott=new Bottle();
		System.out.println("enter the bottle color");
		bott.setColor(scan.next());
		System.out.println("enter the bottle type");
		bott.setType(scan.next());
		System.out.println("enter the bottle size");
		bott.setPrice(scan.nextShort());
		bott.setCap(cap);
		
		System.out.println(bott.getAll());
	
		}
}
