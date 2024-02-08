package packC;

import pCallingFromOneClassToAnother.ClassA;

public class ShubhamClass 
{
//Importing all stuff from "ClassA" of "packA" to 
//class-"ShubhamClass" of "packC".
	
	public static void main(String[] args) 
	{
//1)Static var-		
		System.out.println(ClassA.a);
		
//2)Non-Static var-		
		ClassA sObject = new ClassA();
		System.out.println(sObject.b);
		
//3)-i)static method-
		ClassA.method1();
		
//ii)non-static method-
		sObject.method2();
	
	}	
}