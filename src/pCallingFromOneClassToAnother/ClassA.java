package pCallingFromOneClassToAnother;

public class ClassA 
{
//Calling elements/methods/const. from one class to another.
//In this classA, we r calling everyone in this class itself.
//In classB, we r calling elements of classA into classB.
	
//1)static var-	
		public static int a = 100;
//--------------------------------------------------	
//2)non-static var-
		public int b = 200;
//-----------------------------------------------	
//3)static & non-static methods-
//i)static method-
		public static void method1()
		{
			System.out.println("static method1-classA");
		}
//----------------------------------------------------
//ii)non-static method-
		public void method2()
		{
			System.out.println("Non-static method2-ClassA");
		}

//============================================================
	
		
//Calling in MAIN METHOD-
		public static void main(String[] args) 
		{
//1)Static var-
			System.out.println(a); //can call directly
			//OR 
			System.out.println(ClassA.a); //by className.
//-------------------------------------------------------------------
		
//2)non-static var-
//to call non-static var, we've to create Object. No other option.
			ClassA x = new ClassA();
			System.out.println(x.b);
			
//-------------------------------------------------------------------	
		
//3)-i)Calling static method-
			method1(); //can call directly
			//OR
			ClassA.method1(); //by className. (Like static var)
//but for static var, we've to use printing statement.
//but here just (className.methodName)
//-------------------------------------------------------------------		
		
//3)-ii)Calling non-static method-	
			x.method2();	//Calling with help of object 
		    //OR
			ClassA.method1();	//by writing className.MethodName
		}
}
