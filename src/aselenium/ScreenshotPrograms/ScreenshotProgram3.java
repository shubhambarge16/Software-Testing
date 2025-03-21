package aselenium.ScreenshotPrograms;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotProgram3 
{
//we created a method for 2 purposes- 1) we can reduce code & 2)we can take multiple screenshots.
//this is the standard way of writing ScreenshotProgram.
	
//*We are using 'driver' reference variable in 'getScreenshot' method & below main method as well.
//*We've to declare 'driver' reference variable globally means at start of program.
//& need to declare only once.
//*We are using static keyword in below getScreenshot method & in main method as well. so we need
//to write static keyword while declaring below 'driver' reference variable as well.
	
	static WebDriver driver;
//In below line of method, we've to pass any argument with datatype & its some name. So
//that every screenshot which is going to save, will be identified with different names.
	public static void getScreenshot(String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);     //byte format
//we will concatenate(join) above datatype 'name' in below Path of folder. so after
//executing program, java will came to know whether the file will be saving as a name/
//number or with any special character.
//(we can save the screenshot with any datatype)
		File destFile = new File("C:\\Users\\hp\\Documents\\1.SOFTWARE TESTING NOTES\\1) Automation Testing- Notes by Pavan Sir\\My Automation notes\\Screenshot\\"+name+".jpg");		
		FileHandler.copy(sourceFile, destFile);
	}
		
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
//So, we don't need to write here- WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//1) Take loginPage screenshot here
		getScreenshot("loginPage");
				
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");

		WebElement loginButton= driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		
//2)Take HomePage Screenshot-
		getScreenshot("HomePage");
//When we'are taking multiple Screenshots, then we've to pass different arguments
//in bracket of method keeping same method name as it is- 'getScreenshot'.
		System.out.println("end of program");
	}
}