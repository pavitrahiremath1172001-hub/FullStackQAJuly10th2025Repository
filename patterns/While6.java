class While6
{
	public static void main(String args[])
	{
             int i=1;
             int num=1;
             while(i<=5)
             {
             int j=1;
                while(j<=i)
                {
                   System.out.print(num + " ");
                   num=num+2;
                   j++;
                }
                System.out.println();
                i++;
             }
	}
}