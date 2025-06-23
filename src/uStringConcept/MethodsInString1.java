package uStringConcept;

public class MethodsInString1 
{
	public static void main(String[] args) 
	{
//1) length method-
//(This method counts empty space between the value of string as well)
		
//		String a= "How are you??";
//		int lengthofString = a.length();
//		System.out.println("length of string is "+lengthofString);
//==============================================================================
		
//2)charAt method-
//interview Q-write a Java Program to separate the Individual Characters from a String.
		
		String b = "shubham";
//		index-      0123456
		
//		System.out.println(b.charAt(0));
//		System.out.println(b.charAt(1));
//		System.out.println(b.charAt(2));
//		System.out.println(b.charAt(3));
//		System.out.println(b.charAt(4));
//		System.out.println(b.charAt(5));
//		System.out.println(b.charAt(6));

		//OR
//if we want to avoid lengthyness we can apply for loop.
		for(int i=0; i<b.length(); i++)
		{
			System.out.println(b.charAt(i));
		}
//---------------------------------------------------------------------------
		//OR
//if we want to print specific range of characters then
//we can apply for loop like below as well.
//we just have to add +1 in i< space to print expected characters
		
//		for(int i=0; i<4+1; i++)
//		{
//			System.out.println(b.charAt(i));
//		}
//---------------------------------------------------------------------------		
		
//To print the above value in reverse-
//(basically we've to minus the length one by one so we write i=b.length()-1
//but it should be greater than 0 so we write i>=0; & we've to reduce it one by one
//so we use decrement operator i.e. i--)
		
//		for(int i=b.length()-1; i>=0; i--)
//		{
//			System.out.println(b.charAt(i));
//		}
//====================================================================
		
//3) to Uppercase & to Lowercase method-
//to print all capital letters, we use toUpperCase method & 
//to print all small letters, we use toLowerCase method.
	
//		String a= "ShUbHaM";
//		System.out.println(a);
//		
//		System.out.println(a.toUpperCase());
//		
//		System.out.println(a.toLowerCase());
//====================================================================
		
//4)Concat method-
//This method combines two different values stored in two different variables.
//type I-
//		String a= "Shubham";
						     //String	 //String
//		System.out.println("value of a is "+a);
//statement in above printing statement is a string.
//here + operator works as "concatenation operator".
//-------------------------------------------------------------------------
//type II-	
//OR we can write cancat method like below as well-
//by joining 2 values.
//		String x = "shubham";
//		String y = "barge";
//		String z = "barge123";
//		System.out.println(x+y+z);
		
//-----------------------------------------------------------------
//type-III	
//		String p = "shubham";
//		String q = "barge";
//		String r = p.concat(q);
//		System.out.println(r);
		//OR
//		String w =p.concat("India");
//		System.out.println(w);
		
//we can either print variable or we can enter string value in cancat method directly.
//===============================================================================		

//one more case in string is- we can only add 2 values. we cant minus them. like-
//		String a= "shubham";
//		String b= "India";
//		
//		System.out.println(a+b); 	//possible
//		System.out.println(a-b);	//Not possible
//=================================================================================
		
//one more case in string is-		
//when we write values with different datatypes, it will print all values together-
//		String a = "India";
//		int b = 10;
//		int c = 20;
		
//		System.out.println(a+b+c);
//when we add variables like below,
//it will execute like a rule in maths like- BODMAS (Brackets of Division, Multiplication, Addition, Subtraction)
//		System.out.println(a+(b*c));
//===============================================================================
		
//5)startsWith & endsWith method=
//By using these methods we validate whether the value in string is starting with &
//ending with correct words or not.
//& above methods returns us boolean datatype answer (true/false)
		
//		String a = "RahulKumar";
//		System.out.println(a.startsWith("Ra"));	//true
//		System.out.println(a.endsWith("ma"));	//false
//=================================================================================
			
	}
}
