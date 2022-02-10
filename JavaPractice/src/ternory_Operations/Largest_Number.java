package ternory_Operations;

public class Largest_Number {

	public static void main(String[] args) {

		Largest_Number LN =new Largest_Number();
		LN.comapre_values(25, 45, 1);
		LN.comapre_values(25, 50);
	}

	public void comapre_values(int a ,int b,int c) {
		
		 Object large = (a>b)?(a>c?a:c):(b>c?b:c);
		 System.out.println(large);


	}
	public void comapre_values(int a ,int b) {
		
		 Object large = (a>b)?a:b;
		 System.out.println(large);


	}
}
