package iArrayConcept;

public class ArrayConcept 
{
public static void main(String[] args) 
{
//*Array- It is a collection of multiple values having same data Type.
//We can print values from any datatype like-int,char,double etc...
	
  //int a[]= {1,2,3,4,5,6}; //<-Elements
	//index-> 0 1 2 3 4 5	//<-Indices
//==============================================================================
	
//	int a[] = {10,20,30,40,50,60};
//	indices->  0  1  2  3  4  5
//To print above elements, we've to put indices in printing statement.
 	
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
//		System.out.println(a[5]);
//
//This code becomes too lengthy so, To reduce lengthiness of above array, we use for loop.
//& in for loop we've to put values of indices i.e. Initializing from 0.
	
//	for(int i=0; i<=5; i++)
//	{
//		System.out.println(a[i]);
//	}
	
//(If we put only 'i' in printing statement, it will only print 0 to 5 nos.	
//but if we put 'a[i]' it will print the elements in array.)
//===========================================================================	
	
//*"LENGTH" of Array-->"No. of elements present in Array{}" is LENGTH of Array.
//			 int b[] = {1,2,3,4,5,6} <-6 elements. So Length is 6.
		
//Formula to print Length- ("msg"+ ArrayName.length) <-(Here, b is Array Name)
//i.e.-->("Length of Array- "+ b.length)
	
//	int b[] = {10,20,30,40,50,60};
//	System.out.println("Length of Array- "+ b.length);
//========================================================================
	
//*Different ways of writing "for loop" for Array is->
//(Hint- Just change condition in for loop nothing else.)
	
//		int b[] = {10,20,30,40,50,60};
//		(indices -->0  1  2  3  4  5)
	
//method-1-
//		for(int i=0; i<=5; i++)
//		{
//			System.out.println(b[i]);
//		}
//OR----------------------------------------------------
//Method-2-
//		for(int i=0; i<=(b.length-1); i++)
//		{
//			System.out.println(b[i]);
//		}
//OR------------------------------------------------------	
//Method-3-	
//		for(int i=0; i<b.length; i++)
//		{
//			System.out.println(b[i]);
//		}
//==========================================================
		
//Syntax-1- In this syntax, elements in Array are known to us.
//	int x[]= {1,2,3,4,5};
	
//	System.out.println("Length of Array- "+x.length);
//	for(int i=0; i<=4; i++)
//	{
//		System.out.println(x[i]);
//	}
//====================================================================	
	
//Syntax-2- In this Syntax elements in Array are Unknown to us.
	
//	int y[] = {100, 200, 300, 400};
//	
//	System.out.println("Length of Array is -"+y.length);
//	
//	y[0]= 100;
//	y[1]= 200;
//	y[2]= 300;
//	y[3]= 400;
//	
//	for(int i=0; i<y.length; i++)
//	{
//		System.out.println(y[i]);
//	}
//====================================================================	
}
}
