package automationclasses.PopUpHandlingPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp2AlertPopup2 
{
	public static void main(String[] args) throws InterruptedException 
	{
//Handling "confirm box" Alert- clicking either YES or NO option in alert.
//1st we find xpath of confirm box click button.
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened ");
				
		driver.manage().window().maximize();
		System.out.println("window is maximized");
				
		driver.get("https://demoqa.com/alerts");
		System.out.println("Url is opened");
	 
//finding xpath of click button of confirm box-		
		WebElement Clickme = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		Clickme.click();
		Thread.sleep(3000);
		
//writing alert method to either accept or reject the alert box.		
		Alert alt = driver.switchTo().alert();
		
//if we want to get the text of alert message. (do you want confirm action?)
		alt.getText();
//(it is optional & it does not shows anything different after running program,
//so didn't understand why this is used?)
	
		alt.accept();
		//OR
//		alt.dismiss();
		System.out.println("Alert is accepted");
		
		System.out.println("End of program");	
	}	
}