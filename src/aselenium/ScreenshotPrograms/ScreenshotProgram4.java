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

public class ScreenshotProgram4 
{
//practice Example of taking multiple screenshot-
	static WebDriver driver;
	
	public static void getScreenshot(String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\hp\\Documents\\1.SOFTWARE TESTING NOTES\\1) Automation Testing- Notes by Pavan Sir\\My Automation notes\\Screenshot\\"+name+".jpg");		
		FileHandler.copy(sourceFile, destFile);
	}
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
//1) Take loginPage screenshot-
	
		getScreenshot("LoginPage");
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");

		WebElement loginButton= driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		
//2)Take HomePage Screenshot-	
		getScreenshot("Homepage");
		
//3)take AtoZ dropdown Screenshot-	
		WebElement AtoZdropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		AtoZdropdown.click();
		getScreenshot("AtoZdropdown");
			
//4)Take screenshot of BagImage-
		WebElement BagImage = driver.findElement(By.xpath("//img[@class='inventory_item_img'][1]"));
		BagImage.click();
		getScreenshot("BagImage");
		System.out.println("end of program");
	}
}