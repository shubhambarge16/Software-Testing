package hnumberPrograms;

public class NumberPrograms1 
{
public static void main(String[] args) 
{
//Q-1 WAP to check whether the number is +ve number
	
//	int number1 = 30;
//	
//	if(number1>0)
//	{
//		System.out.println(number1+" -is positive number");
//	}
//	else
//	{
//		System.out.println(number1+" -is negative number");
//	}
//==============================================================
	
//Q-2 WAP to check whether number is positive/negative/zero
	
//	int number2= 25;
//	
//	if(number2>0)
//	{
//		System.out.println(number2+"-number2 is positive");
//	}
//	else if(number2<0)
//	{
//		System.out.println(number2+"-number2 is Negative");
//	}
//	else
//	{
//		System.out.println(number2+"-number2 is Zero");
//	}
//==============================================================	
	
//Q-3 WAP to check whether number is even/odd.
	
//	int number3 = 12;
//	
//	if(number3 % 2 ==0)
//	{
//		System.out.println("number is even");
//	}
//	else
//	{
//		System.out.println("number is odd");
//	}
//==============================================================	
		
//Q-4 WAP to display odd numbers from 1 to 100.
	
//	for(int i=1;  i<=100;  i=i+2)
//	{
//		System.out.println(i);
//	}
//==============================================================
//Q-5 WAP to display even numbers from 1 to 100
//	for(int i=1; i<=100; i++)
//	{
//		if(i%2 ==0)
//		{
//			System.out.println(i);
//		}
//	}
	
//Note- Here, each number from 1 to 100 will be tested by condition,
//(i%2==0)& then decided that which number is even & which number is Odd.
//==============================================================		
	
//Q-6 WAP to print alternate even/odd numbers amongst 1 to 100.	
	
//	for(int i=1; i<=100; i=i+2)  //<-we can take any value here.2,3,4....
//	{
//		if(i%2==0)
//		{
//			System.out.println(i+" -Even Number");
//		}
//		else
//		{
//			System.out.println(i+" -Odd Number");
//		}
//	}
//==============================================================			

//Q-7 WAP to print the greater/Largest of two numbers.
	
//	int i=20;
//	int j=50;
//	
//	if(i>j)
//	{
//		System.out.println("i -is greater number");
//	}
//	else
//	{
//		System.out.println("j -is greater number");
//	}
	
//==============================================================			
	
//Q-8 WAP to print smaller of 2 numbers.
	
//	int a= 10;
//	int b= 20;
//	
//	if(a<b)
//	{
//		System.out.println(a + " -is smaller number");
//	}
//	else
//	{
//		System.out.println(b+ " -is smaller number");
//	}
//==============================================================			
	
//Q-9 WAP to print Greater/Largest of 3 numbers.
//	int a = 10;
//	int b = 20;
//	int c = 30;
//	
//	if((a>b) && (a>c))
//	{
//		System.out.println("a-is greater number");
//	}
//	else if((b>a) && (b>c))
//	{
//		System.out.println("b-is greater number");
//	}
//	else
//	{
//		System.out.println("c-is greater number");
//	}
//Note for applying condition-
//Program write kartana, pratek variable ghyaycha(a,b,c) one by one, then to itar 2 variables
//barobr compare karun '>' sign lavun condition lavaychi.
//if madhli condition 'True' zali tr to block run honar, false zali tr 'else if' block run honar,
//jr ti pn false zali tr by default else block run honar. ani tyatla code print honar.
	
//==============================================================
	
//Q-10 WAP to print smaller of 3 numbers.
//	int a = 250;
//	int b = 400;
//	int c = 500;
//	
//	if(a<b && a<c)
//	{
//		System.out.println(a+" -is smaller");
//	}
//	else if(b<a && b<c)
//	{
//		System.out.println(b+" -is smaller");
//	}
//	else
//	{
//		System.out.println(c+" -is smaller");
//	}
//Note for applying condition-	
//logic same as above program, just change/insert less than '<' sign
//instead of greater than '>' sign.

//===================================================================
	
//Q-11 WAP to print Greater/Largest of 4 numbers.
//	int a=20;
//	int b=50;
//	int c=65;
//	int d=80;
//	
//	if(a>b && a>c && a>d)
//	{
//		System.out.println("a is greater number");
//	}
//	else if(b>a && b>c && b>d)
//	{
//		System.out.println("b is greater number");
//	}
//	else if(c>a && c>b && c>d)
//	{
//		System.out.println("c is greater number");
//	}
//	else
//	{
//		System.out.println("d is greater number");
//	}
//===================================================================
	
//Q-12 WAP to print Smaller of 4 numbers.	
//	int a=100;
//	int b=200;
//	int c=300;
//	int d=400;
//	
//	if(a<b && a<c && a<d)
//	{
//		System.out.println(a+" -is smaller number");
//	}
//	else if(b<a && b<c && b<d)
//	{
//		System.out.println(b+" -is smaller number");
//	}
//	else if(c<a && c<b && c<d)
//	{
//		System.out.println(c+" -is smaller number");
//	}
//	else
//	{
//		System.out.println(d+" -is smaller number");
//	}
//===================================================================	
	
//Q-13 Greater of 3 numbers using nested if statement.
//(Just trial do not use it in interview)
	
//	int a=220;
//	int b=56;
//	int c=3230;
//	
//	if(a>b)
//	{
//		if(a>c)
//		{
//			System.out.println("a is the greater number");
//		}
//		else
//		{
//			System.out.println("c is the greater number");
//		}
//	}
//	else
//	{
//		if(b>c)
//		{
//			System.out.println("b is the greater number");
//		}
//		else
//		{
//			System.out.println("c is the greater number");
//		}
//	}
//	System.out.println("end of program");
//-----------------------------------------------------------------------	
//Q-14	greater of 3 numbers nested if statement
//	int a=10;
//	int b=20;
//	int c=30;
//	
//	if(a>b)
//	{
//		if(a>c)
//		{
//			System.out.println("a is greater");
//		}
//		else
//		{
//			System.out.println("c is greater");
//		}
//	}
//	else
//	{
//		if(b>c)
//		{
//			System.out.println("b is greater");
//		}
//		else
//		{
//			System.out.println("c is greater");
//		}
//	}
//	System.out.println("end of program");

//======================================================================
	
//Q-15 WAP to print Greater of 10 numbers.
//	int a=20;
//	int b=50;
//	int c=65;
//	int d=78;
//	int e=15;
//	int f=47;
//	int g=23;
//	int h=97;
//	int i=83;
//	int j=101;
//Solve using Array. cut paste this to array class.	
}
}
