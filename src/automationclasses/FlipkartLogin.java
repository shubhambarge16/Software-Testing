package automationclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
//login-	
	WebElement Login = driver.findElement(By.xpath("//div[text()='Login']"));
	Login.click();
	
//EnterEmailId-
	WebElement EmailId = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	EmailId.sendKeys("//input[@class='_2IX_2- VJZDxU']");
	
//RequestOTP-
	WebElement RequestOTP = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	RequestOTP.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
