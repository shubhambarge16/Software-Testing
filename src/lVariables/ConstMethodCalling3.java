package lVariables;

public class ConstMethodCalling3 
{
//	method
	public void method1()
	{
		char a= 'A';
		System.out.println(a);
	}
//-----------------------------------------------------------	
//	Const
	
	public ConstMethodCalling3()
	{
		int b= 34;
		System.out.println(b);
	}
//-----------------------------------------------------------------	
//	Main method-
	public static void main(String[] args)
	{
//		method calling
		ConstMethodCalling3 x = new ConstMethodCalling3();
		x.method1();
		
//1st method than const. whatever the sequence is, const. will call first.	
		
	}	
}
