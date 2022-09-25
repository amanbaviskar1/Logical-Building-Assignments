class A13
{
public static void main(String args[])
{
   for(char i='A';i<='E';i++) //for rows
  {
    //for spaces...
	for(char k='D';k>=i;k--)
	{
	System.out.print(" ");
	}
    //for stars..
	for(char j='A';j<=i;j++)
	{
	System.out.print(i+" ");
    }
    System.out.println();
  } 


}

}