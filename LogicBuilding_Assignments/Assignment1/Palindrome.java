//Write a java program to check whether the given number is Palindrome or not?

import java.util.Scanner;
class Palindrome
{

public static void main(String args[])
    {
    
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number:");
	int number=sc.nextInt();
	int reverse=0;
	
	int temp=number; //<<
	
	while(temp!=0)
	{
	int remainder=temp%10;
	reverse=reverse*10+remainder;
	temp=temp/10;
	}
	//----------
	if(reverse==number)
	{
	System.out.println("it is a Palindrome number");
	}
	else{
	System.out.println("it is not a Palindrome number");
	}
	//----------
	
	}


}
