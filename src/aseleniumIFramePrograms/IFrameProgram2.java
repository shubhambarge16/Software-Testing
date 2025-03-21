package aseleniumIFramePrograms;

import java.time.Duration;

import javax.sound.sampled.Line;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameProgram2 
{
//Whole program of IFRAME  concept (from start to end)-
//in this program, we're going inside of frame, handling any element, then coming out of frame,
//& performing other activity on main webpage(parent webpage), using method- "driver.switchTo().parentFrame();"
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		
//Implicit Wait is added, so that selenium take some time to load elements on webpage.
//not compulsory to add this Line. if webpage taking time to load the elements then use this.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		System.out.println("Url is opened");
	
		WebElement Frame = driver.findElement(By.xpath("//iframe[@id='frm2']"));
		
		driver.switchTo().frame(Frame);
		System.out.println("switched from parent webpage to frame");
		
		WebElement Dropdown = driver.findElement(By.xpath("//select[@id='selectnav1']"));
		Dropdown.click();
		System.out.println("Dropdown element is clicked");
		
		Select s = new Select(Dropdown);
		s.selectByVisibleText("YouTube Courses");
		System.out.println("YouTube Courses option is selected");
		Thread.sleep(5000);	
		
//to get out from frame to main webpage-
//		driver.switchTo().parentFrame();
//		OR
		driver.switchTo().defaultContent();
		System.out.println("switched from frame to parent webpage");
		
//then perform any activity on element which is present parent webpage i.e. out of frame.
//I performed click activity on "Contact" element on parent webpage.
//now searching xpath of Contact element.
		WebElement ContactElement = driver.findElement(By.xpath("//a[text()='Contact']"));
		ContactElement.click();
		System.out.println("Contact element is clicked");
		
		System.out.println("end of program");
			
	}
}