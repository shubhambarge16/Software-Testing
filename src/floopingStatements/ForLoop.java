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
	
	//How to explain the program to interviewer?
//at 1st I wrote 'for' keyword then in bracket I initialize the variable by assigning a value 1 to it.
//then I applied a condition as 'i' should be less than OR equal to 10.
//then I applied an increment operator so that it keeps increasing the msg written in printing statement,
//until the condition becomes false.
//After that in curly bracket I wrote a printing statement with a message "Hi".
//then coming out of loop I simply print a message as "end of program" as a standard practice.
	
//eg.1-WAP to print "Hi" message 10 times.
		//	 1	   2	 3
	for(int a=1; a<=10; a++)
	{
		System.out.println("Hi");
	}
	System.out.println("End of Program");
//===========================================================================

//eg-2 WAP to print 1 to 10 numbers.
	
	for(int b=1; b<=10; b++)
	{
		System.out.println(b);
	}
	System.out.println("End of Program");
//===========================================================================	
	
//eg-3 WAP to print 10 to 1 numbers. OR
//eg-WAP to print 1 to 10 numbers in reverse order
	
	for(int c=10; c>=1; c--)
	{
		System.out.println(c);
	}
	System.out.println("End of Program");	
//===========================================================================	

//eg-4 WAP to print alternate numbers starting from 1 upto 17 using for loop.
	
	for(int d=1; d<=17; d=d+2)
	{
		System.out.println(d);
	}
	System.out.println("End of Program");	
//===========================================================================	

//eg-5 WAP to print reverse alternate numbers starting
//from 17 to 1 using for loop.	
	
	for(int e=17; e>=1; e=e-2)
	{
		System.out.println(e);
	}
	System.out.println("End of Program");	
//===========================================================================		
	
//eg-6 WAP to print even numbers upto 20 using for loop.
	
	for(int f=0; f<=20; f=f+2)
	{
		System.out.println(f);
	}
	System.out.println("End of Program");	
//===========================================================================			
	
//eg-7 WAP to print odd numbers upto 19 using for loop.	
	
	for(int g=1; g<=19; g=g+2)
	{
		System.out.println(g);
	}
	System.out.println("End of Program");		
//===========================================================================			
	
//eg-8 WAP to print odd numbers upto 45 in reverse order using for loop.	
	
	for(int h=45; h>=1; h=h-2)
	{
		System.out.println(h);
	}
	System.out.println("End of Program");
//===========================================================
//eg-9 WAP to display a text "Java Language" 5 times using for loop.
	
	for(int i=1; i<=5; i++)
	{
		System.out.println("Java Language");
	}
	System.out.println("End of Program");
//here at first, assign any number to 'n' variable, then make a condition
//in such a way that "for loop" should run the text 5 times.
//===========================================================================
	
//eg-10 WAP to display char A to Z using for loop
	
	for(char j='A'; j<='Z'; j++)
	{
		System.out.println(j);
	}
	System.out.println("End of Program");	
//===========================================================================
	
//eg-11 WAP to print all English alphabets in reverse order.	
	
	for(char k='Z'; k>='A'; k--)
	{
		System.out.println(k);
	}
	System.out.println("End of Program");
//===========================================================================

//if we use 'for loop' to 'double' & 'float' datatype, it will only show
//whole numbers i.e. 25 & 12.
//It will not show decimal numbers after executing the program.
	
//	for(double i=1; i<=25.1234567890; i++)
//	{
//		System.out.println(i);
//	}	
//	System.out.println("End of Program");	
////--------------------------------------------------------------	
//	
//	for(float i=1; i<=12.12345678910; i++)
//	{
//		System.out.println(i);
//	}
//	System.out.println("End of Program");
//===========================================================================				
}
}


