package automationclasses.XpathsAllPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoByRelativeXpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/v1/");
	
//username-
	WebElement username = driver.findElement(By.xpath("//form//input[1]"));
	username.sendKeys("standard_user");
	Thread.sleep(2000);

//Password-
	WebElement password = driver.findElement(By.xpath("//form//input[2]"));
	password.sendKeys("secret_sauce");
	Thread.sleep(2000);
	
//Login-	
	WebElement login = driver.findElement(By.xpath("//form//input[3]"));
	login.click();
	
	System.out.println("end of program");
	}
}