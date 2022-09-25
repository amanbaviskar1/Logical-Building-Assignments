class A14
{
public static void main(String args[])
{
  for(int i=1;i<5;i++) //col
  {
    for(int j=2;j<=i;j++) //spaces
	{
	System.out.print(" ");
	} 
	
    for(int j=5;j>=i;j--) //star
	{
	System.out.print("*");
	}
	
	for(int j=4;j>=i;j--) //star
	{
	System.out.print("*");
	}
	
    System.out.println();
  } 
//-----------------------------------------
for(int i=1;i<=5;i++) //for rows
  {
    //for spaces...
	for(int k=4;k>=i;k--)
	{
	System.out.print(" ");
	}
    //for stars..
	for(int j=1;j<=i;j++)
	{
	System.out.print("*");
	}
    //stars..
	for(int j=2;j<=i;j++)
	{
	System.out.print("*");
	}
    System.out.println();
  } 




} 


}