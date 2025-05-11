package p1;

public class MDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] cal = {{'1', '2', '3'},
				{'4','5','6'},
				{'7','8','9'},
				{'*','0','#'}};
		
		
		for(char[] row : cal) {
			for(char number : row) {
				
				System.out.print(number+" ");
			}
			
			System.out.println("");
		}
		
		
	}

}
