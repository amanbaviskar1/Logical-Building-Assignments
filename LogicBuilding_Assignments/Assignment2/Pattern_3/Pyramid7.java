class Pyramid7
{
public static void main(String args[])
{
   /*for(int i=1;i<=9;i++) //for rows
  {
    //for spaces...
	for(int k=1;k<i;k++)
	{
	System.out.print(" ");
	}
   
	for(int j=9;j>=i;j--)
	{
	System.out.print(i+" ");
	}
    System.out.println();
  }*/ 
  for(int i=9;i>=1;i--) //for rows
  {
    //for spaces...
	for(int k=9;k>i;k--)
	{
	System.out.print(" ");
	}
   
	for(int j=1;j<=i;j++)
	{
	System.out.print(i+" ");
	}
    System.out.println();
  } 
  
  
  
  
}
}