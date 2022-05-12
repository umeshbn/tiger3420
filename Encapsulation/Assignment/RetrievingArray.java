package com.xowkz.oops.Encapsulation.Assignment;

import java.util.Scanner;

public class RetrievingArray {

	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int prices[] = new int[6];
			for(int i=0;i<prices.length;i++) {
				prices[i]=scan.nextInt();
				System.out.println(prices[i]);
				
			}
	}

}
