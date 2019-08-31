public class namwarn32
{
    public static void main(String args[])
    {
        int namwarn=3;
        for(int i=1;i<=namwarn*2-1;i++)
	{
            for(int j=1;j<=(namwarn*2-i+2);j++)
	    {
                System.out.print(j);
            }
            for(int j=namwarn;j<=namwarn+i+1;j++)
	    {
                System.out.print("*");
            }
            System.out.println(namwarn-(namwarn-2)+i);
        }
    }
}