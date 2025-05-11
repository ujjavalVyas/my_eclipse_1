package p1;
import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n ;
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Enetr the value:" );	
		n = s.nextInt();
		
		String evenodd = (n%2==0)? "even" : "odd";
		
		System.out.print("Enetr number is:" +evenodd.toUpperCase());	
		evenodd=s.nextLine();
				
		s.close();
	}

}
