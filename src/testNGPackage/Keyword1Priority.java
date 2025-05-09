package testNGPackage;

import org.testng.annotations.Test;

public class Keyword1Priority
{
//1)Priority Keyword- Its explanation is in word file.
	
	@Test(priority=-4)
	public void TestA()
	{
		System.out.println("TestA");
	}
	
	@Test(priority=0)
	public void TestB()
	{
		System.out.println("TestB");
	}
	
	@Test(priority=3)
	public void TestC()
	{
		System.out.println("TestC");
	}
	
	@Test(priority=-1)
	public void TestD()
	{
		System.out.println("TestD");
	}
	
	@Test(priority=-1)
	public void TestE()
	{
		System.out.println("TestE");
	}
	
}