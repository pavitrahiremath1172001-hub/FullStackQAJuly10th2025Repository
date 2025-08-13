class Dowhile5
{
	public static void main(String args[])
	{
            int i=1;
            char ch='A';
            do
            {
                int j=1;
                do
                {
                   System.out.print(ch + " ");
                   ch++;
                   j++;
                }while(j<=i);
                System.out.println();
                i++;
            }while(i<=5);
	}
}