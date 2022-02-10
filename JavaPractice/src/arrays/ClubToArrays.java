package arrays;

import java.util.Arrays;

public class ClubToArrays {

	public static void main(String[] args)
	{

	int[] array1=new int[] {10,20,30,45};
	int[] array2=new int[] {25,20,30};
	int[]result=new int[array1.length+array2.length];
	
	
		for (int i = 0; i < array1.length; i++) {
			result[i]=array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			result[i+array1.length]=array2[i];
		}
		String re = Arrays.toString(result);
		System.out.println(re);
		
	
	 {
			
		}
		
	}

}
