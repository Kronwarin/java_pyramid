public class namwarn01 
{
    public static void main(String args[])
    {
        int namwarn=4;
        for(int i=1;i<=namwarn;i++)
	{
            for(int j=2;j<=i;j++)
	    {
                System.out.print(" ");
            }
            
            System.out.print(i+""+i);
            
            for(int j=namwarn;j>=(i+1);j--)
	    {
                System.out.print("**");          
            }
            System.out.println(i+""+i);
        }
    }
}