package Test7Hunts;
import java.util.Scanner;
class cube
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+": "+(i*i*i));
        }
        sc.close();
    }
}
