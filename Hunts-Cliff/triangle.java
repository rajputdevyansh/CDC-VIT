package Test7Hunts;

import java.util.Scanner;
class triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        if(a==b && a==c && b==c && a==60)
        {
            System.out.println("This is an equilateral triangle.");
        }
        else if(a==b || b==c || c==a)
        {
            System.out.println("This is an isosceles triangle.");
        }
        else
        {
            System.out.println("This is a scalene triangle.");
        }
    }
}
