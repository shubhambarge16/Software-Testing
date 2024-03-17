package automationclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoByAbsoluteXpath 
{
//This is login scenario by using Absolute Xpath method-
//if interviewer asks us to find elements, then we should'nt use this method.
//we should find xpath by using previous methods.
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/v1/");
	
	WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[1]"));
	username.sendKeys("standard_user");
	Thread.sleep(2000);
	
	WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[2]"));
	password.sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[3]"));
	login.click();
	}
}