package dates;

import java.util.Date;

public class PrintCurrentDate {

	public static void main(String[] args) {
		Date dd=new Date();
	String ss1 = dd.toString().replace(" ","").replace(":", "_");

	System.out.println(ss1);
	}

}
	