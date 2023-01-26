package Test7Hunts;

import java.util.*;
class sumGp 
{
     static float sumOfGP(float a, float r, int n)
    {
        float sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a;
            a=a*r;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float r=sc.nextFloat();
        int n=sc.nextInt();
        sc.close();
        System.out.print(Math.round(sumOfGP(a,r,n)));
    }
}
      
