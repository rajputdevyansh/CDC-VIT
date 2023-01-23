package Test7Hunts;

import java.util.*;
class Charfind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        sc.close();
        if(ch>=32 && ch<=47||ch>=58 && ch<=64||ch>=91 && ch<=96||ch>=123 && ch<=126)
        {
            System.out.println("This is a special character.");
        }
        else if(ch>=48 && ch<=57)
        {
            System.out.println("This is a digit.");
        }
        else
        {
            System.out.println("This is an alphabet.");
        }
    }
}
