package array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Array_List 
{
	public static void main(String []args) {
List<String>names=new ArrayList<String>(Arrays.asList("vasanth","pavan","Malathi"));
System.out.println("----------------------------------");


System.out.println(names);
//for each loop
for (String e : names) {
	System.out.println(e);
}
//By iterater
System.out.println("----------------------------------");
Iterator<String> it = names.iterator();
while(it.hasNext()) {
	
	
	System.out.println(it.next());
}
System.out.println("----------------------------------");


List<String>names2=new ArrayList<String>(Arrays.asList("Lucky","sivaji","malathi"));
Iterator<String> it1 = names2.iterator();

while(it1.hasNext()) {
	
	
	System.out.println(it1.next());
}

System.out.println("----------------------------------");

List<String>Family=new ArrayList<String>();

		Family.addAll(names);
		Family.addAll(names2);
		System.out.println(Family);

	}
}
