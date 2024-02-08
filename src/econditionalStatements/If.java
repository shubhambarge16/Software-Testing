package econditionalStatements;

public class If 
{
public static void main(String[] args) 
{
//Q- Check whether the student is passed.
//for eg-	
	int StudentsMarks = 85;
	int PassingMarks = 40;
	
	if(StudentsMarks>PassingMarks)
	{
		System.out.println("The Student is passed");
	}
//------------------------------------------------------------
//if we put value less than 40 in "StudentsMarks" then
//nothing will display on console.
//for eg-
	
	int studentMarks = 25;
	int passingMarks = 40;
	
	if(studentMarks>passingMarks)
	{
		System.out.println("student is failed");
	}	
//-------------------------------------------------------------	
}
}