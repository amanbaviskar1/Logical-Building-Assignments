//How to add two numbers without using the arithmatic operators in java..

import java.util.Scanner;
class Add_Iteration
{
static int Add(int a,int b)
{
  while(b != 0)
  {
  int carry=a & b;
  a=a ^ b;
  b=carry<<1;
  }
  return a;
}
public static void main(String args[])
    {
    
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First number :");
	int a=sc.nextInt();
	
	System.out.println("Enter Second number :");
	int b=sc.nextInt();
	
	Add(a,b);
	System.out.println("Addition is ="+Add(a,b));
	
	
	


    }


}