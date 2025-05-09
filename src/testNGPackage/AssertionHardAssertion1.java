package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionHardAssertion1 
{
//which should be the expected Title, that is provided by BA/ Developer to us for testing
//1)Hard Assertion-
	@Test
	public void testA()
	{
		String expectedTitle ="Swag Labs";   
		String actualTitle = "Swag Labs";
		Assert.assertEquals(actualTitle, expectedTitle);
	
	   String expectedURL = "www.sauceDemo.com";
	   String actualURL   = "w.sauceDemo.com";
	   Assert.assertEquals(actualURL, expectedURL);	
	}
	
	@Test
	public void testB()
	{
		System.out.println("Hello");
	}

}
