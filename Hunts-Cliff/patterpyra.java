package Test7Hunts;

import java.util.Scanner;
class patterpyra
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>1;j--)
            {
                System.out.println(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
