package iArrayConcept;

public class ArrayPrograms2 
{
public static void main(String[] args) 
{
//Q-7- WAP to sort the elements of Array in Ascending order.
//(for explanation of Ascending & Descending, see photos)
	
//	int a[]= {25,67,7,245,83};
//	
//	int temp=0;
//	
//	for(int i=0; i<a.length; i++)
//	{
//		for(int j=i+1; j<a.length; j++)
//		{
//			if(a[j] < a[i])
//			{
//				temp= a[i];
//				a[i]= a[j];
//				a[j]= temp;
//			}
//		}
//	}
//	System.out.println("Array in Ascending order is-");
//	
//	for(int i=0; i<a.length; i++)
//	{
//		System.out.println(a[i]);
//	}
	
//==================================================================================
	
//Q-8- WAP to sort the elements of array in Descending order.
	
//	int a[]= {25,67,7,245,83};
//	
//	int temp=0;
//	
//	for(int i=0; i<a.length; i++)
//	{
//		for(int j=i+1; j<a.length; j++)
//		{
//			if(a[j] > a[i])
//			{
//				temp= a[i];
//				a[i]= a[j];
//				a[j]= temp;
//			}
//		}
//	}
//	System.out.println("Array in Descending order is-");
//	
//	for(int i=0; i<a.length; i++)
//	{
//		System.out.println(a[i]);
//	}
	
//===========================================================================	
			
//Q-9-WAP to print the duplicate elements of an array.
	
//	int a[]= {3,5,4,3,2,2,1};
//	
//	System.out.println("Duplicate elements are- ");
//	
//	for(int i=0; i<a.length; i++)
//	{
//		for(int j=i+1; j<a.length; j++)
//		{
//			if((a[i] == a[j]) && (i!=j))
//			{
//				System.out.println(a[j]);
//			}
//		}
//	}
//==================================================================	
	
//Q-10- WAP to Find 2nd Largest Number in an array.

//	int a[]= {6,8,2,4,3,1,5,7};
//	int temp;
//	
//	for(int i=0; i<a.length; i++)
//	{
//		for(int j=i+1; j<a.length; j++)
//		{
//			if(a[i] < a[j])
//			{
//				temp= a[i];
//				a[i]= a[j];
//				temp= a[j];
//			}
//		}
//	}
//	System.out.println("Second Largest element is- "+a[1]);
	
//for 2nd largest-
//Just use program of ascending order here as it is & only add last line.
	
//for 2nd smallest-
//to find 2nd smallest element than use descending order program & just add last line
//====================================================================================	
}
}