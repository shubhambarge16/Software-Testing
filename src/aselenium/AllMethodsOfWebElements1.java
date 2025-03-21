package aselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllMethodsOfWebElements1 
{
	public static void main(String[] args) 
	{
//all methods of WebElements-
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opened ");
		
	driver.manage().window().maximize();
	System.out.println("Browser is maximized ");
	
	driver.get("https://en-gb.facebook.com/");
	System.out.println("Url is opened");
		
//I just wrote username text field to try all methods-
	WebElement username= driver.findElement(By.xpath("//input[@id='email']"));
		
//1)getTagname method of WebElement-
	String tagName = username.getTagName();
	System.out.println("TagName of username element is->"+tagName);
//---------------------------------------------------------------------	
//2)getAttribute method of WebElement-
	String idAttributeValue = username.getAttribute("id");
	System.out.println("AttributeValue of id attribute is->"+idAttributeValue);
//--------------------------------------------------------------------------
//3)getText method of WebElement-
	String htmlText = username.getText();
	System.out.println("html text of username is->"+htmlText);
//---------------------------------------------------------------------------
//4)IsDisplayed method-
//this method is used to check whether the element is displaying on screen or not.
//In this case, we are checking whether username element is present on screen or not
	
	boolean result1 = username.isDisplayed();
	System.out.println("is username element displaying"+result1);
	   
	if(result1 == true)
	{
		System.out.println("username element is present");
//if element is present, then entering the value-
		System.out.println("shubham.barge16@gmail.com");
		System.out.println("TC is passed");
	}
	else
	{
		System.out.println("username element is not present");
		System.out.println("TC is failed");
	}
	   System.out.println("end of program");
//--------------------------------------------------------------------		
//5)isEnabled-
//Normally this method is applied on textbox to check whether it is accepting
//the values or not.
//here I will check whether the password element is accepting the value or not.	   
	  WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	 
	  boolean result2 = password.isEnabled();
	  System.out.println("is password element is accepting the value?"+result2);
	  if(result2 == true)
	  {
		  System.out.println("Password Element is accepting the value");
		  System.out.println("normallife@16");
		  System.out.println("TC is passed");
	  }
	  else
	  {
		  System.out.println("password Element is not accepting the value");
		  System.out.println("abc@123");
		  System.out.println("TC is failed");
	  }
	  System.out.println("end of program");
//--------------------------------------------------------------------------	      
}
}