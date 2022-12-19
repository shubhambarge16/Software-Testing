package floopingStatements;

public class ForLoop 
{
public static void main(String[] args)
{
//Q-1. WAP to print "Hii" message 10 times-->
	
//	System.out.println("Hii");
//	System.out.println("Hii");
//	System.out.println("Hii");
//	System.out.println("Hii");
//	System.out.println("Hii");
//	System.out.println("Hii");
//	System.out.println("Hii");
//	System.out.println("Hii");
//	System.out.println("Hii");
//	System.out.println("Hii");
	
//Writing a program in above format is'nt wrong.
//but DRAWBACKS of writing any program in above format are-->
	
//1. Above code is a repeated code.
//2. The whole program becomes lengthy.
//3. The code becomes difficult to maintain.	
//4. The above pattern is not a standard way of writing a program.
//that's why we are using different Looping Statements.
//5. By using looping Statements, We can execute bigger program,
//by writing just very few lines of code.
//=======================================================================

//Standard way of writing a program-->
	
//there are basically 3 statements involved in for loop-->
//1st state.- Initialization.
//2nd state.- Applying condition.
//3rd state.- Applying Increment/Decrement.
	
//eg.1-WAP to print "Hi" message 10 times.
	
		//	 1	   2	 3
	for(int i=1; i<=10; i++)
	{
		System.out.println("Hi");
	}
	System.out.println("End of Program");
//===========================================================================

//eg-2 WAP to print 1 to 10 numbers.
	
	for(int i=1; i<=10; i++)
	{
		System.out.println(i);
	}
	System.out.println("End of Program");
//===========================================================================	
	
//eg-3 WAP to print 10 to 1 numbers. OR
//eg-WAP to print 1 to 10 numbers in reverse order
	
	for(int i=10; i>=1; i--)
	{
		System.out.println(i);
	}
	System.out.println("End of Program");	
//===========================================================================	

//eg-4 WAP to print alternate numbers starting from 1 upto 17.
	
	for(int i=1; i<=17; i=i+2)
	{
		System.out.println(i);
	}
	System.out.println("End of Program");	
//===========================================================================	

//eg-5 WAP to print reverse alternate numbers starting from 17 upto 1.	
	
	for(int i=17; i>=1; i=i-2)
	{
		System.out.println(i);
	}
	System.out.println("End of Program");	
//===========================================================================		
	
//eg-6 WAP to print even numbers upto 20.
	
	for(int i=0; i<=20; i=i+2)
	{
		System.out.println(i);
	}
	System.out.println("End of Program");	
//===========================================================================			
	
//eg-7 WAP to print odd numbers upto 19.	
	
	for(int i=1; i<=19; i=i+2)
	{
		System.out.println(i);
	}
	System.out.println("End of Program");		
//===========================================================================			
		
//eg-8 WAP to display a text "Java Language" 5 times
	
//	int n=5;
	
	for(int i=1; i<=5; i++)
	{
		System.out.println("Java Language");
	}
	System.out.println("End of Program");
//here at first, assign any number to 'n' variable, then make a condition
//in such a way that "for loop" should run the text 5 times.
//===========================================================================
	
//eg-9 WAP to display char A to Z using for loop
	
	for(char i='A'; i<='Z'; i++)
	{
		System.out.println(i);
	}
	System.out.println("End of Program");	
//===========================================================================				

//if we use 'for loop' to 'double' & 'float' datatype, it will only show
//whole numbers i.e. 25 & 12.
//It will not show decimal numbers after executing the program.
	
	for(double i=1; i<=25.1234567890; i++)
	{
		System.out.println(i);
	}	
	System.out.println("End of Program");	
//--------------------------------------------------------------	
	
	for(float i=1; i<=12.12345678910; i++)
	{
		System.out.println(i);
	}
	System.out.println("End of Program");
//===========================================================================				
}
}


