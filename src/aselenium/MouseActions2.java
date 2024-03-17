package aselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions2 
{
	public static void main(String[] args) 
	{
//performing automated mouse actions on- double click, right click, left click.
//using Actions class of selenium-
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
										
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
					
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
				
		driver.get("https://demoqa.com/buttons");
		System.out.println("URL is opened");
		
//1.Searched xpath of doubleClickButton & clicked it.	
		WebElement doubleClickButton= driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		System.out.println("searched xpath of doubleClickButton & clicked it");
		
//2.Now taking the help of Actions class of Selenium & creating Object of it.
//& entering "driver" argument in it compulsory. bcoz its rule of selenium.		
		Actions act = new Actions(driver);
		
//3.Now, on which element you want to click, you've to enter that element name in argument
//of below click Method. like I've entered "DoubleClick" as a argument.
		act.doubleClick(doubleClickButton).perform();
		System.out.println("Click action performed on doubleClickButton");
		
//4.Now to validate whether doubleClick button is clicked properly or not,
//we've to validate the message element as well which is showing after
//clicking 'double click' button on demoQA website.
//1st we've to write & store the ExpectedMessage in string.
		String expectedMessage = "You have done a double click";   //US/BA/Dev

//5.Then we've to find xpath of that msg element as well.
		WebElement resultDisplayElement = driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
		
//6.Then we've to write which actual msg should come. & after inspecting, we'll 
//copy paste html text of that msg here. & we've to store it in string. (correct this line as per below line)
		String actualMessage = resultDisplayElement.getText();     //actual
		
//Applied Validation-
		System.out.println("Applied Validation to check whether double click done or not");
	    if(expectedMessage.equals(actualMessage))
	    {
	    	System.out.println("TC is passed");
	    }
	    else
	    {
	    	System.out.println("TC is failed");
        }
	    System.out.println("End of Program");
	    
		
		
		
		
		
		
		
		
		
		
		
		
	}
}