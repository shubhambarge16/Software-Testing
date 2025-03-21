package aselenium.ExcelPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet5EclipseToExcel 
{
	public static void main(String[] args) throws IOException 
	{
//Program-2 for fetching data from Eclipse to Excel Sheet-
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("TestSheet2");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Sr. No.");
		sheet.getRow(0).createCell(1).setCellValue("Candidate Name");
		sheet.getRow(0).createCell(2).setCellValue("Designation");
		sheet.getRow(0).createCell(3).setCellValue("City");
		sheet.getRow(0).createCell(4).setCellValue("Mobile No.");
		sheet.getRow(0).createCell(5).setCellValue("Date of Birth");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("1");
		sheet.getRow(1).createCell(1).setCellValue("Shubham Rajendra Barge");
		sheet.getRow(1).createCell(2).setCellValue("Software Test Engineer");
		sheet.getRow(1).createCell(3).setCellValue("Pune");
		sheet.getRow(1).createCell(4).setCellValue("7588141506");
		sheet.getRow(1).createCell(5).setCellValue("16/03/1995");
		
		File Address = new File("C:\\Users\\hp\\Documents\\1.SOFTWARE TESTING NOTES\\1) Automation Testing- Notes by Pavan Sir\\My Automation notes\\Excel Book3.xlsx");
		
		FileOutputStream FOS = new FileOutputStream(Address);
		workbook.write(FOS);
			
	}
}