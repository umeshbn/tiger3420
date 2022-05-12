package polymorshism.methodoverriding;

import java.util.Scanner;

public class CalculatorTester {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int s=cal.add(10,5);
		System.out.println(s);
		float f=cal.add(20,43.5f);
		System.out.println(f);
		int ss=cal.substract(299, 100);
		System.out.println(ss);
		float ff=cal.substract(34,78.6f);
		System.out.println(ff);
		int mul=cal.multiply(10,23);
		System.out.println(mul);
		int a=cal.divison(10,5);
		System.out.println(a);
		double d=cal.percetage(500, 600);
		System.out.println(d);

	}

}
