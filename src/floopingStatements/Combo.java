package floopingStatements;

public class Combo 
{
public static void main(String [] args)
{
//Output is same but Only Syntax is different of all 3 loops.
	
//Difference betn all loops-->
	
//1.  "FOR"	-->													
//(Initialization, condition, increment/ decrement) 
//	{
//		Printing statement
//	}
//	Program end.
//All in one bracket & one line.	
//=========================================================	
	
//2. "WHILE" -->
//
// int i=1; <-- 1st Initialization then,
// while(condition) then,
// {
//	Printing statement  then,
//  increment/ decrement
//	}
//	Program end.
	
//============================================================	
//3. "DO-WHILE" -->
	
// int i=1; <-- 1st Initialization then
//  'do' keyword then,
// {
//	Printing statement then,
//	increment/ decrement
// }
// while (condition); <--semicolon must added here.	
// Program end.

//================================================================	
	
//eg.-1 WAP to print 'Hi' msg 5 times using all loops.
	
//for loop-->
	
	for(int a=1; a<=5; a++)
	{
		System.out.println("Hi");
	}
	System.out.println("End of Program");
//------------------------------------------------------------------
//while loop-->
	int b =1;

	while(b<=5)
	{
	System.out.println("Hi");
	b++;
	}
	System.out.println("End of Program");
//------------------------------------------------------------------
//do-while loop-->
	int c=1;

	do
	{
	System.out.println(c);
	c++;
	}
	while(c<=5);
	System.out.println("End of Program");
//==================================================================	

//eg-2WAP to print 1 to 10 numbers.
	
		//1.for loop-->
	for(int d=1; d<=10; d++)
	{
	System.out.println(d);
	}
	System.out.println("End of Program");
//-------------------------------------------------------------
		//2.while loop-->
	int e= 1;

	while(e<=10)
	{
	System.out.println(e);
	e++;
	}
	System.out.println("End of Program");
//-------------------------------------------------------------	
		//3.do-while loop-->
	
	 int f=1;

	 do
	 {
	    System.out.println(f);
	    f++;
	 }
	 while(f<=10);  
	 System.out.println("End of Program");
//=================================================================
	 
//eg-3 WAP to print 10 to 1 numbers. OR
//eg-WAP to print 1 to 10 numbers in reverse order
	
		//1. for loop-->
	
	for(int x=10; x>=1; x--)
	{
		System.out.println(x);
	}
	System.out.println("End of Program");
//----------------------------------------------------------------	
	
		//2. while loop-->
	
	int g=10;

	while(g>=1)
	{
	System.out.println(g);
	g--;
	}
	System.out.println("End of Program");
//--------------------------------------------------------------
		//3. do-while loop-->
	
	int h=10;

	do
	{
	System.out.println(h);
	h--;
	}
	while(h>=1);
	System.out.println("End of Program");
//================================================================
	
//eg-4 WAP to print alternate numbers starting from 1 upto 15 using for loop.	

		//for loop-->
	for(int i=1; i<=15; i=i+2)
	{
	System.out.println(i);
	}
	System.out.println("End of Program");
//---------------------------------------------------------------------
//		while loop-->
	
	int j=1;

	while(j<=15)
	{
	System.out.println(j);
	j=j+2;
	}
	System.out.println("End of Program");
//------------------------------------------------------------------	
//		do-while loop-->
	
	int k=1;

	do
	{
	System.out.println(k);
	k=k+2;
	}
	while(k<=15);
	System.out.println("End of Program");
//=================================================================		
}
}
