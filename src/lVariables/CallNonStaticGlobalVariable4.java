package lVariables;

public class CallNonStaticGlobalVariable4 
{
//non-static Global Variable
		int a=50;
		
		char b='A';
		
//calling above
		
		public static void main(String[] args) 
		{
			CallNonStaticGlobalVariable4 x= new CallNonStaticGlobalVariable4();
			System.out.println(x.b);
			System.out.println(x.a);
		}
//1)After Calling Non Static Global Variables, Sequence matters.
//main method madhe jya sequence madhe printing statement write kel jate, tyach
//sequence madhe console vr value print honar. 
//2)Ithe Object ekdach create karava lagto.
}
