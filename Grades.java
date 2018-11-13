class Grades
{
public static void main(String args[])
{
int numStudents=5;
int i,c=0,d;
int grades[]={73, 67, 85, 72, 64 };
for(i=0;i<5;i++)
{
c=c+grades[i];
}
d=c/5;
System.out.println("No of Students="+numStudents);
System.out.println("Average="+d);
}
}