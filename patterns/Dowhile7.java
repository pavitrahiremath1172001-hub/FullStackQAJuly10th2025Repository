class Dowhile7
{
	public static void main(String args[])
	{
            int i=1;
            do
            {
                int j=1;
                do
                {
                   System.out.print("* ");
                   j++;
                }while(j<=3);
                System.out.println();
                i++;
            }while(i<=10);
	}
}