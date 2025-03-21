package aselenium.DragAndDropPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");
				
		driver.manage().window().maximize();
		System.out.println("browser is Maximized");
				
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		System.out.println("URL is Opened");
		
		WebElement RomeCity = driver.findElement(By.xpath("//div[@id='box6']"));
		RomeCity.click();
		System.out.println("RomeCity is clicked");
		
		WebElement ItalyCountry = driver.findElement(By.xpath("//div[@id='box106']"));
		ItalyCountry.click();
		System.out.println("ItalyCountry is clicked");
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(RomeCity, ItalyCountry);
		
		System.out.println("end of program");	
	}
}