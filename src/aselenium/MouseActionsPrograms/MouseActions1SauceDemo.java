package aselenium.MouseActionsPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions1SauceDemo 
{
public static void main(String[] args) throws InterruptedException 
{
//performing automated mouse action on login button
//using Actions class of selenium-
	
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
						
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opened");
	
	driver.manage().window().maximize();
	System.out.println("Browser is maximized ");
	
	driver.get("https://www.saucedemo.com/v1/");
	System.out.println("Url is opened");
	
//1. entering username-	
	WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys("standard_user");
	Thread.sleep(2000);
	System.out.println("username is entered");
	
//2.entering password-			
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret_sauce");
	Thread.sleep(2000);
	System.out.println("password is entered");
	
//3.Clicking the login button using Actions class-
//I)find the xpath of login button-
	WebElement LoginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
	
//II)here below, we've to create a constructor of actions class of selenium
//& enter "driver" argument in constructor of Actions class.
//& to enter  "driver" argument is demand of selenium script. By default we have to enter it.				
	
	Actions act = new Actions(driver);
	
//III)Now Actually clicking the login button-
//*We've to enter "perform" method to execute clicking action.
//if we don't enter "perform" keyword, then all script will run & will shown on console
//but actual login functionality will not done.
//*Also we've to enter "LoginButton" WebElement as a argument. bcoz it should know on
//which element the clicking action is going to perform.

	act.click(LoginButton).perform();
	
	System.out.println("LoginButton is clicked by using Actions class");
	
	System.out.println("end of program");	
}
}