package testNGPackage;

import org.testng.annotations.Test;

public class Keyword2InvocationCount 
{
//2)Invocation Count-
	
	@Test(invocationCount=3, priority=1)
	public void TestA()
	{
		System.out.println("TestA");
	}
	
	@Test(invocationCount=2, priority=3)
	public void TestB()
	{
		System.out.println("TestB");
	}
	
	@Test(invocationCount=5, priority=-2)
	public void TestC()
	{
		System.out.println("TestC");
	}
	
	@Test(invocationCount=0, priority=0)
	public void TestD()
	{
		System.out.println("TestD");
	}
 
}
