package aselenium.ScrollingActionPrograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingActions3 
{
//If we want to scroll upto end of webpage then,
//follow this process.
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
								
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
								
		driver.manage().window().maximize();
		System.out.println("Browser is maximized ");

		driver.get("https://www.naukri.com/");
		System.out.println("Url is opened");
						
		JavascriptExecutor js = (JavascriptExecutor)driver;
				
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		System.out.println("End of program");
	}
}