package hnumberPrograms;

public class NumberPrograms2 
{
public static void main(String[] args) 
{		
//Q-1 WAP to print Palindrome number. (Not Understood)
//Definition- if we take a number suppose 151 & we reverse it, if the reversed number is same as original number,
//then it is called as "Palindrome number".	

//==================================================================================
	
//Q-2 WAP to find Sum of first 5 Natural Numbers.
//(1st ten Natural nos.-1,2,3,4,5)
//(At 1st we just assume that, sum is 0 & then start a program.)
	
//	int sum=0;
//	
//	for(int i=1; i<=5; i++)
//	{
//		sum=sum+i;
//	}
//	System.out.println("sum of first 5 numbers is- "+sum);

//===================================================================================
	
//Q-3 WAP to find Multiplication of first 10 Natural Numbers.	
//(here also we assume that, Multiplication is 1 & then start a program.)

//if we put 0 here, then any number multiply by 0 is=0. so we start with 1.
	
//	int multi = 1;

//	for(int i=1; i<=10; i++)
//	{
//		multi = multi * i;
//	}
//	System.out.println(multi);
	
//===================================================================================	
	
//Q-4 WAP to Factorial of number 5.
//Factorial means eg. 5!= 5*4*3*2*1=120
//jya no. cha factorial kadhaycha ahe, tya no. pasun descending order
//madhe numbers chi multiplication karaychi.
	
//eg-1-
//	int fact =1;
//	
//	for(int i=1; i<=5; i++)
//	{
//		fact = fact * i;
//	}
//	System.out.println(fact);
//------------------------------------------

//eg-2-
//	int fact =1;
//	
//	for(int i=1; i<=10; i++)
//	{
//		fact = fact * i;
//	}
//	System.out.println(fact);
	
//===================================================================================	
	
//Q-5- WAP to swap the numbers.	
//eg-1-:
	
//	int a=200;
//	int b=300;
//	
//	a=a+b;
//	b=a-b;
//	a=a-b;
//	
//	System.out.println("value of a is- "+a);
//	System.out.println("value of b is- "+b);	
//--------------------------------------------------------
	
//eg-2-:
	
//	int a=15;
//	int b=20;
//
//	a=a+b;	  //a+b=15+20=35,
//	b=a-b;	 //I put a=35 here, So b=35-20=15,
//	a=a-b;	//here, a=(latest value of a=35)-(latest value of b=15)=20.
//(so answer is a=15 & b=20. this is printed below)
	
//	System.out.println("value of a - "+a);
//	System.out.println("value of b - "+b);
	
//===================================================================	  
	
//Q-6- WAP to print Fibonacci Series.
	
//definition- It is the sum of previous two numbers.
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89.....
//means, 0+1=1, 1+1=2, 1+2=3, 2+3=5, 5+8=13, 8+13=21....& so on...

//NOTE - Code should be executed with "System.out.print();" statement.
//do not use "println" Statement. Bcoz its a Fibonacci Series,
//So it should print in single line only.
 	
//	int a=0;  
//	int b=1;
//	int c;
//	
//	for(int i=1; i<=10; i++)
//	{
//		c=a+b;
//		System.out.print(c);
//		System.out.print(" ");
//		a=b;
//		b=c;
//	}
	
//explanation-
//I took 2 variables a & b & I assigned 0 & 1 value to it respectively. & I took 'c' variable as well.
//& I applied "for loop" in such a way that, this series will execute until the condition becomes false.	
//In for loop, I stored sum of a & b in c variable. then I print this sum. & I print a space also,
//so that, every value should print with spaces in betn them.
//then I assigned the value of 'b' to 'a', & 'c' to 'b'. here I added a+b so it comes value of c.
//& I keep assigning the a,b,c variables to next upcoming values. & this process goes on until the condition in for loop becomes false.
//& this is how the Fibonacci Series will print.	
	
//===================================================================================================================================
	
//Q-7- WAP to check whether a number is Prime number or not.
		
//Definition of Prime no.-
//A Prime no. is that no. which can be divided by only two nos.-
//1)The number itself & 2) 1
//for eg. '7'- this no. can only be divided by 7 & 1 only. So '7' is prime no.
//eg-2 '9'- this no. can divide by 1,3,9 as well. So 9 is not prime no.
//(1st few prime nos. are 2, 3, 5, 7, 11).
//1st I've to check whether this 7 no is divisible by numbers 2,3,4,5,6 or not. to check this I applied for loop.
	
//	int number = 7;
//	int temp=0;
//	
//	for(int i=2; i<=number-1; i++)
//	{
//		if(number%i==0)
//		{
//			temp=temp+1;
//		}
//	}
//	if(temp>0)
//	{
//		System.out.println(number+ " -is not a Prime number");
//	}
//	else
//	{
//		System.out.println(number+ " -is a Prime number");
//	}

//Any no. is divisible by 1. so I Initialize "for loop" from 2.
//meaning of "for loop" is if the nos. 2,3,4,5,6 are completely divisible & Remainder comes 0 then
//it is not a prime no. it will show as a temp no. to print in "if-else" loop.
//(for best explanation, check in photos.)
//===================================================================================================================================
	
//Q-8-WAP to Display Prime Numbers betn 1 to 100.
//see its Explanation in Notebook.	
	
//	for(int number=1; number<=100; number++)
//	{
//		int temp=0;
//		for(int i=2; i<=number-1; i++)
//		{
//			if(number%i==0)
//			{
//				temp=temp+1;
//			}
//		}
//		if(temp==0)
//		{
//			System.out.println(number);
//		}	
//	}
//===================================================================================================================================

//(PROGRAMS WHICH ARE DIFFICULT & NOT UNDERSTOOD BUT LEARN THEM LETTER BY "SMART PROGRAMMING YOU TUBE CHANNEL",
//IF ASKED IN INTERVIEW)
	
//Q-7-WAP to print an Armstrong Number.(Not Understood)
	
//Definition- eg.1- 123- This is 3 digits no. So now we've to take cube of every single digit
//& add them. if result of this addition equals to the original number itself,
//then we can say, it is an Armstrong number. 

//eg-1 "123".
//		  1^(3)+2^(3)+3^(3)	
//result of above addition is= 123. So above number is Armstrong Number.
		
//eg-2 "1634"- This is 4 digits Number. so we've to do 'raise to 4' to every digit.
//i.e. 1^(4)+6^(4)+3^(4)+4^(4)
//Result of addition is 1634 itself. So it is Armstrong Number.
//-------------------------------------------------------------------------------

//		int number= 123;
//		int t1=number;
//		int length=0;

//		while(t1!=0)
//		{
//			length=length+1;
//			t1=t1/10;	
//		}

//		int t2=number;
//		int arm=0;
//		int remainder;
//		while(t2!=0)
//		{
//			int multi=1;
//			remainder=t2%10;
//			for(int i=1; i<=length; i++)
//			{
//				multi = multi*remainder;
//			}
//			arm=arm+multi;
//			t2=t2/10;
//		}
//		if(arm==number)
//		{
//			System.out.println(number+" -is Armstrong number");
//		}
//		else
//		{
//			System.out.println(number+" -is not Armstrong number");
//		}
//===================================================================================	
//Q-5-WAP to print a reverse number of given number.(Not Understood)
	
//	int number= 5432;
//	int reverse=0;
//	int remainder=0;
//	
//	while(number !=0)
//	{
//		remainder=number%10;
//		reverse= (reverse*10)+ remainder;
//		number= number/10;
//	}
//	System.out.println("reverse is- "+reverse);
//===================================================================================
//Q-6-WAP to find GCD/GCF/HCF (Not Understood)
//(Greatest Common Divisible/Greatest Common Factor/Highest Common Factor) of two numbers.
//(it means, asa konta highest number ahe, jyane ya donhi numbers la bhaag jato.)
//3,4-> 1	
//3,6-> 3
//25,20-> 5
//===================================================================================	
//Q-2WAP to find LCM of 2 numbers(Least common multiplier) (Not Understood)
}
}
