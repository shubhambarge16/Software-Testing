package automationclasses.PopUpHandlingPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp2AlertPopUp3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened ");
						
		driver.manage().window().maximize();
		System.out.println("window is maximized");
						
		driver.get("https://demoqa.com/alerts");
		System.out.println("Url is opened");
		
		WebElement Clickme = driver.findElement(By.xpath("//button[@id='promtButton']")); 
		Clickme.click();
		System.out.println("Clickme button is clicked");
		
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("shubham Barge");
		Thread.sleep(3000);
		System.out.println("text is entered in text box of alert");
		
		alt.accept();
//		OR
//		alt.dismiss();
		System.out.println("alert is handeled");
		
		System.out.println("End of program");	
	}
}