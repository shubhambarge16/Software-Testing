package aselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitOnSauceDemo 
{
//Login Automation program successful. by using "id" Locator.
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//Note-Now applying Implicit wait in program to give time to selenium
//to find incorrect element.
//if we not use Implicit wait, then selenium will not take efforts to search
//element & will throw exception. & If we use Implicit wait, then selenium will search
//the not ok element silently & then it will throw exception.
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/v1/");
					
		WebElement username = driver.findElement(By.id("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		System.out.println("username is entered");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		System.out.println("password is entered");
		
		WebElement Login = driver.findElement(By.id("login-button"));
		Login.click();
		System.out.println("Login button is clicked");
		
		System.out.println("end of program");
	}
}