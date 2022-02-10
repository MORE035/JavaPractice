package arrays;


public class Declare_Method {
	
	public static void min(int a[]) {
		
		int minimum=a[0];
		for(int i=0;i<a.length;i++) {
			if(minimum>a[i]) {
				
				minimum=a[i];
				
				System.out.println(minimum);
	
			}
		}
	}

	public static void main(String[] args) {
		int[] b= {10,20,5,45,55};
		min(b);
	}

}
