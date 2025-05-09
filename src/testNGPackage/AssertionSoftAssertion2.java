package testNGPackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoftAssertion2 
{
	//1) 1st test case
	@Test
	public void TestA()
	{
		String expectedTitle ="Love India";   
		String actualTitle = "India";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle);
	
	   String expectedURL = "www.sauceDemo.com";
	   String actualURL   = "www.sauceDemo.com";
	   soft.assertEquals(actualURL, expectedURL);
	   
	   soft.assertAll();
	}
	
	//2) 2nd test case
	@Test
	public void TestB()
	{
		System.out.println("HELLO");
	}
	
}
