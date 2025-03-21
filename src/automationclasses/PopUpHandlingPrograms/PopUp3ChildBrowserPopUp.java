package automationclasses.PopUpHandlingPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp3ChildBrowserPopUp 
	{
	public static void main(String[] args) 
	{
//when we open a webpage & click on 1 Element, then 2nd webpage opens for that element.
//so to perform action on that 2nd element, we need to shift selenium from
//1st webpage(Parent page) to 2nd webpage (child page).
		
//Eg- If we want to add a mobile in cart on Amazon, then we search for a particular mobile,
//we clicked it, then the parent website divert us to new page i.e. child webpage.
//for specially that 1 mobile. & then we can do add to cart.
//To automate this scenario, we've to switch selenium from 1st webpage to 2nd child webpage.
//Program for this-
	
//Note- 1)To switch the selenium from parent webpage to alert popup, we use below method-
//		driver.switchTo().alert();
//Note- 2)To switch the selenium from parent webpage to child webpage, we use below method-
//		driver.switchTo().window(“pass the address of child window”);

//collection concept pending to learn. 1st learn that topic, then learn this topic-
//automating parent & child webpage.
//learn notes of date- 12.10.14	
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
								
		driver.manage().window().maximize();
		System.out.println("window is maximized");
								
		driver.get("https://www.amazon.in/s?bbn=1389401031&rh=n%3A1389401031%2Cp_89%3AOnePlus&dc&qid=1719935613&rnid=3837712031&ref=lp_1389401031_nr_p_89_0");
		System.out.println("Url is opened");	
	}
}