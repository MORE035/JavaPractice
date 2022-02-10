package arrays;

public class FindLeastNum {

	public static void main(String[] args) {
		
		int[] list=new int[] {1,2,3,8,5,6,7,9,2,1,21};
		int max=list[0];
		int min=list[0];

		
for(int i=1;i<list.length;i++) {
	
	if(max<list[i]) {
		
		max=list[i];
	}
	if(min>list[i]) {
		
		min=list[i];
	}

	}
System.out.println(min);
System.out.println(max);


	}
}
//System.out.println(min);


