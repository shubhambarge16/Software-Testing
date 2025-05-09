package uListenersConcept;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener
{
//	(*To learn this topic clearly, watch lecture of 4.11.2022)
//We've to use "ITestListener" interface with above class to execute all 7 methods
//of Listeners. & we use "implements" keyword to attach this interface with class.
//I'll use 2 methods of Listeners class.
//we've to pass an argument as- "ITestResult result"
//we've to write below method before start of Test case, 

	public void onTestStart(ITestResult result)
	{
		System.out.println("Test is started");
	}
//after passing of test case, use below method-
		
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test is passed");
	}

//& after failure of test case use below method-
	public void onTestFailure(ITestResult result)
	{
		System.out.println("As Test is failed, take a screenshot");
	}
	
}