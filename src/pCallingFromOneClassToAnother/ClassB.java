package pCallingFromOneClassToAnother;

public class ClassB 
{
//Calling all from ClassA to ClassB under same package.
	
	public static void main(String[] args) 
	{
//1)Static var Calling-	
		System.out.println(ClassA.a);
//---------------------------------------------------------
//2)non-static var Calling-

//Note-Always create the object of that class from which we 
//are calling those non static members.
//->ithe ClassB madhe ClassA madhun var call karnar ahe so ithe 
//Object suddha ClassA chach create karaycha ani call karaych.

		ClassA xobject = new ClassA();
		System.out.println(xobject.b);
//--------------------------------------------------------------		
//3)-i)static method Calling-
		ClassA.method1();		
		
//3)-ii)non-static method Calling-
		xobject.method2();
//----------------------------------------------------------------		
		
	}	
}
