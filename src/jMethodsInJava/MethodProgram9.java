package jMethodsInJava;

public class MethodProgram9 
{
//ex-1-Normal Method-
	public static void AdditionMethod1(int x, int y)
	{
		int a=15;
		int b=20;
		
		int c= a+b;
		System.out.println(c);
	}
//This is a normal regular method. Result of this method will be 35.
//but the problem is, we can'nt change these values(15,20).
//If we call above method in "main method", It will show 35 all the time.
	
//ex-2-Twisted method-
	public static void AdditionMethod2(int x, int y)
	{
		int a=x;
		int b=y;
		
		int c= x+y;
		System.out.println(c);
	}
//In above method, I Assigned argument values (150,200) in arguments of AdditionMethod2.i.e.(int x, int y)
//then I stored x&y variables in int a & int b variables respectively.
//so that, these 150 & 200 values comes in int a & int b variables respectively.
//then simply I added them & print them on console.	
	
//	Main Method-
	
	public static void main(String[] args)
	{
//	    ex-1
		AdditionMethod1(1,2);
		
//		ex-2
		AdditionMethod2(150,200);
		AdditionMethod2(500,700);
		AdditionMethod2(50,40);
//If I don't want to set values in method, but I want to use different values
//at the time of execution in main method, then I can use this 2nd type of method.
	}
}