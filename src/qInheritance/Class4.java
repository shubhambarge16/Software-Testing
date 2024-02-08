package qInheritance;

public class Class4 extends Class3
{
//calling using Inheritance-
	
	public static void main(String[] args) 
	{
		Class4 yObject = new Class4();
		System.out.println(yObject.a);
		
		System.out.println(Class3.b);
		
		Class3.method1();
		
		yObject.method2();
	}	
}