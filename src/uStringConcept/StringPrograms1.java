package uStringConcept;

public class StringPrograms1 
{
	public static void main(String[] args) 
	{
		
//Q-Write a Java Program to replace the space between a string with any character/s.
//if there is a word like- "RAHUL KUMAR" & we've to remove space betn
//these 2 words then we can't remove it bcoz it is part of string.
//but we can replace it with any word or character. like-
		
//in below string, we want to replace space betn 2 words with & word "and"
//we can directly pass the character present now & the character which
//we want to replace with. in this "replace" method
//we can use replace method more than 2 words as well. but the replacing word will be same like-RAHULandKUMARandSingh
	
		String a = "RAHUL KUMAR";
		System.out.println(a.replaceAll(" ", "and"));	//RAHULandKUMAR
//==============================================================================
		
//Q- Write a Java Program to Reverse the string character by character-
		String b= "INDIA";
		System.out.println("original string is "+b);
		String reverse = "";
		char x;
		
		for(int i=0; i<b.length(); i++)
		{
			x= b.charAt(i);
			reverse = x + reverse;
		}
		System.out.println("reverse string is "+reverse);
		
//at 1st, we took a string & print it as original string. then we took another string,
//we name it as reverse, kept it empty bcoz later on we've to pass reverse value in it
//then we just declare a 'x' variable in char datatype. bcoz we're reversing characters in string.
//then we simply run a for loop for 1st string value "RAHUL".
//then we use charAt method in for loop to run each letter in String. & stored it in 'x' variable
//then we took above "reverse" variable & added the x variable & reverse variable together.
//so that it will gives us reverse value of above string.
//then to print the reverse string, we simply write a printing statement & we get a reverse of above string.
//=================================================================================		
	}
}
