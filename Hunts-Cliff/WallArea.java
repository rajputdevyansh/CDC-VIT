package Test7Hunts;
import java.util.Scanner;
import java.text.DecimalFormat;
class WallArea
{
    private double length,height;
    WallArea(double length,double height)
    {
        this.length=length;
        this.height=height;
    }
    public double calculateArea()
    {
        return length*height;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        sc.close();
        WallArea ob1=new WallArea(a,b);
        WallArea ob2=new WallArea(c,d);
        DecimalFormat df=new DecimalFormat("#.##");
        System.out.println("Area of Wall 1:"+df.format(ob1.calculateArea()));
        System.out.println("Area of Wall 2:"+df.format(ob2.calculateArea()));
    }
}
