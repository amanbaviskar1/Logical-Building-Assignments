//write a java program to print all the Prime Factors of a given number..
import java.util.Scanner;
class Prime_Factors
{

public static void main(String args[])
    {
    int num,temp,i=2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	num=sc.nextInt();
	
	temp=num;
	System.out.println("Prime factor of a number : ");
	while(temp>1)
	{
		if(temp%i==0)
		{
		System.out.print(i+" ");	
		temp=temp/i;
		
		}
		else
		{
			i++;
		}
	}

    }


}