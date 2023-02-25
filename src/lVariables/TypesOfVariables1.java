package lVariables;

public class TypesOfVariables1 
{
//Types Of Variables-
//1) Global Variables-
	
//The Variables which are declared in class body only
//those are called as Global Variables.
	
//for ex-1
	
		static int a=50;
		int b=60;
//these are Global Variables & shown in blue color.
//If I add "static" keyword to "a" variable, it becomes "Static-Global Variable"
//If I don't add static keyword to any variable suppose "b" variable, then it will be
//"non-static Global Variable".
	
//Global has 2 sub-types-
//1)static & 2) non-static
//==================================================================
	
//2)Local Variables-
//"The Variables which are declared in class body but declared specifically
//in the block/constructor/Method/Main Method, those are called as Local Variables."
	
//for ex-2- Constructor-

		public TypesOfVariables1()
		{
			int c= 70;
			int d= 80;
		}
//1) c & d are Local Variables & shown in Brown color.
//2) We can'nt Use "static" keyword in Local Variables.
//3) Local has no any sub-types.	
	
//ex of Local Variables-
		
//		ex-3-const.
		
		public TypesOfVariables1(int x)
		{
			int e = 30;	 //This e is local var. bcoz it is declared in const body.
		}
		
//		ex-4-Method.
		
		public static void Method1()
		{
			int f = 70;	  //this f is local var. bcoz it is declared in Method body.
		}
		
//		ex-5- Main Method.
		public static void main(String[] args) 
		{
			int g= 80;	//This g is also local var. bcoz it is declared in main method body.
		}
//============================================================================================		
//ex of "Global Variables"
//		ex-6
		char h='A'; //this h is "Global Variable" bcoz its declared openly in class body.
		
//		ex-7
		String i= "shubham"; //this i is "Global Variable" bcoz its declared openly in class body.
		
}
