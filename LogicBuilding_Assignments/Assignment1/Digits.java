//Q.Write a java program to print the digits of a given number.
import java.util.Scanner;
class Digits
{

public static void main(String args[])
    {
    int num,digit;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	num=sc.nextInt();
	
	while(num!=0)
	{
	digit=num%10;
	System.out.println("The digit is ="+digit);
	num=num/10;
	}


    }


}
