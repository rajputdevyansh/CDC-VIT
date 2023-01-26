package Test7Hunts;

import java.util.Scanner;
class sumprime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int count,k=0;
        int arr[]=new int[n];
        for(int i=1;i<n;i++)
        {
            count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                count++;
            }
            if(count==2)
            {
                arr[k]=i;
                k++;
            }
        }
        for(int x=0;x<=k;x++)
        {
            for(int y=0;y<=k;y++)
            {
                if(arr[x]+arr[y]==n)
                {
                    System.out.println(arr[x]+" + "+arr[y]);
                    arr[x]=0;
                }
            }
        }
    }
}
