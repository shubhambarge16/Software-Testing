package nOverloading;

public class MethodOverloading 
{
//Method Overloading-
//In class, declaring multiple methods with same method name
//with different arguments passed in it is called as "Method Overloading".
	
//		ex-1
		public static void method1()
		{
			System.out.println("static-method1 with no arg");
		}
	
//		ex-2
		public static void method1(int x)
		{
			System.out.println("static-method1 with int arg");
		}
	
//		ex-3
		public void method1(char y)
		{
			System.out.println("non-static-method1 with char arg");
		}
		
		public static void main(String[] args) 
		{
			method1();
			
			method1(3);
//can call above both methods directly bcoz these r static.			

			MethodOverloading x = new MethodOverloading();
			x.method1('A');
//(Non-static method so calling with help of Object.)
				
		}
}