package vExceptionHandlingConcept;

public class RunTimeException 
{
public static void main(String[] args) 
{
//Run Time Exception/ Unchecked Exception
	
		int a[]= {10,20,30};
	
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		try
		{
			System.out.println(a[3]);
		}
		catch(Exception e)
		{
			System.out.println("index 3 is not available in array");
			System.out.println("change the value of index");	
		}
		finally
		{
			System.out.println("Hi rahul");
			System.out.println("bye");
			System.out.println("End of program");
		}
	
}
}
