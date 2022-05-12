package polymorshism.methodoverriding;

public class Calculator {
	
	public int add(int num,int n) {
		return num+n;
	}
	
	public float add(int nu,float no) {
		return nu+no;
	}
	public int substract(int s,int i) {
		return s-i;
	}
	public float substract(int d,float i) {
		return d-i;
	}
	public int multiply(int b,int c) {
		return b*c;
		
	}
	public int divison(int a,int b) {
		
		return (a/b);
	}
public double percetage(int markscored,int maxmarks) {
		
		return (markscored*100)/maxmarks;
	}

}
