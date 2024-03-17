package automationclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemobyIndexMethod {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
							
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/v1/");
		
	WebElement username = driver.findElement(By.xpath("(//input[@class='form_input'])[1]"));
	username.sendKeys("standard_user");
	Thread.sleep(2000);
		
	WebElement password = driver.findElement(By.xpath("(//input[@class='form_input'])[2]"));
	password.sendKeys("secret_sauce");
	Thread.sleep(2000);
		
	WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
	login.click();
		
	}
}
