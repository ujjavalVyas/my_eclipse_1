package p1;
import java.util.Scanner;


public class email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email;
		String username;
		String password;
		
		Scanner s = new Scanner(System.in);
		System.out.print("enter the email: " );
		email = s.nextLine();
		
		if(email.contains("@")) {
			
			username = email.substring(0, email.indexOf("@"));
			password = email.substring(email.indexOf("@")+1);
			System.out.println("This is your email" );
			System.out.println("your user name is: " +username);
			System.out.println("your password is: " +password);
			
			
		}
		else{
			System.out.println("your email is invalid");
		}
		
		s.close();
	}

}
