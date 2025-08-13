class Dowhile4
{
	public static void main(String args[])
	{
            int i=1;
            int num=1;
            do
            {
                int j=1;
                do
                {
                System.out.print(num + " ");
                num++;
                j++;
                }while(j<=i);
                System.out.println();
                i++;
            }while(i<=5);
	}
}