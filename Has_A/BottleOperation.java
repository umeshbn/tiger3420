package com.xowkz.oops.Has_A;

public class BottleOperation {
	  Bottle []bottle=new Bottle[3];

	 	public void add(int index,Bottle Bottl) {
	 		
	 		if(index<bottle.length) {
	 			System.out.println(bottle[index].getColor() +""+ bottle[index].getType() +""+ bottle[index].getPrice());
	 		}
	 	}
}
