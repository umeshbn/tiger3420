package com.xworkz.Abstract;

public class SmarTester {
	public static void main(String[] args) {
		Andriod s=new Redmi();
		s.battery();
		s.display();
		s.Brand();
		s.hardwareSpace();
		s.Os();
		s.processor();
		s.wirlessAccess();
		
		Iphone i=new Iphone11();
		i.battery();
		i.Brand();
		i.display();
		i.hardwareSpace();
		i.processor();
		i.wirlessAccess();
		i.Os();
		Andriod s1=new realme();
		s1.processor();
		s1.display();
		s1.Brand();
		s1.wirlessAccess();
		s1.Os();
		s1.hardwareSpace();
		
		Iphone i1=new Iphone13();
		i1.battery();
		i1.Brand();
		i1.display();
		i1.hardwareSpace();
	}

}
