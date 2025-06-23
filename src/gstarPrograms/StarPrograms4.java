package gstarPrograms;

public class StarPrograms4 
{
public static void main(String[] args) 
{
//Q-12-Star Pyramid PATTERN-12 -->(To print alternate stars, just start 4th for loop from l=2;)
//    *       <-1 Stars increasing by Alternate order.
//   ***      <-3 Stars
//  *****     <-5 Stars
// *******	  <-7 Stars
//*********   <-9 Stars
	
	for(int i=1; i<=5; i++)
	{
		for(int j=4; j>=i; j--)
		{
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++)
		{
			System.out.print("*");
		}
		for(int l=2; l<=i; l++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("end of program");
//======================================================================
	
//Q-13-Star Pyramid PATTERN-13 -->	
//	*********	<-9 Stars decreasing by Alternate order.
//	 *******	<-7 Stars
//	  *****		<-5 Stars
//	   ***		<-3 Stars
//	    *		<-1 Star
	
//	for(int i=1; i<=5; i++)
//	{
//		for(int j=1; j<=i; j++)
//		{
//			System.out.print(" ");
//		}
//		for(int k=5; k>=i; k--)
//		{
//			System.out.print("*");
//		}
//		for(int l=4; l>=i; l--)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	System.out.println("end of program");
//======================================================================	
	
//Q-14-Diamond PATTERN-14 -->		
//    *       
//   ***      
//  *****     
// *******	  
//*********
// *******	
//	*****		
//	 ***		
//	  *		
	
//	for(int i=1; i<=4; i++)	 //<-(Just reduced this condition i.e. i<=4; instead of i<=5;)
//	{
//		for(int j=5; j>=i; j--)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1; k<=i; k++)
//		{
//			System.out.print("*");
//		}
//		for(int l=2; l<=i; l++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	for(int i=1; i<=5; i++)
//	{
//		for(int j=1; j<=i; j++)
//		{
//			System.out.print(" ");
//		}
//		for(int k=5; k>=i; k--)
//		{
//			System.out.print("*");
//		}
//		for(int l=4; l>=i; l--)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	System.out.println("end of program");
//======================================================================
}
}