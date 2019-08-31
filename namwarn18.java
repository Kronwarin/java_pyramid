public class namwarn18 
{
    public static void main(String args[])
    {
        int namwarn=5;
        for(int i=1;i<=namwarn;i++)
	{
            System.out.print(i);
            for(int j=1;j<=i;j++)
	    {
                System.out.print("*");
            }
            System.out.print(i);
            for(int j=namwarn;j>=i;j--)
	    {
                System.out.print("*");
            }
            System.out.println(namwarn*2-i);
        }
    }
}