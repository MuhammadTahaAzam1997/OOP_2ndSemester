import java.util.Scanner;
class Ele{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
int marks; 
char grade;
System.out.println("Enter marks");
marks=obj.nextInt();
if(marks>=85);
{
grade='A';
}
elseif(marks>=75)
grade='b';

elseif(marks>=65)
grade='c';

elseif(marks>=55)
grade='d';

else
grade='f';

System.out.println("your grade is "+grade);
}
}