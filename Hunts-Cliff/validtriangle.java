package Test7Hunts;

import java.util.Scanner;
class validtriangle
{
     public static void main(String args[])
     {
        int anga, angb, angc, sum; 
        Scanner s=  new Scanner(System.in);
        anga=s.nextInt();
        angb=s.nextInt();
        angc=s.nextInt();
        s.close();
        sum = anga + angb + angc;   
        if(sum == 180)   
        {  
            System.out.println("The triangle is valid.");  
        }  
        else  
        {  
            System.out.println("The triangle is not valid.");
        }
     }
 } 
