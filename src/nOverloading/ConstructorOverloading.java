package nOverloading;

public class ConstructorOverloading 
{
//It is same as "Method Overloading"
//In class, declaring multiple Constructors with same Constructor name
//with different arguments passed in it is called as "Constructor Overloading".
//Note-we can store multiple values in very less variables (just 2 variables a&b)
//This is benefit of method & Constructor Overloading.
	
	int a;
	int b;
	
//	ex-1-no arg.
	public ConstructorOverloading()
	{
		a=10;
		System.out.println(a);
		b=20;
		System.out.println(b);
	}
	
//	ex-2-int arg.
	public ConstructorOverloading(int x)
	{
		a=30;
		System.out.println(a);
		b=40;
		System.out.println(b);
	}
	
//	ex-3-char arg.
	public ConstructorOverloading(char y)
	{
		a=50;
		System.out.println(a);
		b=60;
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		ConstructorOverloading x = new ConstructorOverloading();
		
		ConstructorOverloading y = new ConstructorOverloading(3);
		
		ConstructorOverloading z = new ConstructorOverloading('S');
	}	
}