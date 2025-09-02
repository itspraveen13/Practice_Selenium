package java_programs;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {

	public static void main(String[] args) throws IOException {

		String fileLocation = "./Test-Data/Login-Creds.xlsx";
		XSSFWorkbook wbook =new XSSFWorkbook(fileLocation);
		XSSFSheet sheet = wbook.getSheetAt(0);
		//to get last row number
		int lastRowNum = sheet.getLastRowNum();
		//to get last column number
		int lastColNum = sheet.getRow(0).getLastCellNum();
		//print last row and column number
		System.out.println(lastRowNum);
		System.out.println(lastColNum);
		//read and print the data from sheet
		for (int i = 1; i <=lastRowNum; i++) {
			XSSFRow row= sheet.getRow(i);
			for (int j = 0; j < lastColNum; j++) {
				XSSFCell cell = row.getCell(j);
				//String value = cell.getStringCellValue(); //only reads string

				//to read all format string, int
				DataFormatter dft=new DataFormatter();
				String value =dft.formatCellValue(cell);
				System.out.println("Value:"+ value);
			} 
		}
		wbook.close();
	}

}
