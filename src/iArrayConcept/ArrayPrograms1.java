package iArrayConcept;

public class ArrayPrograms1 
{
public static void main(String[] args) 
{
//Array Programs-->
//Q-1- WAP to print the elements of an array.
	
//	int a[]= {10,11,12,13,14,15};
//	
//	for(int i=0; i<a.length; i++)
//	{
//		System.out.println(a[i]);
//	}
	
//=======================================================================
	
//Q-2-WAP to print the elements of an array in reverse order.	
	
//	int b[]= {1,2,3,4,5};
//	
//	for(int i=b.length-1; i>=0; i--) 
//	{
//		System.out.println(b[i]);
//	}
//Print values of Indices in condition of for loop in 
//descending order i.e. from higher to lower. So Initializing from highest length.
//5(b.length-1) upto lowest i>=0. & its descending so decrement. i--
//=======================================================================	
	
//Q-3- WAP to print the EVEN & ODD elements of an array.
	
//NOTE- 1)-if I've to print only EVEN nos. then while writing program, just write program
//upto if loop. do'nt write else loop.
//2)but if I've to write program for- i)only ODD nos. OR 
//ii) EVEN & ODD both, then in this case, write both "if-else" loop.

//	int c[]= {1,2,3,4,5,6,7};
//	
//	for(int i=0; i<c.length; i++)
//	{
//		if(c[i] % 2 ==0)
//		{
//			System.out.println(c[i]+ " -is even number");
//		}
//		else
//		{
//			System.out.println(c[i]+ " -is odd number");
//		}
//	}
//=======================================================================	
	
//Q-4-WAP to print the largest element in Array.
	
//Note-In both cases of finding Largest & Smallest value, we have to assume any 
//array index value at line no-60 & 79. (Array index means in terms of a[0] OR a[1] anything)	
	
//	int a[]= {10,20,30,40,50,60};
//	
//	int max=a[0];	//Assuming that a[0] is largest value.
//
//	for(int i=0; i<a.length; i++)
//	{
//		if(a[i] > max)
//		{
//			max=a[i];
//		}
//	}
//	System.out.println("Largest number is- "+max);
	
//Note- At int max=0, we can Assume any value, 
//but it should be less than largest value from Array. i.e. max<60
//=======================================================================	
	
//Q-5-WAP to print the Smallest element in Array.	
	
//	int a[]= {10,20,30,40,50,60};
//	
//	int min=a[0];  //Assuming that a[0] is smallest value.
//	
//	for(int i=0; i<a.length; i++)
//	{
//		if(a[i]< min)
//		{
//			min= a[i];
//		}
//	}
//	System.out.println("Smallest number is- "+min);
	
//=======================================================================
	
//Q-6- WAP to copy all elements of one array into another array.
	
//Note- To copy elements from one Array to another, just write 1st Array & then make
//another array using 2nd Syntax, (bcoz we don't know the elements in 2nd array.)
//& put indices of 1st Array into indices of 2nd Array. & simply print 2nd array using for loop.
//this is how we copied elements from one Array to another Array.
	
//	int x[]= {1,2,3,4,5};
//		   // 0 1 2 3 4
//	int y[]= new int [5];
//	
//	y[0]= x[0];
//	y[1]= x[1];
//	y[2]= x[2];
//	y[3]= x[3];
//	y[4]= x[4];
//	
//	for(int i=0; i<y.length; i++)
//	{
//		System.out.println(y[i]);
//	}
	
//=======================================================================	

//	int a[] = {38,52,9,18,6,62,13};
//	int temp=0;
//	
//	int min;
//	temp=0;
//	
//	for(int i=0; i<a.length; i++)
//	{
//		min=i;
//		for(int j=i+1; j<a.length; j++)
//		{
//			if(a[j] < a[min])
//			{
//				min=j;
//			}
//		}
//		temp= a[i];
//		a[i]= a[min];
//		a[min]= temp;
//	}
//	for(int i=0; i<a.length; i++)
//	{
//		System.out.println(a[i]);
//	}
	
}
}