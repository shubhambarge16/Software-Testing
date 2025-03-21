package aselenium.ExcelPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetMultipleData3 
{
//applying for loop to fetch multiple data on eclipse at a time.
//FIND SOLUTION FOR FETCHING numerical DATA FROM EXCEL TO ECLIPSE ON YOU TUBE
	public static void main(String[] args) throws IOException
	{
		String Address = "C:\\Users\\hp\\Documents\\1.SOFTWARE TESTING NOTES\\1) Automation Testing- Notes by Pavan Sir\\My Automation notes\\Excel Book2.xlsx";
		FileInputStream file = new FileInputStream(Address);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Multiple Data");
		
//Applying 'for loop' for rows & columns only-
		for(int i=0; i<=7; i++)
		{
			for(int j=0; j<=1;j++)
			{
				String result = sheet.getRow(i).getCell(j).getStringCellValue();
			    System.out.println(result+" | ");			    
			}
		}
		System.out.println("end of program");
	}
}