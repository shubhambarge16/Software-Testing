package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions3 
{
//AssertEquals method can be used for all datatypes- String, int, double, boolean
	//1)String-
	@Test
	public void testA()
	{
		//1
		String expected="Rahul";
		String actual="Rahul";
		
		Assert.assertEquals(actual, expected);
	//2)int-
		//2. 
		int exp = 10;
		int act = 12;
		
		Assert.assertEquals(act, exp);
	}
//==================================================================================
	//2)boolean-
//for purposefully pass or fail a method then we can use any 1 out of below methods-
	@Test
	public void testB()
	{
//1)if we want to purposefully PASS a test case then we've to use below method-
		Assert.assertTrue(true);
//2)if we want to purposefully FAIL a test case then we've to use below method-
		Assert.assertTrue(false);

//3)if we want to purposefully PASS a test case then we can to use below method-
		Assert.assertFalse(false);
//4)if we want to purposefully FAIL a test case then we can to use below method-
		Assert.assertFalse(true);
	}
//==================================================================================	
//3)below test will be FAIL. so in this case we can write a Message here as well-
//	@Test
//	public void testC()
//	{
//		//1
//		String expectedTitle="Rahul";
//		String actualTitle="Mohan";
//		
//		Assert.assertEquals(actualTitle, expectedTitle,"Failure Message-Titles are not matching" );
//	}

}