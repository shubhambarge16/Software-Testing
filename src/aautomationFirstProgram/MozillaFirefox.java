package aautomationFirstProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaFirefox 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver",
	"C:\\Users\\hp\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
					
	WebDriver driver = new FirefoxDriver();
					
	driver.get("https://www.google.com");
}
}