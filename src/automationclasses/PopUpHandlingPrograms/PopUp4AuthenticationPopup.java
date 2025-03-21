package automationclasses.PopUpHandlingPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp4AuthenticationPopup 
{
//Not understood. so Learn this topic again from you tube. 
//In some URL’s, before entering URL in browser, we’ve to enter username & password.
//Only then we get permission to access that website.
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
										
		driver.manage().window().maximize();
		System.out.println("window is maximized");
										
		driver.get("https://the-internet.herokuapp.com/login");
		System.out.println("Url is opened");

		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		Username.sendKeys("tomsmith");
		Thread.sleep(3000);
		System.out.println("Username is entered");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("SuperSecretPassword!");
		Thread.sleep(3000);
		System.out.println("Password is entered");
		
		WebElement Login = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
		Login.click();
		System.out.println("Login button is clicked");
		
		driver.close();
		System.out.println("End of program");
		
	}
}