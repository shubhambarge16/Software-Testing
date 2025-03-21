package aselenium.DropDownPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1SauceDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
														
	WebDriver driver = new ChromeDriver();
	System.out.println("browser is opened");
					
	driver.manage().window().maximize();
	System.out.println("browser is maximized");
					
	driver.get("https://www.saucedemo.com/");
	System.out.println("URL is opened");
			
	WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys("standard_user");
	Thread.sleep(2000);
			
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret_sauce");
	Thread.sleep(2000);
			
	WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
	login.click();
	System.out.println("Login successfully");
	Thread.sleep(3000);
	
//Inspecting filter element on webpage & clicking it-
	WebElement Filter = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	Filter.click();
	System.out.println("Filter button is clicked");
	Thread.sleep(3000);

//we use "Select" class of selenium, creating its ref. variable & passing above element "Filter"
//in its constructor. this class is mandatory for dropdown.
	Select s = new Select(Filter);
	s.selectByValue("lohi");
	System.out.println("Option low to High is selected");
	Thread.sleep(3000);
			
	driver.close();
	System.out.println("Browser is closed");	
		}	
	}