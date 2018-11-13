import java.util.Scanner;
class Pr{
public static void main(String args[]){

Scanner obj=new Scanner(System.in);

int a,b,c;
System.out.println("enter the value");
a=obj.nextInt(System.in);
System.out.println("enter the value");
b=obj.nextInt(System.in);
System.out.println("enter the value");
c=obj.nextInt(System.in);

double s=a+b+c;
System.out.println("the sum of an addition is:");
System.out.print(s);

System.out.println("\n\n\nenter the value");
a=obj.nextInt(System.in);
System.out.println("enter the value");
b=obj.nextInt(System.in);
System.out.println("enter the value");
c=obj.nextInt(System.in);

double v=(a+b+c)/3;

System.out.println("the average of three numbers are:");
System.out.print(v);


System.out.println("\n\n\nfor product");
a=obj.nextInt(System.in);
System.out.println("enter the value");
b=obj.nextInt(System.in);
System.out.println("enter the value");
c=obj.nextInt(System.in);

double p=a*b*c;
System.out.print("the product of three numbers are:");
System.out.print(p);

System.out.println("\n\n\nfor product");
a=obj.nextInt(System.in);
System.out.println("enter the value");
b=obj.nextInt(System.in);
System.out.println("enter the value");
c=obj.nextInt(System.in);

if(a<b){
System.out.print("second number is greater");
}
else(b<c){
System.out.print("third number is greater");
}

}
	}


