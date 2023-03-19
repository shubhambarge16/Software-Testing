package rMethodOverriding;

public class ChildClass extends ParentClass
{
//Method Overriding-
//When there are 2 methods in parent class & child class with
//same name & same arg, than to execute method, it will execute 
//method of itself i.e. child class only.
//this is Method Overriding.

//	public void method1()
//	{
//		System.out.println("method1 child class");
//	}
	
	public static void main(String[] args) 
	{
		ChildClass x= new ChildClass();
		x.method1(0);
	}
//If we hide above method1 in child class & try to execute,
//than it will execute method1 of parent class.
}
