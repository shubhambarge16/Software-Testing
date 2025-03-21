package econditionalStatements;

public class NestedIfElse 
{
public static void main(String[] args) 
{
	//EXPLANATION OF "NESTED-IF-ELSE STATEMENT"-->
//Writing if-else statement within if-else statement is called as
//"Nested-if-else statement".
	
//We are checking 2 conditions in "Nested if-else".
//****************
//In this, We are checking 1st condition by writing it in outer "if" statement.
//If this 1st condition becomes "TRUE", then we'll go for checking 2nd condition
//using one more inner "if-else" statement.
//But if this 1st condition becomes "FALSE", then
//inner "if-else" statement will not execute,
//directly outer "else" statement will execute. & program will end.
	
//Note- we can execute inner "if-else statement",
//only if outer "if" condition becomes "TRUE".
//===================================================================================
	
//Q-1-WAP to check eligibility of a person for Blood Donation.
	
//for eg. Assume- Age>=18,True & Weight>=50. True.	
//means, Age should be greater than or equal to 18 &
//Weight should be greater than or equal to 50.
	
//we can try 4 Scenario's here like-->
//Scenario-1->Age-True, Weight-True.
	//Age = 25;
	//weight = 55;
	
//Scenario-2->Age-True, Weight-False.
	//int Age= 25;
    //int Weight= 45;
	
//Scenario-3->Age-False, Weight-true.
   //int Age = 12;
   //int Weight = 62;
	
//Scenario-4->Age-False, Weight-False.
	//int Age = 12;
	//int Weight=43;
	
//for eg. by using scenario 1 here,
	
	int Age = 25;		//just change values of Age & Weight
	int Weight = 55;    //to try all scenarios
	
	if(Age>=18)
	{
		System.out.println("allowed for weight checking");
		
		if(Weight>=50)
		{
			System.out.println("allowed for blood donation");
		}
		else
		{
			System.out.println("not allowed for blood donation");
		}
	}
	else
	{
		System.out.println("Not allowed for blood donation");
	}
	System.out.println("End of Program");
	
//===========================================================================

//Q-2-WAP to check eligibility of a person to enter in mall.
	
//Scenario-1- if person has knife=yes & ticket=yes.
//	String knife  = "yes";
//	String ticket  = "yes";
		
//Scenario-2-if person has knife=no & ticket=no.	
//	String Knife   = "no";
//	String Ticket  = "no";
		
//Scenario-3-if person has knife=yes & ticket=no.
		
//	String KNIFE = "yes";
//	String TICKET = "no";	
		
//Scenario-4-if person has knife=no & ticket=yes.
		
//	String knife1 = "no";
//	String ticket1 = "yes";	
//---------------------------------------------------------------------------
	//for eg. by using scenario 1 here,
	
	String Knife  = "yes";
	String Ticket = "yes";
		
	if(Knife== "yes")
	{
		System.out.println("can't enter in mall");
				
		if(Ticket== "yes")
		{
			System.out.println("can't see the movie");
		}
		else
		{
			System.out.println("can see the movie");
		}
	}
	else
	{
		System.out.println("can enter in mall");
	}
	
	System.out.println("End of Program");
		
}
}