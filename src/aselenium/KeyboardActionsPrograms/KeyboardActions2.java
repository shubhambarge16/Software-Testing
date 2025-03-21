package aselenium.KeyboardActionsPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions2 
{
//Program to perform Keyboard actions like pressing 2 buttons at a time.
//like- ctrl+A, ctrl+V etc.
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
											
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
						
		driver.manage().window().maximize();
		System.out.println("Browser is maximized ");
						
		driver.get("https://text-compare.com/");
		System.out.println("Url is opened");
		
//clicking Textbox1	element & passing text in it.	
		WebElement Textbox1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		System.out.println("Textbox1 is clicked");
		Textbox1.sendKeys("I am shubham Barge");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);

//for pressing ctrl key & selecting whole text-
//1-pressing ctrl key down-
		act.keyDown(Keys.CONTROL);
//2-pressing A key for selecting the text-		
		act.sendKeys("A");
//3-Leaving ctrl key-
		act.keyUp(Keys.CONTROL);
		act.perform();
	
//for copying whole text-
		act.keyDown(Keys.CONTROL);
//1-pressing C key for copying the text-
		act.sendKeys("C");
//2-leaving ctrl key-
		act.keyUp(Keys.CONTROL);
		act.perform();

//clicking Textbox2-
		WebElement Textbox2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		Textbox2.click();
		System.out.println("Textbox2 is clicked");
		Thread.sleep(3000);
		
//Now pressing keys for pasting the copied text-
//1-pressing ctrl key down
		act.keyDown(Keys.CONTROL);
//2-Now pressing V letter for pasting the copied text-		
		act.sendKeys("V");
//3-Leaving ctrl key-
		act.keyUp(Keys.CONTROL);
		act.perform();
		
//Comparing both texts whether they are correct or not.-
		WebElement Compare = driver.findElement(By.xpath("//div[@class='compareButtonText']"));
		Compare.click();
		
		System.out.println("End of program");	
	}
}