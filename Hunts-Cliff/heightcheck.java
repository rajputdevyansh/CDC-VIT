package Test7Hunts;

import java.util.*;
class heightcheck
{
    public static void main(String args[])
    {
        float PerHeight;
        Scanner s= new Scanner(System.in);
        PerHeight=s.nextInt();
        s.close();
        if(PerHeight<150 && PerHeight>0)
        {
            System.out.println("The person is Dwarf.");
        }
        else if(PerHeight<165 && PerHeight>=150)
        {
            System.out.println("The person is average heighted.");
        }
        else if(PerHeight<=195 && PerHeight>=165)
        {
            System.out.println("The person is taller.");
        }
        else
        {
            System.out.println("Abnormal height.");
        }
    }
}
