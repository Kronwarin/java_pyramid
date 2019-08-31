public class namwarn17 
{
    public static void main(String args[])
    {
        int namwarn=5;
        for(int i=1;i<=namwarn;i++)
   	{
            for(int j=1;j<=namwarn-1;j++)
	    {
                System.out.print(i+""+(namwarn*2-i));
            }   
            System.out.println();
        }
    }
}