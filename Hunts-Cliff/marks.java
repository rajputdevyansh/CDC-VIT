int rollno;
int mark1;
int mark2;
int mark3;
public Student(int rollno,int mark1,int mark2,int mark3)
{
    this.rollno=rollno;
    this.mark1=mark1;
    this.mark2=mark2;
    this.mark3=mark3;
}
}
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Student[] students=new Student[n];
        for(int i=0;i<n;i++)
        {
            int rollno=sc.nextInt();
            int mark1=sc.nextInt();
            int mark2=sc.nextInt();
            int mark3=sc.nextInt();
            students[i]=new Student(rollno,mark1,mark2,mark3);
        }
        int highmark1=0;
        int highroll1=0;
        int highmark2=0;
        int highroll2=0;
        int highmark3=0;
        int highroll3=0;
        int hightotal=0;
        int highroll=0;
        for(int i=0;i<n;i++)
        {
            int total= students[i].mark1+students[i].mark2+students[i].mark3;
            System.out.println(total);
            if(students[i].mark1>highmark1)
            {
                highmark1=students[i].mark1;
                highroll1=students[i].rollno;
            }
            if(students[i].mark2>highmark2)
            {
                highmark2=students[i].mark2;
                highroll2=students[i].rollno;
            }
            if(students[i].mark3>highmark3)
            {
                highmark3=students[i].mark3;
                highroll3=students[i].rollno;
            }
            if(total>hightotal)
            {
                hightotal=total;
                highroll=students[i].rollno;
            }
        }
        System.out.println(highroll1+" "+highmark1);
        System.out.println(highroll2+" "+highmark2);
        System.out.println(highroll3+" "+highmark3);
        System.out.println(highroll+" "+hightotal);
    }
