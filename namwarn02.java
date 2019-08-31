public class namwarn02
{
    public static void main(String args[])
    {
        int namwarn=4;
        for(int i=1;i<=namwarn;i++)
	{
            for(int j=i;j<=i+2;j++)
	    {
                System.out.print(j);
            } 
            for(int j=1;j<=i+1;j++)
	    {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}