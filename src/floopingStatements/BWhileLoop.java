package floopingStatements;

public class BWhileLoop 
{
public static void main(String[] args) 
{
//In while loop do not add semicolon ';' after applying condition(i<=5)

	//How to explain the program to interviewer?
	
//at 1st, I Initialize a variable by assigning a value 1 to it.
//then I took a keyword "while" & applied a condition that, the value should be
//less than or equal to 5. then in curly bracket I wrote a printing statement with a message "Hi".
//After that Increment operator is applied so that it keeps increasing the msg written in printing statement,
//until the condition becomes false.
//then coming out of loop,Simply I print a message "end of program" as a standard practice.

//Eg-1WAP to print 'hi' message 5 times.
	int i=1;
	
	while(i<=5)
	{
		System.out.println("hi");
		i++;
	}
	System.out.println("end of program");
//-------------------------------------------------------------------
	
//eg-2WAP to print 1 to 5  numbers.
	
	int a=1;
	
	while(a<=5)
	{
		System.out.println(a);
		a++;
	}
	System.out.println("end of program");
//-----------------------------------------------------------------------	
	
//eg-3 WAP to print 5 to 1 numbers.
	
	int b=5;
	
	while(b>=1)
	{
		System.out.println(b);
		b--;
	}
	System.out.println("end of program");
//------------------------------------------------------------------------

//eg-4 WAP to print alternate numbers starting from 1 to 17 using while loop.
	
	int c=1;
	
	while(c<=17)
	{
		System.out.println(c);
		c=c+2;
	}
	System.out.println("end of program");
//-----------------------------------------------------------------------
	
//eg-5 WAP to print alternate numbers from 1 to 23 in reverse order using while loop.
	
	int d= 23;
	
	while(d>=1)
	{
		System.out.println(d);
		d=d-2;
	}
	System.out.println("end of program");
//-----------------------------------------------------------------------	
	
//eg-6 WAP to print even numbers upto 20 using while loop.	
	
	int e=0;
	
	while(e<=20)
	{
		System.out.println(e);
		e=e+2;
	}
	System.out.println("end of program");
//--------------------------------------------------------------------
	
//eg-7 WAP to print odd numbers upto 19 using while loop.	
	
	int f=1;
	
	while(f<=19)
	{
		System.out.println(f);
		f=f+2;
	}
	System.out.println("end of program");
//-----------------------------------------------------------------
	
//eg-8 WAP to print odd numbers upto 45 in reverse order using while loop.
	
	int g= 45;
	
	while(g>=1)
	{
		System.out.println(g);
		g=g-2;
	}
	System.out.println("end of program");		
//--------------------------------------------------------------
	
//eg-9 WAP to display a text "Shubham Barge" 5 times using while loop.
			
	int h=1;
	
	while(h<=5)
	{
		System.out.println("Shubham Barge");
		h++;
	}
	System.out.println("end of program");		
//--------------------------------------------------------------			
			
//eg-10 WAP to display char A to Z using while loop.
	
	char j= 'A';
	
	while(j<='Z')
	{
		System.out.println(j);
		j++;
	}
	System.out.println("end of program");		
//--------------------------------------------------------------						

//eg-11 WAP to print all English alphabets in reverse order.
	
	char k='Z';
	
	while(k>='A')
	{
		System.out.println(k);
		k--;
	}
	System.out.println("end of program");
//--------------------------------------------------------------		
}
}
