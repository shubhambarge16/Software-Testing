package aselenium.MouseActionsPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickAction3 
{
//	check whole program again compare with double click program
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
												
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
							
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
						
		driver.get("https://demoqa.com/buttons");
		System.out.println("URL is opened");
		
//1-->		
		WebElement RightClickButton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		System.out.println("searched xpath of RightClickButton & clicked it");
//2-->
		Actions act = new Actions(driver);
		System.out.println("Used Actions class of selenium & created object of it");
//3-->	
		act.click(RightClickButton).perform();
		System.out.println("RightClick action performed on RightClickButton");
//4-->
		String ExpectedMessage = "You have done a right click";
		System.out.println("Expected Message is written");
//5-->
		WebElement ResultMessageElement2 = driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
		System.out.println("searched xpath of msg element. got from html text of msg Element");
//6-->
		String ActualMessage = ResultMessageElement2.getText();
		System.out.println("wrote getText method of msg Element");
//7-->
		System.out.println("Applied Validation to check whether Right click done or not");
		
		if(ExpectedMessage.equals(ActualMessage))
	    {
	    	System.out.println("TC is passed");
	    }
	    else
	    {
	    	System.out.println("TC is failed");
        }
	    System.out.println("End of Program");
	}
}