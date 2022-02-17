package strings;

public class ReverseString {
	
	//By using tipical for loop
	
	public static void main(String args[]) {
	 String name="Vasanth";
	String rev = "";
	
	
	for (int i = name.length()-1; i >= 0; i--) {
		
		rev=rev+name.charAt(i);
	}
	System.out.println(name);
	System.out.println(rev);
	//------------------------------------------------------------------------------------------------
		//By String Buffer

	
	StringBuffer sb=new StringBuffer(name);
	StringBuffer reveseByStringBuffer = sb.reverse();
	System.out.println(reveseByStringBuffer.toString());
	
	
	//------------------------------------------------------------------------------------------------
			//By String Bulder

		
		StringBuffer sbb=new StringBuffer(name);
		StringBuffer reveseByStringBulder = sbb.reverse();
		System.out.println(reveseByStringBulder);
}
}
