class Pyramid4
{
public static void main(String args[])
{
   /*for(int i=1;i<=9;i++) //for rows
  {
    //for spaces...
	for(int k=8;k>=i;k--)
	{
	System.out.print(" ");
	}
    //for stars..
	for(int j=1;j<=i;j++)
	{
	System.out.print(j);
    }
    System.out.println();
  } 
//-----------------------------------------   
    for(int i=2;i<=9;i++)
  {
    for(int j=1;j<=i;j++)
	{
	System.out.print(j);
	}
    System.out.println();
  }*/
    for (int i = 1; i <= 9; i++)
        {
            for (int j = 9; j > i; j--)
            {
                System.out.print(" "+" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k+" ");
            }
            for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(l+" ");
            }
            System.out.println();
        }



}

}
