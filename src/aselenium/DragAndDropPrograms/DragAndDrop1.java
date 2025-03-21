package aselenium.DragAndDropPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1
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
		
		WebElement City = driver.findElement(By.xpath("//div[@id='box3']"));
		City.click();
		System.out.println("City Element is clicked");
		
		WebElement Country = driver.findElement(By.xpath("//div[@id='box103']"));
		Country.click();
		System.out.println("Country Element is clicked");
		
		Actions act = new Actions(driver);
		
//Below method is written to perform drag activity		
		act.dragAndDrop(City,Country).perform();
		
		System.out.println("end of program");	
	}
}