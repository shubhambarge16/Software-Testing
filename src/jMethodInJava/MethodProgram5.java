package jMethodInJava;

public class MethodProgram5 
{
//Note-If we use void datatype here, it returns nothing.
//If we use any other datatype int,char,String, byte, short etc.
//then it returns the value.
	
//In line no 22, jya variable chi value apan return karto tich value
//main method madhe execute hote.
//jr "return" keyword use karun variable print kela (a or b or c)tarach 
//main method madhe ti return chi value console vr print hote.
	
	//method body-
//	method ex-1
	public static int Addition()
	{
		int a=10;
		int b=15;
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
//	method ex-2
	
	public static int Multiplication()
	{
		int x= 10;
		int y= 15;
		int z= x*y;
		
		return z;
//Now I will call this ex-2 method in main method
	}
	
	//main method body-
	public static void main(String[] args) 
	{
		System.out.println(Addition()); //1s call
		int f= Multiplication();	    //2nd call
		System.out.println(f);
		System.out.println(f+100);
	}
//Ithe line no 40 la varchi Addition method call kartoy mhanun ekda 25 print honar,
//ani method body madhe return c che printing statement lihilay mhanun ekda 25 print honar

//datatype apan void sodun dusra kontahi ghetla tr main method madhe execute kartana
//ti value ahe ashi print karu shakto, kontyahi variable madhe store karu shakto(ithe int f madhe store keliye tashi)
//ani tya value vr addition, substraction etc. kontehi operation perform karu shakto.
//mhanjech void sodun kontahi datatype ghetla tr ti value aplyala return hote mhanjech kuthehi vaprayla milte.
}
