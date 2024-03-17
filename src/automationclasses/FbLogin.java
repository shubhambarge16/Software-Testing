package automationclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
							
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
//username-
	WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
	Username.sendKeys("shubham.barge16@gmail.com");
	Thread.sleep(2000);
	
//password-
	WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
	Password.sendKeys("normallife@16");
	Thread.sleep(2000);
	
//login successfully by using "xpath by class" method.
	WebElement login = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
	login.click();					
	
//automated forgottenPassword link by "Xpath by text method" means html text.
//	WebElement forgottenPassword = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//	forgottenPassword.click();
	
//Create New Account- automated by using "Xpath by class" method-
//	WebElement CreateNewAcount = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
//	CreateNewAcount.click();
	
	}	
}