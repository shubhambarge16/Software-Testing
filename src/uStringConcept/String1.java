package uStringConcept;

public class String1 
{
	public static void main(String[] args)
	{
		String a = "mango";
		String b = "Apple";
		String c = "apple";
		String d = "mango";
//below equals method is returning boolean datatype so
//it will show answer in true or false catagory.
//equals method used to compare between any 2 values.
		
		System.out.println(a.equals(b));	//False
		System.out.println(a.equals(c));	//false
		System.out.println(a.equals(d));	//true.
//-----------------------------------------------------------------------
		
//when we've to check address of values means checking where the values are stored
//to check that, we use == (equals equals) arithmetic operator.
		
		System.out.println(a==b);	//F
		System.out.println(a==c);	//F
		System.out.println(a==d);	//T
		
//===========================================================================
		
//String with "new" keyword-

		String p = new String("Apple");
		String q = new String("Mango");
		String r = new String("Apple");
		String s = new String("apple");
		
//values check

		System.out.println(p.equals(q));	//F
		System.out.println(p.equals(r));	//T
		System.out.println(p.equals(s));	//F
		
//address check
		System.out.println(p==q);   //f
		System.out.println(p==r);   //f
		System.out.println(p==s);   //f

//1) equals method is used to check the values stored in variables
//&2) "double equals to" method is used to check address of values 
//means to check where the values are stored.
		
	}
}