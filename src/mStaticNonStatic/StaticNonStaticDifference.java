package mStaticNonStatic;

public class StaticNonStaticDifference 
{
//1) static variable-
	static int b = 100; 
	
//2) Non-static variable-
	int a = 200;
	
	public static void main(String[] args) 
	{
//Calling non-static variable by creating object-
		
		StaticNonStaticDifference x= new StaticNonStaticDifference();
		System.out.println(x.a);	
	}	

//here, 100 & 200 values are stored in 'b' & 'a' variables respectively.
//i)for static variable, memory of 100 in 'b' variable is occupied all the time
//from start of class upto end of class. no one can use their values.

//ii)But for non-static members i.e. 'a' variable, whenever any object is created
//to call the variable in main method, only that time, memory will be allocated
//to that variable. After performing that action means after calling non-static
//variable, memory will be erased.
//===========================================================================================	
//Q-Where could we store max. memory? in static OR non-static?

//->we can store max memory in non- static variables bcoz it uses memory only
//until its action being performed & completed. means (Object creation & calling.)
//After that memory will be erased so that,any other variable can take their position.
//by this way, we can store max. amount of memory using non- static variables.
	
//For extra difference of static & non static variables. refer notes & lecture of (22.8.22).
}	