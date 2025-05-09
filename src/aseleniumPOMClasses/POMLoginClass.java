package aseleniumPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoginClass 
{
//1st we've to declare a webdriver. 
	WebDriver driver;
	
//2.find elements from website by using @FindBy annotations-
//	1st element-
	@FindBy(xpath= "//input[@id='user-name']")
	WebElement Username;
	
//3.Which action is going to perform next, that should be written in the form of method.
//after writing above xpath.
//& which action is going to perform, that action name should be given to that method.
//so that we can easily call it in other class.
	public void sendUsername()
	{
		Username.sendKeys("standard_user");
	}
//---------------------------------------------------------------------------------------

//	2nd element-
	@FindBy(xpath= "//input[@id='password']")
	WebElement Password;
	
	public void SendPassword()
	{
		Password.sendKeys("secret_sauce");
	}
//--------------------------------------------------------------------------------------
	
	//3rd element-
	@FindBy(xpath= "//input[@id='login-button']")
	WebElement LoginButton;
	
	public void LoginClick()
	{
		LoginButton.click();
	}
//-------------------------------------------------------------------------------------

//4.then we've to declare a Constructor-
	public POMLoginClass(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
}