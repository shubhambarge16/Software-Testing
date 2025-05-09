package jMethodsInJava;

public class MethodPrograms4 
{
//Note- In main method, we can call method by its name. OR
//by (classname.methodname)
	
//Method-
	public static void Shubhambarge()
	{
		System.out.println("Hi");
		System.out.println("bye");
	}
	
//Main method body-
	public static void main(String[] args) 
	{
//1.calling directly by method name
		Shubhambarge();
//------------------------------------------------------------------------------		
//		OR
//2. calling by (classname.methodname)		
		MethodPrograms4.Shubhambarge();	
	}
//===================================================================================
	
//Types of methods-
//1.static-
//In static method, we call the method by method name OR classname.methodname 
//-----------------------------------------------------	
//2.non-static- 
//In non static, we can'nt call method by using methodname OR classname.methodname
//non static method can be called with the help of "Object" only.
//--------------------------------------------------------
//Note-syntax & the process of "Method calling" is almost same in both static & non-static.
//Only difference is, In static we use "static" keyword & in non-static we Don't use static keyword. 
	
}