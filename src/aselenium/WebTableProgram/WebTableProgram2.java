package aselenium.WebTableProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableProgram2 
{
//program showing no. of rows & columns & getting all data of webtable on console.
//Below is simplified way of previous program in 'WebTableProgram1' -
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
//		driver.manage().window().maximize();
//		System.out.println("window is maximized");
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println("Url is opened");
//Xpath of Row-
		List<WebElement> Rows =	driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
		
//Rows count-		
		int NumberOfRows = Rows.size();
		System.out.println("Total number of rows are- "+NumberOfRows);
		
//Xpath of Column-		
		List<WebElement> Columns = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[1]//th"));
		
//column count-		
		int NumberOfColumns = Columns.size();
		System.out.println("Total Number of Columns are- "+NumberOfColumns);
		
//running for loop to get text of html table on eclipse-		
		for(int i=0; i<NumberOfRows; i++)
		{
			String DataInTable = Rows.get(i).getText();
			System.out.println("Data is |"+DataInTable);
		}
		
		System.out.println("End of Program");
	}		
}