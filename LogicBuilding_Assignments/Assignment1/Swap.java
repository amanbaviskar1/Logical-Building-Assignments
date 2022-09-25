//Swapping Without Third variable 
class Swap{

public static void main(String args[])
{
int a=20,b=10;
System.out.println("Before Swap a is "+a);
System.out.println("Before Swap b is "+b);

b=a+b;
a=b-a;
b=b-a;

System.out.println("After Swap a is "+a);
System.out.println("After Swap b is "+b);


}
}