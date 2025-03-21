package aselenium.ScreenshotPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.sun.jdi.Method;

public class ScreenshotProgram2 
{
public static void main(String[] args) throws IOException 
{
//Program of taking 2 screenshots-:
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
		
	driver.get("https://www.saucedemo.com");
	
//1) Taking screenshot of Homepage page-
	
	TakesScreenshot ts = (TakesScreenshot)driver;	
	File sourcefile1 = ts.getScreenshotAs(OutputType.FILE);	
	File Destfile1 = new File("C:\\Users\\hp\\Documents\\1.SOFTWARE TESTING NOTES\\1) Automation Testing- Notes by Pavan Sir\\My Automation notes\\Screenshot\\Homepage.jpg");
	FileHandler.copy(sourcefile1, Destfile1);
	
	WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys("standard_user");
	
	WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret_sauce");

	WebElement loginButton= driver.findElement(By.xpath("//input[@id='login-button']"));
	loginButton.click();
	
//2) Taking screenshot of login page-
//we just need to copy below 3 lines from above. no need to copy TakesScreenshot interface every time.
	
	File sourcefile2 = ts.getScreenshotAs(OutputType.FILE);	
	File Destfile2 = new File("C:\\Users\\hp\\Documents\\1.SOFTWARE TESTING NOTES\\1) Automation Testing- Notes by Pavan Sir\\My Automation notes\\Screenshot\\LoginPage.jpg");
	FileHandler.copy(sourcefile2, Destfile2);
	
	System.out.println("end of program");
//we need to write above 3 line code every time when we want to take screenshot.
//but it is repeating again & again. So, to avoid this repetition & reduce the code,
//we need to create a Method. which is shown in ScreenshotProgram3 class.
//Above process is not wrong. but as a standard practice, we need to reduce code & create a method.
}
}