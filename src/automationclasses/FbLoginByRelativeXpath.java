package automationclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginByRelativeXpath 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
								
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/login/");
		
//username-
	WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
	Username.sendKeys("shubham.barge16@gmail.com");
	Thread.sleep(2000);
		
//password-
	WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
	Password.sendKeys("normallife@16");
	Thread.sleep(2000);
		
//login successfully by using "xpath by name" method.
	WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
	login.click();				
	}
}