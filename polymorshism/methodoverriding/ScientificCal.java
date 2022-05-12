package polymorshism.methodoverriding;

public class ScientificCal extends Caculate {
	

	@Override
	public int add(int a,int b) {
		int sum=a+b;
		return sum;
		}
	public int substract(int s,int i) {
		int res= s-i;
		return res;
		
	}

}
