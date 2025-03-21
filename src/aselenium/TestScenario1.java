package aselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario1 
{
//A website is provided by BA to us for testing.
//So after clicking on URL, we are testing whether we are landed on genuine Authentic website or not.
//which was provided to us by BA.
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//Validating website by using method- driver.getCurrentUrl();
		
		String givenURL = "https://www.facebook.com/";
		driver.get(givenURL);
		String ActualURL = driver.getCurrentUrl();
		
		if(givenURL.equals(ActualURL))
		{
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is failed");
		}
//if result of actual URL is equals to given URL,
//then we can say that, we've landed on genuine website.
//which was provided to us.
	}	
}