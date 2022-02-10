package arrays;

public class PalandremOrNot {

	public static void main(String[] args) {

		int number=1221;
		int number1=number;
		int rev=0;
		
		while(number!=0) {
			rev=rev*10;
			rev=rev+number%10;
			number=number/10;
		}
		
		if(number1==rev) {
			
			System.out.println(number1+"  "+"is palandrem");
		}else {
			
			System.out.println(number1+"  "+"is not palandrem");

		}
	}

}
