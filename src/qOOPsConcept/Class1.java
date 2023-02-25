package qOOPsConcept;

public class Class1 
{
//this is normal way of calling elements-
	int a=100;
	
	public void method1()
	{
		System.out.println("this is method1");
	}
	
//we can call these elements in this class itself.
	
	public static void main(String[] args) 
	{
//non-static var calling-
		Class1 x = new Class1();
		System.out.println(x.a);
		
//non-static method calling-
		x.method1();
		
	}	
}
