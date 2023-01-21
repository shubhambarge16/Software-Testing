package gstarPrograms;

public class StarPrograms1 
{
public static void main(String [] args)
{
//	We can write "Star programs" using "Nested for loop"
//Different type of Nested for loop-->
	
//Print this Patter but by reducing the Lengthiness of code & using for loop.
//		System.out.println("PPPPP");
//		System.out.println("PPPPP");
//		System.out.println("PPPPP");
//		System.out.println("PPPPP");
//		System.out.println("PPPPP");

//Standard way to write program-->
			
//		for(int a=1; a<=5; a++)
//		{
//			for(int b=1; b<=5; b++)
//			{
//				System.out.print("P ");
//			}
//			System.out.println();
//		}
//		System.out.println("end of program");
//=============================================================		
			
//Q-1 PATTERN-1
//	*****
//	*****
//	*****
//	*****
//	*****
	
//	for(int c=1; c<=5; c++)
//	{
//		for(int d=1; d<=5; d++)
//		{
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
//	System.out.println("End of Program");
//=============================================================		

//Q-2- WAP to print below PATTERN-2
//	*
//	* *
//	* * *
//	* * * *
//	* * * * *
	
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		System.out.println("End of Program");
//=============================================================	
	
//Q-3-PATTERN-3 (2 ways of Printing this pattern.)
//	* * * * *	
//	* * * *
//	* * *
//	* * 
//	* 
//Either we can change "for(Initialization, Condition, Increment/Decrement)"
//from outer loop.
// OR
//We can change "for(Initialization, Condition, Increment/Decrement)"
//from inner loop. To print exact mirror Image of above program.
	
//Way-1. Printing PATTERN 3 By changing "Outer loop"-->
	
//	for(int i=5; i>=1; i--)	//<-- I made changes here.
//	{
//		for(int j=1; j<=i; j++)
//		{
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
//	System.out.println("End of Program");
	
	//OR
//-------------------------------------	
	
//Way-2. Printing PATTERN 3 By changing "Inner loop"-->
	
//	for(int i=1; i<=5; i++) 
//	{
//		for(int j=5; j>=i; j--) // <-- I made changes here.
//		{
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
//	System.out.println("End of Program");
//Ways are different but output is same. So I choose way-1.
//=====================================================================
	
//Q-4- PATTERN 4-->(combo of Q- 2&3)
//	*
//	* *
//	* * *
//	* * * *
//	* * * * *
//	* * * *
//	* * *
//	* * 
//	* 
	
//	for(int i=1; i<=4; i++)
//	{
//		for(int j=1; j<=i; j++)
//		{
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
//	for(int i=5; i>=1; i--)
//	{
//		for(int j=1; j<=i; j++)
//		{
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
//	System.out.println("End of Program");
	
// by combining programs of Pattern 2&3, we got 2 separate lines of 5 star.
// So to avoid that,
// 1) We should decrease outer loop of 1st "for loop". i.e. i<=4 (Line no-118)
// OR
// 2) We should decrease outer loop of 2nd "for loop" i.e.(Initia.)--> i=4; (Line no-126)
// I will prefer 1st method.	

//=====================================================================	
}
}




