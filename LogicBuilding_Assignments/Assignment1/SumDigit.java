//Q.Write a java program to print sum of digits of given number.
import java.util.Scanner;
class SumDigit
{

public static void main(String args[])
    {
    int num;
	int sum=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	num=sc.nextInt();
	
	while(num>0)
	{
	 int result=num%10;
	 sum=sum+result;
	 num=num/10;
	}
	System.out.println("the sum of all digits is = "+sum);
	

    }


}