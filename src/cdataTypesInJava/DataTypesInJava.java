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
	
//5.FLOAT / DOUBLE-->	
	
//Adding F or f is mandatory with value of float datatype.
//Adding D or d is not mandatory with value of double datatype.
//In float, we can write only 4 to 5 digits after decimal point.
//In double, we can write 13 to 14 digits after decimal point.
//for writing percentage value, we use float & double datatype.
//& for writing normal value, we use int datatype.
		
//Difference betn 'float' & 'double'-->
//1.float has size of 32 bits so it has limited range of inserting values.
//2.double has size of 64 bits so it has wide range of inserting values as compared to float.
		
//Eg-1		
//		float b= 45.12345f;		//correct shows upto 5 digits only
//		System.out.println(b);
//------------------------------------------------------------	
//Eg-2
//		double x= 85.12345678910111;	//correct shows upto 14 digits only.   
//		System.out.println(x);

//These both datatypes has limited range so we generally use int datatype.
//----------------------------------------------------------------

//6.LONG-->

//in long datatype, we can add max 19 digits.
//Attaching L or l is mandatory.
		
//		long l= 1234567891011121314L;
//		System.out.println(l);

//---------------------------------------------------------

//7.INTEGER-->
	
//		int i=2046;
//		System.out.println(i);
//This integer datatype has no any limitations.
//So int and long are generally used for regular practice
//-----------------------------------------------------
	
//NON-PRIMITIVE-->
//1.STRING-->
	
//		String emailid = "shubham.barge16@gmail.com";
//		System.out.println(emailid);
//We can write all the characters of keyboard
//in String Datatype.but double inverted comma->" "is compulsory.
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
