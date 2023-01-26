package Test7Hunts;

import java.util.Scanner;
class OverLoadTemp
{
    private String name;
    private String Day;
    private int temp;
    OverLoadTemp()
    {
        name="Argentina";
        temp=29;
        System.out.println(name+" Yesterday Temperature: "+temp+"\u00B0");
    }    
    OverLoadTemp(String name, int temp)
    {
        this.name=name;
        this.temp=temp;
        System.out.println(name+" Today Temperature: "+temp+"\u00B0");
    }
    OverLoadTemp(String name,String Day, int temp)
    {
        this.name=name;
        this.Day=Day;
        this.temp=temp;
        System.out.println(name+" "+Day+" Temperature: "+temp+"\u00B0");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n1=sc.next();
        int t1=sc.nextInt();
        String n2=sc.next();
        String d=sc.next();
        int t2=sc.nextInt();
        sc.close();
        OverLoadTemp ob1=new OverLoadTemp();
        OverLoadTemp ob2=new OverLoadTemp(n1,t1);
        OverLoadTemp ob3=new OverLoadTemp(n2,d,t2);
    }
}
