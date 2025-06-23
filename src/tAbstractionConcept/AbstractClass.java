package tAbstractionConcept;

public abstract class AbstractClass 
{
	public void method1()
	{
		System.out.println("Hello this is method1");
	}
	 
	public static void main(String[] args)
	{
		AbstractClass x = new AbstractClass();
		x.method1();
		
	}
//Above method will execute but when we insert abstract keyword,
//then this method will not be able to execute.
//it will show error @line no- 12
//so if we've to call this method we've create another class lets say simple class
}
