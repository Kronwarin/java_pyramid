public class namwarn36 
{
    public static void main(String args[])
    {
        int namwarn=3;
        for(int i=1;i<=namwarn;i++)
	{
            for(int j=i;j<=namwarn;j++)
	    {
                System.out.print(j);
            }
            for(int j=1;j<=i*2-1;j++)
	    {
                System.out.print("*");
            }
            for(int j=namwarn;j>=i;j--)
	    {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=namwarn-1;i>=1;i--)
	{
            for(int j=i;j<=namwarn;j++)
    	    {
                System.out.print(j);
            }
            for(int j=1;j<=i*2-1;j++)
	    {
                System.out.print("*");
            }
            for(int j=namwarn;j>=i;j--)
	    {
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}