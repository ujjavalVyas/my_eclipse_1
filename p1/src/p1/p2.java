package p1;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originalStr = "Hello";
		String reversedStr = "";


		for (int i = 0; i < originalStr.length(); i++) {
		  reversedStr = originalStr.charAt(i) + reversedStr;
			System.out.println("Reversed string: "+ reversedStr);
		}

		System.out.println("Reversed string: "+ reversedStr);
		
	}

}
