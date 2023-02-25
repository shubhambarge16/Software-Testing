package lVariables;

public class VariablesCalling2 
{
//		ex-1
		static int a=50;	//static Variable
		
//		ex-2-
		int b=60;			//non-static Variable
		
//		ex-3-Const.
		public VariablesCalling2()
		{
			int c= 70;
			System.out.println("Value of c is- "+c);
		}
		
//		ex-4-Non-static Method.
		public void method1()
		{
			int d = 80;
			System.out.println("Value of d is- "+d);
		}
	
//==================================================================	
	
//Calling above all in Main method-
	
		public static void main(String[] args) 
		{
//ex-1-static var calling
//we can call it either directly OR by className.variableName.
		
			System.out.println(a);
			System.out.println(VariablesCalling2.a);
//=============================================================================
		
//ex-3-Const. Calling.
		
			VariablesCalling2 x = new VariablesCalling2();
			
//here Object of Non-static method is created to call it.
//=============================================================================
		
//ex-4-Non-static Method Calling.
			
			x.method1();
//Note-1)Ithe, Object create karun nantr x.method1(); karun hi method call karaychi aste.
//But ex-2 madhe already Object create kelay. so toch object ithe vaprun non-static method
//call keli.
			
//2)Ithe "Const" adhi ahe ani "method" nantr ahe. jr "method" adhi ani "Const" nantr asta,
//tari by default Const. ch adhi print honar. its ex is shown in next class 3.
			
//bcoz as soon as a class is generated, Const. is also created automatically.
//Const is nothing but class.

//=============================================================================			

//ex-2-non static Variable calling-
			
			System.out.println(x.b);
//=============================================================================		
		}
}
