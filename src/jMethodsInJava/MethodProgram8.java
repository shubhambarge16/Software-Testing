package jMethodsInJava;

public class MethodProgram8 
{
//Different ways of calling a method in main method-
//	ex-1
	public static int method1()
	{
		int a=100;
		System.out.println(a);
		return a;
	}
	
//	ex-2
	public static int method2(char x)
	{
		System.out.println("Static return type with argument");
		return 400;
	}
	
//	ex-3
	public static void Additionmethod3(int x, int y)
	{
		int a=10;
		int b= 20;
		
		int c= a+b;
		System.out.println(c);
	}
	
//Calling above methods in main method-
	
	public static void main(String[] args) 
	{
//Execution of method1-
		 method1();			//<-line no1
	
		 int x=method1();		//<-line no2
		
		 System.out.println(x);		//<-line no3
		
//1)in line no1, I simply calling method1. It will print 100 on console.		
		
//2)in line no2,I simply stored method1 in x variable. but it will not print on console.
//So to execute method1 on console, I write printing statement. (line no3)		
//It will print 100 2nd time.
		
//3) the "return a" is present in method1. So it will also print on console.
//So overall the value-(100) will print 3 times on console.
//================================================================

//Execution of method2-
		
		 method2('A');  				//<-line no1

		 int y= method2('A');			//<-line no2
		
		 System.out.println(y);			//<-line no3
		
		 System.out.println(y+100);		//<-line no4		
	
//what will print on console-
//1.from line no1, msg will print on console.	

//2.line no2 performs 2 tasks,
//i)printing msg on console &
//ii)storing value of "return" (400) in y variable.
	
//3.line no3 is printing value of y variable i.e. 400 on console.
 
//4.In line no4, I added 100 in 400.
//So it will print 400+100="500" on console.	
//================================================================
		
//Execution of Additionmethod3()-
		
	  Additionmethod3(100,200);
//It does'nt matter whatever value u passed in arguments (100,200),
//The code written in method body, only that will print on console.
}
}