public class namwarn29 
{
    public static void main(String args[])
    {
        int namwarn=5;
        for(int i=1;i<=namwarn;i++)
	{
            System.out.print(i+"*"+(i+2));
            for(int j=1;j<=i+2;j++)
	    {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}