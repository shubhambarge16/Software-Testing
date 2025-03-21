package aseleniumIFramePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeProgram3 
{
//Trying iframe on different website-
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
				
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		System.out.println("URL is opened");
		
		WebElement framebutton = driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
		framebutton.click();
		System.out.println("frame button is clicked");	
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame);
		System.out.println("switched to Iframe");
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.click();
		textbox.sendKeys("shubham barge");
		System.out.println("text is passed in textbox");
		
		System.out.println("End of program");

	}
}