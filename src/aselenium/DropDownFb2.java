package aselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFb2 
{
	public static void main(String[] args) throws InterruptedException 
	{
//On create new account page on FB, entering my Birth date by drop down.
//here I am directly opening browser & then "Create New Account" page.
		
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
											
	WebDriver driver = new ChromeDriver();
	System.out.println("browser is opened");
		
	driver.manage().window().maximize();
	System.out.println("browser is maximized");
		
	driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
	System.out.println("URL is opened");
		
//I)Entering the date-
		
	WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
	Day.click();
	System.out.println("Day Option is clicked");
//now we've to select any particular day.
//& webdriver & webelement interfaces don't have methods to select the day/option.
//so we've to take a "Select" class which is of selenium. & we'll create object of it.
		
	Select s1 = new Select(Day);
		
//Now select class has 3 different methods to select any option/Day.
//just create object of it & enter Day number in it as argument.
		
//	s.selectByIndex(16);		//OR
//	s.selectByValue("16");		//OR
//	s.selectByVisibleText("16");<-paste the html text here.

//I'll use 1st method.
//if we want 22 index value on console, we've to enter 1 less number.
//only when we are using selectByIndex method.
//we've to start index values from 0,1,2,3 etc.
	s1.selectByIndex(21);
	Thread.sleep(3000);
	System.out.println("21 Date is selected");
//===========================================
		
//II)Entering the Month-
//here xpath searched by xpath by text Method. bcoz
//attribute value is same for day & month element. so can't found unique xpath.
//by using xpath by attribute. so I searched xpath by text method.
		
	WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
	Month.click();
	System.out.println("Month Option is clicked");
	Select s2 = new Select(Month);
	s2.selectByVisibleText("Jan");
	Thread.sleep(3000);
	System.out.println("Jan month is selected");
//===============================================	
		
//III)Entering the Year-
		
	WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
	Year.click();
	System.out.println("year Option is clicked");
	Select s3 = new Select (Year);
	s3.selectByValue("1973");
	Thread.sleep(3000);
	System.out.println("1973 year is selected");

	driver.close();
	System.out.println("browser is closed");
	}
}