package oAllConceptsInOneProgram;

public class AllConceptsProgram2 
{
//1)I'll declare only Global variables at start-
	
	String name;
	int RollNo;
	double percentage;
	char Grade;
	String emailID;
	String batchName;
	long mobileNo;
//Now creating const. & adding all info of student in it.
	
//const-1-shubham data-
	
	public AllConceptsProgram2()
	{
		name= "Shubham";
		RollNo= 13;
		percentage= 89.45;
		Grade= 'A';
		emailID= "abc123@gmail.com";
		batchName= "25th june Evening";
		mobileNo= 1234567890;
		
		System.out.println(" name is- "+name 
						   +" RollNo is- "+RollNo 
						   +" percentage is- "+percentage 
						   +" Grade is- "+Grade 
						   +" emailID is- "+emailID 
						   +" batchName is- "+batchName 
						   +" mobileNo is- "+mobileNo);	
	}
	
//const-2-Akshay data-
	
	public AllConceptsProgram2(int x)
	{
		name= "Akshay";
		RollNo= 20;
		percentage= 78.56;
		Grade= 'B';
		emailID= "xyz123@gmail.com";
		batchName= "25th june Evening";
		mobileNo= 7894561230l;	
		
		System.out.println("name is- "+name);
		System.out.println("rollno is- "+RollNo);
		System.out.println("percentage is- "+percentage);
		System.out.println("Grade is- "+Grade);
		System.out.println("emailID is- "+emailID);
		System.out.println("BatchName is- "+batchName);
		System.out.println("mobileNo is- "+mobileNo);	
	}

//calling above 2 consts. in main method by creating separate Objects.
	
	public static void main(String[] args) 
	{
		AllConceptsProgram2 shubham = new AllConceptsProgram2();
		
		AllConceptsProgram2 Akshay = new AllConceptsProgram2(1);
//to call this const., i've to pass int value in const.
		
//these 7 variables are non-static variables bcoz these variables can be used
//many times to store data of multiple students.
		
//non-static variables can do proper utilization of memory but static can'nt do.
		
//If we've to store large amount of data with use of less variables than we've
//to use non-static variables. bcoz these occupy very less memory.
	}	
}