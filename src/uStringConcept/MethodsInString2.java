package uStringConcept;

public class MethodsInString2 
{
	public static void main(String[] args) 
	{
//6)"equals" method- 	
//		String a= "SHUBHAM";
//below 1st statement will show as true. bcoz it is written as it is like above.
//2nd will show false bcoz it will not print as it is.
//		System.out.println(a.equals("SHUBHAM"));	//T
//		System.out.println(a.equals("shubham"));	//F
	
//=================================================================================
	
//7)"equalsIgnoreCase" method-
//in above equals method-If the value in string is uppercase/lowercase then it will show
//True/ False results accordingly. this method will not compromise anything at all.
//In equalsIgnoreCase -it doesn't matter whether value in string is in uppercase/lowercase
//this method is just expecting that the content should match with each other.
	
//		String a = "INDIA";
//	
//		System.out.println(a.equalsIgnoreCase("India"));
//		System.out.println(a.equalsIgnoreCase("8india12"));
//====================================================================================
	
//8)substring (start index)-
//we've to pass an starting index value of given string. so all the characters next to it,
//those will print on console.
	
//		String x= "shubham";
//    index values 0123456
//		System.out.println(x.substring(3));	 //bham
//======================================================================================
	
//9)substring (start index, end index)-
//note- if we've to print a specific range of characters, then we should always enter-
//(start index, end index+1). this rule is made by java.		
	
//		String y = "India";
//		//	  	    01234
//		System.out.println(y.substring(1, 5));	//India
//		System.out.println(y.substring(0, 3));	//Ind
//==================================================================================		
	
//10)trim method-
//we can only trim spaces at start of string & at end of string, wherever it is present.
//this method does not trims anywhere else. like in betn the string value.
	
	String a = " shubham   barge ";
//printing above string value-
	System.out.println(a);
	
//original length of string is-
	System.out.println(a.length());	  //17

//using trim method- use trim method & store it in a variable-
	String b = a.trim();
	System.out.println(b);
	System.out.println(b.length());	  //15
	
//================================================================================		
	
	}	
}
