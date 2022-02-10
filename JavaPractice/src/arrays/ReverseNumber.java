package arrays;

public class ReverseNumber {

	public static void main(String[] args) {
		Integer number = 12345;
		// by using String Buffers
		System.out.println("*********by using String Buffers****************");
		String sNum = number.toString();
		StringBuffer sb = new StringBuffer();
		sb.append(sNum);
		sb.reverse();
		System.out.println(sb);
		System.out.println("------------------------------------------------");

		System.out.println("*********by using cretical   for loop ****************");

		String revnumb = "";
		for (int i = sNum.length() - 1; i > 0; i--) {
			revnumb = revnumb + sNum.charAt(i);
		}
		System.out.println(revnumb + " ");
		System.out.println("------------------------------------------------");
		System.out.println("*********by using while loop ****************");

		int rev=0;
		while(number!=0) {
			
			rev=rev*10;
			rev=rev+number%10;
			number=number/10;
		}
		System.out.println(rev);
		System.out.println("------------------------------------------------");

	}

}
