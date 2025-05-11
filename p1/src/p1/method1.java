package p1;

public class method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s = "ujj";	
	int age = 30;
	id(s, age);
	
	double n1 = 5;
	//double result = sq(n1);
		System.out.println(sq2(n1));
		System.out.println(sq(n1));
		
	}
	static void id(String m, int n) {
		System.out.printf("my name is %s \n",m);	
		System.out.printf("my age is %d \n", n);
		
		}
	static double sq(double n) {
		System.out.println("the multiply of result is:");
		return n*n;  
	
	}
	static double sq2(double n) {
		System.out.println("the addition result is:");
		return n+n;
		
	}

}
