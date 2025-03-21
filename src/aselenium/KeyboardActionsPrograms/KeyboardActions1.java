package aselenium.KeyboardActionsPrograms;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
									
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
				
		driver.manage().window().maximize();
		System.out.println("Browser is maximized ");
				
		driver.get("https://the-internet.herokuapp.com/key_presses");
		System.out.println("Url is opened");
		
//Keyboard action
//case-I-if we want to press letters & numbers then use Actions class &
//"sendKeys" Method as well.
		Actions act = new Actions(driver);
		
		act.sendKeys("S").perform();
		Thread.sleep(3000);
		
		act.sendKeys("4").perform();
		Thread.sleep(3000);
		
//Case-II- If we want to press characters other than letters & numbers,
//then use "Keys" method in sendKeys method.
		
		act.sendKeys(Keys.ARROW_LEFT).perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.ARROW_RIGHT).perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.SPACE).perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.TAB).perform();
		
		driver.quit();
		System.out.println("end of program");	
	}
}