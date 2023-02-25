package kConstructorPack;

public class ConstructorTypes4 
{
//Types of Constructor-
//1)Default/ System Defined Constructor-
	
	public ConstructorTypes4()
	{
		int a= 10;
		System.out.println(a);
	}
//Whether we writing const. like above OR not writing, as soon as we generate a class file,
//the class file itself becomes a "CONSTRUCTOR"
//that's why it is called as "Default Constructor".
//=============================================================================

//2)User defined Constructor-

	int x;
	public ConstructorTypes4(int x)
	{
		x= 20;
		System.out.println(x);
	}
	
//if any user is entering specific data types in Constructor for ex. int x,
//than this type of Constructor is called as "User defined Constructor".
//In this type, user can enter any argument with any data type in Constructor.
//It is totally depends on user. So it is called as User defined Constructor
	
}
