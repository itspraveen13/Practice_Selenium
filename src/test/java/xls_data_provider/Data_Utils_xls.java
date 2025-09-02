package xls_data_provider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Data_Utils_xls {
	@DataProvider(name="creds")
	public String[][] get_Data() throws IOException{
		String[][] excelData=Read_Excel_Sheet_With_Data_Provider.getExcelData();
		return excelData;
	}

}
