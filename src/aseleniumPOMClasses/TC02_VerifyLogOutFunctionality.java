package aseleniumPOMClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02_VerifyLogOutFunctionality 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
//Test Steps
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
		driver = new ChromeDriver();
		System.out.println("Browser is opened");
				
		driver.manage().window().maximize();
		System.out.println("Browser is maximzed");
				
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		POMLoginClass LoginPage = new POMLoginClass(driver);
		
		LoginPage.sendUsername();
		System.out.println("username is entered");
		
		LoginPage.SendPassword();
		System.out.println("Password is entered");

		LoginPage.LoginClick();
		System.out.println("Login button clicked");
		
		System.out.println("Went on HomePage");
	
//Now to fetch elements & actions from logout POM class, we've to create object of it.
		POMLogOutClass LogOutPage = new POMLogOutClass(driver);

//after creating Object, doing tests-
		LogOutPage.ClickMenuButton();
		
		LogOutPage.ClickLogoutButton();
	}
//====================================================================
	
//applying validation-
		
		@Test
		public void TC02_VerifyLogOutFunctionality()
		{
	
		String expectedTitle = "Swag Labs";
		String actaulTitle   =  driver.getTitle();
		Assert.assertEquals(actaulTitle, expectedTitle);
		
		}
		
		@AfterMethod
		public void TearDown()
		{
		driver.close();
		System.out.println("browser is closed");
		}
//Learn POM concept clearly from 22.10.2022 lecture. I left it back to learn
//after getting job
		
	
		
}