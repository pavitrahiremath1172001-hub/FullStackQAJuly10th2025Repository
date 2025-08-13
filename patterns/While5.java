class While5
{
	public static void main(String args[])
	{
             int i=1;
             char ch='A';
             while(i<=5)
             {
             int j=1;
                while(j<=i)
                {
                   System.out.print(ch + " ");
                   ch++;
                   j++;
                }
                System.out.println();
                i++;
             }
	}
}