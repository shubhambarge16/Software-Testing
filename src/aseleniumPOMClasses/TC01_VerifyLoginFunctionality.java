package aseleniumPOMClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01_VerifyLoginFunctionality 
{
	WebDriver driver;
//Test Steps	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximzed");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url is opened");
		System.out.println("Went on LoginPage");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//Now for doing login activity, we've to create object of previous LoginPOMClass.
//so that we can call elements from that class into this class.
		POMLoginClass LoginPage = new POMLoginClass(driver);
		
//entering username-(taking above objectName & MethodName from previous class)		
		LoginPage.sendUsername();
		System.out.println("username is entered");

//entering password-
		LoginPage.SendPassword();
		System.out.println("Password is entered");

//Clicking login button-
		LoginPage.LoginClick();
		System.out.println("Login button clicked");
		
		System.out.println("Went on HomePage");
	}
//Now we've to apply validation to check whether tc is passed or failed-
		@Test
		public void TC01_VerifyLoginFunctionality()
		{
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("Validation Applied");
		}
		
		@AfterMethod
		public void TearDown()
		{
		driver.close();
		System.out.println("browser is closed");
		}
	}