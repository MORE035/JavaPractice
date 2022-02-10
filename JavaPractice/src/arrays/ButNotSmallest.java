package arrays;

import java.util.Iterator;

public class ButNotSmallest {

	public static void main(String[] args) {

		 int[] elements  = {0 , 2 , 10 , 3,-4}; 
		    int smallest = elements[0]; 
		    int secondSmallest = elements[0]; 

		    for (int i = 0; i < elements.length; i++)
		    {
		        for (int j = 0; j < elements.length; j++)
		        {
		            if (elements[i] < smallest)
		            {
		                smallest = elements[i];

		                if (elements[j] < secondSmallest)
		                {
		                    secondSmallest = elements[j];
		                }
		            }
		        }

		    }

		    System.out.println("The smallest element is: " + smallest + "\n"+  "The second smallest element is: " + secondSmallest);
		}
	
	}
	
