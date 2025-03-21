package aselenium.ExcelPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheetProgram1 
{
	public static void main(String[] args) throws IOException 
{
//FAILED TO RUN PROGRAM, CHECK WHOLE PROGRAM AGAIN & RUN !!
//		
//Program for fetching data from a Excel sheet to Eclipse & Eclipse to Browser-
//(detail explanation lecture video available on 18 & 19th Oct. 2022)
		
//1)1st We should provide Address of Excel sheet in Eclipse so that Eclipse can fetch the
//data from it. (Right Click on 'copy as path' on excel sheet & paste here)
//& Address should be saved in String format.

	String Address = "C:\\Users\\hp\\Documents\\1.SOFTWARE TESTING NOTES\\1) Automation Testing- Notes by Pavan Sir\\My Automation notes\\Excel Workbook1.xlsx";
			
//2)To read data in Excel file we have to use a class of java 'FileInputStream' & make a object of it
//& we've to pass above variable- 'Address' in the constructor of this class then accept the exception-
//& we can give any name instead of 'file'.
	
	FileInputStream file = new FileInputStream(Address);
		
//3)Read the workbook-for this we use class of java 'XSSFWorkbook' & we've to
//compulsorily pass above 'file' in constructor of this class.
//& we can give any name to below object instead of 'book'.
	
	XSSFWorkbook book = new XSSFWorkbook(file);
		
//4)Read the sheet-above, 'book' object is of 'XSSFWorkbook' class. & below 'getSheet'
//method is of XSSFWorkbook class. & we've to read the sheet for that just pass the sheet.
//name in below argument. we'll use 'getSheet' method & save it in sheet variable of XSSFSheet class.
//we can give any name to below object instead of 'sheet'.
	
	XSSFSheet sheet = book.getSheet("rahul");
			
//5)After reading sheet, then 1st we've to read data in row then data in column. 
//to read data in row, we used 'getRow' method & we'll attach with sheet word & we'll save it
//using any word Eg-'row' (in String format) to fetch data from row.
	
	XSSFRow row = sheet.getRow(0);
	
//6)Now reading data in column. Reading means fetching data from EXCEL to ECLIPSE.
//(column or cell)- names are different but meaning is same.
//we use getCell method of row class. & saved it in cell class.	
	XSSFCell cell = row.getCell(0);
		
//7)Now reading the Actual information.
//I)for fetching USERNAME -
//we use 'getStringCellValue' method of cell class & saved it in String using any variable name. like-'Username'
	
	String Username = cell.getStringCellValue();
	System.out.println(Username);
	
//II)for fetching PASSWORD -
//almost same as above. we'll pass specific argument in brackets of row & column class according
//to its numbers. & we want to fetch password so we use 'getStringCellValue' method, save it in string
//& simply print it.
	
	XSSFRow row1 = sheet.getRow(1);
	XSSFCell cell1 = row1.getCell(0);
	String password = cell1.getStringCellValue();
	System.out.println(password);
	
//fetched data from excel to eclipse successfully.
//NOTE- we've to create object only at step no 2 & 3 means @ FileInputStream & XSSFWorkbook.
//==========================================================================================
//Now fetching data from Eclipse to Browser-
	
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opened");
	
	driver.manage().window().maximize();
	System.out.println("browser is maximized");
	
	driver.get("https://www.saucedemo.com");
	System.out.println("URL is opened");
//we used above Username & Password words as it is from above & passed in below sendkeys method.
//so that Username & Password will be sent on browser page. & login will be done successfully.
	WebElement Username1 = driver.findElement(By.xpath("//input[@id='user-name']"));
	Username1.sendKeys("Username");
	
	WebElement Password2 = driver.findElement(By.xpath("//input[@id='password']"));
	Password2.sendKeys("Password");
	
	WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
	Login.click();
	
	System.out.println("end of program");
//------------------------------------------------------------------------------------------------
//*Q may ask in interview- how many Exceptions did you get in this program?-
//A- @FileInputStream & XSSFWorkbook.
	
//check program from eclipse to browser. line no. 82 to 104
//& additionally, create different excel sheet in pc, add some other data in rows & columns.
//& create other class & write a different program then this to fetch that data.
//Note-while executing program, no need to keep Excel file open all the time.

	}	
}