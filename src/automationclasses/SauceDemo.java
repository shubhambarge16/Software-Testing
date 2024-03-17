package automationclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/v1/");
		
	WebElement username = driver.findElement(By.id("user-name"));
	username.sendKeys("problem_user");
	Thread.sleep(2000);
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	WebElement Login = driver.findElement(By.id("login-button"));
	Login.click();
	Thread.sleep(2000);
//Login Automation program successful. by using "id" Locator.
	}	
}
