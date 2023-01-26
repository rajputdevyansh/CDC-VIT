package Test7Hunts;

import java.util.*;
class sumAp
{
    public static void main(String args[])
    {
        int n1,df,n2,i,ln;
        int s1=0;
        Scanner s = new Scanner(System.in);
        n1=s.nextInt();
        n2=s.nextInt();
        df=s.nextInt();
        s.close();
        ln=n1;
        s1=n1;
        for(i=1;i<n2;i++)
        {
            System.out.print(s1+" + ");
            s1+=df;
            ln+=s1;
        }
        System.out.print(s1+" = "+ln);
    }
}
