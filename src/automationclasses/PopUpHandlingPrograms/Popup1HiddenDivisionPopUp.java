package automationclasses.PopUpHandlingPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1HiddenDivisionPopUp 
{
//after opening bookmyshow website, I selected "Pune" city in below program.
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
						
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
						
		driver.get("https://in.bookmyshow.com/");
		System.out.println("Url is opened");
			
		WebElement City = driver.findElement(By.xpath("//span[text()='Pune']"));
		City.click();
		System.out.println("City is clicked");
		Thread.sleep(3000);
		
		System.out.println("Pop up is closed");
		
		driver.close();
			
		System.out.println("End of program");	
		}
}