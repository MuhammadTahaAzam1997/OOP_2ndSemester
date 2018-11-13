import java.util.Scanner;

class Calculator{
public static void main(String args[])
{

Scanner obj=new Scanner(System.in);

double a,b;
System.out.println("for addition");
System.out.println("enter any number");
a=obj.nextDouble();
System.out.println("enter another number");
b=obj.nextDouble();

double a1=a+b;
System.out.println(a1);

System.out.println("for substraction");
System.out.println("enter a number for subtract");
a=obj.nextDouble();
System.out.println("enter another number");
b=obj.nextDouble();

double m=a-b;

if(a<b){
System.out.println("enter the first number greater than second");
}
System.out.println(m);

System.out.println("for multiplication");
System.out.println("enter a number");
a=obj.nextDouble();
System.out.println("enter another one");
b=obj.nextDouble();

double p=a*b;

if(a==0 && b==0){
System.out.println("not possible the answer is infinity");
}

System.out.println(p);
System.out.println("always enter a first number greater");
System.out.println("for division");
System.out.println("number?");
a=obj.nextDouble();
System.out.println("another?");
b=obj.nextDouble();
double d=a/b;

if(d==0){
System.out.println("the anwer is infinity");
}
}
	}