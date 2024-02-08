package floopingStatements;

public class DDifferencesBetnForWhileDoWhileLoops 
{
public static void main(String [] args)
{
//Output is same but Only Syntax is different of all 3 loops.
	
//Difference betn all loops-->
	
//1.  "FOR"	-->	Syntax-->
//(Initialization, condition, increment/ decrement) 
//	{
//		code print
//	}
//	Program end.
	
//	here, both starting & ending conditions are known. (i.e. starting-i=1;
//	ending- i<=5;)
//All in one bracket & one line.	
//-----------------------------------------------------------------------------	
	
//2. "WHILE" --> Syntax-->
//
//int i=1; <-Initialization is not part of syntax of while loop, it is not compulsory.
//Actual Syntax starts from while keyword & ends at-> }
	
// while(condition) then,
// {
//	code print  then,
//  increment/ decrement
//	}
//	Program end.
	
//1.Use this only when end condition is known.
//2.here, 1st condition check then code print.
//3.Early condition Checking/ Pre-checking is done here.
//4.If we put any larger value out of the loop in initial condition,
//then it becomes false then nothing will get printed on console.
//bcoz here at 1st we check the condition & other things come after.
//------------------------------------------------------------------	
//3. "DO-WHILE" --> Syntax-->
	
// int i=1; <-- 1st Initialization then
//  'do' keyword then,
// {
//	code print then,
//	increment/ decrement
// }
// while (condition); <--semicolon must added here.	
// Program end.
	
//1.Use this only when end condition is known.
//2.here, 1st code print then condition check.
//3.Late condition Checking/ Post-checking is done here.
//4.If we put any larger value out of the loop in initial condition,
//then it prints the value only one time.
//bcoz here at 1st we print the code then we go for condition checking.
//------------------------------------------------------------------------------
//for eg. to understand 4th difference-
	//WHILE loop-->
//here, if Initially we put value of x greater than max value in condition i.e. 5;
//then nothing will print on console. bcoz at 1st we check condition then print code.
	
		int x =11;

		while(x<=5)
		{
		System.out.println("Hi");
		x++;
		}
		System.out.println("End of Program");
		
	//but in DO-WHILE case->
//here, if Initially we put value of x greater than max value in condition i.e. 5;
//then code get printed one time only. bcoz at 1st we print code then condition check. by syntax.
		
		int z=23;

		do
		{
		System.out.println("Hi");
		z++;
		}
		while(z<=5);
		System.out.println("End of Program");
		
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
	
	for(int y=10; y>=1; y--)
	{
		System.out.println(y);
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