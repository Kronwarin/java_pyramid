public class namwarn21 
{
    public static void main(String args[])
    {
        int namwarn=5;
        for(int i=1;i<=namwarn;i++)
	{
            for(int j=0;j<=((namwarn*2)-(i+3));j++)
 	    {
                System.out.print("*");
            }
            System.out.print(i);
            for(int j=i;j>=1;j--)
	    {
                System.out.print("*");
            }
            System.out.println((namwarn*2)-(i+2));
        }
    }
}