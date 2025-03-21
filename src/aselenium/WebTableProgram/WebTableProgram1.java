package aselenium.WebTableProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableProgram1 
{
//Detailed explanation of webtable is in word file- "1.Starting from Method Overloading, OOPS & its Types" (Page no-76)
//Program for getting no. of Rows & no of columns from table-
//(Program is searched from you tube)-

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
										
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println("Url is opened");
		
//1) To get no. of rows in the table-
//we've to write xpath until we found 1 whole row & 1 of 1 selection of it on website.
//(searching xpath by using relative xpath method)
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@class='ws-table-all']//tbody//tr"));
		
//2) below line gives us actual count of Rows-
		int NoOfRows = Rows.size();
		System.out.println("No of Rows are- "+NoOfRows);
		
//3) to get no of columns from table in Eclipse -
		
//NOTE- 1) To get No of Columns, we've to count No of Headers in table. Here 3 headers present.
//(Headers means titles of table)
//2)Now search xpath until we find xpath of 1st cell of starting of table only & paste in eclipse.
//3) If we count no. of headers then indirectly, we counted no. of columns.
//4) & if there are more than 1 tables present on a webpage, then we've to search xpath which starts
//from “id” or any attribute present on the 'table' element & should end until we get specific
//selections of that table. Means in this table there are 3 columns,
//so we've to write xpath until we get 3 selections only.
//5)Above rules of searching xpath of columns are applicable to searching xpath of rows also.
		
		List<WebElement> Columns = driver.findElements(By.xpath("//table[@class='ws-table-all']//tbody//tr[1]//th"));
		
//4) below line gives us actual count of Columns.-
		int NoOfColumns = Columns.size();
		
//5) then to show these nos. on console we've to print them like below-
		System.out.println("No of Columns are- "+NoOfColumns);
		
//6) Now to print only title row of table on console, we'll apply for loop, it will gives us titles
//present from 1st column upto last column-
		for(int i=0; i<NoOfColumns; i++)
		{
			String TitlesOfTable = Columns.get(i).getText();	
			System.out.println(TitlesOfTable);
		}
//(If interviewer asks to print only headers of table on console, then write program upto above
//for loop only.
//& if interviewer asks to print whole table on console, then read next program-"WebTableProgram2")

//7) Now to print remaining all cells except title, we'll use above "No. of rows" to print
//data of all rows here-
//Note- we want exact count of rows so we are running for loop & for that we've to write "NoOfRows"
//here in for loop.
//& inside for loop, we used "Rows" only. bcoz we can get all text from all rows 
//only from "Rows" bcoz we wrote xpath of "Rows" above.
		for(int i=0; i<NoOfRows; i++)
		{
			String DataInTable = Rows.get(i).getText();
			System.out.println("Data is |"+ DataInTable);
		}
		
		System.out.println("End of program");
		
	}
}