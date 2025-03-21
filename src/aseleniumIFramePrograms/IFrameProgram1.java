package aseleniumIFramePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameProgram1 
{
//program for handling an IFrame on a website using selenium-
//here we are selecting 1 option from dropdown menu in frame (child webpage) of main webpage-
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		System.out.println("Url is opened");
		
//find xpath of frame element & pass here.
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='frm1'][1]"));
		System.out.println("xpath of frame element is searched");
		
//then write "switchTo" method & pass above "iframe" variable in it. 
		driver.switchTo().frame(iframe);
		
//Now onwards, write regular program of dropdown activity, by inspecting elements.
//1) click on dropdown button-
		WebElement DropDown = driver.findElement(By.xpath("//select[@id='selectnav1']"));
		DropDown.click();	
		
//2) Use Select class of selenium & pass above "DropDown" variable in its constructor.		
		Select s = new Select(DropDown);
		s.selectByVisibleText("-- Automation Testing");
		
		System.out.println("Automation Testing option is selected");
		Thread.sleep(3000);	
		
		System.out.println("end of program");
		
	}
}