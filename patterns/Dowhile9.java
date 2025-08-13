class Dowhile9
{
	public static void main(String args[])
	{
            int i=1;
            do
            {
                int j=5;
                do
                {
                   if(j>=i)
                   {
                   System.out.print(i + " ");
                   }
                   j--;
                }while(j>=i);
                System.out.println();
                i++;
            }while(i<=5);
	}
}