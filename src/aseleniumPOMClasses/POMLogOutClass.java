package aseleniumPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POMLogOutClass 
{
//for performing action of logout, we need to find only 2 elements from homepage.
//Menu button & Logout button
	
	WebDriver driver;
	
//1)Menu button element-
	@FindBy(xpath = "//button[text()='Open Menu']")
	WebElement MenuButton;
	
	public void ClickMenuButton()
	{
		MenuButton.click();
	}
//===================================================================

//2)Logout Button Element-
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	WebElement LogOutButton;
	
	public void ClickLogoutButton()
	{
		LogOutButton.click();
	}
//=================================================================
	
//3)Declaring a constructor-
	public POMLogOutClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}