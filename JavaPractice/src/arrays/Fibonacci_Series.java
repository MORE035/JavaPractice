package arrays;

public class Fibonacci_Series {
 public static void feb(int n) {
	 
	 int f1=0,f2=1,i;
	for(i=1;i<n;i++) {
		
		System.out.print(f2+ " ");
		int next=f1+f2;
		f1=f2;
		f2=next;
	} 
	
	 }
	 
 
	public static void main(String[] args) {
		
		//feb(100);
		int f3=0,f4=1;
		int n=10,sum=0;
		for (int i = 0; i < n; i++) {
			sum=f3+f4;
			f3=f4;
			f4=sum;
			System.out.println(sum);
		}
		
		
		
			
		}
		
	}


