package qOOPsConcept;

public class ChildClass extends ParentClass
{
//Execution of Inheritance Concept-
//we are inheriting/ importing elements from parent to child class
//so we've to write "extends" keyword in child class.
//bcoz of inheritance, we've to create object of child class here itself to
//bring elements of parent class here.
	
	public static void main(String[] args) 
	{
		ChildClass y = new ChildClass();
		System.out.println(y.a);
		
		y.method1();	
	}

}
//Syllabus has been studied & completed upto Inheritance concept @ 25/2/23