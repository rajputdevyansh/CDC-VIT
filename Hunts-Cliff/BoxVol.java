package Test7Hunts;

import java.util.Scanner;
import java.text.DecimalFormat;
class BoxVol
{
    double width;
    double height;
    double depth;
    BoxVol()
    {
        width=0;
        height=0;
        depth=0;
    }
    BoxVol(double w, double h, double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    BoxVol(double len)
    {
        width=len;
        height=len;
        depth=len;
    }
    public double volume()
    {
        return width*height*depth;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double w=sc.nextDouble();
        double h=sc.nextDouble();
        double d=sc.nextDouble();
        double len=sc.nextDouble();
        sc.close();
        BoxVol ob1= new BoxVol();
        BoxVol ob2= new BoxVol(w,h,d);
        BoxVol ob3= new BoxVol(len);
        DecimalFormat df=new DecimalFormat("#");
        System.out.println("Volume of mybox1 is "+df.format(ob1.volume()));
        System.out.println("Volume of mybox2 is "+df.format(ob2.volume()));
        System.out.println("Volume of mycube is "+df.format(ob3.volume()));
    }
}
