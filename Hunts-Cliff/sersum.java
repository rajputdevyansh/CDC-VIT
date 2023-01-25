package Test7Hunts;
import java.util.Scanner;
import java.text.DecimalFormat;
class sersum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        double fact;
        double sumA=0,sumB=0;
        for(int i=0;i<=((b-a)*4);i+=4)
        {
            fact=1;
            for(int j=1;j<=i;j++)
            {
                fact=fact*j;
            }
            sumA=sumA+(Math.pow(a,i)/fact);
        }
        for(int i=2;i<=((b-a)*4);i+=4)
        {
            fact=1;
            for(int j=1;j<=i;j++)
            {
                fact=fact*j;
            }
            sumB=sumB+(Math.pow(a,i)/fact);
        }
        double total=sumA-sumB;
        DecimalFormat df=new DecimalFormat("#.##");     
        System.out.println(df.format(total));
    }
}
