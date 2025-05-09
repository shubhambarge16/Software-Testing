package jMethodsInJava;

public class MethodProgram2 
{
//MethodProgram1 is not wrong its just lengthy. So to reduce Length of program, we use "Method".
//So, from the previous code, all lines which have repeated codes, will be kept in
//method body & only those will be called in "Main method" body. Other lines which
//have different codes, will be printed separately in "Main method".
	
//Note-Always write "Method" in class body only. Not in "Main method" body.
	
	//Method Body-
	public static void printpattern()
	{
	System.out.println("123");
	System.out.println("AA");
	System.out.println("BB");
	System.out.println("CC");
	}

//"Calling Method in Main method" means-
//Method la call karaych mhanje varchya method body madhla code
//console vr print karnyasathi below "Main method" body madhe anaycha.
//this is "Method calling".
	
	//main method-
	public static void main(String[] args) 
	{
		printpattern();	  //<-only this line is copied from above Method Body.
		
	}
//This is the method calling process using reduced code.
}