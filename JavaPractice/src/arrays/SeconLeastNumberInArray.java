package arrays;

public class SeconLeastNumberInArray {

	public static void main(String[] args) {

		int[] array1=new int[] {25,4,6,7,3,26,1,30,0};
		int min=array1[0];
		int max=array1[0];
		int seconmin=min;

		for (int i = 0; i < array1.length; i++) {
			
			if(min>array1[i]) {
				min=array1[i];
				
			}else if(array1[i]<seconmin&&array1[i]!=min) {
	
				seconmin=array1[i];
				
			}
		}
		

		System.out.println(min);
		System.out.println(seconmin);


	}

}
