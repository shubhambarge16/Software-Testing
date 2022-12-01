package econditionalStatements;

public class IfElseIfLadder 
{
public static void main(String[] args) 
{
//In this conditional statement, we can write multiple
//conditions in one program.
	
//eg-1-WAP to check whether the number is +ve/-ve/0.
//checking for +ve number.
//		int number1 = 89;
//	
//		if(number1>0)
//		{
//			System.out.println("number1 is positive");
//		}
//		else if(number1<0)
//		{
//			System.out.println("number1 is negative");
//		}
//		else
//		{
//			System.out.println("number1 is zero");
//		}
//		System.out.println("end of program");
//if we want to check whether the number is -ve/0,
//then just change the number from 89 to any -ve number/0 number.
//other whole program will be same.
 
//==================================================
//eg-2-same above question here.
//checking for -ve number.	
		
//		int number2 = -45;
//		
//		if(number2>0)
//		{
//			System.out.println("number2 is positive");
//		}
//		else if(number2<0)
//		{
//			System.out.println("number2 is negative");
//		}
//		else
//		{
//			System.out.println("number2 is zero");
//		}
//		System.out.println("end of program");
//======================================================
//eg-3-same above question here.
//checking for zero number.
		
//		int number3= 0;
//		
//		if(number3>0)
//		{
//			System.out.println("its a positive number");
//		}
//		else if(number3<0)
//		{
//			System.out.println("its a negative number");
//		}
//		else
//		{
//			System.out.println("its a zero number");
//		}
//		System.out.println("end of program");
//=======================================================
		
//eg-4-WAP to decide Grades given to a student according to marks.		
		
//		int studentmarks1= 92;
//		int studentmarks2= 89;
//		
//		if(studentmarks1>90&&studentmarks1<100)
//		{
//			System.out.println("A Grade");
//		}
//		else if(studentmarks2>80&&studentmarks2<90)
//		{
//			System.out.println("B Grade");
//		}
//we can write program for only 1 studentmarks at a time.
//So we can'nt write program like above.
//================================================
	//Standard way of writing program of Grades is-->
	//eg-
//Use OR Uncomment anyone of these below marks of 1 student & check
//the Grade given to student.
//		int Marks= 98;	//OR
// 	    int Marks= 87;	//OR
//		int Marks= 76;	//OR
		int Marks= 60;	//OR
//		int Marks= 54;	//OR
//		int Marks= 43;	//OR
//		int Marks= 37;
//read the below condition as "Marks should be less than or equal to
//100 && Marks should be greater than 90
		
 	if(Marks<=100&&Marks>90)
 	{
 		System.out.println("A Grade");
 	}
 	else if(Marks<=90&&Marks>80)
 	{
 		System.out.println("B Grade");
 	}
 	else if(Marks<=80&&Marks>70)
 	{
 		System.out.println("C Grade");
 	}
 	else if(Marks<=70&&Marks>60)
 	{
 		System.out.println("D Grade");
 	}
 	else if(Marks<=60&&Marks>50)
 	{
 		System.out.println("E Grade");
 	}
 	else if(Marks<=50&&Marks>40) 
 	{
 		System.out.println("F Grade");
 	}
 	else
 	{
 		System.out.println("Student is failed");
 	}
	System.out.println("end of program");
	
//jr konti pn value <= sign chya pudhe asel tr
//ti tyach block madhe consider keli janar.
//eg <=60-->it will run in E grade block.
	
//==========================================================		

//CONCLUSION-->
//1) In this statement, we can check conditions for
//1 variable & 1 value at a time only.
		
//2) & we can use multiple "else-if" conditions in single program.
//but just for one variable only. eg. int marks= 76;
			
}
}
