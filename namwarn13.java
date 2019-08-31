public class namwarn13
{
    public static void main(String args[])
    {
        int namwarn=5;
        for(int i=1;i<=namwarn;i++)
	{
            for(int j=1;j<i*2-1;j++)
	    {
                System.out.print(" ");
            }
            for(int j=namwarn*2-(i*2-1);j>=1;j--)
	    {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}