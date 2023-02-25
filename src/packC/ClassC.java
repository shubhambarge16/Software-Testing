package packC;

import packACallingFromClassAToClassB.ClassA;

public class ClassC 
{
//Calling all stuffs from a class of one package
//to class of another package.
	
	public static void main(String[] args)
	{
//1)Static var-
		System.out.println(ClassA.a);
		
//2)non-static var-	
		ClassA xobj = new ClassA();
		System.out.println(xobj.b);
			
//3)-i)static method-
		ClassA.method1();
		
//3)-ii)non-static method-
		xobj.method2();
	
	}	
}
