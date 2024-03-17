package kConstructorPack;

public class CreatingConstructorAndObject2 
{
//Purpose of constructor-
//1)To initialize a Variable.
//2)To load Non static elements.
	
//Note-
//1)Constructor must always write in class body not in main method body.
//It is almost same as writing a "method".
//2)"Constructor Name" should be always same as "class name".

//creating a "CONSTRUCTOR"-
	
	public CreatingConstructorAndObject2()
	{
		int a=20;
		System.out.println(a);
		System.out.println("Hello");
	}

//Main method-:
	
	public static void main(String[] args) 
	{
//calling Constructor like method-
		
//		ConstructorAndObject();  
//Not possible. So I've to create an object to call Constructor in main method.	
//=================================================================================	
//Creating "OBJECT" to call the constructor.
		
		CreatingConstructorAndObject2 x = new CreatingConstructorAndObject2();
		
//Here, x-is the object.
//By creating object, we have called the constructor in Main Method.
	}	
}