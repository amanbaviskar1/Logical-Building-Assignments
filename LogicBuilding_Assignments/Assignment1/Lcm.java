//Write a java program to find LCM of two numbers..

import java.util.Scanner;
class Lcm
{

public static void main(String args[])
    {
	int gcd=1;
	int x,y;
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter First number :");
	x=sc.nextInt();
	
	System.out.println("Enter Second number :");
	y=sc.nextInt();
	
	
	for(int i=1;i<=x && i<=y;i++)
	{
	    if(x%i==0 && y%i==0)
		   gcd=i;
	
	}
	
	int lcm=(x*y)/gcd;
	
    System.out.println("Lcm of "+x+" and "+y+" is = "+lcm);
    }


}