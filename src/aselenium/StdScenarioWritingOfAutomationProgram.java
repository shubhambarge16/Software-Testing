package aselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StdScenarioWritingOfAutomationProgram {

	public static void main(String[] args) 
	{
//This is the standard way of writing test script when we work
//as a "Automation Test Engineer."
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
						
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
						
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url is opened");
						
//username
		WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
		username.clear();
		username.sendKeys("standard_user");
		System.out.println("Username is entered");
						
//password
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys("secret_sauce");
		System.out.println("Password is entered");
				
//LoginButton-	
		WebElement loginButton= driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		System.out.println("Clicked on Login Button");
						
//homePage		
		System.out.println("Apply validation");
						
		String expectedTitle = "Swag Labs";   //BA/dev provides us this info.
						
		String actaulTitle =driver.getTitle();
						
		if(expectedTitle.equals(actaulTitle))
		{
			System.out.println("Login Test is passed");
		}
		else
		{
			System.out.println("Login Test is failed");
		}		
		
		driver.close();
		System.out.println("browser is closed");
		System.out.println("end of program");
		
	}
}