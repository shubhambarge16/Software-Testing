package oAllConceptsInOneProgram;

public class AllConceptsProgram3 
{
//To reduce repetability of printing statement of program 2
//some small changes-
//1) removed printing statements from all consts.
	
	String name;
	int RollNo;
	double percentage;
	char Grade;
	String emailID;
	
static String batchName;
//common info. so I made it static bcoz its remaining common until end of program.
//& I am removing it from both constructors.

	long mobileNo;
	
//const-1-shubham data-
	
	public AllConceptsProgram3()
	{
		name= "Shubham";
		RollNo= 13;
		percentage= 89.45;
		Grade= 'A';
		emailID= "abc123@gmail.com";
		mobileNo= 1234567890;
	}

//const-2-Akshay data-
	public AllConceptsProgram3(int x)
	{
		name= "Akshay";
		RollNo= 20;
		percentage= 78.56;
		Grade= 'B';
		emailID= "xyz123@gmail.com";
		mobileNo= 7894561230l;	
	}
	
//Created method-
//To reduce lengthiness of program.
	public void PrintStudentsData()
	{
		System.out.println("name is- "+name);
		System.out.println("rollno is- "+RollNo);
		System.out.println("percentage is- "+percentage);
		System.out.println("Grade is- "+Grade);
		System.out.println("emailID is- "+emailID);
		System.out.println("BatchName is- "+batchName);
		System.out.println("mobileNo is- "+mobileNo);		
	}
//=================================================================	
//calling above 2 consts. in main method by creating separate Objects.
	
	public static void main(String[] args) 
	{
		AllConceptsProgram3 shubham = new AllConceptsProgram3();
		shubham.PrintStudentsData();
		
		AllConceptsProgram3 Akshay = new AllConceptsProgram3(3);
		Akshay.PrintStudentsData();	
	}
//Note-1)Here from program2, I simply removed printing statements from both
//the constructors & created a method & called them in main method. like-
//	shubham.PrintStudentsData(); &
//	Akshay.PrintStudentsData();

//2)We are taking data of students from same batch So at start, I declared
//BatchName as "static". bcoz BatchName will be remain same throughout.
//3)Also I removed BatchName from both constructors.
//4)I just kept it in i)Global variables at start bcoz it should be declared 
//& in ii)method only.
}