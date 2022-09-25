//Q.Write a java program to find smallest of three numbers (a,b,c)

import java.util.Scanner;
class Smallest
{

public static void main(String args[])
    {
    int a,b,c;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter first number :");
	a=sc.nextInt();
	
	System.out.println("Enter second number :");
	b=sc.nextInt();
	
	System.out.println("Enter third number :");
	c=sc.nextInt();
	
	if(a<b && a<c)
	{
	System.out.println("First number is smallest");
	}
	else if(b<a && b<c)
	{
	System.out.println("Second number is smallest");
	}  
	else 
	{
	System.out.println("Third number is smallest");
	}


    }


}