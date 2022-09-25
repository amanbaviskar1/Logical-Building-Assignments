//Write a java program to reverse a given number..

import java.util.Scanner;
class Reverse_Num
{

public static void main(String args[])
    {
    
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number to be reversed :");
	int number=sc.nextInt();
	int reverse=0;
	
	while(number!=0)
	{
	int remainder=number%10;
	reverse=reverse*10+remainder;
	number=number/10;
	}
	
	System.out.println("The reverse of given number is ="+reverse);
	
	}


}