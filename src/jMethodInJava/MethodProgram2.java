package jMethodInJava;

public class MethodProgram2 
{
//program written in MethodProgram1 is not wrong. its just lengthy.
//But as a Standard practice, we can't write like that.
//So to avoid Length of program, we use "Method".
//from the previous code, those all lines which have repeated codes, will be
//kept in method body & only those will be called in "Main method" body.
//Other lines which have different codes, will be printed separately in "Main method".
	
//Note- always write a "Method" in class body only
//Don't write "Method" in "Main method" body.
	
	//Method Body-
	public static void printpattern()
	{
	System.out.println("123");
	System.out.println("123");
	System.out.println("123");
	}

//Now above method calling in "Main method"-
//Method la call karaych mhanje above method body madhla code
//below main method body madhe anaycha i.e. "Method calling".
	
	public static void main(String[] args) 
	{
		printpattern();		//<-this line is copied from above program only.
		System.out.println("AA");
		
		printpattern();
		System.out.println("BB");
		
		printpattern();
		System.out.println("CC");
	}
//This is the reduced code using method calling process.
}
