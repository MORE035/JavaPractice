package arrays;

import java.util.Arrays;

public class SmallestNumberInAnArray {
	public static void main(String args[]){
	      int array[] = {10, 20, 25, 63, 96, 57,11};
	      Arrays.sort(array);
	      int size = array.length;
	      int res = array[1];
	      System.out.println("2nd smallest element is ::"+res);
	   }
	}