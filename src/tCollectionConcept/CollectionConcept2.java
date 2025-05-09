package tCollectionConcept;

import java.util.ArrayList;

public class CollectionConcept2 
{
	public static void main(String[] args) 
	{
//extra example of ArrayList using string-
		ArrayList<String> a = new ArrayList<String>();
		
//1) add method-
		
		a.add("Shubham");  	//0
		a.add("Rahul");  	//1
		a.add("Kiran");  	//2
		a.add("Pranav");  	//3
		
//print all data
		System.out.println(a);
		
//2) if we want to print selected data-
		System.out.println(a.get(1));

//3) if we want to replace any value-
		   //index	 string value
		a.set(3,      "Rohan");
		System.out.println(a);
		
//4) if we want to count the size of data- 
		System.out.println(a.size());
				
//5) if we want to remove element-
		System.out.println(a.remove(2));
	}
}