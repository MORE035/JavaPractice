package arrays;

public class CalculateAvgArray 
{
	public static void main(String[] args) 
	{
	
		int[] array1=new int[] {10,20,30,45,45};
		int result=0;
		for (int i = 0; i < array1.length; i++) {
			result=result+array1[i];
		}
		System.out.println(result+"       "+array1.length+"     "+result/array1.length);
	}

}
