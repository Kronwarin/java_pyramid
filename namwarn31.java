public class namwarn31
{
    public static void main(String args[])
    {
        int namwarn=5;
        for(int i=1;i<=namwarn;i++)
 	{
            for(int j=i;j<=namwarn;j++)
	    {
                System.out.print(i);
            }
            for(int j=1;j<i*2-1;j++)
	    {
                System.out.print(" ");
            }
            for(int j=i;j<=namwarn;j++)
	    {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}