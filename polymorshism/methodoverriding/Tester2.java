package polymorshism.methodoverriding;

public class Tester2 {
  public static void main(String[] args) {
	  ScientificCal cal=new ScientificCal();
	 int c= cal.add(27, 45);
	 int u= cal.substract(45, 15);
	 System.out.println(c+"\n"+u);
  	}
}
