package qInheritance;

public class Class2 
{
//Calling elements of class1 to class2 by normal way.
//(without using inheritance.)
		
	public static void main(String[] args) 
	{
		//1.
		System.out.println(Class1.a);
		//2.
		Class1 x = new Class1();
		System.out.println(x.b);
		//3.
		x.method1();
			
	}
		
}
