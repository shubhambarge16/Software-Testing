package testNGPackage;

import org.testng.annotations.Test;

public class Keyword5timeOut 
{
	@Test
	public void TestA()
	{
		System.out.println("TestA");
	}
	
	@Test(timeOut=2000)
	public void TestB() throws InterruptedException
	{
		System.out.println("TestB");
		Thread.sleep(5000);
	}
	
	@Test
	public void TestC()
	{
		System.out.println("TestC");
	}
	
}
