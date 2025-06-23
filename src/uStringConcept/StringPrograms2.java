package uStringConcept;

public class StringPrograms2 
{
	public static void main(String[] args) 
	{ 
//Q-1) Write a Java Program to count total number of vowels and consonants in a string.    
//(Vowels are- a,e,i,o,u & others are consonents)
//     String s= "Shubham";
//
//     int vowelscount=0;
//     int consonentscount=0;
//     
//     s= s.toLowerCase();
//     
//     for(int i=0; i<s.length(); i++)
//     {
//    	 char ch = s.charAt(i);
//    	 
//    	 if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
//    	 {
//    		 vowelscount++;
//    	 }
//    	 else
//    	 {
//    		 consonentscount++;
//    	 }
//     }
//     System.out.println("vowels count is "+vowelscount);
//     System.out.println("Consonents Count is "+consonentscount);

//we've to count vowels & consonents so we declare vowels & Consonents equal to 0
//then we use toLowerCase bcoz if there is any uppercase character in string it will be difficult 
//to execute. so we've to bring the string either to uppercase or LowerCase.
//then we apply a for loop under which all characters will come & we store all characters in one ch variable      
//in charAt Method.
//& then we apply if else statement & we write as if any of the vowels comes in the string, then
//those will count in vowels else others will count in Consonents
//===========================================================================================     
     
//Q-2)Java program to find the duplicate characters in a string    
     
//     String a	= "maharashtra";
//     int length = a.length();
//     char[] ch  = a.toCharArray();
//		
//     for(int i=0; i<length; i++)
//    	 for(int j= i+1; j<length; j++)
//    		 if(ch[i]==ch[j])
//    		 {
//    			 System.out.println("Duplicate characters are- "+ch[j]);
//    			 break;
//    		 }
		
//1) String ‘a’ is declared and assigned the value "maharashtra".
//2) Then we store Length of string in length variable. Bcoz we’ve to apply “for loop” ahead.
//& to run that loop, we’ve to use length there.
//3) Also, we’ve to store the string in character array char [] bcoz by using array,
//it goes easy for us to compare each character with other. So, we used “toCharArray” method.
//4)then Outer for loop (i) goes from the first to last character.
//5) In inner for loop, I wrote j =i+1 means means it’ll compare each character with all other character after it.
//6) then in “if statement”, I wrote condition as, ch[i]==ch[j]
//bcoz This condition checks that if character present at position i is equal to character at position j or not.
//7) If they are equal, it means a duplicate is found.
//8)then in printing statement, it Prints the duplicate character.
//9) break; it is written bcoz it exits from the inner loop once a duplicate is found for that character.

//=============================================================================  
 
//Q-3)A Java Program to find the frequency of characters in a String 
//for example, here we are checking frequency for letter 's'.
		
//		String input = "This is a mango";
//		char ch= 's';
//		int count=0;
//		for(int i=0; i<input.length(); i++)
//		{
//			if(ch== input.charAt(i))
//			{
//			count++;
//			}
//		}
//		System.out.println("total frequency of character is "+count);
		
//1)for the given string, I took letter 's' to check its  frequency.
//means how many times it is repeated in String.  
//2)then I declared count variable bcoz we've to count how many times 's' is repeating
//3)Then I apply a for loop & inside that, I run all the characters of String
//also i apply 'if statement' which is comparing 's' character with all other character
//4) then I write count++ bcoz due to this increment, it will keep checking upto end of string
//5) at end I simply write a printing statement which is showing the frequency count.
     
//============================================================================================
		
//Q-4)Java Program to Reverse the String Word by Word.(simple program to remember)
		
//		String str = "Welcome to India";
//		String[] words = str.split("");
//		
//		String ReverseWords = "";
//		
//		for(String w:words)
//		{
//			StringBuilder sb = new StringBuilder(w);
//			sb.reverse();
//			ReverseWords = ReverseWords+sb.toString()+" ";
//		}
//		System.out.println(ReverseWords);
 
//Logic- 1)Split the given string in different parts & store it in string Array.
//2)use class of java as- 'StringBuilder' to reverse the string.
//3)then combine in one single string & print it.
//=============================================================================

//1)To reverse the string word by word, 1st we've to split each word in string.
//before splitting, I've to store the string in array of String. bcoz by using array,
//it goes easy for us to take each character separately for splitting.
//& to split the string, I use split class.
//2)Then I take a String as 'ReverseWord' & Keep it Empty.
//bcoz later on I've to store the final reversed words in it.
//3)then I apply a 'for loop' taking a string as 'w' & assigned 'words' to it.
//from this 'words', it will retrieve each word.
//4)then I took a 'StringBuilder' class of java & created object of it, & passed w as a argument.
//5)then I took 'reverse()' method with 'sb' variable to reverse the string.
////6)now words are reversed. now to get them, we've to add some like- ReverseWord+sb.toString+" ";
//i)ReverseWord means- we left empty string above so we've to fill the reversed word in this.
//ii)sb.toString() means- the reversed words are in StringBuilder Format. we've to get back in normal format i.e. string format.
//so we used above method (sb.toString)
//iii)" " means- we kept space bcoz there should be a space betn each reversed word.
//I kept this 'ReverseWord' addition in for loop bcoz it will run for each word & it will make reverse of each word.
//this is how Total Reverse Word is created.
//7)then coming out of for loop, I simply print the 'ReverseWord' to get output on console.
    
     
     
		
     
     
     
     
     
    
}	
}  