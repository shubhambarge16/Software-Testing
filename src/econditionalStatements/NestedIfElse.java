package econditionalStatements;

public class NestedIfElse 
{
public static void main(String[] args) 
{
	//EXPLANATION OF "NESTED-IF-ELSE"-->
//Writing if-else statement within if-else statement is called as
//"Nested-if-else statement".
	
//We are checking 2 conditions in "Nested if-else".
//****************
//In this, We are checking 1st condition by writing it in outer "if" statement.
//If this 1st condition becomes TRUE, then we'll go for checking 2nd condition
//using one more inner "if-else" statement.
//But if this 1st condition becomes FALSE, then
//inner if-else statement will not execute,
//directly outer else statement will execute. & program will end. 
	
//we can execute inner "if-else statement",
//only if outer "if" condition becomes true.
//===================================================================================
	
//Q-1WAP to check eligibility of a person for Blood Donation.
//for eg. Assume- Age>=18, Weight>=50.
	
//Scenario-1->Age-True, Weight-True.
	
//	int age=25;
//	int weight=55;
//	
//	if(age>=18)
//	{
//		System.out.println("Allowed for weight checking");
//		
//		if(weight>=50)
//		{
//			System.out.println("Allowed for blood donation");
//		}
//		else
//		{
//			System.out.println("Not Allowed for blood donation due to weight criteria");
//		}	
//	}
//	else
//	{
//		System.out.println("Not Allowed for blood donation due to age criteria");
//	}
//	System.out.println("End of Program");
//----------------------------------------------------------------------------
	
//Scenario-2->Age-True, Weight-False.
//	int age= 25;
//	int weight= 45;
//	
//	if(age>18)
//	{
//		System.out.println("Allowed for weight checking");
//		
//		if(weight>50)
//		{
//			System.out.println("Allowed for blood donation");
//		}
//		else
//		{
//			System.out.println("not allowed for blood donation due to weight criteria");
//		}
//	}
//	else
//	{
//		System.out.println("not allowed due to age criteria");
//	}
//	System.out.println("End of Program");
//----------------------------------------------------------------------
	
//Scenario-3->Age-False, Weight-true.	
	
//	int age=12;
//	int weight=62;
//	
//	if(age>18)
//	{
//		System.out.println("allowed for weight checking");
//		
//		if(weight>50)
//		{
//			System.out.println("allowed for blood donation");
//		}
//		else
//		{
//			System.out.println("not allowed for blood donation due to weight criteria");
//		}
//	}
//	else
//	{
//		System.out.println("not allowed for blood donation due to age criteria");
//	}
//	System.out.println("End of Program");
//-----------------------------------------------------------------------------
	
//Scenario-4->Age-False, Weight-False.
	
//	int age= 12;
//	int weight=43;
//	
//	if(age>18)
//	{
//		System.out.println("Allowed for weight checking");
//		
//		if(weight>50)
//		{
//			System.out.println("Allowed for blood donation");
//		}
//		else
//		{
//			System.out.println("not Allowed for blood donation due to weight criteria");
//		}
//	}
//	else
//	{
//		System.out.println("Not allowed for blood donation due to age criteria");
//	}
//	System.out.println("End of Program");
//======================================================================	
	
//Q-WAP to check eligibility of a person to enter in mall.
//Scenario-1- if person has knife=yes & ticket=yes.
	
//	String knife  = "yes";
//	String ticket  = "yes";
//	
//	if(knife=="yes")
//	{
//		System.out.println("can't enter in mall");
//		
//		if(ticket=="yes")
//		{
//			System.out.println("can't see the movie");
//		}
//		else
//		{
//			System.out.println("can see the movie");
//		}
//	}
//	else
//	{
//		System.out.println("can enter in mall");
//	}
//	System.out.println("End of Program");
//---------------------------------------------------------------------
	
//Scenario-2-if person has knife=no & ticket=no.
	
//	String Knife   = "no";
//	String Ticket  = "no";
//	
//	if(Knife=="no")
//	{
//		System.out.println("can enter in mall");
//		
//		if(Ticket=="no")
//		{
//			System.out.println("can't watch the movie");
//		}
//		else
//		{
//			System.out.println("can watch the movie");
//		}
//	}
//	else
//	{
//		System.out.println("can't enter in mall");
//	}
//	System.out.println("End of Program");
//---------------------------------------------------------------------

//Scenario-3-if person has knife=yes & ticket=no.
	
//	String KNIFE = "yes";
//	String TICKET = "no";
//	
//	if(KNIFE=="yes")
//	{
//		System.out.println("Can't enter in mall");
//		
//		if(TICKET=="no")
//		{
//			System.out.println("can't watch the movie");
//		}
//		else
//		{
//			System.out.println("can watch the movie");
//		}
//	}
//	else
//	{
//		System.out.println("Can enter in mall");
//	}
//	System.out.println("End of Program");
//---------------------------------------------------------------------
	
//Scenario-4-if person has knife=no & ticket=yes.
	
//	String knife = "no";
//	String ticket = "yes";
//	
//	if(knife=="no")
//	{
//		System.out.println("can enter in mall");
//		
//		if(ticket=="yes")
//		{
//			System.out.println("can watch the movie");
//		}
//		else
//		{
//			System.out.println("can't watch the movie");
//		}
//	}
//	else
//	{
//		System.out.println("can't enter in mall");
//	}
//	System.out.println("End of Program");
//=========================================================================
	
	

	
	
	
	
	
	
	
	
	
	
	
}
}
