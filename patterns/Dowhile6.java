class Dowhile6
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
                num=num+2;
                j++;
                }while(j<=i);
                System.out.println();
                i++;
            }while(i<=5);
	}
}