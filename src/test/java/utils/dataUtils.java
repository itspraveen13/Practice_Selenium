package utils;

import org.testng.annotations.DataProvider;

public class dataUtils {
//	@DataProvider(name ="Creds")
	@DataProvider(name ="Creds", indices = {0,2}, parallel = true) 
	//indices is used to use only specific data with index, parallel is used to run in parallel

	public String[][] getData(){
		String[][] data= new String[3][2];
		data[0][0]="1234567890";
		data[0][1]="pass@123";

		data[1][0]="9876543210";
		data[1][1]="pass@1234";
		

		data[2][0]="9876512340";
		data[2][1]="pass@12345";
		return data;
	}

}
 