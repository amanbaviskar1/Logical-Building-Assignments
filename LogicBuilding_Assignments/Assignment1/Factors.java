//Q.Write a java program to print all the factors of a given number 

import java.util.Scanner;
class Factors
{

public static void main(String args[])
    {
    int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	num=sc.nextInt();
	
	for(int i=1;i<=num;++i)
	{
	    if(num%i==0)
		{
		System.out.println("The factor of " +num+ " is = "+i);
		
		}
	}

    }


}