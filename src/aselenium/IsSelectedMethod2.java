package aselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod2 
{
	public static void main(String[] args) 
	{
//FAILED TO RUN, CORRECT IT & EXECUTE AGAIN
//watch lecture of 4.10.22 - @52:00 min
//if value of "id" is changing after refreshing webpage, then find the
//xpath by using relative xpath method.
		
//6)isSelected-
//here we'll check the radio button is clickable or not
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
					
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
					
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		System.out.println("Url is opened");
//here I entered the xpath of male element by using xpath by value.
//1.Without selecting any Radio Button-
		
		WebElement RadioButton = driver.findElement(By.xpath("//input[@value='2']"));
		boolean result2 = RadioButton.isSelected();
		
		if(result2 == true)
		{
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println("TC is failed");
		}
//2.By selecting any 1 Radio Button-		
		
		WebElement MaleElement = driver.findElement(By.xpath("//input[@value='2']"));
		MaleElement.click();
		boolean result3 = MaleElement.isSelected();
		
		if(result3 == true)
		{
			System.out.println("Is RadioButton selected" +result3);
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println("TC is failed");
//If TC is failed then we should click on maleElement. thats why I wrote below code.
			MaleElement.click();
		}
		System.out.println("end of program");
		}
	}