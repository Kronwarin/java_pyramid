public class namwarn05 
{
    public static void main(String args[])
    {
        int namwarn=4;
        for(int i=1;i<=namwarn;i++)
	{
            for(int j=namwarn-1;j>=i;j--)
 	    {
                System.out.print(" ");
            }
            System.out.print(i);
            for(int j=1;j<i;j++)
	    {
                System.out.print("**");
            }
            System.out.println(i);
        }
        for(int i=1;i<namwarn;i++)
	{
            for(int j=1;j<=i;j++)
	    {
                System.out.print(" ");
            }
            System.out.print(namwarn-i);
            for(int j=namwarn-1;j>i;j--)
	    {
                System.out.print("**");
            }
            System.out.println(namwarn-i);
        }
    }
}