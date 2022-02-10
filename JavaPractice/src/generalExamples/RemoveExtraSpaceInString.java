package generalExamples;

public class RemoveExtraSpaceInString {

	public static void main(String[] args) 
	{
		String demo="We l come";
		System.out.println(demo);
		
		//remove extraspaces
		//Hordcodinng
		System.out.println("Hardcoing ");
		System.out.println("-------------------------------------");
		 String subs1 = demo.substring(0, 2);
		char subs2 = demo.charAt(3);
		String subs3 = demo.substring(5, 9);
		String res = subs1+subs2+subs3;
		
		demo.trim();
		System.out.println(res);
		
		//Generic way
		System.out.println(" By Generic way");
		System.out.println("-------------------------------------");

		String[] splited = demo.split(" ");
		String resl="";
		for (int i = 0; i < splited.length; i++) {
			resl=resl+splited[i];
		}
		
		System.out.println(resl);
		
		//single line
		System.out.println("By Single Line code");
		System.out.println("-------------------------------------");

		String res2 = demo.replaceAll("( +)", "").trim();
	
		System.out.println(res2);
		System.out.println("By trim ");
		System.out.println("-------------------------------------");
		System.out.println("W el come  ".trim());

		
	}

}
