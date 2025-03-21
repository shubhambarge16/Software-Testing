package aselenium.ExcelPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetShortProgram2 
{
	public static void main(String[] args) throws IOException
	{
//Simplified program of previous program from previous class "ExcelSheetProgram1"-
//I)Fetching data without method chaining.
		String Address = "C:\\Users\\hp\\Documents\\1.SOFTWARE TESTING NOTES\\1) Automation Testing- Notes by Pavan Sir\\My Automation notes\\Excel Book2.xlsx";
		
		FileInputStream file = new FileInputStream(Address);
			
		XSSFWorkbook book = new XSSFWorkbook(file);
				
		XSSFSheet sheet = book.getSheet("Personal Data");
		
		XSSFRow row = sheet.getRow(1);
		
		XSSFCell cell = row.getCell(1);
		
		String CandidateName1 = cell.getStringCellValue();
		
		System.out.println(CandidateName1);
//fetched 1 CandidateName from above lines successfully.
//================================================================================================
//Standard way of writing above program (using method chaining)-

		String Address1 = "C:\\Users\\hp\\Documents\\1.SOFTWARE TESTING NOTES\\1) Automation Testing- Notes by Pavan Sir\\My Automation notes\\Excel Book2.xlsx";
		
		FileInputStream file1 = new FileInputStream(Address1);
		
		XSSFWorkbook book1 = new XSSFWorkbook(file1);
		
		String CandidateName2 = book1.getSheet("Personal Data").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(CandidateName2);
//Use variable of Workbook to close the Workbook.
		book1.close();
//======================================================================================================
		
//If we've to fetch "Numeric" type of data then-(9421964986)
//'getNumericCellValue' this method will always returns value in double format not in int. format
//if we want in int. format then we've to do casting.
		
		double NumberData1 = book.getSheet("Personal Data").getRow(3).getCell(2).getNumericCellValue();
		System.out.println(NumberData1);
//after doing Casting-		
		int MainData1 = (int)NumberData1;
		System.out.println(MainData1);

//(Above Numeric program didn't execute. find solution on google, you tube)		
	}
}