package aselenium.ExcelPrograms;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ProcessHandle.Info;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet4EclipseToExcel 
{
	public static void main(String[] args) throws IOException
	{		
//Program 1 for fetching data from Eclipse to Excel Sheet-
		
//1) Below line is for creating a workbook in excel-	
	XSSFWorkbook workbook = new XSSFWorkbook();
//2) Below line gives name to sheet in excel workbook-(we can give any name)-
	XSSFSheet sheet = workbook.createSheet("TestSheet1");
	
//3) In below line row is created. & we've to create it once only.
	sheet.createRow(0);
	
//4) we've to create cell(column) into this row, so we use "createCell" method.
//& we've to use next method i.e. "setCellValue" to enter some text in cell.
	sheet.getRow(0).createCell(0).setCellValue("Hello");
	sheet.getRow(0).createCell(1).setCellValue("Hi");
	
	sheet.createRow(1);
	sheet.getRow(1).createCell(0).setCellValue("Shubham");
	sheet.getRow(1).createCell(1).setCellValue("Barge");
//Note-i) we can enter multiple data like above by using same methods above.
//ii) There is a note of "setCellValue" method in "Automation notes Word file"

//5) Whatever data entered in rows & columns above is temporary. we've to save it in excel file & 
//for that we've to create an Excel workbook in any folder in PC. After creating Excel workbook,
//we passed its address in below line.
	File Address = new File("C:\\Users\\hp\\Documents\\1.SOFTWARE TESTING NOTES\\1) Automation Testing- Notes by Pavan Sir\\My Automation notes\\Excel Book3.xlsx");

//6) when we enter new data from eclipse to excel, we've to use "FileOutputStream" method.
	FileOutputStream FOS = new FileOutputStream(Address);
	
//7) To write all above data in excel sheet, we use "workbook.write()" method.	
	workbook.write(FOS);
	
//8) closing workbook is not compulsory, but we write it as a standard practice.	
	workbook.close();	
	
//Note- 1)Keep the Excel sheet closed while writing program (Info.) in Eclipse.
//2) Also stay closed while doing any changes in program.
//3) After completing program, run the program in Eclipse & see the results by opening Excel sheet.
	
	}
}