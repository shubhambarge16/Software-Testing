package qInheritance;

public class ChildClass extends ParentClass
{
//Calling by INHERITANCE-
//we are inheriting/ importing elements from parent to child class
//so we've to write "extends" keyword in child class.
//bcoz of inheritance, we've to create object of child class here itself to
//bring elements of parent class here.
			
	public static void main(String[] args) 
	{
		System.out.println(ParentClass.a);
			
		ChildClass x = new ChildClass();
		System.out.println(x.b);
			
		x.method1();	
	}

}
