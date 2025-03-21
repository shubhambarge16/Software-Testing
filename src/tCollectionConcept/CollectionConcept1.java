package tCollectionConcept;

import java.util.ArrayList;

public class CollectionConcept1 
{
	public static void main(String[] args) 
	{
//if there is wide range of data like population of India or vaccination record etc.
//& we've to store & maintain it properly, then we use collection concept.
//& for that we use ArrayList.
			
//for storing different types of data, which is having different datatypes,
//we've to use a class of java- ArrayList & store data in it. for that,
//make constructor of ArrayList & store data in it by using "add"
//method of ArrayList class.
		
	ArrayList a = new ArrayList();
		
//1)If we want to add data in ArrayList, use 'add' method-
	
	a.add(10);
	a.add(200);
	a.add(455);

//to print above data, enter the variable 'a' in below printing statement.
	System.out.println(a);
//--------------------------------------------------------------
//Also we can add data having different datatypes
	
	a.add('A');		//char
	a.add('G');		//char
	a.add("Shubham");	//String
	a.add("Barge");		//String
	a.add(3.43);		//double
	a.add(2.78);		//double
	
	System.out.println(a);
//-----------------------------------------------------------			
			
//if we want to print data of specific datatype then,
//in angular bracket of ArrayList, pass datatype class eg- <Integer>. not the datatype.
//like datatype is Int. & datatype class is Integer.
//in below eg, we want to print specifically only Integer type of datatype.
//so I added Integer datatype class in angular bracket.

//here, in below line, b is the variable.
	ArrayList<Integer> b = new ArrayList<Integer>();
				//index values
	b.add(10);   //0
	b.add(20);   //1
	b.add(30);   //2
	b.add(40);   //3
	b.add(50);	 //4
	
//below 3 can't print thats why showing error. so I hide them.
//so that I can print above integer values.	
	
//	b.add("Rahul");   //not possible
//	b.add(11.11);     
//	b.add('A');       
	
//& I just printed the variable 'b'.
	System.out.println(b);
//---------------------------------------------------------------------	
			
//2) if we want to print any specific data out of above 10 to 50 then,
//use 'get' method with variable like below. but we've to provide index value of it.
	System.out.println(b.get(2));
//we can perform various operations on them. (+-*/)
//only rule is, we've to enter index values in below printing
//statements while printing specific data.
	
	System.out.println(b.get(2)+ b.get(3));
	System.out.println(b.get(3) - b.get(1));
	System.out.println(b.get(3) * b.get(2));		
	System.out.println(b.get(3) / b.get(1));
//---------------------------------------------------------------------------
	
//3) If we want to replace any value in the given ArrayList then
//we've to use 'set' method.
//Eg- if we want to replace 50 to 57 then-
	   //index  Integer
	b.set(4,     57);
	System.out.println(b);
//-------------------------------------------------------------------------
	
//4)If we want to count the size of data/ ArrayList then
//we've to use 'size' method.	
			
	System.out.println(b.size());
//	OR
//	System.out.println("size of data->"+b.size());
//------------------------------------------------------------------------
	
//5)if we want to remove any one data, then use 'remove method'
//just insert index value of that data. 
	b.remove(2);
	System.out.println(b);
//----------------------------------------------------------------------	
}
}