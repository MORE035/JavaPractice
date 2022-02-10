package hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDublicate {

	public static void main(String[] args)
	{
		List<Integer>names=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,11,20,1,2));
		List<String>names1=new ArrayList<String>(Arrays.asList("sai","vinay","vinay"));

		HashSet<Integer> HS=new HashSet<Integer>(names);
		LinkedHashSet<String> LHS=new LinkedHashSet<String>(names1);
		
		System.out.println(HS);
		System.out.println(LHS);

	}

}
