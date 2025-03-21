package aautomationFirstProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeProgram 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver",
		"C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe\\");
				
		WebDriver driver = new EdgeDriver();
				
		driver.get("https://www.instagram.com/");
		System.out.println("end of program");
	}
}