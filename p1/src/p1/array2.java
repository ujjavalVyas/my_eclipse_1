package p1;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = {1,2,3,4,5,6};
		int target = 0;
		boolean isfound = false;
		
		for(int i=0; i<number.length; i++) {
			if(target == number[i]) {
				System.out.println("element of your no is :"+i);
				isfound = true;
				break;
			}}	
			if(!isfound) {
				System.out.println("NA");	
		}
			
	}
}
