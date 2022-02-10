package arrays;

public class GFG{
	
	public static void main(String args[]) {
		
		student arr[];
		arr=new student[3];
		student[] arr1 = new student[6];
		
		arr[0]=new student(1,"vasanth");
		arr[1]=new student(2,"malathi");
		arr[2]=new student(3,"pavan");

		
		for(int i=0;i<arr.length;i++) {
			
			String Name = arr[i].name;
			System.out.println(arr[i].name);
			
		}
	}
}