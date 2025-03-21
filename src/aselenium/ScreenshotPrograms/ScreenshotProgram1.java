package aselenium.ScreenshotPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotProgram1 
{
public static void main(String[] args) throws IOException 
{
//Program of taking 1 screenshot-:
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.get("https://www.saucedemo.com");
	
//taking loginPage screenshot here.
//we did upcasting of 'driver' using "TakesScreenshot" interface.
	//1)
		TakesScreenshot ts = (TakesScreenshot)driver;

//by using ts reference vairable, we called a method- getScreenshotAs(OutputType.FILE)
//to get the screenshot.
	//2)
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
//we got screenshot here but it is in 'byte' format.
//but we want it in jpg/png/jpeg format. So, to convert it, we use method
//of java- getScreenshotAs(OutputType.FILE); & saved it in a file named as sourcefile.
//But from above line, we didn't know which is the format of File.
//so to decide format of image & destination where to save, we've to give path of folder & format name of 
//screenshot image like- shubham.jpg/png/jpeg.
	//3)
		File Destfile = new File("C:\\Users\\hp\\Documents\\1.SOFTWARE TESTING NOTES\\1) Automation Testing- Notes by Pavan Sir\\My Automation notes\\Screenshot\\Shubha.jpg");

//then we've to write below line to copy screenshot from sourcefile to Destinationfile.
	//4)
		FileHandler.copy(sourcefile, Destfile);

		System.out.println("end of program");
//screenshot taken successfully.		
}
}