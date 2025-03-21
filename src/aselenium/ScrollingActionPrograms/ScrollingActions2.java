package aselenium.ScrollingActionPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingActions2 
{
//If we want to scroll upto a certain WebElement on a webpage then,
//follow this process.
//we followed this scrolling action upto "GetLink" WebElement.
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
				
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");

		driver.get("https://www.naukri.com/");
		System.out.println("URL is Opened");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement GetLink = driver.findElement(By.xpath("//input[@class='wdgt-form-btn']"));
		
		js.executeScript("arguments[0].scrollIntoView();",GetLink);
		System.out.println("WebPage scroll down upto Getlink element");
		
		System.out.println("End of program");
	}
}