package doperatorsInJava;

public class LogicalOperators 
{
public static void main(String[] args) 
{
	//It has 3 main types-
	//1.AND
	//2.OR
	//3.NOT
	
//for eg.- 
	
	boolean a = true;	
	boolean b = true;
	
	boolean c = false;	
	boolean d = false;
	
//1."AND" Operator-->	
	
	System.out.println(a&&b);  //T
	
	System.out.println(a&&c);  //F

	System.out.println(c&&a);   //F
	
	System.out.println(c&&d);   //F
//Note-:In "AND" Operator, from given 2 values if any one of those
//is false then result will be false.
	
//All combinations of "AND" Operator-
	
//1. true+true = true
//2. true+false = false
//3. false+true = false
//4. false+false = false
//--------------------------------------------------------------
	
//2."OR" Operator-->
	
    System.out.println(a||b);  //T
	
	System.out.println(a||c);  //T
	
	System.out.println(c||a);   //T
	
	System.out.println(c||d);   //F
	
//Note-:In "OR" Operator, If both values from given values are false,
//only & only then result will be false.
//otherwise all other combinations gives true result.
	
//All combinations of "OR" Operator-
	
//1. true+true = true
//2. true+false = true
//3. false+true = true
//4. false+false = false
//-----------------------------------------------------------------
	
//3. NOT Operator-->
	
//Note-: To make anyones result reverse, then
//in that case, NOT Operator is used.
	
	System.out.println(!a);	//False

	System.out.println(!b);	//false
	
	System.out.println(!c);	//true
	
	System.out.println(!d);	//true
//===================================================================

}
}
