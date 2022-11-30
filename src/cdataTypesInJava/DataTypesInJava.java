package cdataTypesInJava;

public class DataTypesInJava 
{
public static void main(String[] args) 
{
//Data Type - Data types are used to represent type
//of data or information used in program.
	
//Two types of Datatype-
//1. Primitive- in which size is fixed.
//2. Non Primitive- in which size is not fixed.
	
//PRIMITIVE DATA TYPES-
	
//1.BOOLEAN-> 
	
//		boolean x = 2000;   //integer not possible
//		boolean x = 'A';   //character not possible
//		boolean x = TRUE;  //Capital letters not possible
//	
//bcoz java is case sensitive language,
//So no capital letters allowed.
	
//		boolean x = true;
//		System.out.println(x);
//	
//		boolean y = false;
//		System.out.println(y);
		
//In boolean data type, we can assign value
//of variable as either "true" or "false" only.
//----------------------------------------------------	
	
//2.CHAR -->
		char a= 'A';
		System.out.println(a);	//ans-A
		
//in char datatype, we can write
//only single letters in single quotation.
	
	//A-Z
	//a-z
	//laptop special chars !@#$%^&*()_+
	// 0-9 numbers
//All are considered in char datatype.
//----------------------------------------------------
	
//3.BYTE-->
	
//		byte b =128;	//range Issue
//		System.out.println(b);
	
//byte datatype has limitations its range is betn
//-128 to 127
//------------------------------------------------------
	
//4.SHORT-->

//		short s =123456;
//		System.out.println(s);
		
//short datatype has limitations its range is betn	
//-32768 to 32767	
	
//BYTE & SHORT HAS RANGE LIMITATIONS
//SO WE OFTEN DID'NT USE IT.
//-------------------------------------------------	
	
//5.FLOAT/DOUBLE-->	
	
//		float f = 0.7588141506F;
//		System.out.println(f);	
//		
//		double percentage= 76.45;
//		System.out.println(percentage);
//We can write percentage value only in "double" datatype.
	
//		double d = 0.12345678910111213D;
//		System.out.println(d);
//results provide 13-14 digits after the decimel point.
//F or f should be attached with value of float datatype.
	
//Attaching D or d is not mandatory in double datatype.
//float/double datatype shows only 8 digits after decimel point.
//----------------------------------------------------------------

//6.LONG-->
	
//		long l= 1234567891011121314L;
//		System.out.println(l);
//in long datatype, we can add max 19 digits.
//Attaching L or l is mandatory.
//---------------------------------------------------------

//7.INTEGER-->
	
//		int a=20;
//		System.out.println(a);
//This integer datatype has no any limitations.
//So int and long are generally used for regular practice
//-----------------------------------------------------
	
//NON-PRIMITIVE-->
//1.STRING-->
	
//		String emailid = "shubham.barge16@gmail.com";
//		System.out.println(emailid);
//We can write all the characters of keyboard
//in String Datatype.
//--------------------------------------------------------	
	
//2. Array-->
	
//		int a [] = {1,2,3,4,5};    //homogenous
		//index --> 0 1 2 3 4
	 
		//for loop-->
	 
//		for(int i=0; i<=4; i++)
//		{
//			System.out.println(a[i]);
//		}
//Array is used to store maximum data
//of same datatype.
//eg. in above eg, we can store multiple numbers in array
//but they all should be in "int" Datatype.
	 //likewise
	 //eg 2->
		
//		char b[]= {'a', 'A', '@', '8', '4', '%', 'q', 'W', '*', '+'};
//		//index->   0    1    2    3	 4	  5    6	7    8    9
//		for(char i=0; i<=9; i++)
//		{
//			System.out.println(b(i));
//		}
//This is also valid. but condition is- info. inside { } this
//bracket should be of same dataType.
//=================================================================
	 
//THIS IS ALL ABOUT DATA TYPES IN JAVA.	 
	 
	 
	
}
}
