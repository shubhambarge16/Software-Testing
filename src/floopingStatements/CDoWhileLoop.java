package floopingStatements;

public class CDoWhileLoop 
{
public static void main(String[] args) 
{
//always give semicolon after while loop.
	
	//STEPS TO EXECUTE PROGRAM USING DO-WHILE LOOP-->
//step-1-Initializing the variable by assigning some value to it.
//step-2-Code print using printing statement in do loop.
//step-3-Applied Increment Operator. i++;
//step-4-coming out of do loop, apply condition in while.
	
//eg.-1 WAP to print 'Hi' msg 5 times using do-while loop.
	
	int a=1;
	
	do
	{
		System.out.println("Hi");
		a++;
	}
	while(a<=5);
	System.out.println("End of Program");
//--------------------------------------------------------------------

//eg-2-WAP to print 1 to 5 numbers using do-while loop.
	
	int b= 1;
	
	do
	{
		System.out.println(b);
		b++;
	}
	while(b<=5);
	System.out.println("End of Program");
//-------------------------------------------------------------------
	
//eg-3-WAP to print 1 to 10 numbers in reverse order.
	
	int c=10;
	
	do
	{
		System.out.println(c);
		c--;
	}
	while(c>=1);
	System.out.println("End of Program");
//-------------------------------------------------------------------	
	
//eg-4 WAP to print alternate numbers starting from 1 upto 17 using do-while loop.	
	
	int d=1;

	do
	{
	System.out.println(d);
	d=d+2;
	}
	while(d<=17);
	System.out.println("End of Program");
//-------------------------------------------------------------------		
	
//eg-5 WAP to print reverse alternate numbers starting
//from 27 to 1 using for loop.	
	
	int e = 27;

	do
	{
	System.out.println(e);
	e=e-2;
	}
	while(e>=1);
	System.out.println("End of Program");
//-------------------------------------------------------------------			

//eg-6 WAP to print even numbers upto 20 using do-while loop.
	
	int f=2;

	do
	{
	System.out.println(f);
	f=f+2;
	}
	while(f<=20);
	System.out.println("End of Program");
//-------------------------------------------------------------------			
	
//eg-7 WAP to print odd numbers upto 19 using do-while loop.
	
	int g=1;

	do
	{
	System.out.println(g);
	g=g+2;
	}
	while(g<=19);
	System.out.println("End of Program");	
//-------------------------------------------------------------------	
	
//eg-8 WAP to print odd numbers upto 45 in reverse order using do-while loop.	
	
	int h=45;

	do
	{
	System.out.println(h);
	h=h-2;
	}
	while(h>=1);
	System.out.println("End of Program");
//-------------------------------------------------------------------	
	
//eg-9 WAP to display a text "Java Language" 5 times using do-while loop.
	
	int i = 1;

	do
	{
	System.out.println("Java Language");
	i++;
	}
	while(i<=5);
	System.out.println("End of Program");
//-------------------------------------------------------------------	
	
//eg-10 WAP to print all English alphabets A to Z using do-while loop.
	
	char j='A';

	do
	{
	System.out.println(j);
	j++;
	}
	while(j<='Z');
	System.out.println("End of Program");
//-------------------------------------------------------------------
	
//eg-11 WAP to print all English alphabets A to Z in reverse order.
	
	char k='Z';

	do
	{
	System.out.println(k);
	k--;
	}
	while(k>='A');
	System.out.println("End of Program");
//-------------------------------------------------------------------	
	
	
	
	
	
	
	
	
}
}
