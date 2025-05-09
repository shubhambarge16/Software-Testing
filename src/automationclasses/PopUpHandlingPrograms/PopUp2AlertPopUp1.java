package automationclasses.PopUpHandlingPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp2AlertPopUp1 
{
	public static void main(String[] args) throws InterruptedException 
	{
//how to handle alert pop up-
//when we are on a webpage, & after clicking on an element we got alert,
//& we can't inspect that alert So to handle that alert, we have to switch
//selenium from main webpage to alert dialogue box.
//for this we've to use "driver.switchTo.alert" method.	
//ALERT-1
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened ");
		
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		
		driver.get("https://demoqa.com/alerts");
		System.out.println("Url is opened");
		
//=========================================================================================		
//1st we've to find xpath of clickme1 button.
		WebElement clickme1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickme1.click();
		System.out.println("clickme1 button is clicked");
		Thread.sleep(3000);
		
//then we use switchTo().alert(); method of Alert to switch selenium from main webpage
//to alert dialogue box & to handle it. then we use accept method to accept the alert.
		Alert alt = driver.switchTo().alert();
		alt.accept();
		System.out.println("Alert1 is accepted");
//==================================================================================================
		
//ALERT-2
//we find xpath of clickme2 button.
//it will do click action 5 seconds after clicking.
		WebElement Clickme2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		Clickme2.click();
		System.out.println("clickme2 button is clicked");
//here, the functionality of website is, "alert will show 5 seconds after clicking "clickme"
//so we've to wait upto completion of 5 sec. thats why i used little bit more time. i.e. 6 sec.
//to accept the alert.
		Thread.sleep(6000);
		
//& then alert will be acceped & handeled.
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Alert2 is accepted");
		Thread.sleep(3000);
		
		System.out.println("end of program");	
	}
}