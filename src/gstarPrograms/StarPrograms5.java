package gstarPrograms;

public class StarPrograms5 
{
public static void main(String[] args) 
{
//Q-15- Diagonal Star Pattern-->
//*
// * 
//  *
//   *
//    *	
	
//	for(int i=1; i<=5; i++)
//	{
//		for(int j=1; j<=i; j++)
//		{
//			if(i>=2 && j<=i-1)
//			{
//				System.out.print(" ");
//			}
//			else
//			{
//				System.out.print("*");
//			}
//		}
//		System.out.println();
//	}
	
//=====================================================================
	
//Q-16- Reverse Diagonal Star Pattern-->	
//    *
//   *	
//  *	
// *	
//*	
	
//	for(int i=1; i<=5; i++)
//	{
//		for(int j=4; j>=i; j--)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1; k<=i; k++)
//		{
//			if(i>=2 && k>1)
//			{
//				System.out.print(" ");
//			}
//			else
//			{
//				System.out.print("*");
//			}
//		}
//		System.out.println();
//	}
//=========================================================================
	
//Q-17-Combo of above 2 Patterns -->	
//*
// * 
//  *
//   *
//	  *		
//   *
//  *	
// *	
//*	
//	same copy paste above except change is-
//	for(int i=1; i<=4; i++)  <- insert i<=4 instead of i<=5
//	{
//		for(int j=1; j<=i; j++)
//		{
//			if(i>=2 && j<=i-1)
//			{
//				System.out.print(" ");
//			}
//			else
//			{
//				System.out.print("*");
//			}
//		}
//		System.out.println();
//	}
//	for(int i=1; i<=5; i++)
//	{
//		for(int j=4; j>=i; j--)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1; k<=i; k++)
//		{
//			if(i>=2 && k>1)
//			{
//				System.out.print(" ");
//			}
//			else
//			{
//				System.out.print("*");
//			}
//		}
//		System.out.println();
//	}
	
//Note-for extra star programs other than pavan sir's assignment,
//refer smart programming you tube channel by deepak
}
}