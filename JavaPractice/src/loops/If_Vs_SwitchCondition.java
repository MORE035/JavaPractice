package loops;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class If_Vs_SwitchCondition {

	public static void main(String[] args) throws Exception {

		Properties prop=new Properties();
		File fill=new File(System.getProperty("user.dir")+"/src/loops/properties");
		FileInputStream FIS=new FileInputStream(fill);
		prop.load(FIS);
		String browsername = (String) prop.get("browsername");
		System.out.println(prop.get("browsername"));
//-------------------------------------------------------------------------------------------------------------------
//---------By using nested If and Else------------------------------------------------------------------------------
		System.out.println("*************************By using IF-ELSE Conditions**********************************");
		if(browsername.equals("chrome")) {
			
			System.out.println("chrome browser executed");
		}else if(browsername.equals("firefox")) {
			
			System.out.println("firefox browser executed");
		}else if(browsername.equals("edge")) {
			
			System.out.println("edge browser executed");
		}else {
			System.out.println("invalid browser name");
		}
		

//---------By using nested If and Else------------------------------------------------------------------------------
	System.out.println("*************************By using Switch case Conditions**********************************");	
		
		
		
		switch (browsername) {
		case "chrome": System.out.println("chrome browser executed");break;
		case "firefox": System.out.println("firefox browser executed");break;
		case "edge": System.out.println("edge browser executed");break;

	
		default:System.out.println("invalid "+browsername);
		}
		
		
	}

}
