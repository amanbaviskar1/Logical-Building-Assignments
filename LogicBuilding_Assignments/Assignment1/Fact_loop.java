//5!=5x4x3x2x1

class Fact_loop
{

public static void main(String args[])
{
int i,fact=1;
int n=5;

for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("Factorial of " +n + " is = "+fact);


}


}