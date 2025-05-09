package aseleniumPOMClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC03_VerifyFbLoginClass 
{
	WebDriver driver;
		
	@BeforeMethod
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
		driver = new ChromeDriver();
		System.out.println("Browser is opened");
			
		driver.manage().window().maximize();
		System.out.println("Browser is maximzed");
			
		driver.get("https://www.facebook.com/login/");
		System.out.println("Url is opened");
		System.out.println("Went on LoginPage");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		POMFbLoginClass Login = new POMFbLoginClass(driver);
			
		Login.SendUsername();
		System.out.println("username is entered");
			
		Login.SendPassword();
		System.out.println("Password is entered");
			
		Login.ClickLoginButton();
		System.out.println("Login button clicked");
			
		System.out.println("Went on HomePage");
	}
//Validation-
	@Test	
	public void TC03_VerifyFbLogin()
	{
		String expectedTitle= "Facebook";
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.close();
		System.out.println("browser is closed");
	}
	
}