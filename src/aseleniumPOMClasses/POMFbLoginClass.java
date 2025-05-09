package aseleniumPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMFbLoginClass 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement Username;
	
	public void SendUsername()
	{
		Username.sendKeys("shubham.barge16@gmail.com");
	}
//=============================================================	
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement Password;
	
	public void SendPassword()
	{
		Password.sendKeys("normallife@16");
	}
//================================================================
	
	@FindBy(xpath= "//button[@id='loginbutton']")
	WebElement LoginButton;
	
	public void ClickLoginButton()
	{
		LoginButton.click();
	}
//=================================================================
	
	public POMFbLoginClass(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
}
