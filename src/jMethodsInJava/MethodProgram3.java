package jMethodsInJava;

public class MethodProgram3 
{
//We can call "Method" in "Main Method" more than 1 time also.
//jevdya vela method call karu tevdya vela Method Body madhla code print honar.
	
//Method body-
	public static void CodePrint()
	{
		System.out.println("Hi");
		System.out.println("Bye");
	}
	
//for eg., we called method 4 times in main method, so msg in method body
//will be showing 4 times on console.
	
//Main method body-
	public static void main(String[] args)
	{
		CodePrint();
		CodePrint();
		CodePrint();
		CodePrint();
	}	
}