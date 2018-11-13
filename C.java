import java.util.Scanner;
class C{
public static void main(String args[]){

Scanner obj= new Scanner(System.in);
int a,b,c,d,e,f;
System.out.println("enter 1st");
a=obj.nextInt();
System.out.println("enter 2nd");
b=obj.nextInt();

c= (a>b>d>e>f)? a:b:d:e:f;

System.out.println("the greatest number is" +c);
}
}