package testNGPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations1 
{	
//Annotations which are mostly used in TestNG-
	
	@BeforeMethod
	public void method1()
	{
		System.out.println("method1");
	}
	
	@Test 
	public void method2()
	{
		System.out.println("method2");
	}
	
	@AfterMethod
	public void method3()
	{
		System.out.println("method3");
	}
}