package econditionalStatements;

public class NestedIfElse 
{
public static void main(String[] args) 
{
//Writing if loop within if loop is called as
//"Nested-if-else statement". 
//if statement chya aat ajun ek if statement lihaych
//ani 2 conditions check karaychya. it is called as "Nested if else statement".
//1st condition true zali tarach 2nd condition check
//karaychi otherwise loop madhun baher padaych.
	
//Q-1WAP to check eligibility of a person for Blood Donation.
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
//	System.out.println("end of program");
//======================================================================
	
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
//	System.out.println("end of program");
//==================================================================
	
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
//	System.out.println("end of program");
//===================================================================
	
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
//	System.out.println("end of program");
//======================================================================	
	
//Q-WAP to enter a person in mall.
//Scenario-1- if person has knife=no & ticket=yes.
	
	String knife  = "no";
	String ticket  = "yes";
	
	if(knife=="no")
	{
		System.out.println("entry in mall");
		
		if(ticket=="yes")
		{
			System.out.println("can see the movie");
		}
		else
		{
			System.out.println("can'nt see the movie");
		}
	}
	else
	{
		System.out.println("no entry in mall");
	}
	System.out.println("end of program");
//=========================================================================
	
//Scenario-2-if person has knife=no & ticket=no.
	
	String Knife  = "no";
	String Ticket  = "no";
	
	
	
	
	
	
	
	

	

	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
}
