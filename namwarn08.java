public class namwarn08
{
    public static void main(String args[])
    {
        int namwarn=7;
        for(int i=1;i<=namwarn;i++)
	{
            for(int j =1;j<i;j++)
	    {
                System.out.print(" ");
            }
            System.out.print(i+""+(i+1)+""+(i+2));
            for(int j=0;j<=i;j++)
	    {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}