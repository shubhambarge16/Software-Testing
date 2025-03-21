package jMethodsInJava;

public class MethodProgram7 
{
//Types of Method -
//1) with Arguments 
//2) without Arguments.
	
//while calling methods in main method, we can insert argument in parenthesis,
//with their specific datatype.
	
	//ex-1
	public static void method1()
	{
		System.out.println("method1 with no arguments");
	}
	
	//ex-2
	public static void method1(int x)
	{
		System.out.println("method1 with int argument");
	}
	
	//ex-3
	public static void method1(int a, int b, int c, int x, int y, int z)
	{
		System.out.println("method1 with 6 int arguments");
	}
	
	//ex-4
	public static void method1(char x)
	{
		System.out.println("method1 with char argument");
	}
	
	//ex-5
	public static void method1(int x, char y)
	{
		System.out.println("method1 with int & char argument");
	}
	
//Executing above methods in MAIN METHOD-	
	
	public static void main(String[] args) 
	{
	//1. 
	method1();  //(no arguments- possible)
	
	//2.
	method1(10);  //(int arg- possible)
//here in parenthesis, we've to insert any int value to execute.	
		
	//3.
	method1(24,34,45,23,34,78);  //(int arg- possible)
//this means we can pass multiple arguments in method
//but to execute it, we've to pass same amount of int in above line no54.
//& can do this with any datatype.
	
	//4.
	method1('A');  //(char-possible)
	
	//5.1
//	method1('W', 34);
//not possible bcoz in method ex-5, 1st we written int & then char.
//so Arguments should be passed sequentially.
		
	//5.2
	method1(34,'W');
//possible bcoz arguments are passed with sequence i.e. 1st int & then char.
	
//some trials-
	//7.
//	method1("shubham");
//currently not possible bcoz String arg is not passed in any of above methods.
	
    //8)
//   method1("A");
//(same as above. A is written in String datatype so not possible)
	
	//9)
    //method1(10.00);
//not possible bcoz double arg is not passed in any of above methods.
	
	//10)
    method1(500098);
//whatever int value u pass in arg, it will execute int arg.
		
	}
//-----------------------------------------------------------------
}