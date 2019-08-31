public class namwarn14 
{
    public static void main(String args[])
    {
        int namwarn=5;
        for(int i=1;i<=namwarn;i++)
    	{
            for(int j=i;j>1;j--)
	    {
                System.out.print(" ");
            }
            System.out.print(i+""+(i+1));
            for(int j=namwarn;j>i;j--)
	    {
                System.out.print("  ");
            }
            System.out.println((i+1)+""+i);
        }
    }
}