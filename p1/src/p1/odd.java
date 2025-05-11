package p1;
import java.util.*;
import java.util.Scanner;


  class odd {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in); 
	System.out.print("enter the value: ");
	//int i = s.nextInt();
	double i = s.nextDouble();
	
	System.out.println("the value: " +i);

	if (i%2 == 0) {
		
		System.out.println("entered number is even , i.e." +i);
		
	}
	
	else {
		
		System.out.println("entered number is odd , i.e." +i);
	}
	s.close();
}
	
}