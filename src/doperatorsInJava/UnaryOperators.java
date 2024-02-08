package doperatorsInJava;

public class UnaryOperators 
{
public static void main(String[] args) 
{
//It has 2 types-->
//1.Increment Operator(++)
//2.Decrement Operator(--)

//1.Increment Operator(++)-->
//It increases value by 1
//for eg-
	
	int a= 10;
//1.	a++;
//		System.out.println(a);	//ans-10+1=11

//2.	a=a+1;
//		System.out.println(a);	//ans-11+1=12

//3.	a=a+35;
//		System.out.println(a);	//ans-12+35=47
//if we want to add directly 35 in basic value of "a" then
//hide above 1st & 2nd print statements & increments.
//================================================================
	
//2.Decrement Operator(--)
//It decreases value by 1
//for eg-
	
	int b=20;
	b--;
	System.out.println(b);	//ans-19
	
	b=b-1;
	System.out.println(b);	//ans-18
	
	b=b-7;
	System.out.println(b);	//ans-11
//============================================================		
}
}