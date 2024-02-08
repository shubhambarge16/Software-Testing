package oAllConceptsInOneProgram;

public class AllConceptsProgram1 
{
//To save data of all Students.
//Normal but lengthy program-	
	
	//studentData
	public static void main(String[] args) 
	{
		String name= "shubham";
		int rollno = 13;
		double percentage= 78.56;
		char Grade= 'A';
		String emailID= "shubham.barge16@gmail.com";
		String batchName= "25th june evening";
		long mobileNo= 1234567890;
		
		System.out.println("name is- "+name);
		System.out.println("rollno is- "+rollno);
		System.out.println("percentage is- "+percentage);
		System.out.println("Grade is- "+Grade);
		System.out.println("emailID is- "+emailID);
		System.out.println("BatchName is- "+batchName);
		System.out.println("mobileNo is- "+mobileNo);
	}
//For saving data of one student, I took 7 variables.
//if I've to save data of 100 students than I've to take 700 variables,
//which is going difficult to maintain. bcoz it will Occupy more memory.
	
//1)So that's why I'll declare all those 7 variables with data types "Globally" only once at start of class.
//2)than I'll create a Constructor & insert all data of student in it.(1 const=1student) 
//than I'll write printing statement & I'll add all data in it. 
//3)After creating const. I'll create an Object to call in main method.
//4)separate Object for separate student.(Object must be differ from each other by inserting arg. in const.)
	
//By this way, we can store multiple values using very less variables.
//so that less memory will be occupied by variables.
}