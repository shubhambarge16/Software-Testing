package vExceptionHandlingConcept;

import java.io.FileNotFoundException;

public class ThrowKeyword 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		System.out.println("india");
		System.out.println("Hello");
		
		throw new FileNotFoundException();
	}
}
