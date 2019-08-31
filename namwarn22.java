public class namwarn22 
{
    public static void main(String args[])
    {
        int namwarn=5;
        for(int i=1;i<=namwarn;i++)
	{
            System.out.print("*");
            for(int j=1;j<i;j++)
	    {
                System.out.print(" ");
            }
            for(int j=i;j<=namwarn*2-i;j++)
	    {
                System.out.print(i);
            }
            for(int j=i;j>1;j--)
	    {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}