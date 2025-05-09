package testNGPackage;

import org.testng.annotations.Test;

public class Keyword3Enabled 
{
//3) enabled keyword-
//In this case, TestB will not execute bcoz we gave "enabled= false" keyword.
//TestD has not given enabled keyword besides this Test case will execute.
	
	@Test(enabled= true)
	public void TestA()
	{
		System.out.println("TestA");
	}
	
	@Test(enabled= false)
	public void TestB()
	{
		System.out.println("TestB");
	}
	
	@Test(enabled= true)
	public void TestC()
	{
		System.out.println("TestC");
	}

	@Test
	public void TestD()
	{
		System.out.println("TestD");
	}
	
}
