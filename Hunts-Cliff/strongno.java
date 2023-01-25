package Test7Hunts;

import java.util.Scanner;
class strongno
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int r,n,fact=1;
        int sum;
        for(int i=a;i<=b;i++)
        {
            n=i;
            sum=0;
            while(n!=0)
            {
                r=n%10;
                fact=1;
                for(int k=1;k<=r;k++)
                {
                    fact=fact*k;
                }
                sum=sum+fact;
                n=n/10;
            }
            if(sum==i)
            System.out.print(i+" ");
        }
    }
}
