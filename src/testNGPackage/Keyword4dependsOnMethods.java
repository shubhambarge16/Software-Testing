package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Keyword4dependsOnMethods 
{
	@Test
	public void LoginTest()
	{
		System.out.println("LoginTest");
		Assert.assertTrue(false);
	}
	
	@Test
	public void TestC()
	{
		System.out.println("TestC");
	}
	
	@Test
	public void TestD()
	{
		System.out.println("TestD");
	}
	
	@Test(dependsOnMethods= {"LoginTest"})
	public void MobileAddToCart()
	{
		System.out.println("MobileAddToCart");
	}
	
}