package Test7Hunts;

import java.util.*;
class admissionCheck
{ 
    public static void main(String args[])
    {
        int p,c,m,t,mp;
        Scanner s = new Scanner(System.in);
        p=s.nextInt();
        c=s.nextInt();
        m=s.nextInt();
        s.close();
        t=p+c+m;
        mp=m+p;
        System.out.println("Total marks of Maths, Physics, and Chemistry : "+t);
        System.out.println("Total marks of Maths and Physics : "+mp);
        if(t>=190 && mp>=140)
        {
            System.out.println("The candidate is eligible for admission.");
        }
        else
        {
            System.out.println("The candidate is not eligible.");
        }
    }
}
