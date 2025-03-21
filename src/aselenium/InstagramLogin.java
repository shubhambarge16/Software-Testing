package aselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
												
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
		
//Username-
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("shubham.barge16@gmail.com");
//	Thread.sleep(2000);
	
//Password-
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("normallife@16");
//	Thread.sleep(2000);
	
//login button- logged in successfully
	WebElement Login = driver.findElement(By.xpath("(//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1'])[1]"));
	Login.click();
	
	System.out.println("end of Program");
	}
}
