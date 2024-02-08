package kConstructorPack;

public class CallingConstAndNonStaticMethod3 
{
//calling of 1)"Constructor" &
//2)"Non static method" in Main method-
	
//1)Creating Constructor-
	
		int a;		//variable declared here.
		public CallingConstAndNonStaticMethod3()
		{
			a=100;	//Variable Initialized here.
			System.out.println(a);
			System.out.println("Hi-Bye");
		}
//===============================================================================	
//2)Creating "Non static method"
//(Almost Same process as per Method creation)
	
		public void Method1()
		{
			System.out.println("this is method1-non static");
		}
	
//To call above "const" & "Non static method",
//we've to create 2 objects in main method.
	
		public static void main(String[] args) 
		{
//1)Creating Object to call "const"-
		
			CallingConstAndNonStaticMethod3 x = new CallingConstAndNonStaticMethod3();
		
//2)To call "Non static method" in main method,
//Object must be Created.
			
//Note-I)"Non static method" call karaychi asel tr ti direct main method madhe
//copy paste karun call karta yet nahi. bcoz its "Non static method".
//So hi method call karnyasathi tyacha Object create karava lagto. Like Below.
//II)We can take any letter or word instead of x & y to create object of "Non static method".
//III)To call a method with the help of Object, formula is-
						
//		Objectname.Methodname();
//Means y.Method1(); in line no 48.		
			
			CallingConstAndNonStaticMethod3 y = new CallingConstAndNonStaticMethod3();
			y.Method1();

		}
}