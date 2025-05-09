package aautomationFirstProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeProgram 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//1. maximize browser-
		driver.manage().window().maximize();
//-------------------------------------------------------------------------
//2. get method opens a URL-
		driver.get("https://www.facebook.com");				//facebook
		Thread.sleep(2000);
//--------------------------------------------------------------------------
//3. navigating from 1 website to another website		
//		driver.navigate().to("https://www.selenium.dev/");   //selenium
//		Thread.sleep(3000);
//----------------------------------------------------------------------------	
//4. back from selenium to facebook
//		driver.navigate().back();							//facebook
//		Thread.sleep(3000);
//----------------------------------------------------------------------------		
//5. Forwarded to selenium-
//		driver.navigate().forward();						//selenium
//		Thread.sleep(3000);
//-----------------------------------------------------------------------------	
//6. Refreshing above URL itself-
//		driver.navigate().refresh();						//selenium
//-----------------------------------------------------------------------------		
//7. minimizing browser-
//		driver.manage().window().minimize();
//-----------------------------------------------------------------------------		
//8. closes a single tab in browser when multiple tabs are open-
//		driver.close();
//-----------------------------------------------------------------------------
//9. quit whole browser-
//		driver.quit();
//-----------------------------------------------------------------------------		
//10. Get current URL-
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println("CurrentUrl is-"+currentUrl);
//-----------------------------------------------------------------------------		
//11. get Title of website-
//		String WebsiteTitle = driver.getTitle();
//		System.out.println("CurrentTitle is-"+WebsiteTitle);
//-----------------------------------------------------------------------------		
//12. set a specific size of browser(width, height)-
//		Dimension d= new Dimension(250,350);
//		driver.manage().window().setSize(d);
//-----------------------------------------------------------------------------
//13.set a specific position of browser on screen-
//		Point p = new Point(300,200);
//		driver.manage().window().setPosition(p);
//14. minimizing the Browser-		
//		driver.manage().window().minimize();
//		Thread.sleep(2000);
		
//		driver.close();
		System.out.println("end of program");
	}	
}