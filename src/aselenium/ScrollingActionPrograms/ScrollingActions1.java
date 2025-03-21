package aselenium.ScrollingActionPrograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingActions1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized ");

		driver.get("https://www.saucedemo.com/v1/");
		System.out.println("Url is opened");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//scroll down action->
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		
//scroll up action->
		js.executeScript("window.scrollBy(0,-100)");
		
		System.out.println("End of program");
//this 100 is pixels. we perform scrolling action by using pixels.			
	}	
}