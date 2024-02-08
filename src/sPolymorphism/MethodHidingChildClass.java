package sPolymorphism;

public class MethodHidingChildClass extends MethodHidingParentClass
{
//Method Hiding-
	
	public static void method1()
	{
		System.out.println("Bye-method1-childClass");
	}
	
	//execute
	public static void main(String[] args) 
	{
		method1();
	}	
}