package floopingStatements;

public class FForEachLoopProgram 
{
//this is extra topic. not taught in class - "for Each loop"
	public static void main(String[] args)
	{
//Eg-1
		String [] marks = {"10","35","56","87","43","99"};
		
		for(String m: marks)
		{
			System.out.println(m);
		}
//================================================================
		
//Eg-2
		String[] animals = {"lion", "bird", "cat", "dog", "rat"};
		
		for(String a: animals)
		{
			System.out.println(a);
		}
//================================================================		
//for each loop- Its easy tracing technique to iterate through all the elements in array.		
//: colon present in for each loop represents each element in array should be
//run. (According to condition written)	
		
	}
}