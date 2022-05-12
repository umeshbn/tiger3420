package com.xowkz.oops.Encapsulation.Assignment;


public class SeriesTester {
	
	public static void main(String []args) {
		SeriesOperation oper=new SeriesOperation();
			
		Series obj=new Series("the witcher","Action thriller","Netflix","Henry cavil");
		Series obj1=new Series("the witcher","Action thriller","Netflix","Henry cavil");
		Series obj2=new Series("the witcher","Action thriller","Netflix","Henry cavil");
		Series obj3=new Series("the witcher","Action thriller","Netflix","Henry cavil");
		
		oper.add(0,obj);
		System.out.println(obj);
		oper.add(1,obj1);		
		oper.add(2,obj2);
		oper.printAll();		
		oper.add(3,obj3);		
		oper.upadateNameByHero("the witcher 2","henry cavil");
		oper.printAll();			
	}

}
