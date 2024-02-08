package jMethodInJava;

public class MethodProgram6 
{
//To clear the Concept of return & non return datatype-:

//	method 1-
	public static void method1()
	{
		int a=100;
		System.out.println(a);
	}
//----------------------------------------------------------------	
//	method2-
	public static int method2()	//if we are using any datatype other than void,
								//then return statement must be added.
	{
		int b= 200;
		System.out.println(b);
		return b;
	}
//------------------------------------------------------------------------
//	method 3-
	public static char method3()
	{
		int c= 300;		//<-this will'nt execute & will not return anything
						//bcoz datatype is char.
		char d= 'A';	//<-this can be execute & will not return char value.
		System.out.println(d);
		return d;
	}
//----------------------------------------------------------------
//Now i will call all above methods in main method-
	
	public static void main(String[] args) 
	{
		method1();
		
		int x=method2();	//x variable madhe method2 store keli
		System.out.println(x);	//ti ahe ashi print keli.
		System.out.println(x+100+20);  //kontehi operation perform karu shakto.
		
		method3();
		
	}
//=====================================================================	
}